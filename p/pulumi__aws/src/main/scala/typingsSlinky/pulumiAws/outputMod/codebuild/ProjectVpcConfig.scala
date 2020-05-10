package typingsSlinky.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectVpcConfig extends js.Object {
  /**
    * The security group IDs to assign to running builds.
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * The subnet IDs within which to run builds.
    */
  var subnets: js.Array[String] = js.native
  /**
    * The ID of the VPC within which to run builds.
    */
  var vpcId: String = js.native
}

object ProjectVpcConfig {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String], vpcId: String): ProjectVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectVpcConfig]
  }
  @scala.inline
  implicit class ProjectVpcConfigOps[Self <: ProjectVpcConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

