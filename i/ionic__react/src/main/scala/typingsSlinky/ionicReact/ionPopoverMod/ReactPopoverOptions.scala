package typingsSlinky.ionicReact.ionPopoverMod

import slinky.core.TagMod
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@ionic/core.@ionic/core.PopoverOptions<@ionic/core.@ionic/core.ComponentRef>, 'component' | 'componentProps'> & {  children  :react.react.ReactNode} */
trait ReactPopoverOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  var children: TagMod[Any]
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var event: js.UndefOr[Event_] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object ReactPopoverOptions {
  @scala.inline
  def apply(
    children: TagMod[Any],
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    cssClass: String | js.Array[String] = null,
    delegate: FrameworkDelegate = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    event: Event_ = null,
    id: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    mode: Mode = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): ReactPopoverOptions = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3(enterAnimation))
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3(leaveAnimation))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPopoverOptions]
  }
}

