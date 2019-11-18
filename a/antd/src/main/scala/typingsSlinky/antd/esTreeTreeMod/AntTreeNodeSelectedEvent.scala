package typingsSlinky.antd.esTreeTreeMod

import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import typingsSlinky.antd.antdStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeSelectedEvent extends AntTreeNodeBaseEvent {
  var event: select
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedNodes: js.UndefOr[js.Array[ReactComponentClass[AntTreeNodeProps]]] = js.undefined
}

object AntTreeNodeSelectedEvent {
  @scala.inline
  def apply(
    event: select,
    nativeEvent: MouseEvent,
    node: ReactComponentClass[AntTreeNodeProps],
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedNodes: js.Array[ReactComponentClass[AntTreeNodeProps]] = null
  ): AntTreeNodeSelectedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeSelectedEvent]
  }
}

