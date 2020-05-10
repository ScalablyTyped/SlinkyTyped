package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEventsMove extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Calendar identifier of the source calendar where the event currently is
    * on.
    */
  var calendarId: js.UndefOr[String] = js.native
  /**
    * Calendar identifier of the target calendar where the event is to be moved
    * to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Event identifier.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the change of the event's organizer. Note that some
    * emails might still be sent even if you set the value to false. The
    * default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  /**
    * Guests who should receive notifications about the change of the event's
    * organizer.
    */
  var sendUpdates: js.UndefOr[String] = js.native
}

object ParamsResourceEventsMove {
  @scala.inline
  def apply(): ParamsResourceEventsMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsMove]
  }
  @scala.inline
  implicit class ParamsResourceEventsMoveOps[Self <: ParamsResourceEventsMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarId")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(js.undefined)
        ret
    }
    @scala.inline
    def withSendNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withSendUpdates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendUpdates")(js.undefined)
        ret
    }
  }
  
}

