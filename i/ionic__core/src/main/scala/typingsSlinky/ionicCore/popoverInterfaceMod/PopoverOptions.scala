package typingsSlinky.ionicCore.popoverInterfaceMod

import org.scalajs.dom.raw.Event
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverOptions[T /* <: ComponentRef */] extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var component: T = js.native
  var componentProps: js.UndefOr[ComponentProps[T]] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var event: js.UndefOr[Event] = js.native
  var id: js.UndefOr[String] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var showBackdrop: js.UndefOr[Boolean] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
}

object PopoverOptions {
  @scala.inline
  def apply[T](component: T): PopoverOptions[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverOptions[T]]
  }
  @scala.inline
  implicit class PopoverOptionsOps[Self[t] <: PopoverOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComponent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropDismiss(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropDismiss: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentProps(value: ComponentProps[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegate(value: FrameworkDelegate): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEnterAnimation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: Event): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardClose(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardClose: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveAnimation(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLeaveAnimation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBackdrop(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBackdrop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
  }
  
}

