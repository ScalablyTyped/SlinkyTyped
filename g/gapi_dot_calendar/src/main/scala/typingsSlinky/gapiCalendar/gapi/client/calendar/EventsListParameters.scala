package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsListParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  var calendarId: String = js.native
  var iCalUID: js.UndefOr[String] = js.native
  var maxAttendees: js.UndefOr[integer] = js.native
  var maxResults: js.UndefOr[integer] = js.native
  var orderBy: js.UndefOr[EventsOrder] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var privateExtendedProperty: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var sharedExtendedProperty: js.UndefOr[String] = js.native
  var showDeleted: js.UndefOr[Boolean] = js.native
  var showHiddenInvitations: js.UndefOr[Boolean] = js.native
  var singleEvents: js.UndefOr[Boolean] = js.native
  var syncToken: js.UndefOr[SyncToken] = js.native
  var timeMax: js.UndefOr[datetime] = js.native
  var timeMin: js.UndefOr[datetime] = js.native
  var timeZone: js.UndefOr[String] = js.native
  var updatedMin: js.UndefOr[datetime] = js.native
}

object EventsListParameters {
  @scala.inline
  def apply(calendarId: String): EventsListParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsListParameters]
  }
  @scala.inline
  implicit class EventsListParametersOps[Self <: EventsListParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysIncludeEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysIncludeEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysIncludeEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysIncludeEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withICalUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCalUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICalUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCalUID")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttendees(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttendees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttendees")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: EventsOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateExtendedProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateExtendedProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateExtendedProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateExtendedProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedExtendedProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedExtendedProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedExtendedProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedExtendedProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHiddenInvitations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHiddenInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHiddenInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHiddenInvitations")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncToken(value: SyncToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMax(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMin(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedMin(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedMin")(js.undefined)
        ret
    }
  }
  
}

