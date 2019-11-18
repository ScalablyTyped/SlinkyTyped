package typingsSlinky.antd.esTreeTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: ReactComponentClass[AntTreeNodeProps]
  var dragNodesKeys: js.Array[String]
  var dropPosition: Double
  var dropToGap: js.UndefOr[Boolean] = js.undefined
  var event: SyntheticMouseEvent[HTMLElement]
  var node: ReactComponentClass[AntTreeNodeProps]
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: ReactComponentClass[AntTreeNodeProps],
    dragNodesKeys: js.Array[String],
    dropPosition: Double,
    event: SyntheticMouseEvent[HTMLElement],
    node: ReactComponentClass[AntTreeNodeProps],
    dropToGap: js.UndefOr[Boolean] = js.undefined
  ): AntTreeNodeDropEvent = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDropEvent]
  }
}

