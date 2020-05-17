package typingsSlinky.gapiClientCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalUID extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /**
    * Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is
    * available (i.e. a generated, non-working value will be provided).
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in
    * user, use the "primary" keyword.
    */
  var calendarId: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Specifies event ID in the iCalendar format to be included in the response. Optional. */
  var iCalUID: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned.
    * Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  /**
    * Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if
    * there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is
    * 250 events. The page size can never be larger than 2500 events. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** The order of the events returned in the result. Optional. The default is an unspecified, stable order. */
  var orderBy: js.UndefOr[String] = js.native
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to
    * return events that match all given constraints.
    */
  var privateExtendedProperty: js.UndefOr[String] = js.native
  /** Free text search terms to find events that match these terms in any field, except for extended properties. Optional. */
  var q: js.UndefOr[String] = js.native
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to
    * return events that match all given constraints.
    */
  var sharedExtendedProperty: js.UndefOr[String] = js.native
  /**
    * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying
    * recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single
    * instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /** Whether to include hidden invitations in the result. Optional. The default is False. */
  var showHiddenInvitations: js.UndefOr[Boolean] = js.native
  /**
    * Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying
    * recurring events themselves. Optional. The default is False.
    */
  var singleEvents: js.UndefOr[Boolean] = js.native
  /**
    * Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it
    * is not allowed to set showDeleted to False.
    * There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
    *
    * These are:
    * - iCalUID
    * - orderBy
    * - privateExtendedProperty
    * - q
    * - sharedExtendedProperty
    * - timeMin
    * - timeMax
    * - updatedMin If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full
    * synchronization without any syncToken.
    * Learn more about incremental synchronization.
    * Optional. The default is to return all entries.
    */
  var syncToken: js.UndefOr[String] = js.native
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with
    * mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is
    * set, timeMax must be greater than timeMin.
    */
  var timeMax: js.UndefOr[String] = js.native
  /**
    * Lower bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with
    * mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is
    * set, timeMin must be smaller than timeMax.
    */
  var timeMin: js.UndefOr[String] = js.native
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[String] = js.native
  /**
    * Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be
    * included regardless of showDeleted. Optional. The default is not to filter by last modification time.
    */
  var updatedMin: js.UndefOr[String] = js.native
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}

object ICalUID {
  @scala.inline
  def apply(calendarId: String): ICalUID = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalUID]
  }
  @scala.inline
  implicit class ICalUIDOps[Self <: ICalUID] (val x: Self) extends AnyVal {
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
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
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
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttendees(value: Double): Self = {
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
    def withMaxResults(value: Double): Self = {
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
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
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
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
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
    def withQuotaUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(js.undefined)
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
    def withSyncToken(value: String): Self = {
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
    def withTimeMax(value: String): Self = {
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
    def withTimeMin(value: String): Self = {
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
    def withUpdatedMin(value: String): Self = {
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
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
  }
  
}

