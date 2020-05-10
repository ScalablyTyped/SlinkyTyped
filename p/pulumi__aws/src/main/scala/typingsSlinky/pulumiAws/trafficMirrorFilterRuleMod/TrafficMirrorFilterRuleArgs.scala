package typingsSlinky.pulumiAws.trafficMirrorFilterRuleMod

import typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleDestinationPortRange
import typingsSlinky.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleSourcePortRange
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRuleArgs extends js.Object {
  /**
    * A description of the traffic mirror filter rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  val destinationCidrBlock: Input[String] = js.native
  /**
    * The destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
    */
  val destinationPortRange: js.UndefOr[Input[TrafficMirrorFilterRuleDestinationPortRange]] = js.native
  /**
    * The protocol number, for example 17 (UDP), to assign to the Traffic Mirror rule. For information about the protocol value, see [Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml) on the Internet Assigned Numbers Authority (IANA) website.
    */
  val protocol: js.UndefOr[Input[Double]] = js.native
  /**
    * The action to take (accept | reject) on the filtered traffic. Valid values are `accept` and `reject`
    */
  val ruleAction: Input[String] = js.native
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  val ruleNumber: Input[Double] = js.native
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  val sourceCidrBlock: Input[String] = js.native
  /**
    * The source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
    */
  val sourcePortRange: js.UndefOr[Input[TrafficMirrorFilterRuleSourcePortRange]] = js.native
  /**
    * The direction of traffic to be captured. Valid values are `ingress` and `egress`
    */
  val trafficDirection: Input[String] = js.native
  /**
    * ID of the traffic mirror filter to which this rule should be added
    */
  val trafficMirrorFilterId: Input[String] = js.native
}

object TrafficMirrorFilterRuleArgs {
  @scala.inline
  def apply(
    destinationCidrBlock: Input[String],
    ruleAction: Input[String],
    ruleNumber: Input[Double],
    sourceCidrBlock: Input[String],
    trafficDirection: Input[String],
    trafficMirrorFilterId: Input[String]
  ): TrafficMirrorFilterRuleArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], ruleAction = ruleAction.asInstanceOf[js.Any], ruleNumber = ruleNumber.asInstanceOf[js.Any], sourceCidrBlock = sourceCidrBlock.asInstanceOf[js.Any], trafficDirection = trafficDirection.asInstanceOf[js.Any], trafficMirrorFilterId = trafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterRuleArgs]
  }
  @scala.inline
  implicit class TrafficMirrorFilterRuleArgsOps[Self <: TrafficMirrorFilterRuleArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleAction(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleNumber(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficDirection(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficMirrorFilterId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficMirrorFilterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationPortRange(value: Input[TrafficMirrorFilterRuleDestinationPortRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPortRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPortRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPortRange")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePortRange(value: Input[TrafficMirrorFilterRuleSourcePortRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePortRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePortRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePortRange")(js.undefined)
        ret
    }
  }
  
}

