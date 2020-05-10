package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCommentContentInput extends js.Object {
  /**
    * The unique, system-generated ID of the comment. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId = js.native
}

object DeleteCommentContentInput {
  @scala.inline
  def apply(commentId: CommentId): DeleteCommentContentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCommentContentInput]
  }
  @scala.inline
  implicit class DeleteCommentContentInputOps[Self <: DeleteCommentContentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentId(value: CommentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

