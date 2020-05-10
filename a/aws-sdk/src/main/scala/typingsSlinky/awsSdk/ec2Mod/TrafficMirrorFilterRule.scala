package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRule extends js.Object {
  /**
    * The description of the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The destination CIDR block assigned to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The destination port range assigned to the Traffic Mirror rule.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRange] = js.native
  /**
    * The protocol assigned to the Traffic Mirror rule.
    */
  var Protocol: js.UndefOr[Integer] = js.native
  /**
    * The action assigned to the Traffic Mirror rule.
    */
  var RuleAction: js.UndefOr[TrafficMirrorRuleAction] = js.native
  /**
    * The rule number of the Traffic Mirror rule.
    */
  var RuleNumber: js.UndefOr[Integer] = js.native
  /**
    * The source CIDR block assigned to the Traffic Mirror rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.native
  /**
    * The source port range assigned to the Traffic Mirror rule.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRange] = js.native
  /**
    * The traffic direction assigned to the Traffic Mirror rule.
    */
  var TrafficDirection: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficDirection] = js.native
  /**
    * The ID of the Traffic Mirror filter that the rule is associated with.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: js.UndefOr[String] = js.native
}

object TrafficMirrorFilterRule {
  @scala.inline
  def apply(): TrafficMirrorFilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRule]
  }
  @scala.inline
  implicit class TrafficMirrorFilterRuleOps[Self <: TrafficMirrorFilterRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationPortRange(value: TrafficMirrorPortRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPortRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPortRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPortRange")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleAction(value: TrafficMirrorRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleAction")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePortRange(value: TrafficMirrorPortRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePortRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePortRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePortRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficDirection(value: TrafficDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficMirrorFilterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorFilterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficMirrorFilterRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorFilterRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterRuleId")(js.undefined)
        ret
    }
  }
  
}

