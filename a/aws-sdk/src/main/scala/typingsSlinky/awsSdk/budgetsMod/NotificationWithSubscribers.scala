package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationWithSubscribers extends js.Object {
  /**
    * The notification that is associated with a budget.
    */
  var Notification: typingsSlinky.awsSdk.budgetsMod.Notification = js.native
  /**
    * A list of subscribers who are subscribed to this notification.
    */
  var Subscribers: typingsSlinky.awsSdk.budgetsMod.Subscribers = js.native
}

object NotificationWithSubscribers {
  @scala.inline
  def apply(Notification: Notification, Subscribers: Subscribers): NotificationWithSubscribers = {
    val __obj = js.Dynamic.literal(Notification = Notification.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationWithSubscribers]
  }
  @scala.inline
  implicit class NotificationWithSubscribersOps[Self <: NotificationWithSubscribers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribers(value: Subscribers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscribers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

