package typingsSlinky.materialUiCore.anon

import slinky.core.TagMod
import typingsSlinky.materialUiCore.materialUiCoreBooleans.`false`
import typingsSlinky.materialUiCore.materialUiCoreStrings.onClick
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchStart
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
@js.native
trait PartialClickAwayListenerP extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  var onClickAway: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
}

object PartialClickAwayListenerP {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    onClickAway: /* event */ ChangeEvent[js.Object] => Unit = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): PartialClickAwayListenerP = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(js.Any.fromFunction1(onClickAway))
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClickAwayListenerP]
  }
}

