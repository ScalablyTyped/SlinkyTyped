package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCompanyNetworkConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: typingsSlinky.awsSdk.worklinkMod.SecurityGroupIds = js.native
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: typingsSlinky.awsSdk.worklinkMod.SubnetIds = js.native
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: typingsSlinky.awsSdk.worklinkMod.VpcId = js.native
}

object UpdateCompanyNetworkConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): UpdateCompanyNetworkConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCompanyNetworkConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateCompanyNetworkConfigurationRequestOps[Self <: UpdateCompanyNetworkConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

