package typingsSlinky.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LikedFeedResponseItemsItem extends js.Object {
  var can_view_more_preview_comments: Boolean = js.native
  var can_viewer_reshare: Boolean = js.native
  var can_viewer_save: Boolean = js.native
  var caption: LikedFeedResponseCaption = js.native
  var caption_is_edited: Boolean = js.native
  var client_cache_key: String = js.native
  var code: String = js.native
  var comment_count: Double = js.native
  var comment_likes_enabled: Boolean = js.native
  var comment_threading_enabled: Boolean = js.native
  var device_timestamp: Double | String = js.native
  var filter_type: Double = js.native
  var has_liked: Boolean = js.native
  var has_more_comments: Boolean = js.native
  var id: String = js.native
  var image_versions2: LikedFeedResponseImageVersions2 = js.native
  var inline_composer_display_condition: String = js.native
  var inline_composer_imp_trigger_time: Double = js.native
  var lat: js.UndefOr[Double] = js.native
  var like_count: Double = js.native
  var lng: js.UndefOr[Double] = js.native
  var location: js.UndefOr[LikedFeedResponseLocation] = js.native
  var max_num_visible_preview_comments: Double = js.native
  var media_type: Double = js.native
  var next_max_id: js.UndefOr[String] = js.native
  var organic_tracking_token: String = js.native
  var original_height: Double = js.native
  var original_width: Double = js.native
  var photo_of_you: Boolean = js.native
  var pk: String = js.native
  var preview_comments: js.Array[LikedFeedResponsePreviewCommentsItem] = js.native
  var taken_at: Double = js.native
  var user: LikedFeedResponseUser = js.native
  var usertags: js.UndefOr[LikedFeedResponseUsertags] = js.native
}

object LikedFeedResponseItemsItem {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: LikedFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double | String,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: LikedFeedResponseImageVersions2,
    inline_composer_display_condition: String,
    inline_composer_imp_trigger_time: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[LikedFeedResponsePreviewCommentsItem],
    taken_at: Double,
    user: LikedFeedResponseUser
  ): LikedFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikedFeedResponseItemsItem]
  }
  @scala.inline
  implicit class LikedFeedResponseItemsItemOps[Self <: LikedFeedResponseItemsItem] (val x: Self) extends AnyVal {
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
    def withCan_viewer_reshare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_viewer_reshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_viewer_save(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_viewer_save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: LikedFeedResponseCaption): Self = {
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
    def withClient_cache_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_cache_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
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
    def withComment_threading_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_threading_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice_timestamp(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_liked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_liked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage_versions2(value: LikedFeedResponseImageVersions2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_versions2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline_composer_display_condition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_composer_display_condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline_composer_imp_trigger_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_composer_imp_trigger_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLike_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_num_visible_preview_comments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_num_visible_preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganic_tracking_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic_tracking_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoto_of_you(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_of_you")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview_comments(value: js.Array[LikedFeedResponsePreviewCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaken_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: LikedFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(js.undefined)
        ret
    }
    @scala.inline
    def withLng(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: LikedFeedResponseLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_max_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: LikedFeedResponseUsertags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsertags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(js.undefined)
        ret
    }
  }
  
}

