package {ROOT_PACKAGE_NAME}.{NAME}.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.core.view.WindowCompat
import com.google.accompanist.pager.ExperimentalPagerApi
import com.hh.emo.base.EmoRouterConfig
import com.hh.emo.base.theme.EmoTheme
import com.hh.emo.base.view.BaseEmoActivity
import com.xiaojinzi.component.anno.RouterAnno
import com.xiaojinzi.module.base.support.translateStatusBar
import com.xiaojinzi.module.base.view.compose.StateBar
import com.xiaojinzi.support.annotation.ViewLayer
import com.xiaojinzi.support.ktx.initOnceUseViewModel
import kotlinx.coroutines.InternalCoroutinesApi

@RouterAnno(hostAndPath = EmoRouterConfig.xxx)
@ViewLayer
class {JAVA_NAME}Act : BaseEmoActivity<{JAVA_NAME}ViewModel>() {

    override fun getViewModelClass(): Class<{JAVA_NAME}ViewModel> {
        return {JAVA_NAME}ViewModel::class.java
    }

    @InternalCoroutinesApi
    @ExperimentalMaterialApi
    @ExperimentalAnimationApi
    @ExperimentalPagerApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.translateStatusBar()
        WindowCompat.setDecorFitsSystemWindows(window, false)

        initOnceUseViewModel {
        }

        setContent {
            EmoTheme {
                StateBar {
                    {JAVA_NAME}ViewWrap()
                }
            }
        }

    }

}