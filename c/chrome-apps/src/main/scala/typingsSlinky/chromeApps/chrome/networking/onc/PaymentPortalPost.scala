package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chromeAppsStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentPortalPost extends js.Object {
  /** The HTTP method to use for the payment portal. */
  var Method: POST = js.native
  /** The post data to send to the payment portal. */
  var PostData: js.UndefOr[String] = js.native
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.native
}

object PaymentPortalPost {
  @scala.inline
  def apply(Method: POST): PaymentPortalPost = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPortalPost]
  }
  @scala.inline
  implicit class PaymentPortalPostOps[Self <: PaymentPortalPost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: POST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostData")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

