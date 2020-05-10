package typingsSlinky.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFeedResponseItemsItem extends js.Object {
  var attribution: js.UndefOr[TagFeedResponseAttribution] = js.native
  var can_reply: js.UndefOr[Boolean] = js.native
  var can_reshare: js.UndefOr[Boolean] = js.native
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.native
  var can_view_more_preview_comments: js.UndefOr[Boolean] = js.native
  var can_viewer_reshare: js.UndefOr[Boolean] = js.native
  var can_viewer_save: Boolean = js.native
  var caption: TagFeedResponseCaption | Null = js.native
  var caption_is_edited: Boolean = js.native
  var caption_position: js.UndefOr[Double] = js.native
  var carousel_media: js.UndefOr[js.Array[TagFeedResponseCarouselMediaItem]] = js.native
  var carousel_media_count: js.UndefOr[Double] = js.native
  var client_cache_key: String = js.native
  var code: String = js.native
  var comment_count: js.UndefOr[Double] = js.native
  var comment_likes_enabled: js.UndefOr[Boolean] = js.native
  var comment_threading_enabled: js.UndefOr[Boolean] = js.native
  var commenting_disabled_for_viewer: js.UndefOr[Boolean] = js.native
  var comments_disabled: js.UndefOr[Boolean] = js.native
  var creative_config: js.UndefOr[TagFeedResponseCreativeConfig] = js.native
  var device_timestamp: String | Double = js.native
  var expiring_at: js.UndefOr[Double] = js.native
  var filter_type: Double = js.native
  var has_audio: js.UndefOr[Boolean] = js.native
  var has_liked: js.UndefOr[Boolean] = js.native
  var has_more_comments: js.UndefOr[Boolean] = js.native
  var has_shared_to_fb: js.UndefOr[Double] = js.native
  var id: String = js.native
  var image_versions2: js.UndefOr[TagFeedResponseImageVersions2] = js.native
  var imported_taken_at: js.UndefOr[Double] = js.native
  var is_dash_eligible: js.UndefOr[Double] = js.native
  var is_reel_media: js.UndefOr[Boolean] = js.native
  var lat: js.UndefOr[Double | String] = js.native
  var like_count: js.UndefOr[Double] = js.native
  var likers: js.UndefOr[js.Array[TagFeedResponseLikersItem]] = js.native
  var lng: js.UndefOr[Double | String] = js.native
  var location: js.UndefOr[TagFeedResponseLocation] = js.native
  var max_num_visible_preview_comments: js.UndefOr[Double] = js.native
  var media_type: Double = js.native
  var next_max_id: js.UndefOr[String] = js.native
  var number_of_qualities: js.UndefOr[Double] = js.native
  var organic_tracking_token: String = js.native
  var original_height: js.UndefOr[Double] = js.native
  var original_width: js.UndefOr[Double] = js.native
  var photo_of_you: Boolean = js.native
  var pk: String = js.native
  var preview_comments: js.UndefOr[js.Array[TagFeedResponsePreviewCommentsItem]] = js.native
  var reel_mentions: js.UndefOr[js.Array[TagFeedResponseReelMentionsItem]] = js.native
  var show_one_tap_fb_share_tooltip: js.UndefOr[Boolean] = js.native
  var story_hashtags: js.UndefOr[js.Array[TagFeedResponseStoryHashtagsItem]] = js.native
  var story_locations: js.UndefOr[js.Array[TagFeedResponseStoryLocationsItem]] = js.native
  var supports_reel_reactions: js.UndefOr[Boolean] = js.native
  var taken_at: Double = js.native
  var user: TagFeedResponseUser = js.native
  var usertags: js.UndefOr[TagFeedResponseUsertags] = js.native
  var video_codec: js.UndefOr[String] = js.native
  var video_dash_manifest: js.UndefOr[String] = js.native
  var video_duration: js.UndefOr[Double] = js.native
  var video_versions: js.UndefOr[js.Array[TagFeedResponseVideoVersionsItem]] = js.native
  var view_count: js.UndefOr[Double] = js.native
}

object TagFeedResponseItemsItem {
  @scala.inline
  def apply(
    can_viewer_save: Boolean,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    device_timestamp: String | Double,
    filter_type: Double,
    id: String,
    media_type: Double,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    taken_at: Double,
    user: TagFeedResponseUser
  ): TagFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseItemsItem]
  }
  @scala.inline
  implicit class TagFeedResponseItemsItemOps[Self <: TagFeedResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_viewer_save(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_viewer_save")(value.asInstanceOf[js.Any])
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withTaken_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: TagFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribution(value: TagFeedResponseAttribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_reply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_reply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reply")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_reshare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_reshare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reshare")(js.undefined)
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
    def withCan_view_more_preview_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_view_more_preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_view_more_preview_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_view_more_preview_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_viewer_reshare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_viewer_reshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_viewer_reshare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_viewer_reshare")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: TagFeedResponseCaption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(null)
        ret
    }
    @scala.inline
    def withCaption_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_position")(js.undefined)
        ret
    }
    @scala.inline
    def withCarousel_media(value: js.Array[TagFeedResponseCarouselMediaItem]): Self = {
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
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(js.undefined)
        ret
    }
    @scala.inline
    def withComment_likes_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_likes_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_likes_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_likes_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withComment_threading_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_threading_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_threading_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_threading_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCommenting_disabled_for_viewer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commenting_disabled_for_viewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommenting_disabled_for_viewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commenting_disabled_for_viewer")(js.undefined)
        ret
    }
    @scala.inline
    def withComments_disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments_disabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCreative_config(value: TagFeedResponseCreativeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creative_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreative_config: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creative_config")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiring_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiring_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiring_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiring_at")(js.undefined)
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
    def withHas_liked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_liked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_liked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_liked")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_more_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_more_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_shared_to_fb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_shared_to_fb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_shared_to_fb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_shared_to_fb")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_versions2(value: TagFeedResponseImageVersions2): Self = {
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
    def withImported_taken_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imported_taken_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImported_taken_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imported_taken_at")(js.undefined)
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
    def withIs_reel_media(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_reel_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_reel_media: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_reel_media")(js.undefined)
        ret
    }
    @scala.inline
    def withLat(value: Double | String): Self = {
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
    def withLike_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLike_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like_count")(js.undefined)
        ret
    }
    @scala.inline
    def withLikers(value: js.Array[TagFeedResponseLikersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likers")(js.undefined)
        ret
    }
    @scala.inline
    def withLng(value: Double | String): Self = {
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
    def withLocation(value: TagFeedResponseLocation): Self = {
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
    def withMax_num_visible_preview_comments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_num_visible_preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_num_visible_preview_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_num_visible_preview_comments")(js.undefined)
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
    def withPreview_comments(value: js.Array[TagFeedResponsePreviewCommentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withReel_mentions(value: js.Array[TagFeedResponseReelMentionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReel_mentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_mentions")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_one_tap_fb_share_tooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_one_tap_fb_share_tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_one_tap_fb_share_tooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_one_tap_fb_share_tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_hashtags(value: js.Array[TagFeedResponseStoryHashtagsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_hashtags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_hashtags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_hashtags")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_locations(value: js.Array[TagFeedResponseStoryLocationsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_locations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_locations")(js.undefined)
        ret
    }
    @scala.inline
    def withSupports_reel_reactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports_reel_reactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupports_reel_reactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports_reel_reactions")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: TagFeedResponseUsertags): Self = {
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
    def withVideo_versions(value: js.Array[TagFeedResponseVideoVersionsItem]): Self = {
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

