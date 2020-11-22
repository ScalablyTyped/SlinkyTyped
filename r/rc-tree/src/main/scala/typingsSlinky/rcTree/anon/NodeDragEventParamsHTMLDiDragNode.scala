package typingsSlinky.rcTree.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-tree.rc-tree/es/contextTypes.NodeDragEventParams<std.HTMLDivElement> & {  dragNode :rc-tree.rc-tree/es/interface.EventDataNode,   dragNodesKeys :std.Array<rc-tree.rc-tree/es/interface.Key>,   dropPosition :number,   dropToGap :boolean} */
@js.native
trait NodeDragEventParamsHTMLDiDragNode extends js.Object {
  
  var dragNode: EventDataNode = js.native
  
  var dragNodesKeys: js.Array[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var dropPosition: Double = js.native
  
  var dropToGap: Boolean = js.native
  
  var event: SyntheticMouseEvent[HTMLDivElement] = js.native
  
  var node: EventDataNode = js.native
}
object NodeDragEventParamsHTMLDiDragNode {
  
  @scala.inline
  def apply(
    dragNode: EventDataNode,
    dragNodesKeys: js.Array[typingsSlinky.rcTree.interfaceMod.Key],
    dropPosition: Double,
    dropToGap: Boolean,
    event: SyntheticMouseEvent[HTMLDivElement],
    node: EventDataNode
  ): NodeDragEventParamsHTMLDiDragNode = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], dropToGap = dropToGap.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDragEventParamsHTMLDiDragNode]
  }
  
  @scala.inline
  implicit class NodeDragEventParamsHTMLDiDragNodeOps[Self <: NodeDragEventParamsHTMLDiDragNode] (val x: Self) extends AnyVal {
    
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
    def setDragNode(value: EventDataNode): Self = this.set("dragNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragNodesKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = this.set("dragNodesKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragNodesKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = this.set("dragNodesKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropToGap(value: Boolean): Self = this.set("dropToGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[HTMLDivElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
