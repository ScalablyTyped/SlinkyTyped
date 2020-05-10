package typingsSlinky.pulumiAws.networkAclRuleMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclRuleArgs extends js.Object {
  /**
    * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
    */
  val egress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The from port to match.
    */
  val fromPort: js.UndefOr[Input[Double]] = js.native
  /**
    * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpCode: js.UndefOr[Input[String]] = js.native
  /**
    * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
    */
  val icmpType: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv6 CIDR block to allow or deny.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network ACL.
    */
  val networkAclId: Input[String] = js.native
  /**
    * The protocol. A value of -1 means all protocols.
    */
  val protocol: Input[String] = js.native
  /**
    * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
    */
  val ruleAction: Input[String] = js.native
  /**
    * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
    */
  val ruleNumber: Input[Double] = js.native
  /**
    * The to port to match.
    */
  val toPort: js.UndefOr[Input[Double]] = js.native
}

object NetworkAclRuleArgs {
  @scala.inline
  def apply(
    networkAclId: Input[String],
    protocol: Input[String],
    ruleAction: Input[String],
    ruleNumber: Input[Double]
  ): NetworkAclRuleArgs = {
    val __obj = js.Dynamic.literal(networkAclId = networkAclId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleAction = ruleAction.asInstanceOf[js.Any], ruleNumber = ruleNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclRuleArgs]
  }
  @scala.inline
  implicit class NetworkAclRuleArgsOps[Self <: NetworkAclRuleArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkAclId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
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
    def withCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withEgress(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egress")(js.undefined)
        ret
    }
    @scala.inline
    def withFromPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(js.undefined)
        ret
    }
    @scala.inline
    def withIcmpCode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icmpCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcmpCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icmpCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIcmpType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icmpType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcmpType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icmpType")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withToPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(js.undefined)
        ret
    }
  }
  
}

