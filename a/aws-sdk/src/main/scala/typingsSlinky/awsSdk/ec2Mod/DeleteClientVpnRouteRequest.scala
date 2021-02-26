package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClientVpnRouteRequest extends StObject {
  
  /**
    * The ID of the Client VPN endpoint from which the route is to be deleted.
    */
  var ClientVpnEndpointId: typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, of the route to be deleted.
    */
  var DestinationCidrBlock: String = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the target subnet used by the route.
    */
  var TargetVpcSubnetId: js.UndefOr[SubnetId] = js.native
}
object DeleteClientVpnRouteRequest {
  
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, DestinationCidrBlock: String): DeleteClientVpnRouteRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientVpnRouteRequest]
  }
  
  @scala.inline
  implicit class DeleteClientVpnRouteRequestMutableBuilder[Self <: DeleteClientVpnRouteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTargetVpcSubnetId(value: SubnetId): Self = StObject.set(x, "TargetVpcSubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVpcSubnetIdUndefined: Self = StObject.set(x, "TargetVpcSubnetId", js.undefined)
  }
}
