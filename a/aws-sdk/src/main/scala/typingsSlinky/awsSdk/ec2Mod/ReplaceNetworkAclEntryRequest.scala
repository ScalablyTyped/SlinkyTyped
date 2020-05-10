package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceNetworkAclEntryRequest extends js.Object {
  /**
    * The IPv4 network range to allow or deny, in CIDR notation (for example 172.16.0.0/24).
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to replace the egress rule. Default: If no value is specified, we replace the ingress rule.
    */
  var Egress: Boolean = js.native
  /**
    * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
    */
  var IcmpTypeCode: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.IcmpTypeCode] = js.native
  /**
    * The IPv6 network range to allow or deny, in CIDR notation (for example 2001:bd8:1234:1a00::/64).
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The ID of the ACL.
    */
  var NetworkAclId: typingsSlinky.awsSdk.ec2Mod.NetworkAclId = js.native
  /**
    * TCP or UDP protocols: The range of ports the rule applies to. Required if specifying protocol 6 (TCP) or 17 (UDP).
    */
  var PortRange: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PortRange] = js.native
  /**
    * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP types or codes that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP types and codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
    */
  var Protocol: String = js.native
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: typingsSlinky.awsSdk.ec2Mod.RuleAction = js.native
  /**
    * The rule number of the entry to replace.
    */
  var RuleNumber: Integer = js.native
}

object ReplaceNetworkAclEntryRequest {
  @scala.inline
  def apply(
    Egress: Boolean,
    NetworkAclId: NetworkAclId,
    Protocol: String,
    RuleAction: RuleAction,
    RuleNumber: Integer
  ): ReplaceNetworkAclEntryRequest = {
    val __obj = js.Dynamic.literal(Egress = Egress.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], RuleAction = RuleAction.asInstanceOf[js.Any], RuleNumber = RuleNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceNetworkAclEntryRequest]
  }
  @scala.inline
  implicit class ReplaceNetworkAclEntryRequestOps[Self <: ReplaceNetworkAclEntryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Egress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkAclId(value: NetworkAclId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleAction(value: RuleAction): Self = {
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
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlock")(js.undefined)
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
    def withIcmpTypeCode(value: IcmpTypeCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IcmpTypeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcmpTypeCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IcmpTypeCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withPortRange(value: PortRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortRange")(js.undefined)
        ret
    }
  }
  
}

