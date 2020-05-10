package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.card
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.modal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationStackConfig extends js.Object {
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
  var cardShadowEnabled: js.UndefOr[Boolean] = js.native
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.native
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.native
  var headerBackgroundTransitionPreset: js.UndefOr[HeaderBackgroundTransitionPreset] = js.native
  var headerLayoutPreset: js.UndefOr[HeaderLayoutPreset] = js.native
  var headerMode: js.UndefOr[HeaderMode] = js.native
  var headerTransitionPreset: js.UndefOr[HeaderTransitionPreset] = js.native
  var mode: js.UndefOr[card | modal] = js.native
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  var transitionConfig: js.UndefOr[
    js.Function3[
      /* transitionProps */ TransitionProps, 
      /* prevTransitionProps */ js.UndefOr[TransitionProps], 
      /* isModal */ js.UndefOr[Boolean], 
      TransitionConfig with HeaderTransitionConfig
    ]
  ] = js.native
  var transparentCard: js.UndefOr[Boolean] = js.native
}

object NavigationStackConfig {
  @scala.inline
  def apply(): NavigationStackConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationStackConfig]
  }
  @scala.inline
  implicit class NavigationStackConfigOps[Self <: NavigationStackConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardOverlayEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOverlayEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardOverlayEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOverlayEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCardShadowEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardShadowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardShadowEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardShadowEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCardStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCardStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardStyle")(null)
        ret
    }
    @scala.inline
    def withDisableKeyboardHandling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKeyboardHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackTitleVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitleVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackTitleVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackTitleVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackgroundTransitionPreset(value: HeaderBackgroundTransitionPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackgroundTransitionPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackgroundTransitionPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackgroundTransitionPreset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLayoutPreset(value: HeaderLayoutPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLayoutPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderLayoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLayoutPreset")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderMode(value: HeaderMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTransitionPreset(value: HeaderTransitionPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTransitionPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTransitionPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTransitionPreset")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: card | modal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionConfig(
      value: (/* transitionProps */ TransitionProps, /* prevTransitionProps */ js.UndefOr[TransitionProps], /* isModal */ js.UndefOr[Boolean]) => TransitionConfig with HeaderTransitionConfig
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionConfig")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransitionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparentCard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparentCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCard")(js.undefined)
        ret
    }
  }
  
}

