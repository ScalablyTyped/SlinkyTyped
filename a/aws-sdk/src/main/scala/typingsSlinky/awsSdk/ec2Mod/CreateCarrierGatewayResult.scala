package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCarrierGatewayResult extends js.Object {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateway: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CarrierGateway] = js.native
}
object CreateCarrierGatewayResult {
  
  @scala.inline
  def apply(): CreateCarrierGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCarrierGatewayResult]
  }
  
  @scala.inline
  implicit class CreateCarrierGatewayResultOps[Self <: CreateCarrierGatewayResult] (val x: Self) extends AnyVal {
    
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
    def setCarrierGateway(value: CarrierGateway): Self = this.set("CarrierGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierGateway: Self = this.set("CarrierGateway", js.undefined)
  }
}
