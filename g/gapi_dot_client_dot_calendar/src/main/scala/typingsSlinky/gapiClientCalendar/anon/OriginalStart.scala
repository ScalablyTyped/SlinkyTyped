package typingsSlinky.gapiClientCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalStart extends js.Object {
  
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
  
  /** Recurring event identifier. */
  var eventId: String = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned.
    * Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  
  /** Maximum number of events returned on one result page. By default the value is 250 events. The page size can never be larger than 2500 events. Optional. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** The original start time of the instance in the result. Optional. */
  var originalStart: js.UndefOr[String] = js.native
  
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /**
    * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events will still be included if
    * singleEvents is False. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with
    * mandatory time zone offset.
    */
  var timeMax: js.UndefOr[String] = js.native
  
  /**
    * Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with
    * mandatory time zone offset.
    */
  var timeMin: js.UndefOr[String] = js.native
  
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[String] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object OriginalStart {
  
  @scala.inline
  def apply(calendarId: String, eventId: String): OriginalStart = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalStart]
  }
  
  @scala.inline
  implicit class OriginalStartOps[Self <: OriginalStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = this.set("alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysIncludeEmail: Self = this.set("alwaysIncludeEmail", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMaxAttendees(value: Double): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOriginalStart(value: String): Self = this.set("originalStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalStart: Self = this.set("originalStart", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    
    @scala.inline
    def setTimeMax(value: String): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMax: Self = this.set("timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: String): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMin: Self = this.set("timeMin", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
}
