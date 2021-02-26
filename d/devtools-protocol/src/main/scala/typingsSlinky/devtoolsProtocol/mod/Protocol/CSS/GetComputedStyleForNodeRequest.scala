package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComputedStyleForNodeRequest extends StObject {
  
  var nodeId: NodeId = js.native
}
object GetComputedStyleForNodeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetComputedStyleForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputedStyleForNodeRequest]
  }
  
  @scala.inline
  implicit class GetComputedStyleForNodeRequestMutableBuilder[Self <: GetComputedStyleForNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
