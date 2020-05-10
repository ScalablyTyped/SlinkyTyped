package typingsSlinky.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAdmin.admin.messaging.AndroidConfig
import typingsSlinky.firebaseAdmin.admin.messaging.ApnsConfig
import typingsSlinky.firebaseAdmin.admin.messaging.FcmOptions
import typingsSlinky.firebaseAdmin.admin.messaging.Notification
import typingsSlinky.firebaseAdmin.admin.messaging.WebpushConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMessage extends js.Object {
  var android: js.UndefOr[AndroidConfig] = js.native
  var apns: js.UndefOr[ApnsConfig] = js.native
  var data: js.UndefOr[StringDictionary[String]] = js.native
  var fcmOptions: js.UndefOr[FcmOptions] = js.native
  var notification: js.UndefOr[Notification] = js.native
  var webpush: js.UndefOr[WebpushConfig] = js.native
}

object BaseMessage {
  @scala.inline
  def apply(): BaseMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMessage]
  }
  @scala.inline
  implicit class BaseMessageOps[Self <: BaseMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: AndroidConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withApns(value: ApnsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
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
    def withNotification(value: Notification): Self = {
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
    def withWebpush(value: WebpushConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebpush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpush")(js.undefined)
        ret
    }
  }
  
}

