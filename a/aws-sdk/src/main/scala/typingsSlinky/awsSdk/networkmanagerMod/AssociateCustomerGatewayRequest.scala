package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateCustomerGatewayRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the customer gateway. For more information, see Resources Defined by Amazon EC2.
    */
  var CustomerGatewayArn: String = js.native
  
  /**
    * The ID of the device.
    */
  var DeviceId: String = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
}
object AssociateCustomerGatewayRequest {
  
  @scala.inline
  def apply(CustomerGatewayArn: String, DeviceId: String, GlobalNetworkId: String): AssociateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayArn = CustomerGatewayArn.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCustomerGatewayRequest]
  }
  
  @scala.inline
  implicit class AssociateCustomerGatewayRequestOps[Self <: AssociateCustomerGatewayRequest] (val x: Self) extends AnyVal {
    
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
    def setCustomerGatewayArn(value: String): Self = this.set("CustomerGatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: String): Self = this.set("LinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkId: Self = this.set("LinkId", js.undefined)
  }
}
