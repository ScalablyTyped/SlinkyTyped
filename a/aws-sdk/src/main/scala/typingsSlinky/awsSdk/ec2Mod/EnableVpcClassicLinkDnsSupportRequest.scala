package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcId] = js.native
}

object EnableVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(): EnableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableVpcClassicLinkDnsSupportRequest]
  }
  @scala.inline
  implicit class EnableVpcClassicLinkDnsSupportRequestOps[Self <: EnableVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
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

