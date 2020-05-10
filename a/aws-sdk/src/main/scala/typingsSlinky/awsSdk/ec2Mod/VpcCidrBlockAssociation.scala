package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcCidrBlockAssociation extends js.Object {
  /**
    * The association ID for the IPv4 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.native
}

object VpcCidrBlockAssociation {
  @scala.inline
  def apply(): VpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcCidrBlockAssociation]
  }
  @scala.inline
  implicit class VpcCidrBlockAssociationOps[Self <: VpcCidrBlockAssociation] (val x: Self) extends AnyVal {
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
    def withCidrBlockState(value: VpcCidrBlockState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlockState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlockState")(js.undefined)
        ret
    }
  }
  
}

