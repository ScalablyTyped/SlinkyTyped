package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCalendarNotification extends js.Object {
  /**
    * The method used to deliver the notification. Possible values are:   -
    * &quot;email&quot; - Notifications are sent via email.  - &quot;sms&quot;
    * - Deprecated. Once this feature is shutdown, the API will no longer
    * return notifications using this method. Any newly added SMS notifications
    * will be ignored. See  Google Calendar SMS notifications to be removed for
    * more information. Notifications are sent via SMS. This value is read-only
    * and is ignored on inserts and updates. SMS notifications are only
    * available for G Suite customers.   Required when adding a notification.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The type of notification. Possible values are:   -
    * &quot;eventCreation&quot; - Notification sent when a new event is put on
    * the calendar.  - &quot;eventChange&quot; - Notification sent when an
    * event is changed.  - &quot;eventCancellation&quot; - Notification sent
    * when an event is cancelled.  - &quot;eventResponse&quot; - Notification
    * sent when an attendee responds to the event invitation.  -
    * &quot;agenda&quot; - An agenda with the events of the day (sent out in
    * the morning).   Required when adding a notification.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCalendarNotification {
  @scala.inline
  def apply(): SchemaCalendarNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarNotification]
  }
  @scala.inline
  implicit class SchemaCalendarNotificationOps[Self <: SchemaCalendarNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

