package typingsSlinky.gapiCalendar.anon

import typingsSlinky.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typingsSlinky.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  var additionalGuests: js.UndefOr[integer] = js.native
  var comment: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var email: String = js.native
  var id: String = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var organizer: Boolean = js.native
  var resource: Boolean = js.native
  var responseStatus: AttendeeResponseStatus = js.native
  var self: Boolean = js.native
}

object Comment {
  @scala.inline
  def apply(
    email: String,
    id: String,
    organizer: Boolean,
    resource: Boolean,
    responseStatus: AttendeeResponseStatus,
    self: Boolean
  ): Comment = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStatus(value: AttendeeResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
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
  }
  
}

