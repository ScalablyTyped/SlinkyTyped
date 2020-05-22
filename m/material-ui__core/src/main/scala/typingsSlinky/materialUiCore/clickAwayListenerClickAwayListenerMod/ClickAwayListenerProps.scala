package typingsSlinky.materialUiCore.clickAwayListenerClickAwayListenerMod

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

@js.native
trait ClickAwayListenerProps extends js.Object {
  var children: TagMod[Any] = js.native
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
  def onClickAway(event: ChangeEvent[js.Object]): Unit = js.native
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(
    onClickAway: ChangeEvent[js.Object] => Unit,
    children: TagMod[Any] = null,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
}

