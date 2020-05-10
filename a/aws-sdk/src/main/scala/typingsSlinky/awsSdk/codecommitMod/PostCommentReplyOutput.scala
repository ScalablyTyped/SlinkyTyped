package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentReplyOutput extends js.Object {
  /**
    * Information about the reply to a comment.
    */
  var comment: js.UndefOr[Comment] = js.native
}

object PostCommentReplyOutput {
  @scala.inline
  def apply(): PostCommentReplyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentReplyOutput]
  }
  @scala.inline
  implicit class PostCommentReplyOutputOps[Self <: PostCommentReplyOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
  }
  
}

