package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOuterHTMLRequest extends StObject {
  
  /**
    * Id of the node to set markup for.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Outer HTML markup to set.
    */
  var outerHTML: String = js.native
}
object SetOuterHTMLRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, outerHTML: String): SetOuterHTMLRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOuterHTMLRequest]
  }
  
  @scala.inline
  implicit class SetOuterHTMLRequestMutableBuilder[Self <: SetOuterHTMLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
  }
}
