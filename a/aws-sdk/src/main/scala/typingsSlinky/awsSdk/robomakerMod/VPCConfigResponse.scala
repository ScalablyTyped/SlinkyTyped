package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPCConfigResponse extends js.Object {
  /**
    * A boolean indicating if a public IP was assigned.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.native
  /**
    * A list of security group IDs associated with the simulation job.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  /**
    * A list of subnet IDs associated with the simulation job.
    */
  var subnets: js.UndefOr[Subnets] = js.native
  /**
    * The VPC ID associated with your simulation job.
    */
  var vpcId: js.UndefOr[GenericString] = js.native
}

object VPCConfigResponse {
  @scala.inline
  def apply(): VPCConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCConfigResponse]
  }
  @scala.inline
  implicit class VPCConfigResponseOps[Self <: VPCConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignPublicIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignPublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignPublicIp")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnets(value: Subnets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

