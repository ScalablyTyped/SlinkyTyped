package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateVPCWithHostedZoneResponse extends js.Object {
  /**
    * A complex type that describes the changes made to your hosted zone.
    */
  var ChangeInfo: typingsSlinky.awsSdk.route53Mod.ChangeInfo = js.native
}

object AssociateVPCWithHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): AssociateVPCWithHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVPCWithHostedZoneResponse]
  }
  @scala.inline
  implicit class AssociateVPCWithHostedZoneResponseOps[Self <: AssociateVPCWithHostedZoneResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeInfo(value: ChangeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

