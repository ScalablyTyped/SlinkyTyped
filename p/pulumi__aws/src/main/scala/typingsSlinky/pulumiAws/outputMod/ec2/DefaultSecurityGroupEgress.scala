package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSecurityGroupEgress extends js.Object {
  var cidrBlocks: js.UndefOr[js.Array[String]] = js.native
  /**
    * The description of the security group
    */
  var description: js.UndefOr[String] = js.native
  var fromPort: Double = js.native
  var ipv6CidrBlocks: js.UndefOr[js.Array[String]] = js.native
  var prefixListIds: js.UndefOr[js.Array[String]] = js.native
  var protocol: String = js.native
  var securityGroups: js.UndefOr[js.Array[String]] = js.native
  var self: js.UndefOr[Boolean] = js.native
  var toPort: Double = js.native
}

object DefaultSecurityGroupEgress {
  @scala.inline
  def apply(fromPort: Double, protocol: String, toPort: Double): DefaultSecurityGroupEgress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSecurityGroupEgress]
  }
  @scala.inline
  implicit class DefaultSecurityGroupEgressOps[Self <: DefaultSecurityGroupEgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withToPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrBlocks(value: js.Array[String]): Self = {
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
    def withDescription(value: String): Self = {
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
    def withIpv6CidrBlocks(value: js.Array[String]): Self = {
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
    def withPrefixListIds(value: js.Array[String]): Self = {
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
    def withSecurityGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSelf(value: Boolean): Self = {
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
  }
  
}

