package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents options for features provided by the FCM SDK for Android.
  */
@js.native
trait AndroidFcmOptions extends js.Object {
  /**
    * The label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String] = js.native
}

object AndroidFcmOptions {
  @scala.inline
  def apply(): AndroidFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidFcmOptions]
  }
  @scala.inline
  implicit class AndroidFcmOptionsOps[Self <: AndroidFcmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsLabel")(js.undefined)
        ret
    }
  }
  
}

