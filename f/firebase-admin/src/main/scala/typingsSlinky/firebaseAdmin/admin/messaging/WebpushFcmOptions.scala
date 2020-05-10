package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents options for features provided by the FCM SDK for Web
  * (which are not part of the Webpush standard).
  */
@js.native
trait WebpushFcmOptions extends js.Object {
  /**
    * The link to open when the user clicks on the notification.
    * For all URL values, HTTPS is required.
    */
  var link: js.UndefOr[String] = js.native
}

object WebpushFcmOptions {
  @scala.inline
  def apply(): WebpushFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushFcmOptions]
  }
  @scala.inline
  implicit class WebpushFcmOptionsOps[Self <: WebpushFcmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
  }
  
}

