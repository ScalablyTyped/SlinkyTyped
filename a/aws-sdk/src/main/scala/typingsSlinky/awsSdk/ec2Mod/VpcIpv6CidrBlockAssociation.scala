package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcIpv6CidrBlockAssociation extends js.Object {
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the state of the CIDR block.
    */
  var Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.native
  /**
    * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
    */
  var Ipv6Pool: js.UndefOr[String] = js.native
  /**
    * The name of the location from which we advertise the IPV6 CIDR block.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
}

object VpcIpv6CidrBlockAssociation {
  @scala.inline
  def apply(): VpcIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcIpv6CidrBlockAssociation]
  }
  @scala.inline
  implicit class VpcIpv6CidrBlockAssociationOps[Self <: VpcIpv6CidrBlockAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
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
    def withIpv6CidrBlockState(value: VpcCidrBlockState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlockState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockState")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Pool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Pool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Pool")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkBorderGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkBorderGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkBorderGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkBorderGroup")(js.undefined)
        ret
    }
  }
  
}

