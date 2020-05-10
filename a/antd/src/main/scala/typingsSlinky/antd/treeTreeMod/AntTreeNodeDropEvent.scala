package typingsSlinky.antd.treeTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: ReactComponentClass[AntTreeNodeProps] = js.native
  var dragNodesKeys: js.Array[String] = js.native
  var dropPosition: Double = js.native
  var dropToGap: js.UndefOr[Boolean] = js.native
  var event: SyntheticMouseEvent[HTMLElement] = js.native
  var node: ReactComponentClass[AntTreeNodeProps] = js.native
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: ReactComponentClass[AntTreeNodeProps],
    dragNodesKeys: js.Array[String],
    dropPosition: Double,
    event: SyntheticMouseEvent[HTMLElement],
    node: ReactComponentClass[AntTreeNodeProps]
  ): AntTreeNodeDropEvent = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDropEvent]
  }
  @scala.inline
  implicit class AntTreeNodeDropEventOps[Self <: AntTreeNodeDropEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragNode(value: ReactComponentClass[AntTreeNodeProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragNodesKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragNodesKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: SyntheticMouseEvent[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: ReactComponentClass[AntTreeNodeProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropToGap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropToGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropToGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropToGap")(js.undefined)
        ret
    }
  }
  
}

