package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclIngress extends js.Object {
  /**
    * The action to take.
    */
  var action: String = js.native
  /**
    * The CIDR block to match. This must be a
    * valid network mask.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  /**
    * The from port to match.
    */
  var fromPort: Double = js.native
  /**
    * The ICMP type code to be used. Default 0.
    */
  var icmpCode: js.UndefOr[Double] = js.native
  /**
    * The ICMP type to be used. Default 0.
    */
  var icmpType: js.UndefOr[Double] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The protocol to match. If using the -1 'all'
    * protocol, you must specify a from and to port of 0.
    */
  var protocol: String = js.native
  /**
    * The rule number. Used for ordering.
    */
  var ruleNo: Double = js.native
  /**
    * The to port to match.
    */
  var toPort: Double = js.native
}

object NetworkAclIngress {
  @scala.inline
  def apply(action: String, fromPort: Double, protocol: String, ruleNo: Double, toPort: Double): NetworkAclIngress = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclIngress]
  }
  @scala.inline
  implicit class NetworkAclIngressOps[Self <: NetworkAclIngress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleNo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrBlock(value: String): Self = {
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
    def withIcmpCode(value: Double): Self = {
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
    def withIcmpType(value: Double): Self = {
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
    def withIpv6CidrBlock(value: String): Self = {
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

