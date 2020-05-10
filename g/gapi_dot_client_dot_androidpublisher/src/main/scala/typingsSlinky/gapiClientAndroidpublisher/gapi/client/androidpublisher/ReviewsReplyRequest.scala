package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewsReplyRequest extends js.Object {
  /** The text to set as the reply. Replies of more than approximately 350 characters will be rejected. HTML tags will be stripped. */
  var replyText: js.UndefOr[String] = js.native
}

object ReviewsReplyRequest {
  @scala.inline
  def apply(): ReviewsReplyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewsReplyRequest]
  }
  @scala.inline
  implicit class ReviewsReplyRequestOps[Self <: ReviewsReplyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyText")(js.undefined)
        ret
    }
  }
  
}

