package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOuterHTMLRequest extends StObject {
  
  /**
    * Identifier of the backend node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * Identifier of the node.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  
  /**
    * JavaScript object id of the node wrapper.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
}
object GetOuterHTMLRequest {
  
  @scala.inline
  def apply(): GetOuterHTMLRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOuterHTMLRequest]
  }
  
  @scala.inline
  implicit class GetOuterHTMLRequestMutableBuilder[Self <: GetOuterHTMLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
