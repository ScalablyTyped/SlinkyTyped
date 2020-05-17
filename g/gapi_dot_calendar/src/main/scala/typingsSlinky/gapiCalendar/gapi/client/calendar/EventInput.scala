package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.anon.AdditionalGuests
import typingsSlinky.gapiCalendar.anon.Date
import typingsSlinky.gapiCalendar.anon.DateTime
import typingsSlinky.gapiCalendar.anon.Display
import typingsSlinky.gapiCalendar.anon.FileUrl
import typingsSlinky.gapiCalendar.anon.Overrides
import typingsSlinky.gapiCalendar.anon.Private
import typingsSlinky.gapiCalendar.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventInput extends js.Object {
  // Optional Properties
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  // Required Properties
  var attachments: js.UndefOr[js.Array[FileUrl]] = js.native
  var attendees: js.UndefOr[js.Array[AdditionalGuests]] = js.native
  var colorId: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var end: Date = js.native
  var extendedProperties: js.UndefOr[Private] = js.native
  var gadget: js.UndefOr[Display] = js.native
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var originalStartTime: js.UndefOr[DateTime] = js.native
  var recurrence: js.UndefOr[js.Array[String]] = js.native
  var reminders: js.UndefOr[Overrides] = js.native
  var sequence: js.UndefOr[integer] = js.native
  var source: js.UndefOr[Title] = js.native
  var start: Date = js.native
  var status: js.UndefOr[EventStatus] = js.native
  var summary: js.UndefOr[String] = js.native
  var transparency: js.UndefOr[EventTransparency] = js.native
  var visibility: js.UndefOr[EventVisibility] = js.native
}

object EventInput {
  @scala.inline
  def apply(end: Date, start: Date): EventInput = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInput]
  }
  @scala.inline
  implicit class EventInputOps[Self <: EventInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnyoneCanAddSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyoneCanAddSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyoneCanAddSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyoneCanAddSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[FileUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withAttendees(value: js.Array[AdditionalGuests]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(js.undefined)
        ret
    }
    @scala.inline
    def withColorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedProperties(value: Private): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withGadget(value: Display): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gadget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGadget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gadget")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestsCanInviteOthers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanInviteOthers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestsCanInviteOthers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanInviteOthers")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestsCanSeeOtherGuests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanSeeOtherGuests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestsCanSeeOtherGuests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanSeeOtherGuests")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalStartTime(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withReminders(value: Overrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminders")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EventStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparency(value: EventTransparency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: EventVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

