package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.googleapis.AnonNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCalendarListEntry extends js.Object {
  /**
    * The effective access role that the authenticated user has on the
    * calendar. Read-only. Possible values are:   - &quot;freeBusyReader&quot;
    * - Provides read access to free/busy information.  - &quot;reader&quot; -
    * Provides read access to the calendar. Private events will appear to users
    * with reader access, but event details will be hidden.  -
    * &quot;writer&quot; - Provides read and write access to the calendar.
    * Private events will appear to users with writer access, and event details
    * will be visible.  - &quot;owner&quot; - Provides ownership of the
    * calendar. This role has all of the permissions of the writer role with
    * the additional ability to see and manipulate ACLs.
    */
  var accessRole: js.UndefOr[String] = js.native
  /**
    * The main color of the calendar in the hexadecimal format
    * &quot;#0088aa&quot;. This property supersedes the index-based colorId
    * property. To set or change this property, you need to specify
    * colorRgbFormat=true in the parameters of the insert, update and patch
    * methods. Optional.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The color of the calendar. This is an ID referring to an entry in the
    * calendar section of the colors definition (see the colors endpoint). This
    * property is superseded by the backgroundColor and foregroundColor
    * properties and can be ignored when using these properties. Optional.
    */
  var colorId: js.UndefOr[String] = js.native
  /**
    * Conferencing properties for this calendar, for example what types of
    * conferences are allowed.
    */
  var conferenceProperties: js.UndefOr[SchemaConferenceProperties] = js.native
  /**
    * The default reminders that the authenticated user has for this calendar.
    */
  var defaultReminders: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  /**
    * Whether this calendar list entry has been deleted from the calendar list.
    * Read-only. Optional. The default is False.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Description of the calendar. Optional. Read-only.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The foreground color of the calendar in the hexadecimal format
    * &quot;#ffffff&quot;. This property supersedes the index-based colorId
    * property. To set or change this property, you need to specify
    * colorRgbFormat=true in the parameters of the insert, update and patch
    * methods. Optional.
    */
  var foregroundColor: js.UndefOr[String] = js.native
  /**
    * Whether the calendar has been hidden from the list. Optional. The default
    * is False.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Identifier of the calendar.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource (&quot;calendar#calendarListEntry&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Geographic location of the calendar as free-form text. Optional.
    * Read-only.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The notifications that the authenticated user is receiving for this
    * calendar.
    */
  var notificationSettings: js.UndefOr[AnonNotifications] = js.native
  /**
    * Whether the calendar is the primary calendar of the authenticated user.
    * Read-only. Optional. The default is False.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Whether the calendar content shows up in the calendar UI. Optional. The
    * default is False.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Title of the calendar. Read-only.
    */
  var summary: js.UndefOr[String] = js.native
  /**
    * The summary that the authenticated user has set for this calendar.
    * Optional.
    */
  var summaryOverride: js.UndefOr[String] = js.native
  /**
    * The time zone of the calendar. Optional. Read-only.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaCalendarListEntry {
  @scala.inline
  def apply(): SchemaCalendarListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarListEntry]
  }
  @scala.inline
  implicit class SchemaCalendarListEntryOps[Self <: SchemaCalendarListEntry] (val x: Self) extends AnyVal {
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
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
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
    def withConferenceProperties(value: SchemaConferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConferenceProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultReminders(value: js.Array[SchemaEventReminder]): Self = {
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
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
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
    def withForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
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
    def withNotificationSettings(value: AnonNotifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
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
    def withSummaryOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryOverride")(js.undefined)
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
  }
  
}

