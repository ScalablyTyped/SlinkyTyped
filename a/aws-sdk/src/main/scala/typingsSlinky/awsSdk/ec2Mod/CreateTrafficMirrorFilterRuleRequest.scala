package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorFilterRuleRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The description of the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * The destination port range.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The protocol, for example UDP, to assign to the Traffic Mirror rule. For information about the protocol value, see Protocol Numbers on the Internet Assigned Numbers Authority (IANA) website.
    */
  var Protocol: js.UndefOr[Integer] = js.native
  /**
    * The action to take (accept | reject) on the filtered traffic.
    */
  var RuleAction: TrafficMirrorRuleAction = js.native
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: Integer = js.native
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: String = js.native
  /**
    * The source port range.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.native
  /**
    * The type of traffic (ingress | egress).
    */
  var TrafficDirection: typingsSlinky.awsSdk.ec2Mod.TrafficDirection = js.native
  /**
    * The ID of the filter that this rule is associated with.
    */
  var TrafficMirrorFilterId: typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterId = js.native
}

object CreateTrafficMirrorFilterRuleRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    RuleAction: TrafficMirrorRuleAction,
    RuleNumber: Integer,
    SourceCidrBlock: String,
    TrafficDirection: TrafficDirection,
    TrafficMirrorFilterId: TrafficMirrorFilterId
  ): CreateTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], RuleAction = RuleAction.asInstanceOf[js.Any], RuleNumber = RuleNumber.asInstanceOf[js.Any], SourceCidrBlock = SourceCidrBlock.asInstanceOf[js.Any], TrafficDirection = TrafficDirection.asInstanceOf[js.Any], TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleRequest]
  }
  @scala.inline
  implicit class CreateTrafficMirrorFilterRuleRequestOps[Self <: CreateTrafficMirrorFilterRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleAction(value: TrafficMirrorRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficDirection(value: TrafficDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
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
  }
  
}

