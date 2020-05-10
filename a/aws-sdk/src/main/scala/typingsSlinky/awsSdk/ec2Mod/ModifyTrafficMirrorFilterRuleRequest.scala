package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterRuleRequest extends js.Object {
  /**
    * The description to assign to the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The destination ports that are associated with the Traffic Mirror rule.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The protocol, for example TCP, to assign to the Traffic Mirror rule.
    */
  var Protocol: js.UndefOr[Integer] = js.native
  /**
    * The properties that you want to remove from the Traffic Mirror filter rule. When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
    */
  var RemoveFields: js.UndefOr[TrafficMirrorFilterRuleFieldList] = js.native
  /**
    * The action to assign to the rule.
    */
  var RuleAction: js.UndefOr[TrafficMirrorRuleAction] = js.native
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.native
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.native
  /**
    * The port range to assign to the Traffic Mirror rule.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * The type of traffic (ingress | egress) to assign to the rule.
    */
  var TrafficDirection: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficDirection] = js.native
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterRuleId = js.native
}

object ModifyTrafficMirrorFilterRuleRequest {
  @scala.inline
  def apply(TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId): ModifyTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleRequest]
  }
  @scala.inline
  implicit class ModifyTrafficMirrorFilterRuleRequestOps[Self <: ModifyTrafficMirrorFilterRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficMirrorFilterRuleId(value: TrafficMirrorFilterRuleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterRuleId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDestinationPortRange(value: TrafficMirrorPortRangeRequest): Self = {
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
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
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
    def withRemoveFields(value: TrafficMirrorFilterRuleFieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveFields")(js.undefined)
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
    def withSourcePortRange(value: TrafficMirrorPortRangeRequest): Self = {
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
  }
  
}

