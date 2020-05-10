package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponseItem extends js.Object {
  var ad_action: js.UndefOr[String] = js.native
  var can_reply: Boolean = js.native
  var can_reshare: Boolean = js.native
  var can_viewer_save: Boolean = js.native
  var caption: Null = js.native
  var caption_is_edited: Boolean = js.native
  var caption_position: Double = js.native
  var client_cache_key: String = js.native
  var code: String = js.native
  var device_timestamp: String = js.native
  var expiring_at: Double = js.native
  var filter_type: Double = js.native
  var has_audio: Boolean = js.native
  var has_shared_to_fb: Double = js.native
  var id: String = js.native
  var image_versions2: ReelsMediaFeedResponseImageVersions2 = js.native
  var imported_taken_at: js.UndefOr[Double] = js.native
  var is_dash_eligible: Double = js.native
  var is_reel_media: Boolean = js.native
  var link_text: js.UndefOr[String] = js.native
  var media_type: Double = js.native
  var number_of_qualities: Double = js.native
  var organic_tracking_token: String = js.native
  var original_height: Double = js.native
  var original_width: Double = js.native
  var photo_of_you: Boolean = js.native
  var pk: String = js.native
  var reel_mentions: js.UndefOr[js.Array[ReelsMediaFeedResponseReelMentionsItem]] = js.native
  var show_one_tap_fb_share_tooltip: Boolean = js.native
  var story_countdowns: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCountdownsItem]] = js.native
  var story_cta: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryCtaItem]] = js.native
  var story_polls: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryPollsItem]] = js.native
  var story_questions: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuestionsItem]] = js.native
  var story_quizs: js.UndefOr[js.Array[ReelsMediaFeedResponseStoryQuizsItem]] = js.native
  var story_sliders: js.UndefOr[js.Array[ReelsMediaFeedResponseStorySlidersItem]] = js.native
  var supports_reel_reactions: Boolean = js.native
  var taken_at: Double = js.native
  var user: ReelsMediaFeedResponseUser = js.native
  var video_codec: String = js.native
  var video_dash_manifest: String = js.native
  var video_duration: Double = js.native
  var video_versions: js.Array[ReelsMediaFeedResponseVideoVersionsItem] = js.native
}

object ReelsMediaFeedResponseItem {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    caption_position: Double,
    client_cache_key: String,
    code: String,
    device_timestamp: String,
    expiring_at: Double,
    filter_type: Double,
    has_audio: Boolean,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: ReelsMediaFeedResponseImageVersions2,
    is_dash_eligible: Double,
    is_reel_media: Boolean,
    media_type: Double,
    number_of_qualities: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    show_one_tap_fb_share_tooltip: Boolean,
    supports_reel_reactions: Boolean,
    taken_at: Double,
    user: ReelsMediaFeedResponseUser,
    video_codec: String,
    video_dash_manifest: String,
    video_duration: Double,
    video_versions: js.Array[ReelsMediaFeedResponseVideoVersionsItem]
  ): ReelsMediaFeedResponseItem = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_audio = has_audio.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_dash_eligible = is_dash_eligible.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], number_of_qualities = number_of_qualities.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], video_codec = video_codec.asInstanceOf[js.Any], video_dash_manifest = video_dash_manifest.asInstanceOf[js.Any], video_duration = video_duration.asInstanceOf[js.Any], video_versions = video_versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseItem]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseItemOps[Self <: ReelsMediaFeedResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_reply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_reshare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_viewer_save(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_viewer_save")(value.asInstanceOf[js.Any])
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
    def withCaption_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption_position")(value.asInstanceOf[js.Any])
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
    def withDevice_timestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiring_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiring_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_audio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_shared_to_fb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_shared_to_fb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage_versions2(value: ReelsMediaFeedResponseImageVersions2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_versions2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_dash_eligible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_dash_eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_reel_media(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_reel_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber_of_qualities(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number_of_qualities")(value.asInstanceOf[js.Any])
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
    def withShow_one_tap_fb_share_tooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_one_tap_fb_share_tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupports_reel_reactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports_reel_reactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaken_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taken_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ReelsMediaFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo_codec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo_dash_manifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_dash_manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo_duration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo_versions(value: js.Array[ReelsMediaFeedResponseVideoVersionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAd_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAd_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_action")(js.undefined)
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
    def withLink_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_text")(js.undefined)
        ret
    }
    @scala.inline
    def withReel_mentions(value: js.Array[ReelsMediaFeedResponseReelMentionsItem]): Self = {
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
    def withStory_countdowns(value: js.Array[ReelsMediaFeedResponseStoryCountdownsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_countdowns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_countdowns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_countdowns")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_cta(value: js.Array[ReelsMediaFeedResponseStoryCtaItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_cta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_cta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_cta")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_polls(value: js.Array[ReelsMediaFeedResponseStoryPollsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_polls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_polls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_polls")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_questions(value: js.Array[ReelsMediaFeedResponseStoryQuestionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_questions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_questions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_questions")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_quizs(value: js.Array[ReelsMediaFeedResponseStoryQuizsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_quizs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_quizs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_quizs")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_sliders(value: js.Array[ReelsMediaFeedResponseStorySlidersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_sliders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_sliders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_sliders")(js.undefined)
        ret
    }
  }
  
}

