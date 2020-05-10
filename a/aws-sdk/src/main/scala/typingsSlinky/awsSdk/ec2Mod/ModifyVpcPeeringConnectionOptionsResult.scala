package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcPeeringConnectionOptionsResult extends js.Object {
  /**
    * Information about the VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.native
  /**
    * Information about the VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.native
}

object ModifyVpcPeeringConnectionOptionsResult {
  @scala.inline
  def apply(): ModifyVpcPeeringConnectionOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsResult]
  }
  @scala.inline
  implicit class ModifyVpcPeeringConnectionOptionsResultOps[Self <: ModifyVpcPeeringConnectionOptionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterPeeringConnectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepterPeeringConnectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterPeeringConnectionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPeeringConnectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPeeringConnectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPeeringConnectionOptions")(js.undefined)
        ret
    }
  }
  
}

