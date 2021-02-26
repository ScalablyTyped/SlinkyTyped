package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGatewayResponse extends StObject {
  
  /**
    * The details of the gateway.
    */
  var Gateway: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Gateway] = js.native
}
object GetGatewayResponse {
  
  @scala.inline
  def apply(): GetGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGatewayResponse]
  }
  
  @scala.inline
  implicit class GetGatewayResponseMutableBuilder[Self <: GetGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGateway(value: Gateway): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
  }
}
