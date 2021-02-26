package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpnConnectionRequest extends StObject {
  
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: typingsSlinky.awsSdk.ec2Mod.CustomerGatewayId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The options for the VPN connection.
    */
  var Options: js.UndefOr[VpnConnectionOptionsSpecification] = js.native
  
  /**
    * The tags to apply to the VPN connection.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
    */
  var TransitGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayId] = js.native
  
  /**
    * The type of VPN connection (ipsec.1).
    */
  var Type: String = js.native
  
  /**
    * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit gateway.
    */
  var VpnGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpnGatewayId] = js.native
}
object CreateVpnConnectionRequest {
  
  @scala.inline
  def apply(CustomerGatewayId: CustomerGatewayId, Type: String): CreateVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnConnectionRequest]
  }
  
  @scala.inline
  implicit class CreateVpnConnectionRequestMutableBuilder[Self <: CreateVpnConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGatewayId(value: CustomerGatewayId): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setOptions(value: VpnConnectionOptionsSpecification): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayId(value: VpnGatewayId): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayIdUndefined: Self = StObject.set(x, "VpnGatewayId", js.undefined)
  }
}
