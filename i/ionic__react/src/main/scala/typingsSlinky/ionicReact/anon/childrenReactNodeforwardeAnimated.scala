package typingsSlinky.ionicReact.anon

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children  :react.react.ReactNode,   forwardedRef ? :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonPopoverElement> | undefined} & std.Pick<@ionic/core.@ionic/core.PopoverOptions<@ionic/core.@ionic/core.ComponentRef>, 'id' | 'mode' | 'animated' | 'translucent' | 'cssClass' | 'backdropDismiss' | 'keyboardClose' | 'enterAnimation' | 'leaveAnimation' | 'showBackdrop' | 'delegate' | 'event'> & @ionic/react.@ionic/react/dist/types/components/createOverlayComponent.ReactOverlayProps & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonPopoverElement> */
@js.native
trait childrenReactNodeforwardeAnimated extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var event: js.UndefOr[Event] = js.native
  var forwardedRef: js.UndefOr[ReactRef[HTMLIonPopoverElement]] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: Boolean = js.native
  var key: js.UndefOr[Key] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var ref: js.UndefOr[Ref[HTMLIonPopoverElement]] = js.native
  var showBackdrop: js.UndefOr[Boolean] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
}

object childrenReactNodeforwardeAnimated {
  @scala.inline
  def apply(isOpen: Boolean): childrenReactNodeforwardeAnimated = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[childrenReactNodeforwardeAnimated]
  }
  @scala.inline
  implicit class childrenReactNodeforwardeAnimatedOps[Self <: childrenReactNodeforwardeAnimated] (val x: Self) extends AnyVal {
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
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withDelegate(value: FrameworkDelegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
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
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardedRef(value: ReactRef[HTMLIonPopoverElement]): Self = {
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
    def withRefRefObject(value: ReactRef[HTMLIonPopoverElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ HTMLIonPopoverElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[HTMLIonPopoverElement]): Self = {
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

