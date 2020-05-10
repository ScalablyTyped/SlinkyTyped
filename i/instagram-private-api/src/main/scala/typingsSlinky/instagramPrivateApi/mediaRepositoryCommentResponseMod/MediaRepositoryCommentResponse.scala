package typingsSlinky.instagramPrivateApi.mediaRepositoryCommentResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryCommentResponse extends js.Object {
  var comment: MediaRepositoryCommentResponseComment = js.native
  var status: String = js.native
}

object MediaRepositoryCommentResponse {
  @scala.inline
  def apply(comment: MediaRepositoryCommentResponseComment, status: String): MediaRepositoryCommentResponse = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryCommentResponse]
  }
  @scala.inline
  implicit class MediaRepositoryCommentResponseOps[Self <: MediaRepositoryCommentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: MediaRepositoryCommentResponseComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

