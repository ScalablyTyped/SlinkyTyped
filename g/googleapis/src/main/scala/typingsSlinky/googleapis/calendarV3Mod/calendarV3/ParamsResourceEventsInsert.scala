package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEventsInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list
    * method. If you want to access the primary calendar of the currently
    * logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.native
  
  /**
    * Version number of conference data supported by the API client. Version 0
    * assumes no conference data support and ignores conference data in the
    * event's body. Version 1 enables support for copying of ConferenceData as
    * well as for creating new conferences using the createRequest field of
    * conferenceData. The default is 0.
    */
  var conferenceDataVersion: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of attendees to include in the response. If there are
    * more than the specified number of attendees, only the participant is
    * returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEvent] = js.native
  
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the creation of the new event. Note that some emails
    * might still be sent even if you set the value to false. The default is
    * false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to send notifications about the creation of the new event. Note
    * that some emails might still be sent. The default is false.
    */
  var sendUpdates: js.UndefOr[String] = js.native
  
  /**
    * Whether API client performing operation supports event attachments.
    * Optional. The default is False.
    */
  var supportsAttachments: js.UndefOr[Boolean] = js.native
}
object ParamsResourceEventsInsert {
  
  @scala.inline
  def apply(): ParamsResourceEventsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceEventsInsertOps[Self <: ParamsResourceEventsInsert] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarId: Self = this.set("calendarId", js.undefined)
    
    @scala.inline
    def setConferenceDataVersion(value: Double): Self = this.set("conferenceDataVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceDataVersion: Self = this.set("conferenceDataVersion", js.undefined)
    
    @scala.inline
    def setMaxAttendees(value: Double): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEvent): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setSendNotifications(value: Boolean): Self = this.set("sendNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendNotifications: Self = this.set("sendNotifications", js.undefined)
    
    @scala.inline
    def setSendUpdates(value: String): Self = this.set("sendUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendUpdates: Self = this.set("sendUpdates", js.undefined)
    
    @scala.inline
    def setSupportsAttachments(value: Boolean): Self = this.set("supportsAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsAttachments: Self = this.set("supportsAttachments", js.undefined)
  }
}
