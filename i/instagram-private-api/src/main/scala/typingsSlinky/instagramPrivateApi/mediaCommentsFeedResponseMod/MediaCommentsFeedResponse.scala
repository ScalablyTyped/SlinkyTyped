package typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaCommentsFeedResponse extends js.Object {
  var can_view_more_preview_comments: Boolean = js.native
  var caption: MediaCommentsFeedResponseCaption = js.native
  var caption_is_edited: Boolean = js.native
  var comment_count: Double = js.native
  var comment_likes_enabled: Boolean = js.native
  var comments: js.Array[MediaCommentsFeedResponseCommentsItem] = js.native
  var has_more_comments: Boolean = js.native
  var has_more_headload_comments: Boolean = js.native
  var initiate_at_top: Boolean = js.native
  var insert_new_comment_to_top: Boolean = js.native
  var media_header_display: String = js.native
  var next_max_id: String = js.native
  var next_min_id: String = js.native
  var preview_comments: js.Array[MediaCommentsFeedResponsePreviewCommentsItem] = js.native
  var quick_response_emojis: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem] = js.native
  var status: String = js.native
  var threading_enabled: Boolean = js.native
}

object MediaCommentsFeedResponse {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    caption: MediaCommentsFeedResponseCaption,
    caption_is_edited: Boolean,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comments: js.Array[MediaCommentsFeedResponseCommentsItem],
    has_more_comments: Boolean,
    has_more_headload_comments: Boolean,
    initiate_at_top: Boolean,
    insert_new_comment_to_top: Boolean,
    media_header_display: String,
    next_max_id: String,
    next_min_id: String,
    preview_comments: js.Array[MediaCommentsFeedResponsePreviewCommentsItem],
    quick_response_emojis: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem],
    status: String,
    threading_enabled: Boolean
  ): MediaCommentsFeedResponse = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_more_headload_comments = has_more_headload_comments.asInstanceOf[js.Any], initiate_at_top = initiate_at_top.asInstanceOf[js.Any], insert_new_comment_to_top = insert_new_comment_to_top.asInstanceOf[js.Any], media_header_display = media_header_display.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_min_id = next_min_id.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], quick_response_emojis = quick_response_emojis.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threading_enabled = threading_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponse]
  }
  @scala.inline
  implicit class MediaCommentsFeedResponseOps[Self <: MediaCommentsFeedResponse] (val x: Self) extends AnyVal {
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
    def withCaption(value: MediaCommentsFeedResponseCaption): Self = {
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
    def withComments(value: js.Array[MediaCommentsFeedResponseCommentsItem]): Self = {
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
    def withInitiate_at_top(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiate_at_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsert_new_comment_to_top(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_new_comment_to_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_header_display(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_header_display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_min_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_min_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview_comments(value: js.Array[MediaCommentsFeedResponsePreviewCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuick_response_emojis(value: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quick_response_emojis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreading_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threading_enabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

