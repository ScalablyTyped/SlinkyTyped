package typingsSlinky.atMaterialDashUiCore

import slinky.core.TagMod
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreBooleans.`false`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onClick
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseDown
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseUp
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchEnd
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchStart
import typingsSlinky.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
@js.native
trait PartialClickAwayListenerProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  var onClickAway: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
}

object PartialClickAwayListenerProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    onClickAway: /* event */ ChangeEvent[js.Object] => Unit = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): PartialClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(js.Any.fromFunction1(onClickAway))
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClickAwayListenerProps]
  }
}

