package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcEndpointRequest extends StObject {
  
  /**
    * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
    */
  var AddRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList] = js.native
  
  /**
    * (Interface endpoint) One or more security group IDs to associate with the network interface.
    */
  var AddSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList] = js.native
  
  /**
    * (Interface and Gateway Load Balancer endpoints) One or more subnet IDs in which to serve the endpoint. For a Gateway Load Balancer endpoint, you can specify only one subnet.
    */
  var AddSubnetIds: js.UndefOr[VpcEndpointSubnetIdList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * (Interface and gateway endpoints) A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
    */
  var PolicyDocument: js.UndefOr[String] = js.native
  
  /**
    * (Interface endpoint) Indicates whether a private hosted zone is associated with the VPC.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
    */
  var RemoveRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList] = js.native
  
  /**
    * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
    */
  var RemoveSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList] = js.native
  
  /**
    * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
    */
  var RemoveSubnetIds: js.UndefOr[VpcEndpointSubnetIdList] = js.native
  
  /**
    * (Gateway endpoint) Specify true to reset the policy document to the default policy. The default policy allows full access to the service.
    */
  var ResetPolicy: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: typingsSlinky.awsSdk.ec2Mod.VpcEndpointId = js.native
}
object ModifyVpcEndpointRequest {
  
  @scala.inline
  def apply(VpcEndpointId: VpcEndpointId): ModifyVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(VpcEndpointId = VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointRequest]
  }
  
  @scala.inline
  implicit class ModifyVpcEndpointRequestMutableBuilder[Self <: ModifyVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRouteTableIds(value: VpcEndpointRouteTableIdList): Self = StObject.set(x, "AddRouteTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddRouteTableIdsUndefined: Self = StObject.set(x, "AddRouteTableIds", js.undefined)
    
    @scala.inline
    def setAddRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "AddRouteTableIds", js.Array(value :_*))
    
    @scala.inline
    def setAddSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = StObject.set(x, "AddSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSecurityGroupIdsUndefined: Self = StObject.set(x, "AddSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setAddSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "AddSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setAddSubnetIds(value: VpcEndpointSubnetIdList): Self = StObject.set(x, "AddSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSubnetIdsUndefined: Self = StObject.set(x, "AddSubnetIds", js.undefined)
    
    @scala.inline
    def setAddSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "AddSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: String): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    @scala.inline
    def setPrivateDnsEnabled(value: Boolean): Self = StObject.set(x, "PrivateDnsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsEnabledUndefined: Self = StObject.set(x, "PrivateDnsEnabled", js.undefined)
    
    @scala.inline
    def setRemoveRouteTableIds(value: VpcEndpointRouteTableIdList): Self = StObject.set(x, "RemoveRouteTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRouteTableIdsUndefined: Self = StObject.set(x, "RemoveRouteTableIds", js.undefined)
    
    @scala.inline
    def setRemoveRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "RemoveRouteTableIds", js.Array(value :_*))
    
    @scala.inline
    def setRemoveSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = StObject.set(x, "RemoveSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSecurityGroupIdsUndefined: Self = StObject.set(x, "RemoveSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setRemoveSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "RemoveSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setRemoveSubnetIds(value: VpcEndpointSubnetIdList): Self = StObject.set(x, "RemoveSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSubnetIdsUndefined: Self = StObject.set(x, "RemoveSubnetIds", js.undefined)
    
    @scala.inline
    def setRemoveSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "RemoveSubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setResetPolicy(value: Boolean): Self = StObject.set(x, "ResetPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetPolicyUndefined: Self = StObject.set(x, "ResetPolicy", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
  }
}
