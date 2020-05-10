package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedReply. */
@js.native
trait IRbmSuggestedReply extends js.Object {
  /** RbmSuggestedReply postbackData */
  var postbackData: js.UndefOr[String | Null] = js.native
  /** RbmSuggestedReply text */
  var text: js.UndefOr[String | Null] = js.native
}

object IRbmSuggestedReply {
  @scala.inline
  def apply(): IRbmSuggestedReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmSuggestedReply]
  }
  @scala.inline
  implicit class IRbmSuggestedReplyOps[Self <: IRbmSuggestedReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostbackData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostbackData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackData")(js.undefined)
        ret
    }
    @scala.inline
    def withPostbackDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackData")(null)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

