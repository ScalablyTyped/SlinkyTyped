package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOutboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the OutboundCrossClusterSearchConnection of deleted outbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[OutboundCrossClusterSearchConnection] = js.native
}
object DeleteOutboundCrossClusterSearchConnectionResponse {
  
  @scala.inline
  def apply(): DeleteOutboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionResponse]
  }
  
  @scala.inline
  implicit class DeleteOutboundCrossClusterSearchConnectionResponseMutableBuilder[Self <: DeleteOutboundCrossClusterSearchConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossClusterSearchConnection(value: OutboundCrossClusterSearchConnection): Self = StObject.set(x, "CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossClusterSearchConnectionUndefined: Self = StObject.set(x, "CrossClusterSearchConnection", js.undefined)
  }
}
