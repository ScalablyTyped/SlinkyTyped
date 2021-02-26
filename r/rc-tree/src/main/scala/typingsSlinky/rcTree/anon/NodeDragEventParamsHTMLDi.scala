package typingsSlinky.rcTree.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-tree.rc-tree/es/contextTypes.NodeDragEventParams<std.HTMLDivElement> & {  expandedKeys :std.Array<rc-tree.rc-tree/es/interface.Key>} */
@js.native
trait NodeDragEventParamsHTMLDi extends StObject {
  
  var event: SyntheticMouseEvent[HTMLDivElement] = js.native
  
  var expandedKeys: js.Array[typingsSlinky.rcTree.interfaceMod.Key] = js.native
  
  var node: EventDataNode = js.native
}
object NodeDragEventParamsHTMLDi {
  
  @scala.inline
  def apply(
    event: SyntheticMouseEvent[HTMLDivElement],
    expandedKeys: js.Array[typingsSlinky.rcTree.interfaceMod.Key],
    node: EventDataNode
  ): NodeDragEventParamsHTMLDi = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDragEventParamsHTMLDi]
  }
  
  @scala.inline
  implicit class NodeDragEventParamsHTMLDiMutableBuilder[Self <: NodeDragEventParamsHTMLDi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[HTMLDivElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeys(value: js.Array[typingsSlinky.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: typingsSlinky.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
