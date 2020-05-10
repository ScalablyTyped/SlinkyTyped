package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.AnonMethod
import typingsSlinky.gapiCalendar.gapiCalendarStrings.calendarNumbersignevents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events_ extends js.Object {
  // The user's access role for this calendar. Read-only. Possible values are:
  var accessRole: AccessRole = js.native
  var defaultReminders: js.Array[AnonMethod] = js.native
  var description: String = js.native
  var etag: typingsSlinky.gapiCalendar.gapi.client.calendar.etag = js.native
  var items: js.Array[Event] = js.native
  var kind: calendarNumbersignevents = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var nextSyncToken: js.UndefOr[String] = js.native
  var summary: String = js.native
  var timeZone: String = js.native
  var updated: datetime = js.native
}

object Events_ {
  @scala.inline
  def apply(
    accessRole: AccessRole,
    defaultReminders: js.Array[AnonMethod],
    description: String,
    etag: etag,
    items: js.Array[Event],
    kind: calendarNumbersignevents,
    summary: String,
    timeZone: String,
    updated: datetime
  ): Events_ = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events_]
  }
  @scala.inline
  implicit class Events_Ops[Self <: Events_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessRole(value: AccessRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultReminders(value: js.Array[AnonMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultReminders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: etag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: calendarNumbersignevents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSyncToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSyncToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSyncToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSyncToken")(js.undefined)
        ret
    }
  }
  
}

