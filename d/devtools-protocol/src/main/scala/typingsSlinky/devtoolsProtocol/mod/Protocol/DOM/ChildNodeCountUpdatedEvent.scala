package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildNodeCountUpdatedEvent extends StObject {
  
  /**
    * New node count.
    */
  var childNodeCount: integer = js.native
  
  /**
    * Id of the node that has changed.
    */
  var nodeId: NodeId = js.native
}
object ChildNodeCountUpdatedEvent {
  
  @scala.inline
  def apply(childNodeCount: integer, nodeId: NodeId): ChildNodeCountUpdatedEvent = {
    val __obj = js.Dynamic.literal(childNodeCount = childNodeCount.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildNodeCountUpdatedEvent]
  }
  
  @scala.inline
  implicit class ChildNodeCountUpdatedEventMutableBuilder[Self <: ChildNodeCountUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildNodeCount(value: integer): Self = StObject.set(x, "childNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
