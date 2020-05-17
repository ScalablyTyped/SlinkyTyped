package typingsSlinky.ionicReact.anon

import org.scalajs.dom.raw.CustomEvent
import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.spinnerConfigsMod.SpinnerTypes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/core.@ionic/core.LoadingOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef ? :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonLoadingElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonLoadingElement> */
@js.native
trait LoadingOptionsReactContro extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var duration: js.UndefOr[Double] = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var forwardedRef: js.UndefOr[ReactRef[HTMLIonLoadingElement]] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: Boolean = js.native
  var key: js.UndefOr[Key] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var message: js.UndefOr[String] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var ref: js.UndefOr[Ref[HTMLIonLoadingElement]] = js.native
  var showBackdrop: js.UndefOr[Boolean] = js.native
  var spinner: js.UndefOr[SpinnerTypes | Null] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
}

object LoadingOptionsReactContro {
  @scala.inline
  def apply(isOpen: Boolean): LoadingOptionsReactContro = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingOptionsReactContro]
  }
  @scala.inline
  implicit class LoadingOptionsReactControOps[Self <: LoadingOptionsReactContro] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
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
    def withBackdropDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEnterAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardedRef(value: ReactRef[HTMLIonLoadingElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLeaveAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
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
    def withOnDidDismiss(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDidPresent(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidPresent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillDismiss(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWillDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillPresent(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillPresent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWillPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[HTMLIonLoadingElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ HTMLIonLoadingElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[HTMLIonLoadingElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withShowBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(js.undefined)
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
    def withSpinnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(null)
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
  }
  
}

