package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionVpcInfo extends js.Object {
  /**
    * The IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the IPv4 CIDR blocks for the VPC.
    */
  var CidrBlockSet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CidrBlockSet] = js.native
  /**
    * The IPv6 CIDR block for the VPC.
    */
  var Ipv6CidrBlockSet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Ipv6CidrBlockSet] = js.native
  /**
    * The AWS account ID of the VPC owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Information about the VPC peering connection options for the accepter or requester VPC.
    */
  var PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription] = js.native
  /**
    * The Region in which the VPC is located.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object VpcPeeringConnectionVpcInfo {
  @scala.inline
  def apply(): VpcPeeringConnectionVpcInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionVpcInfo]
  }
  @scala.inline
  implicit class VpcPeeringConnectionVpcInfoOps[Self <: VpcPeeringConnectionVpcInfo] (val x: Self) extends AnyVal {
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
    def withCidrBlockSet(value: CidrBlockSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlockSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockSet")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrBlockSet(value: Ipv6CidrBlockSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlockSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeeringOptions(value: VpcPeeringConnectionOptionsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeeringOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeeringOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeeringOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

