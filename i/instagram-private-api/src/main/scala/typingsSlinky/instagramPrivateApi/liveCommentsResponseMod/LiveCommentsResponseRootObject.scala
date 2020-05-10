package typingsSlinky.instagramPrivateApi.liveCommentsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveCommentsResponseRootObject extends js.Object {
  var can_view_more_preview_comments: Boolean = js.native
  var caption: Null = js.native
  var caption_is_edited: Boolean = js.native
  var comment_count: Double = js.native
  var comment_likes_enabled: Boolean = js.native
  var comment_muted: Double = js.native
  var comments: js.Array[LiveCommentsResponseCommentsItem] = js.native
  var has_more_comments: Boolean = js.native
  var has_more_headload_comments: Boolean = js.native
  var is_first_fetch: String = js.native
  var live_seconds_per_comment: Double = js.native
  var media_header_display: String = js.native
  var status: String = js.native
  var system_comments: js.Array[LiveCommentsResponseSystemCommentsItem] = js.native
}

object LiveCommentsResponseRootObject {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_muted: Double,
    comments: js.Array[LiveCommentsResponseCommentsItem],
    has_more_comments: Boolean,
    has_more_headload_comments: Boolean,
    is_first_fetch: String,
    live_seconds_per_comment: Double,
    media_header_display: String,
    status: String,
    system_comments: js.Array[LiveCommentsResponseSystemCommentsItem]
  ): LiveCommentsResponseRootObject = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_muted = comment_muted.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_more_headload_comments = has_more_headload_comments.asInstanceOf[js.Any], is_first_fetch = is_first_fetch.asInstanceOf[js.Any], live_seconds_per_comment = live_seconds_per_comment.asInstanceOf[js.Any], media_header_display = media_header_display.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system_comments = system_comments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveCommentsResponseRootObject]
  }
  @scala.inline
  implicit class LiveCommentsResponseRootObjectOps[Self <: LiveCommentsResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_view_more_preview_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_view_more_preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption_is_edited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_is_edited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_likes_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_likes_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[LiveCommentsResponseCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more_headload_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_headload_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_first_fetch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_first_fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLive_seconds_per_comment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_seconds_per_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_header_display(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_header_display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem_comments(value: js.Array[LiveCommentsResponseSystemCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system_comments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

