package typingsSlinky.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the APNs-specific options that can be included in an
  * {@link admin.messaging.Message}. Refer to
  * [Apple documentation](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CommunicatingwithAPNs.html)
  * for various headers and payload fields supported by APNs.
  */
@js.native
trait ApnsConfig extends js.Object {
  /**
    * Options for features provided by the FCM SDK for iOS.
    */
  var fcmOptions: js.UndefOr[ApnsFcmOptions] = js.native
  /**
    * A collection of APNs headers. Header values must be strings.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An APNs payload to be included in the message.
    */
  var payload: js.UndefOr[ApnsPayload] = js.native
}

object ApnsConfig {
  @scala.inline
  def apply(): ApnsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsConfig]
  }
  @scala.inline
  implicit class ApnsConfigOps[Self <: ApnsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFcmOptions(value: ApnsFcmOptions): Self = {
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
    def withPayload(value: ApnsPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

