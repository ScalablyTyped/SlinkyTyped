package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFeedResponsePreviewCommentsItem extends js.Object {
  var bit_flags: Double = js.native
  var comment_like_count: Double = js.native
  var content_type: String = js.native
  var created_at: Double = js.native
  var created_at_utc: Double = js.native
  var did_report_as_spam: Boolean = js.native
  var has_liked_comment: Boolean = js.native
  var has_translation: js.UndefOr[Boolean] = js.native
  var media_id: String = js.native
  var parent_comment_id: js.UndefOr[String] = js.native
  var pk: String = js.native
  var share_enabled: Boolean = js.native
  var status: String = js.native
  var text: String = js.native
  var `type`: Double = js.native
  var user: SavedFeedResponseUser = js.native
  var user_id: Double = js.native
}

object SavedFeedResponsePreviewCommentsItem {
  @scala.inline
  def apply(
    bit_flags: Double,
    comment_like_count: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    has_liked_comment: Boolean,
    media_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: SavedFeedResponseUser,
    user_id: Double
  ): SavedFeedResponsePreviewCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponsePreviewCommentsItem]
  }
  @scala.inline
  implicit class SavedFeedResponsePreviewCommentsItemOps[Self <: SavedFeedResponsePreviewCommentsItem] (val x: Self) extends AnyVal {
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
    def withMedia_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
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
    def withUser(value: SavedFeedResponseUser): Self = {
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
    def withParent_comment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_comment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent_comment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_comment_id")(js.undefined)
        ret
    }
  }
  
}

