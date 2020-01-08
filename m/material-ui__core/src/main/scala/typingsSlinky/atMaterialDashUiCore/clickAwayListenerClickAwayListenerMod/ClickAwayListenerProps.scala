package typingsSlinky.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod

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
    children: TagMod[Any],
    onClickAway: ChangeEvent[js.Object] => Unit,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onClickAway = js.Any.fromFunction1(onClickAway))
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
}

