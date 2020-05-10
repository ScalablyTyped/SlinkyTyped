package typingsSlinky.pulumiAws.inputMod.cloudwatch

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetEcsTargetNetworkConfiguration extends js.Object {
  /**
    * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
    */
  var assignPublicIp: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The subnets associated with the task or service.
    */
  var subnets: Input[js.Array[Input[String]]] = js.native
}

object EventTargetEcsTargetNetworkConfiguration {
  @scala.inline
  def apply(subnets: Input[js.Array[Input[String]]]): EventTargetEcsTargetNetworkConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetEcsTargetNetworkConfiguration]
  }
  @scala.inline
  implicit class EventTargetEcsTargetNetworkConfigurationOps[Self <: EventTargetEcsTargetNetworkConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnets(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignPublicIp(value: Input[Boolean]): Self = {
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
    def withSecurityGroups(value: Input[js.Array[Input[String]]]): Self = {
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

