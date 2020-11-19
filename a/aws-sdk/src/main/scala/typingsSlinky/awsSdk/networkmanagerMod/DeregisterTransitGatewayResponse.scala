package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTransitGatewayResponse extends js.Object {
  
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
  implicit class DeregisterTransitGatewayResponseOps[Self <: DeregisterTransitGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransitGatewayRegistration(value: TransitGatewayRegistration): Self = this.set("TransitGatewayRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayRegistration: Self = this.set("TransitGatewayRegistration", js.undefined)
  }
}
