package typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaCommentsFeedResponseCommentsItem extends js.Object {
  var bit_flags: Double = js.native
  var child_comment_count: Double = js.native
  var comment_index: Double = js.native
  var comment_like_count: Double = js.native
  var content_type: String = js.native
  var created_at: Double = js.native
  var created_at_utc: Double = js.native
  var did_report_as_spam: Boolean = js.native
  var has_liked_comment: Boolean = js.native
  var has_more_head_child_comments: js.UndefOr[Boolean] = js.native
  var has_more_tail_child_comments: js.UndefOr[Boolean] = js.native
  var has_translation: js.UndefOr[Boolean] = js.native
  var inline_composer_display_condition: String = js.native
  var next_min_child_cursor: js.UndefOr[String] = js.native
  var num_head_child_comments: js.UndefOr[Double] = js.native
  var num_tail_child_comments: js.UndefOr[Double] = js.native
  var other_preview_users: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem] = js.native
  var pk: String = js.native
  var preview_child_comments: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem] = js.native
  var share_enabled: Boolean = js.native
  var status: String = js.native
  var text: String = js.native
  var `type`: Double = js.native
  var user: MediaCommentsFeedResponseUser = js.native
  var user_id: Double = js.native
}

object MediaCommentsFeedResponseCommentsItem {
  @scala.inline
  def apply(
    bit_flags: Double,
    child_comment_count: Double,
    comment_index: Double,
    comment_like_count: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    has_liked_comment: Boolean,
    inline_composer_display_condition: String,
    other_preview_users: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem],
    pk: String,
    preview_child_comments: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem],
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: MediaCommentsFeedResponseUser,
    user_id: Double
  ): MediaCommentsFeedResponseCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], child_comment_count = child_comment_count.asInstanceOf[js.Any], comment_index = comment_index.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], other_preview_users = other_preview_users.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_child_comments = preview_child_comments.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponseCommentsItem]
  }
  @scala.inline
  implicit class MediaCommentsFeedResponseCommentsItemOps[Self <: MediaCommentsFeedResponseCommentsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBit_flags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit_flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild_comment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child_comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_like_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_like_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at_utc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at_utc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDid_report_as_spam(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did_report_as_spam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_liked_comment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_liked_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline_composer_display_condition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_composer_display_condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther_preview_users(value: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other_preview_users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview_child_comments(value: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: MediaCommentsFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more_head_child_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_head_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_more_head_child_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_head_child_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_more_tail_child_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_tail_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_more_tail_child_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_tail_child_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_translation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_translation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_translation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_translation")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_min_child_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_min_child_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_min_child_cursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_min_child_cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_head_child_comments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_head_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_head_child_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_head_child_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_tail_child_comments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_tail_child_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_tail_child_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_tail_child_comments")(js.undefined)
        ret
    }
  }
  
}

