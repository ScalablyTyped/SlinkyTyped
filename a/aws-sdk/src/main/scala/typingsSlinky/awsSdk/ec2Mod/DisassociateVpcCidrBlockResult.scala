package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateVpcCidrBlockResult extends js.Object {
  /**
    * Information about the IPv4 CIDR block association.
    */
  var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.native
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DisassociateVpcCidrBlockResult {
  @scala.inline
  def apply(): DisassociateVpcCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateVpcCidrBlockResult]
  }
  @scala.inline
  implicit class DisassociateVpcCidrBlockResultOps[Self <: DisassociateVpcCidrBlockResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlockAssociation(value: VpcCidrBlockAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlockAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockAssociation")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrBlockAssociation(value: VpcIpv6CidrBlockAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlockAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockAssociation")(js.undefined)
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

