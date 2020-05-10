package typingsSlinky.ionicCore.utilsConfigMod

import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.spinnerConfigsMod.SpinnerTypes
import typingsSlinky.ionicCore.tabBarInterfaceMod.TabButtonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicConfig extends js.Object {
  var _forceStatusbarPadding: js.UndefOr[Boolean] = js.native
  var _testing: js.UndefOr[Boolean] = js.native
  var _zoneGate: js.UndefOr[js.Function1[/* h */ js.Function0[_], _]] = js.native
  /**
    * Provides a custom enter animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom enter animation for all `ion-alert`, overriding the default "animation".
    */
  var alertEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-alert`, overriding the default "animation".
    */
  var alertLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * When it's set to `false`, disables all animation and transition across the app.
    * Can be useful to make ionic smoother in slow devices, when animations can't run smoothly.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default icon in all `<ion-back-button>` components.
    */
  var backButtonIcon: js.UndefOr[String] = js.native
  /**
    * Overrides the default text in all `<ion-back-button>` components.
    */
  var backButtonText: js.UndefOr[String] = js.native
  /**
    * EXPERIMENTAL: Adds a page shadow to transitioning pages on iOS. Disabled by default.
    */
  var experimentalTransitionShadow: js.UndefOr[Boolean] = js.native
  /**
    * Wherever ionic will respond to hardware go back buttons in an Android device.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var hardwareBackButton: js.UndefOr[Boolean] = js.native
  var hideCaretOnScroll: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default spinner type in all `<ion-infinite-scroll-content>` components.
    */
  var infiniteLoadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  var inputBlurring: js.UndefOr[Boolean] = js.native
  var inputShims: js.UndefOr[Boolean] = js.native
  var keyboardHeight: js.UndefOr[Double] = js.native
  /**
    * Provides a custom enter animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Overrides the default spinner for all `ion-loading` overlays, ie. the ones
    * created with `ion-loading-controller`.
    */
  var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * Overrides the default icon in all `<ion-menu-button>` components.
    */
  var menuIcon: js.UndefOr[String] = js.native
  /**
    * Overrides the default menu type for all `<ion-menu>` components.
    * By default the menu type is chosen based in the app's mode.
    */
  var menuType: js.UndefOr[String] = js.native
  /**
    * Provides a custom enter animation for all `ion-modal`, overriding the default "animation".
    */
  var modalEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-modal`, overriding the default "animation".
    */
  var modalLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * The mode determines which platform styles to use for the whole application.
    */
  var mode: js.UndefOr[Mode] = js.native
  /**
    * Overrides the default "animation" of all `ion-nav` and `ion-router-outlet` across the whole application.
    * This prop allows to replace the default transition and provide a custom one that applies to all navigation outlets.
    */
  var navAnimation: js.UndefOr[AnimationBuilder] = js.native
  var persistConfig: js.UndefOr[Boolean] = js.native
  /**
    * Provides a custom enter animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom enter animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Overrides the default icon in all `<ion-refresh-content>` components.
    */
  var refreshingIcon: js.UndefOr[String] = js.native
  /**
    * Overrides the default spinner type in all `<ion-refresh-content>` components.
    */
  var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * When it's set to `false`, it disables all material-design ripple-effects across the app.
    * Defaults to `true`.
    */
  var rippleEffect: js.UndefOr[Boolean] = js.native
  var scrollAssist: js.UndefOr[Boolean] = js.native
  var scrollPadding: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default spinner in all `<ion-spinner>` components.
    * By default the spinner type is chosen based in the mode (ios or md).
    */
  var spinner: js.UndefOr[SpinnerTypes] = js.native
  /**
    * Whenever clicking the top status bar should cause the scroll to top in an application.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var statusTap: js.UndefOr[Boolean] = js.native
  /**
    * Global switch that disables or enables "swipe-to-go-back" gesture across all
    * `ion-nav` in your application.
    */
  var swipeBackEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default "layout" of all `ion-bar-button` across the whole application.
    */
  var tabButtonLayout: js.UndefOr[TabButtonLayout] = js.native
  /**
    * Provides a custom enter animation for all `ion-toast`, overriding the default "animation".
    */
  var toastEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-toast`, overriding the default "animation".
    */
  var toastLeave: js.UndefOr[AnimationBuilder] = js.native
}

object IonicConfig {
  @scala.inline
  def apply(): IonicConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonicConfig]
  }
  @scala.inline
  implicit class IonicConfigOps[Self <: IonicConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_forceStatusbarPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_forceStatusbarPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_forceStatusbarPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_forceStatusbarPadding")(js.undefined)
        ret
    }
    @scala.inline
    def with_testing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_testing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_testing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_testing")(js.undefined)
        ret
    }
    @scala.inline
    def with_zoneGate(value: /* h */ js.Function0[_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_zoneGate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without_zoneGate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_zoneGate")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSheetEnter(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSheetEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutActionSheetEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSheetEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSheetLeave(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSheetLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutActionSheetLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSheetLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertEnter(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAlertEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertLeave(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAlertLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withBackButtonIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButtonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withBackButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalTransitionShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalTransitionShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalTransitionShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalTransitionShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareBackButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareBackButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCaretOnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCaretOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCaretOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCaretOnScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteLoadingSpinner(value: SpinnerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoadingSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteLoadingSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoadingSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteLoadingSpinnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoadingSpinner")(null)
        ret
    }
    @scala.inline
    def withInputBlurring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBlurring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBlurring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBlurring")(js.undefined)
        ret
    }
    @scala.inline
    def withInputShims(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputShims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputShims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputShims")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingEnter(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLoadingEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingLeave(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLoadingLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingSpinner(value: SpinnerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingSpinnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingSpinner")(null)
        ret
    }
    @scala.inline
    def withMenuIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuType")(js.undefined)
        ret
    }
    @scala.inline
    def withModalEnter(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutModalEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withModalLeave(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutModalLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
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
    def withNavAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNavAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerEnter(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPickerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerLeave(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPickerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverEnter(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPopoverEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverLeave(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPopoverLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingSpinner(value: SpinnerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshingSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingSpinnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingSpinner")(null)
        ret
    }
    @scala.inline
    def withRippleEffect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollAssist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAssist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollAssist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAssist")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinner(value: SpinnerTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusTap")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeBackEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeBackEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeBackEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeBackEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTabButtonLayout(value: TabButtonLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabButtonLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabButtonLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabButtonLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withToastEnter(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutToastEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withToastLeave(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutToastLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastLeave")(js.undefined)
        ret
    }
  }
  
}

