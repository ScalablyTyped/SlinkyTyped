package typingsSlinky.firebaseMessaging.messagePayloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePayload extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var fcmOptions: js.UndefOr[FcmOptions] = js.native
  var notification: js.UndefOr[NotificationDetails] = js.native
}

object MessagePayload {
  @scala.inline
  def apply(): MessagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePayload]
  }
  @scala.inline
  implicit class MessagePayloadOps[Self <: MessagePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
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
    def withFcmOptions(value: FcmOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcmOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFcmOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcmOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: NotificationDetails): Self = {
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

