package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#notificationSet". */
  var kind: js.UndefOr[String] = js.native
  /** The notifications received, or empty if no notifications are present. */
  var notification: js.UndefOr[js.Array[Notification]] = js.native
  /**
    * The notification set ID, required to mark the notification as received with the Enterprises.AcknowledgeNotification API. This will be omitted if no
    * notifications are present.
    */
  var notificationSetId: js.UndefOr[String] = js.native
}

object NotificationSet {
  @scala.inline
  def apply(): NotificationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSet]
  }
  @scala.inline
  implicit class NotificationSetOps[Self <: NotificationSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNotification(value: js.Array[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSetId")(js.undefined)
        ret
    }
  }
  
}

