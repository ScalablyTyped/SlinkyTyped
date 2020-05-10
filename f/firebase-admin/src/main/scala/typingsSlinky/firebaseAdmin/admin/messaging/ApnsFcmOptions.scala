package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents options for features provided by the FCM SDK for iOS.
  */
@js.native
trait ApnsFcmOptions extends js.Object {
  /**
    * The label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String] = js.native
  /**
    * URL of an image to be displayed in the notification.
    */
  var imageUrl: js.UndefOr[String] = js.native
}

object ApnsFcmOptions {
  @scala.inline
  def apply(): ApnsFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsFcmOptions]
  }
  @scala.inline
  implicit class ApnsFcmOptionsOps[Self <: ApnsFcmOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
  }
  
}

