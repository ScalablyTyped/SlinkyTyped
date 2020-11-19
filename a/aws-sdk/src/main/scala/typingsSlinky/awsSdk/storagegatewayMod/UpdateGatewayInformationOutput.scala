package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayInformationOutput extends js.Object {
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
}
object UpdateGatewayInformationOutput {
  
  @scala.inline
  def apply(): UpdateGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGatewayInformationOutput]
  }
  
  @scala.inline
  implicit class UpdateGatewayInformationOutputOps[Self <: UpdateGatewayInformationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setGatewayName(value: String): Self = this.set("GatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayName: Self = this.set("GatewayName", js.undefined)
  }
}
