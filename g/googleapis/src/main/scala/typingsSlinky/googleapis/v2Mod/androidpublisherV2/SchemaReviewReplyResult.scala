package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReviewReplyResult extends js.Object {
  /**
    * The time at which the reply took effect.
    */
  var lastEdited: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * The reply text that was applied.
    */
  var replyText: js.UndefOr[String] = js.native
}

object SchemaReviewReplyResult {
  @scala.inline
  def apply(): SchemaReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewReplyResult]
  }
  @scala.inline
  implicit class SchemaReviewReplyResultOps[Self <: SchemaReviewReplyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastEdited(value: SchemaTimestamp): Self = {
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

