package typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnbindDeviceFromGatewayRequest extends js.Object {
  
  /** Required. The device to disassociate from the specified gateway. The value of `device_id` can be either the device numeric ID or the user-defined device identifier. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** Required. The value of `gateway_id` can be either the device numeric ID or the user-defined device identifier. */
  var gatewayId: js.UndefOr[String] = js.native
}
object UnbindDeviceFromGatewayRequest {
  
  @scala.inline
  def apply(): UnbindDeviceFromGatewayRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnbindDeviceFromGatewayRequest]
  }
  
  @scala.inline
  implicit class UnbindDeviceFromGatewayRequestOps[Self <: UnbindDeviceFromGatewayRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setGatewayId(value: String): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("gatewayId", js.undefined)
  }
}
