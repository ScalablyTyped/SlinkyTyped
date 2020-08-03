package typingsSlinky.antd.treeTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: ReactComponentClass[AntTreeNodeProps]
  var dragNodesKeys: js.Array[Key]
  var dropPosition: Double
  var dropToGap: js.UndefOr[Boolean] = js.undefined
  var event: SyntheticMouseEvent[HTMLElement]
  var node: ReactComponentClass[AntTreeNodeProps]
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: ReactComponentClass[AntTreeNodeProps],
    dragNodesKeys: js.Array[Key],
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDragNode(value: ReactComponentClass[AntTreeNodeProps]): Self = this.set("dragNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragNodesKeysVarargs(value: Key*): Self = this.set("dragNodesKeys", js.Array(value :_*))
    @scala.inline
    def setDragNodesKeys(value: js.Array[Key]): Self = this.set("dragNodesKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[HTMLElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReactComponentClass[AntTreeNodeProps]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropToGap(value: Boolean): Self = this.set("dropToGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropToGap: Self = this.set("dropToGap", js.undefined)
  }
  
}

