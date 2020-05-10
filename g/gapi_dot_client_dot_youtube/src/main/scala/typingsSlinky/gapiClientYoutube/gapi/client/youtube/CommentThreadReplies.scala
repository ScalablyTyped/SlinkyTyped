package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentThreadReplies extends js.Object {
  /**
    * A limited number of replies. Unless the number of replies returned equals total_reply_count in the snippet the returned replies are only a subset of
    * the total number of replies.
    */
  var comments: js.UndefOr[js.Array[Comment]] = js.native
}

object CommentThreadReplies {
  @scala.inline
  def apply(): CommentThreadReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThreadReplies]
  }
  @scala.inline
  implicit class CommentThreadRepliesOps[Self <: CommentThreadReplies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
  }
  
}

