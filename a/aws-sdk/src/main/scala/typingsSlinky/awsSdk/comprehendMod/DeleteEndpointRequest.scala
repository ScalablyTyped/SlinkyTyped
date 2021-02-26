package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEndpointRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being deleted.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}
object DeleteEndpointRequest {
  
  @scala.inline
  def apply(EndpointArn: ComprehendEndpointArn): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteEndpointRequestMutableBuilder[Self <: DeleteEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
