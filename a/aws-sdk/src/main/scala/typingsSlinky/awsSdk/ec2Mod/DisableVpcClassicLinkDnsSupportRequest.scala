package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcId] = js.native
}

object DisableVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(): DisableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableVpcClassicLinkDnsSupportRequest]
  }
  @scala.inline
  implicit class DisableVpcClassicLinkDnsSupportRequestOps[Self <: DisableVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcId(value: VpcId): Self = {
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

