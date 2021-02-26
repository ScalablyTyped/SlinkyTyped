package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMatchedStylesForNodeRequest extends StObject {
  
  var nodeId: NodeId = js.native
}
object GetMatchedStylesForNodeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetMatchedStylesForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMatchedStylesForNodeRequest]
  }
  
  @scala.inline
  implicit class GetMatchedStylesForNodeRequestMutableBuilder[Self <: GetMatchedStylesForNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
