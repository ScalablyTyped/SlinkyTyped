package typingsSlinky.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaInlineChildCommentsFeedResponseRootObject extends js.Object {
  var child_comment_count: Double = js.native
  var child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem] = js.native
  var has_more_head_child_comments: Boolean = js.native
  var has_more_tail_child_comments: Boolean = js.native
  var next_max_child_cursor: String = js.native
  var num_tail_child_comments: Double = js.native
  var parent_comment: MediaInlineChildCommentsFeedResponseParentComment = js.native
  var status: String = js.native
}

object MediaInlineChildCommentsFeedResponseRootObject {
  @scala.inline
  def apply(
    child_comment_count: Double,
    child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem],
    has_more_head_child_comments: Boolean,
    has_more_tail_child_comments: Boolean,
    next_max_child_cursor: String,
    num_tail_child_comments: Double,
    parent_comment: MediaInlineChildCommentsFeedResponseParentComment,
    status: String
  ): MediaInlineChildCommentsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(child_comment_count = child_comment_count.asInstanceOf[js.Any], child_comments = child_comments.asInstanceOf[js.Any], has_more_head_child_comments = has_more_head_child_comments.asInstanceOf[js.Any], has_more_tail_child_comments = has_more_tail_child_comments.asInstanceOf[js.Any], next_max_child_cursor = next_max_child_cursor.asInstanceOf[js.Any], num_tail_child_comments = num_tail_child_comments.asInstanceOf[js.Any], parent_comment = parent_comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseRootObject]
  }
  @scala.inline
  implicit class MediaInlineChildCommentsFeedResponseRootObjectOps[Self <: MediaInlineChildCommentsFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild_comment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child_comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild_comments(value: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more_head_child_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_head_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more_tail_child_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_tail_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_child_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_child_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_tail_child_comments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_tail_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_comment(value: MediaInlineChildCommentsFeedResponseParentComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_comment")(value.asInstanceOf[js.Any])
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

