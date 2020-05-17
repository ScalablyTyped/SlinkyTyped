package typingsSlinky.gapiCalendar.anon

import typingsSlinky.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typingsSlinky.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalGuests extends js.Object {
  var additionalGuests: js.UndefOr[integer] = js.native
  var comment: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var email: String = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var responseStatus: js.UndefOr[AttendeeResponseStatus] = js.native
}

object AdditionalGuests {
  @scala.inline
  def apply(email: String): AdditionalGuests = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalGuests]
  }
  @scala.inline
  implicit class AdditionalGuestsOps[Self <: AdditionalGuests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalGuests(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalGuests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalGuests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalGuests")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseStatus(value: AttendeeResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(js.undefined)
        ret
    }
  }
  
}

