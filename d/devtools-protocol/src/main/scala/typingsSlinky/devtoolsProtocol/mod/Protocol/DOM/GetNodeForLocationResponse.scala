package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNodeForLocationResponse extends StObject {
  
  /**
    * Resulting node.
    */
  var backendNodeId: BackendNodeId = js.native
  
  /**
    * Frame this node belongs to.
    */
  var frameId: FrameId = js.native
  
  /**
    * Id of the node at given coordinates, only when enabled and requested document.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
}
object GetNodeForLocationResponse {
  
  @scala.inline
  def apply(backendNodeId: BackendNodeId, frameId: FrameId): GetNodeForLocationResponse = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodeForLocationResponse]
  }
  
  @scala.inline
  implicit class GetNodeForLocationResponseMutableBuilder[Self <: GetNodeForLocationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
  }
}
