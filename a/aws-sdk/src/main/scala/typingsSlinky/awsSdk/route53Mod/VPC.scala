package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPC extends js.Object {
  var VPCId: js.UndefOr[typingsSlinky.awsSdk.route53Mod.VPCId] = js.native
  /**
    * (Private hosted zones only) The region that an Amazon VPC was created in.
    */
  var VPCRegion: js.UndefOr[typingsSlinky.awsSdk.route53Mod.VPCRegion] = js.native
}

object VPC {
  @scala.inline
  def apply(): VPC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPC]
  }
  @scala.inline
  implicit class VPCOps[Self <: VPC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVPCId(value: VPCId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(js.undefined)
        ret
    }
    @scala.inline
    def withVPCRegion(value: VPCRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCRegion")(js.undefined)
        ret
    }
  }
  
}

