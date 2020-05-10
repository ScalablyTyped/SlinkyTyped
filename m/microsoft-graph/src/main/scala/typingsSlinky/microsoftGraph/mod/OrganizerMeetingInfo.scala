package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizerMeetingInfo extends MeetingInfo {
  var organizer: js.UndefOr[IdentitySet] = js.native
}

object OrganizerMeetingInfo {
  @scala.inline
  def apply(): OrganizerMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizerMeetingInfo]
  }
  @scala.inline
  implicit class OrganizerMeetingInfoOps[Self <: OrganizerMeetingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizer(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(js.undefined)
        ret
    }
  }
  
}

