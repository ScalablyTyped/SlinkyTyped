package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectClassNamesFromSubtreeRequest extends StObject {
  
  /**
    * Id of the node to collect class names.
    */
  var nodeId: NodeId = js.native
}
object CollectClassNamesFromSubtreeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): CollectClassNamesFromSubtreeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesFromSubtreeRequest]
  }
  
  @scala.inline
  implicit class CollectClassNamesFromSubtreeRequestMutableBuilder[Self <: CollectClassNamesFromSubtreeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
