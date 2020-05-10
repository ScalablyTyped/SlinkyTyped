package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.NOT_PROMPTED
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`2`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.besties
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.chat_sticker_id
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.countdown_sticker_time
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.once
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.polling_sticker
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.question_sticker_ma
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.story
import typingsSlinky.instagramPrivateApi.mediaConfigureOptionsMod.MediaConfigureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryBaseOptions because var conflicts: geotag_enabled, media_latitude, media_longitude, posting_latitude, posting_longitude. Inlined story_media_creation_date, client_shared_at, audience, configure_mode, camera_position, allow_multi_configures, thread_ids, recipient_users, client_context, view_mode, reply_type, caption, mas_opt_in, story_sticker_ids, story_hashtags, story_locations, reel_mentions, story_polls, internal_features, story_sliders, story_questions, story_countdowns, attached_media, story_chats, story_quizs, story_cta */ @js.native
trait MediaConfigureStoryPhotoOptions extends MediaConfigureOptions {
  var allow_multi_configures: js.UndefOr[`0` | `1`] = js.native
  var attached_media: js.UndefOr[js.Array[StoryAttachedMedia] | String] = js.native
  var audience: js.UndefOr[besties] = js.native
  var camera_position: js.UndefOr[String] = js.native
  var caption: js.UndefOr[String] = js.native
  var client_context: js.UndefOr[String] = js.native
  var client_shared_at: js.UndefOr[String] = js.native
  var configure_mode: `1` | `2` = js.native
  var internal_features: js.UndefOr[polling_sticker] = js.native
  var mas_opt_in: js.UndefOr[NOT_PROMPTED] = js.native
  var recipient_users: js.UndefOr[js.Array[String] | String] = js.native
  var reel_mentions: js.UndefOr[js.Array[StoryMention] | String] = js.native
  var reply_type: js.UndefOr[story | String] = js.native
  var story_chats: js.UndefOr[js.Array[StoryChat] | String] = js.native
  var story_countdowns: js.UndefOr[js.Array[StoryCountdown] | String] = js.native
  var story_cta: js.UndefOr[js.Array[StoryCta] | String] = js.native
  var story_hashtags: js.UndefOr[js.Array[StoryHashtag] | String] = js.native
  var story_locations: js.UndefOr[js.Array[StoryLocation] | String] = js.native
  var story_media_creation_date: js.UndefOr[String] = js.native
  var story_polls: js.UndefOr[js.Array[StoryPoll] | String] = js.native
  var story_questions: js.UndefOr[js.Array[StoryQuestion] | String] = js.native
  var story_quizs: js.UndefOr[js.Array[StoryQuiz] | String] = js.native
  var story_sliders: js.UndefOr[js.Array[StorySlider] | String] = js.native
  var story_sticker_ids: js.UndefOr[String | question_sticker_ma | countdown_sticker_time | chat_sticker_id] = js.native
  var thread_ids: js.UndefOr[js.Array[String] | String] = js.native
  var view_mode: js.UndefOr[replayable | once | String] = js.native
}

object MediaConfigureStoryPhotoOptions {
  @scala.inline
  def apply(configure_mode: `1` | `2`, upload_id: String): MediaConfigureStoryPhotoOptions = {
    val __obj = js.Dynamic.literal(configure_mode = configure_mode.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureStoryPhotoOptions]
  }
  @scala.inline
  implicit class MediaConfigureStoryPhotoOptionsOps[Self <: MediaConfigureStoryPhotoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure_mode(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_multi_configures(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_multi_configures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_multi_configures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_multi_configures")(js.undefined)
        ret
    }
    @scala.inline
    def withAttached_media(value: js.Array[StoryAttachedMedia] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttached_media: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached_media")(js.undefined)
        ret
    }
    @scala.inline
    def withAudience(value: besties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera_position(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera_position")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_context")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_shared_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_shared_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_shared_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_shared_at")(js.undefined)
        ret
    }
    @scala.inline
    def withInternal_features(value: polling_sticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal_features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternal_features: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal_features")(js.undefined)
        ret
    }
    @scala.inline
    def withMas_opt_in(value: NOT_PROMPTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mas_opt_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMas_opt_in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mas_opt_in")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient_users(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient_users: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_users")(js.undefined)
        ret
    }
    @scala.inline
    def withReel_mentions(value: js.Array[StoryMention] | String): Self = {
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
    def withReply_type(value: story | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply_type")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_chats(value: js.Array[StoryChat] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_chats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_chats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_chats")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_countdowns(value: js.Array[StoryCountdown] | String): Self = {
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
    def withStory_cta(value: js.Array[StoryCta] | String): Self = {
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
    def withStory_hashtags(value: js.Array[StoryHashtag] | String): Self = {
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
    def withStory_locations(value: js.Array[StoryLocation] | String): Self = {
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
    def withStory_media_creation_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_media_creation_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_media_creation_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_media_creation_date")(js.undefined)
        ret
    }
    @scala.inline
    def withStory_polls(value: js.Array[StoryPoll] | String): Self = {
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
    def withStory_questions(value: js.Array[StoryQuestion] | String): Self = {
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
    def withStory_quizs(value: js.Array[StoryQuiz] | String): Self = {
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
    def withStory_sliders(value: js.Array[StorySlider] | String): Self = {
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
    @scala.inline
    def withStory_sticker_ids(value: String | question_sticker_ma | countdown_sticker_time | chat_sticker_id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_sticker_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStory_sticker_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_sticker_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withThread_ids(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThread_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withView_mode(value: replayable | once | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_mode")(js.undefined)
        ret
    }
  }
  
}

