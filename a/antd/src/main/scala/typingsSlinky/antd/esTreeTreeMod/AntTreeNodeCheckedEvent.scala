package typingsSlinky.antd.esTreeTreeMod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import typingsSlinky.antd.antdStrings.check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeCheckedEvent extends AntTreeNodeBaseEvent {
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedNodes: js.UndefOr[js.Array[ReactComponentClass[AntTreeNodeProps]]] = js.undefined
  var event: check
}

object AntTreeNodeCheckedEvent {
  @scala.inline
  def apply(
    event: check,
    nativeEvent: MouseEvent,
    node: ReactComponentClass[AntTreeNodeProps],
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedNodes: js.Array[ReactComponentClass[AntTreeNodeProps]] = null
  ): AntTreeNodeCheckedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (checkedNodes != null) __obj.updateDynamic("checkedNodes")(checkedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeCheckedEvent]
  }
}

