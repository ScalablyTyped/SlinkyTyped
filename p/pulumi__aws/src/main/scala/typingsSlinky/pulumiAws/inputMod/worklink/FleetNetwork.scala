package typingsSlinky.pulumiAws.inputMod.worklink

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetNetwork extends js.Object {
  /**
    * A list of security group IDs associated with access to the provided subnets.
    */
  var securityGroupIds: Input[js.Array[Input[String]]] = js.native
  /**
    * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The VPC ID with connectivity to associated websites.
    */
  var vpcId: Input[String] = js.native
}

object FleetNetwork {
  @scala.inline
  def apply(
    securityGroupIds: Input[js.Array[Input[String]]],
    subnetIds: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): FleetNetwork = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetNetwork]
  }
  @scala.inline
  implicit class FleetNetworkOps[Self <: FleetNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

