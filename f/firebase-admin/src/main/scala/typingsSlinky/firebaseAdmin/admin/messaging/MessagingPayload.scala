package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a Firebase Cloud Messaging message payload. One or
  * both of the `data` and `notification` keys are required.
  *
  * See
  * [Build send requests](/docs/cloud-messaging/send-message)
  * for code samples and detailed documentation.
  */
@js.native
trait MessagingPayload extends js.Object {
  /**
    * The data message payload.
    */
  var data: js.UndefOr[DataMessagePayload] = js.native
  /**
    * The notification message payload.
    */
  var notification: js.UndefOr[NotificationMessagePayload] = js.native
}

object MessagingPayload {
  @scala.inline
  def apply(): MessagingPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingPayload]
  }
  @scala.inline
  implicit class MessagingPayloadOps[Self <: MessagingPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: DataMessagePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: NotificationMessagePayload): Self = {
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
  }
  
}

