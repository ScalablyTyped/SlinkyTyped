package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vpc extends js.Object {
  /**
    * The primary IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the IPv4 CIDR blocks associated with the VPC.
    */
  var CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet] = js.native
  /**
    * The ID of the set of DHCP options you've associated with the VPC (or default if the default options are associated with the VPC).
    */
  var DhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * The allowed tenancy of instances launched into the VPC.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  /**
    * Information about the IPv6 CIDR blocks associated with the VPC.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet] = js.native
  /**
    * Indicates whether the VPC is the default VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The current state of the VPC.
    */
  var State: js.UndefOr[VpcState] = js.native
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Vpc {
  @scala.inline
  def apply(): Vpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vpc]
  }
  @scala.inline
  implicit class VpcOps[Self <: Vpc] (val x: Self) extends AnyVal {
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
    def withCidrBlockAssociationSet(value: VpcCidrBlockAssociationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockAssociationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlockAssociationSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockAssociationSet")(js.undefined)
        ret
    }
    @scala.inline
    def withDhcpOptionsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpOptionsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhcpOptionsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DhcpOptionsId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTenancy(value: Tenancy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrBlockAssociationSet(value: VpcIpv6CidrBlockAssociationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockAssociationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlockAssociationSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockAssociationSet")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(js.undefined)
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
    def withState(value: VpcState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

