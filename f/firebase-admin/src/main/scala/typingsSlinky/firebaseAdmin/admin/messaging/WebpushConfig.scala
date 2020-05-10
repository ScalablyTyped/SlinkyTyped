package typingsSlinky.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the WebPush protocol options that can be included in an
  * {@link admin.messaging.Message}.
  */
@js.native
trait WebpushConfig extends js.Object {
  /**
    * A collection of data fields.
    */
  var data: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Options for features provided by the FCM SDK for Web.
    */
  var fcmOptions: js.UndefOr[WebpushFcmOptions] = js.native
  /**
    * A collection of WebPush headers. Header values must be strings.
    *
    * See [WebPush specification](https://tools.ietf.org/html/rfc8030#section-5)
    * for supported headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A WebPush notification payload to be included in the message.
    */
  var notification: js.UndefOr[WebpushNotification] = js.native
}

object WebpushConfig {
  @scala.inline
  def apply(): WebpushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushConfig]
  }
  @scala.inline
  implicit class WebpushConfigOps[Self <: WebpushConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFcmOptions(value: WebpushFcmOptions): Self = {
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
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: WebpushNotification): Self = {
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

