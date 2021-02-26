package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInlineStylesForNodeRequest extends StObject {
  
  var nodeId: NodeId = js.native
}
object GetInlineStylesForNodeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): GetInlineStylesForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInlineStylesForNodeRequest]
  }
  
  @scala.inline
  implicit class GetInlineStylesForNodeRequestMutableBuilder[Self <: GetInlineStylesForNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
