package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingParticipantInfo extends js.Object {
  var identity: js.UndefOr[IdentitySet] = js.native
  var upn: js.UndefOr[String] = js.native
}

object MeetingParticipantInfo {
  @scala.inline
  def apply(): MeetingParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipantInfo]
  }
  @scala.inline
  implicit class MeetingParticipantInfoOps[Self <: MeetingParticipantInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.undefined)
        ret
    }
    @scala.inline
    def withUpn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upn")(js.undefined)
        ret
    }
  }
  
}

