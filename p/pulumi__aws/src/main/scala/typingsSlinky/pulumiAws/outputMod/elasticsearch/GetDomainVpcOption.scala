package typingsSlinky.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainVpcOption extends js.Object {
  /**
    * The availability zones used by the domain.
    */
  var availabilityZones: js.Array[String] = js.native
  /**
    * The security groups used by the domain.
    */
  var securityGroupIds: js.Array[String] = js.native
  /**
    * The subnets used by the domain.
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The VPC used by the domain.
    */
  var vpcId: String = js.native
}

object GetDomainVpcOption {
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): GetDomainVpcOption = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainVpcOption]
  }
  @scala.inline
  implicit class GetDomainVpcOptionOps[Self <: GetDomainVpcOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
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

