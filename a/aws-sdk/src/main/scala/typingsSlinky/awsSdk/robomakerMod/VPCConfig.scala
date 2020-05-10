package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPCConfig extends js.Object {
  /**
    * A boolean indicating whether to assign a public IP address.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.native
  /**
    * A list of one or more security groups IDs in your VPC.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  /**
    * A list of one or more subnet IDs in your VPC.
    */
  var subnets: Subnets = js.native
}

object VPCConfig {
  @scala.inline
  def apply(subnets: Subnets): VPCConfig = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCConfig]
  }
  @scala.inline
  implicit class VPCConfigOps[Self <: VPCConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnets(value: Subnets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

