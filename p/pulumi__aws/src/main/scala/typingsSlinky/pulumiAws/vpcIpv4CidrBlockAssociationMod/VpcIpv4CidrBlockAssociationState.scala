package typingsSlinky.pulumiAws.vpcIpv4CidrBlockAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcIpv4CidrBlockAssociationState extends js.Object {
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcIpv4CidrBlockAssociationState {
  @scala.inline
  def apply(): VpcIpv4CidrBlockAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcIpv4CidrBlockAssociationState]
  }
  @scala.inline
  implicit class VpcIpv4CidrBlockAssociationStateOps[Self <: VpcIpv4CidrBlockAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

