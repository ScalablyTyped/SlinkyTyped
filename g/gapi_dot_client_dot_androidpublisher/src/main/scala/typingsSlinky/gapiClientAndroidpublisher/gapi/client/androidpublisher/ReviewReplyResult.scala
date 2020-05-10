package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewReplyResult extends js.Object {
  /** The time at which the reply took effect. */
  var lastEdited: js.UndefOr[Timestamp] = js.native
  /** The reply text that was applied. */
  var replyText: js.UndefOr[String] = js.native
}

object ReviewReplyResult {
  @scala.inline
  def apply(): ReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewReplyResult]
  }
  @scala.inline
  implicit class ReviewReplyResultOps[Self <: ReviewReplyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastEdited(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEdited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEdited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEdited")(js.undefined)
        ret
    }
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

