package typingsSlinky.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.high
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the Android-specific options that can be included in an
  * {@link admin.messaging.Message}.
  */
@js.native
trait AndroidConfig extends js.Object {
  /**
    * Collapse key for the message. Collapse key serves as an identifier for a
    * group of messages that can be collapsed, so that only the last message gets
    * sent when delivery can be resumed. A maximum of four different collapse keys
    * may be active at any given time.
    */
  var collapseKey: js.UndefOr[String] = js.native
  /**
    * A collection of data fields to be included in the message. All values must
    * be strings. When provided, overrides any data fields set on the top-level
    * `admin.messaging.Message`.}
    */
  var data: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Options for features provided by the FCM SDK for Android.
    */
  var fcmOptions: js.UndefOr[AndroidFcmOptions] = js.native
  /**
    * Android notification to be included in the message.
    */
  var notification: js.UndefOr[AndroidNotification] = js.native
  /**
    * Priority of the message. Must be either `normal` or `high`.
    */
  var priority: js.UndefOr[high | normal] = js.native
  /**
    * Package name of the application where the registration tokens must match
    * in order to receive the message.
    */
  var restrictedPackageName: js.UndefOr[String] = js.native
  /**
    * Time-to-live duration of the message in milliseconds.
    */
  var ttl: js.UndefOr[Double] = js.native
}

object AndroidConfig {
  @scala.inline
  def apply(): AndroidConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidConfig]
  }
  @scala.inline
  implicit class AndroidConfigOps[Self <: AndroidConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(js.undefined)
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
    def withFcmOptions(value: AndroidFcmOptions): Self = {
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
    def withNotification(value: AndroidNotification): Self = {
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
    def withPriority(value: high | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedPackageName")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

