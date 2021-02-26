package typingsSlinky.primereact.anon

import typingsSlinky.primereact.treeNodeMod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeOriginalEvent extends StObject {
  
  var node: TreeNode = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object NodeOriginalEvent {
  
  @scala.inline
  def apply(node: TreeNode, originalEvent: org.scalajs.dom.raw.Event): NodeOriginalEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOriginalEvent]
  }
  
  @scala.inline
  implicit class NodeOriginalEventMutableBuilder[Self <: NodeOriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: TreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
