package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointRequest extends js.Object {
  /**
    * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
    */
  var AddRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList] = js.native
  /**
    * (Interface endpoint) One or more security group IDs to associate with the network interface.
    */
  var AddSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList] = js.native
  /**
    * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
    */
  var AddSubnetIds: js.UndefOr[VpcEndpointSubnetIdList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
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
  implicit class ModifyVpcEndpointRequestOps[Self <: ModifyVpcEndpointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcEndpointId(value: VpcEndpointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddRouteTableIds(value: VpcEndpointRouteTableIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddRouteTableIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRouteTableIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddRouteTableIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSubnetIds(value: VpcEndpointSubnetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDnsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveRouteTableIds(value: VpcEndpointRouteTableIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveRouteTableIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveRouteTableIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveRouteTableIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSecurityGroupIds(value: VpcEndpointSecurityGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSubnetIds(value: VpcEndpointSubnetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withResetPolicy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetPolicy")(js.undefined)
        ret
    }
  }
  
}

