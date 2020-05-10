package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclEntry extends js.Object {
  /**
    * The IPv4 network range to allow or deny, in CIDR notation.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Indicates whether the rule is an egress rule (applied to traffic leaving the subnet).
    */
  var Egress: js.UndefOr[Boolean] = js.native
  /**
    * ICMP protocol: The ICMP type and code.
    */
  var IcmpTypeCode: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.IcmpTypeCode] = js.native
  /**
    * The IPv6 network range to allow or deny, in CIDR notation.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * TCP or UDP protocols: The range of ports the rule applies to.
    */
  var PortRange: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PortRange] = js.native
  /**
    * The protocol number. A value of "-1" means all protocols.
    */
  var Protocol: js.UndefOr[String] = js.native
  /**
    * Indicates whether to allow or deny the traffic that matches the rule.
    */
  var RuleAction: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.RuleAction] = js.native
  /**
    * The rule number for the entry. ACL entries are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.native
}

object NetworkAclEntry {
  @scala.inline
  def apply(): NetworkAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAclEntry]
  }
  @scala.inline
  implicit class NetworkAclEntryOps[Self <: NetworkAclEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Egress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Egress")(js.undefined)
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
    @scala.inline
    def withProtocol(value: String): Self = {
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
    def withRuleAction(value: RuleAction): Self = {
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
  }
  
}

