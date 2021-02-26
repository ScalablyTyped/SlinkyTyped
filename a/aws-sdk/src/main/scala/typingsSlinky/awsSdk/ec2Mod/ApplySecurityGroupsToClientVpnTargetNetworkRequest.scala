package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySecurityGroupsToClientVpnTargetNetworkRequest extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied to an associated target network.
    */
  var SecurityGroupIds: ClientVpnSecurityGroupIdSet = js.native
  
  /**
    * The ID of the VPC in which the associated target network is located.
    */
  var VpcId: typingsSlinky.awsSdk.ec2Mod.VpcId = js.native
}
object ApplySecurityGroupsToClientVpnTargetNetworkRequest {
  
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    SecurityGroupIds: ClientVpnSecurityGroupIdSet,
    VpcId: VpcId
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkRequest]
  }
  
  @scala.inline
  implicit class ApplySecurityGroupsToClientVpnTargetNetworkRequestMutableBuilder[Self <: ApplySecurityGroupsToClientVpnTargetNetworkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
