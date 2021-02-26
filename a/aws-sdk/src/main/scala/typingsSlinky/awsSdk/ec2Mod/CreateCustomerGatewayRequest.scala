package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomerGatewayRequest extends StObject {
  
  /**
    * For devices that support BGP, the customer gateway's BGP ASN. Default: 65000
    */
  var BgpAsn: Integer = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the customer gateway certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  
  /**
    * A name for the customer gateway device. Length Constraints: Up to 255 characters.
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
    */
  var PublicIp: js.UndefOr[String] = js.native
  
  /**
    * The tags to apply to the customer gateway.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The type of VPN connection that this customer gateway supports (ipsec.1).
    */
  var Type: GatewayType = js.native
}
object CreateCustomerGatewayRequest {
  
  @scala.inline
  def apply(BgpAsn: Integer, Type: GatewayType): CreateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(BgpAsn = BgpAsn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerGatewayRequest]
  }
  
  @scala.inline
  implicit class CreateCustomerGatewayRequestMutableBuilder[Self <: CreateCustomerGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgpAsn(value: Integer): Self = StObject.set(x, "BgpAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setType(value: GatewayType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
