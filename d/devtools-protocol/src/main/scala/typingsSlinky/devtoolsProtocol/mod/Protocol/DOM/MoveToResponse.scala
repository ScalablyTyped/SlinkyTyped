package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveToResponse extends StObject {
  
  /**
    * New id of the moved node.
    */
  var nodeId: NodeId = js.native
}
object MoveToResponse {
  
  @scala.inline
  def apply(nodeId: NodeId): MoveToResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToResponse]
  }
  
  @scala.inline
  implicit class MoveToResponseMutableBuilder[Self <: MoveToResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
