package typingsSlinky.pulumiAws.securityGroupRuleMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupRuleArgs extends js.Object {
  /**
    * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
    */
  val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The start port (or ICMP type number if protocol is "icmp" or "icmpv6").
    */
  val fromPort: Input[Double] = js.native
  /**
    * List of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints).
    * Only valid with `egress`.
    */
  val prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  val protocol: Input[String] = js.native
  /**
    * The security group to apply this rule to.
    */
  val securityGroupId: Input[String] = js.native
  /**
    * If true, the security group itself will be added as
    * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
    */
  val self: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The security group id to allow access to/from,
    * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
    */
  val sourceSecurityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The end port (or ICMP code if protocol is "icmp").
    */
  val toPort: Input[Double] = js.native
  /**
    * The type of rule being created. Valid options are `ingress` (inbound)
    * or `egress` (outbound).
    */
  val `type`: Input[String] = js.native
}

object SecurityGroupRuleArgs {
  @scala.inline
  def apply(
    fromPort: Input[Double],
    protocol: Input[String],
    securityGroupId: Input[String],
    toPort: Input[Double],
    `type`: Input[String]
  ): SecurityGroupRuleArgs = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupRuleArgs]
  }
  @scala.inline
  implicit class SecurityGroupRuleArgsOps[Self <: SecurityGroupRuleArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrBlocks(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlocks")(js.undefined)
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
    def withIpv6CidrBlocks(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixListIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixListIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSelf(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSecurityGroupId")(js.undefined)
        ret
    }
  }
  
}

