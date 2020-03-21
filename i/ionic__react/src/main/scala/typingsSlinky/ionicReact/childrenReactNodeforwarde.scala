package typingsSlinky.ionicReact

import org.scalajs.dom.raw.CustomEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonModalElement
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children  :react.react.ReactNode,   forwardedRef ? :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonModalElement> | undefined} & std.Pick<@ionic/core.@ionic/core.ModalOptions<@ionic/core.@ionic/core.ComponentRef>, 'id' | 'mode' | 'animated' | 'cssClass' | 'backdropDismiss' | 'keyboardClose' | 'enterAnimation' | 'leaveAnimation' | 'showBackdrop' | 'delegate'> & @ionic/react.@ionic/react/dist/types/components/createOverlayComponent.ReactOverlayProps & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonModalElement> */
trait childrenReactNodeforwarde extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var forwardedRef: js.UndefOr[ReactRef[HTMLIonModalElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isOpen: Boolean
  var key: js.UndefOr[Key] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var ref: js.UndefOr[Ref[HTMLIonModalElement]] = js.undefined
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
}

object childrenReactNodeforwarde {
  @scala.inline
  def apply(
    isOpen: Boolean,
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    cssClass: String | js.Array[String] = null,
    delegate: FrameworkDelegate = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    forwardedRef: ReactRef[HTMLIonModalElement] = null,
    id: String = null,
    key: Key = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    mode: Mode = null,
    onDidDismiss: /* event */ CustomEvent => Unit = null,
    onDidPresent: /* event */ CustomEvent => Unit = null,
    onWillDismiss: /* event */ CustomEvent => Unit = null,
    onWillPresent: /* event */ CustomEvent => Unit = null,
    ref: Ref[HTMLIonModalElement] = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined
  ): childrenReactNodeforwarde = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3(enterAnimation))
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3(leaveAnimation))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    if (onDidPresent != null) __obj.updateDynamic("onDidPresent")(js.Any.fromFunction1(onDidPresent))
    if (onWillDismiss != null) __obj.updateDynamic("onWillDismiss")(js.Any.fromFunction1(onWillDismiss))
    if (onWillPresent != null) __obj.updateDynamic("onWillPresent")(js.Any.fromFunction1(onWillPresent))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[childrenReactNodeforwarde]
  }
}

