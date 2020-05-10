package typingsSlinky.pulumiAws.vpcDhcpOptionsAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcDhcpOptionsAssociationState extends js.Object {
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcDhcpOptionsAssociationState {
  @scala.inline
  def apply(): VpcDhcpOptionsAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcDhcpOptionsAssociationState]
  }
  @scala.inline
  implicit class VpcDhcpOptionsAssociationStateOps[Self <: VpcDhcpOptionsAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDhcpOptionsId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcpOptionsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDhcpOptionsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcpOptionsId")(js.undefined)
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

