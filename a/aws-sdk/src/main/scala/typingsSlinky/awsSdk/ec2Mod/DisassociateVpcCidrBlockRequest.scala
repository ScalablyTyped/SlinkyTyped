package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateVpcCidrBlockRequest extends js.Object {
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: VpcCidrAssociationId = js.native
}

object DisassociateVpcCidrBlockRequest {
  @scala.inline
  def apply(AssociationId: VpcCidrAssociationId): DisassociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVpcCidrBlockRequest]
  }
  @scala.inline
  implicit class DisassociateVpcCidrBlockRequestOps[Self <: DisassociateVpcCidrBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: VpcCidrAssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

