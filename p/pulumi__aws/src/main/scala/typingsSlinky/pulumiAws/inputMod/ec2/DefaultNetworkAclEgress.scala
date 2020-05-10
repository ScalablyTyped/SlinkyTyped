package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultNetworkAclEgress extends js.Object {
  /**
    * The action to take.
    */
  var action: Input[String] = js.native
  /**
    * The CIDR block to match. This must be a
    * valid network mask.
    */
  var cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The from port to match.
    */
  var fromPort: Input[Double] = js.native
  /**
    * The ICMP type code to be used. Default 0.
    */
  var icmpCode: js.UndefOr[Input[Double]] = js.native
  /**
    * The ICMP type to be used. Default 0.
    */
  var icmpType: js.UndefOr[Input[Double]] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The protocol to match. If using the -1 'all'
    * protocol, you must specify a from and to port of 0.
    */
  var protocol: Input[String] = js.native
  /**
    * The rule number. Used for ordering.
    */
  var ruleNo: Input[Double] = js.native
  /**
    * The to port to match.
    */
  var toPort: Input[Double] = js.native
}

object DefaultNetworkAclEgress {
  @scala.inline
  def apply(
    action: Input[String],
    fromPort: Input[Double],
    protocol: Input[String],
    ruleNo: Input[Double],
    toPort: Input[Double]
  ): DefaultNetworkAclEgress = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNetworkAclEgress]
  }
  @scala.inline
  implicit class DefaultNetworkAclEgressOps[Self <: DefaultNetworkAclEgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withRuleNo(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(value.asInstanceOf[js.Any])
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
    def withIcmpCode(value: Input[Double]): Self = {
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
    def withIcmpType(value: Input[Double]): Self = {
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
  }
  
}

