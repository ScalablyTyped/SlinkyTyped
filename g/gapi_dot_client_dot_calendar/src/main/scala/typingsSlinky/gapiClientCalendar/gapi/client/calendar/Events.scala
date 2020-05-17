package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /**
    * The user's access role for this calendar. Read-only. Possible values are:
    * - "none" - The user has no access.
    * - "freeBusyReader" - The user has read access to free/busy information.
    * - "reader" - The user has read access to the calendar. Private events will appear to users with reader access, but event details will be hidden.
    * - "writer" - The user has read and write access to the calendar. Private events will appear to users with writer access, and event details will be
    * visible.
    * - "owner" - The user has ownership of the calendar. This role has all of the permissions of the writer role with the additional ability to see and
    * manipulate ACLs.
    */
  var accessRole: js.UndefOr[String] = js.native
  /**
    * The default reminders on the calendar for the authenticated user. These reminders apply to all events on this calendar that do not explicitly override
    * them (i.e. do not have reminders.useDefault set to True).
    */
  var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.native
  /** Description of the calendar. Read-only. */
  var description: js.UndefOr[String] = js.native
  /** ETag of the collection. */
  var etag: js.UndefOr[String] = js.native
  /** List of events on the calendar. */
  var items: js.UndefOr[js.Array[Event]] = js.native
  /** Type of the collection ("calendar#events"). */
  var kind: js.UndefOr[String] = js.native
  /** Token used to access the next page of this result. Omitted if no further results are available, in which case nextSyncToken is provided. */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned. Omitted if further results are
    * available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
  /** Title of the calendar. Read-only. */
  var summary: js.UndefOr[String] = js.native
  /** The time zone of the calendar. Read-only. */
  var timeZone: js.UndefOr[String] = js.native
  /** Last modification time of the calendar (as a RFC3339 timestamp). Read-only. */
  var updated: js.UndefOr[String] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessRole")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultReminders(value: js.Array[EventReminder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultReminders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultReminders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultReminders")(js.undefined)
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
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

