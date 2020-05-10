package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfig extends js.Object {
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
    */
  var SecurityGroupIds: VpcSecurityGroupIds = js.native
  /**
    * The ID of the subnets in the VPC to which you want to connect your training job or model. For information about the availability of specific instance types, see Supported Instance Types and Availability Zones.
    */
  var Subnets: typingsSlinky.awsSdk.sagemakerMod.Subnets = js.native
}

object VpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: VpcSecurityGroupIds, Subnets: Subnets): VpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfig]
  }
  @scala.inline
  implicit class VpcConfigOps[Self <: VpcConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupIds(value: VpcSecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnets(value: Subnets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

