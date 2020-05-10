package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSubnetCidrBlockRequest extends js.Object {
  /**
    * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
    */
  var Ipv6CidrBlock: String = js.native
  /**
    * The ID of your subnet.
    */
  var SubnetId: typingsSlinky.awsSdk.ec2Mod.SubnetId = js.native
}

object AssociateSubnetCidrBlockRequest {
  @scala.inline
  def apply(Ipv6CidrBlock: String, SubnetId: SubnetId): AssociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(Ipv6CidrBlock = Ipv6CidrBlock.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSubnetCidrBlockRequest]
  }
  @scala.inline
  implicit class AssociateSubnetCidrBlockRequestOps[Self <: AssociateSubnetCidrBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

