package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTransitGatewayResponse extends StObject {
  
  /**
    * The transit gateway registration information.
    */
  var TransitGatewayRegistration: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.TransitGatewayRegistration] = js.native
}
object DeregisterTransitGatewayResponse {
  
  @scala.inline
  def apply(): DeregisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayResponse]
  }
  
  @scala.inline
  implicit class DeregisterTransitGatewayResponseMutableBuilder[Self <: DeregisterTransitGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayRegistration(value: TransitGatewayRegistration): Self = StObject.set(x, "TransitGatewayRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRegistrationUndefined: Self = StObject.set(x, "TransitGatewayRegistration", js.undefined)
  }
}
