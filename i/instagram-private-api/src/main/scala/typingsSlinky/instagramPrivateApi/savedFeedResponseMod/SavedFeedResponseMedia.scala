package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFeedResponseMedia extends js.Object {
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.native
  var can_view_more_preview_comments: Boolean = js.native
  var can_viewer_reshare: Boolean = js.native
  var can_viewer_save: Boolean = js.native
  var caption: SavedFeedResponseCaption = js.native
  var caption_is_edited: Boolean = js.native
  var carousel_media: js.UndefOr[js.Array[SavedFeedResponseCarouselMediaItem]] = js.native
  var carousel_media_count: js.UndefOr[Double] = js.native
  var client_cache_key: String = js.native
  var code: String = js.native
  var comment_count: Double = js.native
  var comment_likes_enabled: Boolean = js.native
  var comment_threading_enabled: Boolean = js.native
  var device_timestamp: String | Double = js.native
  var filter_type: Double = js.native
  var has_audio: js.UndefOr[Boolean] = js.native
  var has_liked: Boolean = js.native
  var has_more_comments: Boolean = js.native
  var has_viewer_saved: Boolean = js.native
  var id: String = js.native
  var image_versions2: js.UndefOr[SavedFeedResponseImageVersions2] = js.native
  var inline_composer_display_condition: String = js.native
  var inline_composer_imp_trigger_time: Double = js.native
  var is_dash_eligible: js.UndefOr[Double] = js.native
  var is_external_share_disabled: js.UndefOr[Boolean] = js.native
  var like_count: Double = js.native
  var max_num_visible_preview_comments: Double = js.native
  var media_type: Double = js.native
  var next_max_id: String = js.native
  var number_of_qualities: js.UndefOr[Double] = js.native
  var organic_tracking_token: String = js.native
  var original_height: js.UndefOr[Double] = js.native
  var original_width: js.UndefOr[Double] = js.native
  var photo_of_you: Boolean = js.native
  var pk: String = js.native
  var preview_comments: js.Array[SavedFeedResponsePreviewCommentsItem] = js.native
  var product_tags: js.UndefOr[SavedFeedResponseProductTags] = js.native
  var saved_collection_ids: js.Array[_] = js.native
  var taken_at: Double = js.native
  var user: SavedFeedResponseUser = js.native
  var usertags: js.UndefOr[SavedFeedResponseUsertags] = js.native
  var video_codec: js.UndefOr[String] = js.native
  var video_dash_manifest: js.UndefOr[String] = js.native
  var video_duration: js.UndefOr[Double] = js.native
  var video_versions: js.UndefOr[js.Array[SavedFeedResponseVideoVersionsItem]] = js.native
  var view_count: js.UndefOr[Double] = js.native
}

object SavedFeedResponseMedia {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: SavedFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: String | Double,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    has_viewer_saved: Boolean,
    id: String,
    inline_composer_display_condition: String,
    inline_composer_imp_trigger_time: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    next_max_id: String,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[SavedFeedResponsePreviewCommentsItem],
    saved_collection_ids: js.Array[_],
    taken_at: Double,
    user: SavedFeedResponseUser
  ): SavedFeedResponseMedia = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_viewer_saved = has_viewer_saved.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], saved_collection_ids = saved_collection_ids.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseMedia]
  }
  @scala.inline
  implicit class SavedFeedResponseMediaOps[Self <: SavedFeedResponseMedia] (val x: Self) extends AnyVal {
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
    def withCaption(value: SavedFeedResponseCaption): Self = {
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
    def withDevice_timestamp(value: String | Double): Self = {
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
    def withHas_viewer_saved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_viewer_saved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganic_tracking_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic_tracking_token")(value.asInstanceOf[js.Any])
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
    def withPreview_comments(value: js.Array[SavedFeedResponsePreviewCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaved_collection_ids(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved_collection_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaken_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: SavedFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_see_insights_as_brand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_see_insights_as_brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_see_insights_as_brand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_see_insights_as_brand")(js.undefined)
        ret
    }
    @scala.inline
    def withCarousel_media(value: js.Array[SavedFeedResponseCarouselMediaItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarousel_media: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel_media")(js.undefined)
        ret
    }
    @scala.inline
    def withCarousel_media_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel_media_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarousel_media_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel_media_count")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_audio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_audio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_audio")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_versions2(value: SavedFeedResponseImageVersions2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_versions2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_versions2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_versions2")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_dash_eligible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_dash_eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_dash_eligible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_dash_eligible")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_external_share_disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_external_share_disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_external_share_disabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_external_share_disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber_of_qualities(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number_of_qualities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber_of_qualities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number_of_qualities")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_height")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_width")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_tags(value: SavedFeedResponseProductTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_tags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: SavedFeedResponseUsertags): Self = {
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
    @scala.inline
    def withVideo_codec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_codec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_codec")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_dash_manifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_dash_manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_dash_manifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_dash_manifest")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_duration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_duration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_duration")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_versions(value: js.Array[SavedFeedResponseVideoVersionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_versions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_versions")(js.undefined)
        ret
    }
    @scala.inline
    def withView_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_count")(js.undefined)
        ret
    }
  }
  
}

