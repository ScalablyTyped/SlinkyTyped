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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureStoryBaseOptions extends StObject {
  
  var allow_multi_configures: js.UndefOr[`0` | `1`] = js.native
  
  var attached_media: js.UndefOr[js.Array[StoryAttachedMedia] | String] = js.native
  
  var audience: js.UndefOr[besties] = js.native
  
  var camera_position: js.UndefOr[String] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var client_context: js.UndefOr[String] = js.native
  
  var client_shared_at: js.UndefOr[String] = js.native
  
  var configure_mode: `1` | `2` = js.native
  
  var geotag_enabled: js.UndefOr[`1` | `0`] = js.native
  
  var internal_features: js.UndefOr[polling_sticker] = js.native
  
  var mas_opt_in: js.UndefOr[NOT_PROMPTED] = js.native
  
  var media_latitude: js.UndefOr[String] = js.native
  
  var media_longitude: js.UndefOr[String] = js.native
  
  var posting_latitude: js.UndefOr[String] = js.native
  
  var posting_longitude: js.UndefOr[String] = js.native
  
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
object MediaConfigureStoryBaseOptions {
  
  @scala.inline
  def apply(configure_mode: `1` | `2`): MediaConfigureStoryBaseOptions = {
    val __obj = js.Dynamic.literal(configure_mode = configure_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureStoryBaseOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureStoryBaseOptionsMutableBuilder[Self <: MediaConfigureStoryBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_multi_configures(value: `0` | `1`): Self = StObject.set(x, "allow_multi_configures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_multi_configuresUndefined: Self = StObject.set(x, "allow_multi_configures", js.undefined)
    
    @scala.inline
    def setAttached_media(value: js.Array[StoryAttachedMedia] | String): Self = StObject.set(x, "attached_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttached_mediaUndefined: Self = StObject.set(x, "attached_media", js.undefined)
    
    @scala.inline
    def setAttached_mediaVarargs(value: StoryAttachedMedia*): Self = StObject.set(x, "attached_media", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: besties): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setCamera_position(value: String): Self = StObject.set(x, "camera_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera_positionUndefined: Self = StObject.set(x, "camera_position", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_contextUndefined: Self = StObject.set(x, "client_context", js.undefined)
    
    @scala.inline
    def setClient_shared_at(value: String): Self = StObject.set(x, "client_shared_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_shared_atUndefined: Self = StObject.set(x, "client_shared_at", js.undefined)
    
    @scala.inline
    def setConfigure_mode(value: `1` | `2`): Self = StObject.set(x, "configure_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeotag_enabled(value: `1` | `0`): Self = StObject.set(x, "geotag_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeotag_enabledUndefined: Self = StObject.set(x, "geotag_enabled", js.undefined)
    
    @scala.inline
    def setInternal_features(value: polling_sticker): Self = StObject.set(x, "internal_features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal_featuresUndefined: Self = StObject.set(x, "internal_features", js.undefined)
    
    @scala.inline
    def setMas_opt_in(value: NOT_PROMPTED): Self = StObject.set(x, "mas_opt_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMas_opt_inUndefined: Self = StObject.set(x, "mas_opt_in", js.undefined)
    
    @scala.inline
    def setMedia_latitude(value: String): Self = StObject.set(x, "media_latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_latitudeUndefined: Self = StObject.set(x, "media_latitude", js.undefined)
    
    @scala.inline
    def setMedia_longitude(value: String): Self = StObject.set(x, "media_longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_longitudeUndefined: Self = StObject.set(x, "media_longitude", js.undefined)
    
    @scala.inline
    def setPosting_latitude(value: String): Self = StObject.set(x, "posting_latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosting_latitudeUndefined: Self = StObject.set(x, "posting_latitude", js.undefined)
    
    @scala.inline
    def setPosting_longitude(value: String): Self = StObject.set(x, "posting_longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosting_longitudeUndefined: Self = StObject.set(x, "posting_longitude", js.undefined)
    
    @scala.inline
    def setRecipient_users(value: js.Array[String] | String): Self = StObject.set(x, "recipient_users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_usersUndefined: Self = StObject.set(x, "recipient_users", js.undefined)
    
    @scala.inline
    def setRecipient_usersVarargs(value: String*): Self = StObject.set(x, "recipient_users", js.Array(value :_*))
    
    @scala.inline
    def setReel_mentions(value: js.Array[StoryMention] | String): Self = StObject.set(x, "reel_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_mentionsUndefined: Self = StObject.set(x, "reel_mentions", js.undefined)
    
    @scala.inline
    def setReel_mentionsVarargs(value: StoryMention*): Self = StObject.set(x, "reel_mentions", js.Array(value :_*))
    
    @scala.inline
    def setReply_type(value: story | String): Self = StObject.set(x, "reply_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_typeUndefined: Self = StObject.set(x, "reply_type", js.undefined)
    
    @scala.inline
    def setStory_chats(value: js.Array[StoryChat] | String): Self = StObject.set(x, "story_chats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_chatsUndefined: Self = StObject.set(x, "story_chats", js.undefined)
    
    @scala.inline
    def setStory_chatsVarargs(value: StoryChat*): Self = StObject.set(x, "story_chats", js.Array(value :_*))
    
    @scala.inline
    def setStory_countdowns(value: js.Array[StoryCountdown] | String): Self = StObject.set(x, "story_countdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_countdownsUndefined: Self = StObject.set(x, "story_countdowns", js.undefined)
    
    @scala.inline
    def setStory_countdownsVarargs(value: StoryCountdown*): Self = StObject.set(x, "story_countdowns", js.Array(value :_*))
    
    @scala.inline
    def setStory_cta(value: js.Array[StoryCta] | String): Self = StObject.set(x, "story_cta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_ctaUndefined: Self = StObject.set(x, "story_cta", js.undefined)
    
    @scala.inline
    def setStory_ctaVarargs(value: StoryCta*): Self = StObject.set(x, "story_cta", js.Array(value :_*))
    
    @scala.inline
    def setStory_hashtags(value: js.Array[StoryHashtag] | String): Self = StObject.set(x, "story_hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_hashtagsUndefined: Self = StObject.set(x, "story_hashtags", js.undefined)
    
    @scala.inline
    def setStory_hashtagsVarargs(value: StoryHashtag*): Self = StObject.set(x, "story_hashtags", js.Array(value :_*))
    
    @scala.inline
    def setStory_locations(value: js.Array[StoryLocation] | String): Self = StObject.set(x, "story_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_locationsUndefined: Self = StObject.set(x, "story_locations", js.undefined)
    
    @scala.inline
    def setStory_locationsVarargs(value: StoryLocation*): Self = StObject.set(x, "story_locations", js.Array(value :_*))
    
    @scala.inline
    def setStory_media_creation_date(value: String): Self = StObject.set(x, "story_media_creation_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_media_creation_dateUndefined: Self = StObject.set(x, "story_media_creation_date", js.undefined)
    
    @scala.inline
    def setStory_polls(value: js.Array[StoryPoll] | String): Self = StObject.set(x, "story_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_pollsUndefined: Self = StObject.set(x, "story_polls", js.undefined)
    
    @scala.inline
    def setStory_pollsVarargs(value: StoryPoll*): Self = StObject.set(x, "story_polls", js.Array(value :_*))
    
    @scala.inline
    def setStory_questions(value: js.Array[StoryQuestion] | String): Self = StObject.set(x, "story_questions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_questionsUndefined: Self = StObject.set(x, "story_questions", js.undefined)
    
    @scala.inline
    def setStory_questionsVarargs(value: StoryQuestion*): Self = StObject.set(x, "story_questions", js.Array(value :_*))
    
    @scala.inline
    def setStory_quizs(value: js.Array[StoryQuiz] | String): Self = StObject.set(x, "story_quizs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_quizsUndefined: Self = StObject.set(x, "story_quizs", js.undefined)
    
    @scala.inline
    def setStory_quizsVarargs(value: StoryQuiz*): Self = StObject.set(x, "story_quizs", js.Array(value :_*))
    
    @scala.inline
    def setStory_sliders(value: js.Array[StorySlider] | String): Self = StObject.set(x, "story_sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_slidersUndefined: Self = StObject.set(x, "story_sliders", js.undefined)
    
    @scala.inline
    def setStory_slidersVarargs(value: StorySlider*): Self = StObject.set(x, "story_sliders", js.Array(value :_*))
    
    @scala.inline
    def setStory_sticker_ids(value: String | question_sticker_ma | countdown_sticker_time | chat_sticker_id): Self = StObject.set(x, "story_sticker_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_sticker_idsUndefined: Self = StObject.set(x, "story_sticker_ids", js.undefined)
    
    @scala.inline
    def setThread_ids(value: js.Array[String] | String): Self = StObject.set(x, "thread_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_idsUndefined: Self = StObject.set(x, "thread_ids", js.undefined)
    
    @scala.inline
    def setThread_idsVarargs(value: String*): Self = StObject.set(x, "thread_ids", js.Array(value :_*))
    
    @scala.inline
    def setView_mode(value: replayable | once | String): Self = StObject.set(x, "view_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_modeUndefined: Self = StObject.set(x, "view_mode", js.undefined)
  }
}
