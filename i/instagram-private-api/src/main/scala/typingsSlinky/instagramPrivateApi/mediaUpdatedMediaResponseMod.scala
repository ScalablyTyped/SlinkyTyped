package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaUpdatedMediaResponseMod {
  
  @js.native
  trait MediaUpdatedMediaResponseCandidatesItem extends StObject {
    
    var estimated_scans_sizes: js.Array[Double] = js.native
    
    var height: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object MediaUpdatedMediaResponseCandidatesItem {
    
    @scala.inline
    def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): MediaUpdatedMediaResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseCandidatesItem]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseCandidatesItemMutableBuilder[Self <: MediaUpdatedMediaResponseCandidatesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseCaption extends StObject {
    
    var bit_flags: Double = js.native
    
    var content_type: String = js.native
    
    var created_at: Double = js.native
    
    var created_at_utc: Double = js.native
    
    var did_report_as_spam: Boolean = js.native
    
    var media_id: String = js.native
    
    var pk: String = js.native
    
    var share_enabled: Boolean = js.native
    
    var status: String = js.native
    
    var text: String = js.native
    
    var `type`: Double = js.native
    
    var user: MediaUpdatedMediaResponseUser = js.native
    
    var user_id: Double = js.native
  }
  object MediaUpdatedMediaResponseCaption {
    
    @scala.inline
    def apply(
      bit_flags: Double,
      content_type: String,
      created_at: Double,
      created_at_utc: Double,
      did_report_as_spam: Boolean,
      media_id: String,
      pk: String,
      share_enabled: Boolean,
      status: String,
      text: String,
      `type`: Double,
      user: MediaUpdatedMediaResponseUser,
      user_id: Double
    ): MediaUpdatedMediaResponseCaption = {
      val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseCaption]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseCaptionMutableBuilder[Self <: MediaUpdatedMediaResponseCaption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBit_flags(value: Double): Self = StObject.set(x, "bit_flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at_utc(value: Double): Self = StObject.set(x, "created_at_utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDid_report_as_spam(value: Boolean): Self = StObject.set(x, "did_report_as_spam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShare_enabled(value: Boolean): Self = StObject.set(x, "share_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaUpdatedMediaResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseCreativeConfig extends StObject {
    
    var camera_facing: String = js.native
    
    var capture_type: String = js.native
    
    var should_render_try_it_on: Boolean = js.native
  }
  object MediaUpdatedMediaResponseCreativeConfig {
    
    @scala.inline
    def apply(camera_facing: String, capture_type: String, should_render_try_it_on: Boolean): MediaUpdatedMediaResponseCreativeConfig = {
      val __obj = js.Dynamic.literal(camera_facing = camera_facing.asInstanceOf[js.Any], capture_type = capture_type.asInstanceOf[js.Any], should_render_try_it_on = should_render_try_it_on.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseCreativeConfig]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseCreativeConfigMutableBuilder[Self <: MediaUpdatedMediaResponseCreativeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamera_facing(value: String): Self = StObject.set(x, "camera_facing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapture_type(value: String): Self = StObject.set(x, "capture_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShould_render_try_it_on(value: Boolean): Self = StObject.set(x, "should_render_try_it_on", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseFriendshipStatus extends StObject {
    
    var following: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_restricted: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object MediaUpdatedMediaResponseFriendshipStatus {
    
    @scala.inline
    def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): MediaUpdatedMediaResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseFriendshipStatusMutableBuilder[Self <: MediaUpdatedMediaResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[MediaUpdatedMediaResponseCandidatesItem] = js.native
  }
  object MediaUpdatedMediaResponseImageVersions2 {
    
    @scala.inline
    def apply(candidates: js.Array[MediaUpdatedMediaResponseCandidatesItem]): MediaUpdatedMediaResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseImageVersions2]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseImageVersions2MutableBuilder[Self <: MediaUpdatedMediaResponseImageVersions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[MediaUpdatedMediaResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: MediaUpdatedMediaResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponsePollSticker extends StObject {
    
    var finished: Boolean = js.native
    
    var id: String = js.native
    
    var is_shared_result: Boolean = js.native
    
    var poll_id: String = js.native
    
    var promotion_tallies: Null = js.native
    
    var question: String = js.native
    
    var tallies: js.Array[MediaUpdatedMediaResponseTalliesItem] = js.native
    
    var viewer_can_vote: Boolean = js.native
    
    var viewer_vote: Double = js.native
  }
  object MediaUpdatedMediaResponsePollSticker {
    
    @scala.inline
    def apply(
      finished: Boolean,
      id: String,
      is_shared_result: Boolean,
      poll_id: String,
      promotion_tallies: Null,
      question: String,
      tallies: js.Array[MediaUpdatedMediaResponseTalliesItem],
      viewer_can_vote: Boolean,
      viewer_vote: Double
    ): MediaUpdatedMediaResponsePollSticker = {
      val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_shared_result = is_shared_result.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], promotion_tallies = promotion_tallies.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any], viewer_vote = viewer_vote.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponsePollSticker]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponsePollStickerMutableBuilder[Self <: MediaUpdatedMediaResponsePollSticker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_shared_result(value: Boolean): Self = StObject.set(x, "is_shared_result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoll_id(value: String): Self = StObject.set(x, "poll_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotion_tallies(value: Null): Self = StObject.set(x, "promotion_tallies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTallies(value: js.Array[MediaUpdatedMediaResponseTalliesItem]): Self = StObject.set(x, "tallies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTalliesVarargs(value: MediaUpdatedMediaResponseTalliesItem*): Self = StObject.set(x, "tallies", js.Array(value :_*))
      
      @scala.inline
      def setViewer_can_vote(value: Boolean): Self = StObject.set(x, "viewer_can_vote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_vote(value: Double): Self = StObject.set(x, "viewer_vote", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var updated_media: MediaUpdatedMediaResponseUpdatedMedia = js.native
  }
  object MediaUpdatedMediaResponseRootObject {
    
    @scala.inline
    def apply(status: String, updated_media: MediaUpdatedMediaResponseUpdatedMedia): MediaUpdatedMediaResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], updated_media = updated_media.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseRootObject]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseRootObjectMutableBuilder[Self <: MediaUpdatedMediaResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_media(value: MediaUpdatedMediaResponseUpdatedMedia): Self = StObject.set(x, "updated_media", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseStoryPollsItem extends StObject {
    
    var height: Double = js.native
    
    var is_hidden: Double = js.native
    
    var is_pinned: Double = js.native
    
    var is_sticker: Double = js.native
    
    var poll_sticker: MediaUpdatedMediaResponsePollSticker = js.native
    
    var rotation: Double = js.native
    
    var width: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object MediaUpdatedMediaResponseStoryPollsItem {
    
    @scala.inline
    def apply(
      height: Double,
      is_hidden: Double,
      is_pinned: Double,
      is_sticker: Double,
      poll_sticker: MediaUpdatedMediaResponsePollSticker,
      rotation: Double,
      width: String,
      x: Double,
      y: Double,
      z: Double
    ): MediaUpdatedMediaResponseStoryPollsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], poll_sticker = poll_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseStoryPollsItem]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseStoryPollsItemMutableBuilder[Self <: MediaUpdatedMediaResponseStoryPollsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoll_sticker(value: MediaUpdatedMediaResponsePollSticker): Self = StObject.set(x, "poll_sticker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseTalliesItem extends StObject {
    
    var count: Double = js.native
    
    var font_size: Double = js.native
    
    var text: String = js.native
  }
  object MediaUpdatedMediaResponseTalliesItem {
    
    @scala.inline
    def apply(count: Double, font_size: Double, text: String): MediaUpdatedMediaResponseTalliesItem = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseTalliesItem]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseTalliesItemMutableBuilder[Self <: MediaUpdatedMediaResponseTalliesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseUpdatedMedia extends StObject {
    
    var can_reply: Boolean = js.native
    
    var can_reshare: Boolean = js.native
    
    var can_send_custom_emojis: Boolean = js.native
    
    var can_view_more_preview_comments: Boolean = js.native
    
    var can_viewer_save: Boolean = js.native
    
    var caption: MediaUpdatedMediaResponseCaption = js.native
    
    var caption_is_edited: Boolean = js.native
    
    var caption_position: Double = js.native
    
    var client_cache_key: String = js.native
    
    var code: String = js.native
    
    var comment_count: Double = js.native
    
    var comment_likes_enabled: Boolean = js.native
    
    var comment_threading_enabled: Boolean = js.native
    
    var creative_config: MediaUpdatedMediaResponseCreativeConfig = js.native
    
    var device_timestamp: Double = js.native
    
    var expiring_at: Double = js.native
    
    var filter_type: Double = js.native
    
    var has_liked: Boolean = js.native
    
    var has_more_comments: Boolean = js.native
    
    var has_shared_to_fb: Double = js.native
    
    var id: String = js.native
    
    var image_versions2: MediaUpdatedMediaResponseImageVersions2 = js.native
    
    var is_pride_media: Boolean = js.native
    
    var is_reel_media: Boolean = js.native
    
    var like_count: Double = js.native
    
    var likers: js.Array[_] = js.native
    
    var max_num_visible_preview_comments: Double = js.native
    
    var media_type: Double = js.native
    
    var organic_tracking_token: String = js.native
    
    var original_height: Double = js.native
    
    var original_width: Double = js.native
    
    var photo_of_you: Boolean = js.native
    
    var pk: String = js.native
    
    var preview_comments: js.Array[_] = js.native
    
    var show_one_tap_fb_share_tooltip: Boolean = js.native
    
    var story_polls: js.Array[MediaUpdatedMediaResponseStoryPollsItem] = js.native
    
    var supports_reel_reactions: Boolean = js.native
    
    var taken_at: Double = js.native
    
    var user: MediaUpdatedMediaResponseUser = js.native
  }
  object MediaUpdatedMediaResponseUpdatedMedia {
    
    @scala.inline
    def apply(
      can_reply: Boolean,
      can_reshare: Boolean,
      can_send_custom_emojis: Boolean,
      can_view_more_preview_comments: Boolean,
      can_viewer_save: Boolean,
      caption: MediaUpdatedMediaResponseCaption,
      caption_is_edited: Boolean,
      caption_position: Double,
      client_cache_key: String,
      code: String,
      comment_count: Double,
      comment_likes_enabled: Boolean,
      comment_threading_enabled: Boolean,
      creative_config: MediaUpdatedMediaResponseCreativeConfig,
      device_timestamp: Double,
      expiring_at: Double,
      filter_type: Double,
      has_liked: Boolean,
      has_more_comments: Boolean,
      has_shared_to_fb: Double,
      id: String,
      image_versions2: MediaUpdatedMediaResponseImageVersions2,
      is_pride_media: Boolean,
      is_reel_media: Boolean,
      like_count: Double,
      likers: js.Array[_],
      max_num_visible_preview_comments: Double,
      media_type: Double,
      organic_tracking_token: String,
      original_height: Double,
      original_width: Double,
      photo_of_you: Boolean,
      pk: String,
      preview_comments: js.Array[_],
      show_one_tap_fb_share_tooltip: Boolean,
      story_polls: js.Array[MediaUpdatedMediaResponseStoryPollsItem],
      supports_reel_reactions: Boolean,
      taken_at: Double,
      user: MediaUpdatedMediaResponseUser
    ): MediaUpdatedMediaResponseUpdatedMedia = {
      val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_send_custom_emojis = can_send_custom_emojis.asInstanceOf[js.Any], can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], creative_config = creative_config.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], story_polls = story_polls.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseUpdatedMedia]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseUpdatedMediaMutableBuilder[Self <: MediaUpdatedMediaResponseUpdatedMedia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_send_custom_emojis(value: Boolean): Self = StObject.set(x, "can_send_custom_emojis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: MediaUpdatedMediaResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_position(value: Double): Self = StObject.set(x, "caption_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_config(value: MediaUpdatedMediaResponseCreativeConfig): Self = StObject.set(x, "creative_config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_shared_to_fb(value: Double): Self = StObject.set(x, "has_shared_to_fb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: MediaUpdatedMediaResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pride_media(value: Boolean): Self = StObject.set(x, "is_pride_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_reel_media(value: Boolean): Self = StObject.set(x, "is_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikers(value: js.Array[_]): Self = StObject.set(x, "likers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikersVarargs(value: js.Any*): Self = StObject.set(x, "likers", js.Array(value :_*))
      
      @scala.inline
      def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_comments(value: js.Array[_]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_commentsVarargs(value: js.Any*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
      
      @scala.inline
      def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = StObject.set(x, "show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_polls(value: js.Array[MediaUpdatedMediaResponseStoryPollsItem]): Self = StObject.set(x, "story_polls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_pollsVarargs(value: MediaUpdatedMediaResponseStoryPollsItem*): Self = StObject.set(x, "story_polls", js.Array(value :_*))
      
      @scala.inline
      def setSupports_reel_reactions(value: Boolean): Self = StObject.set(x, "supports_reel_reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: MediaUpdatedMediaResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaUpdatedMediaResponseUser extends StObject {
    
    var friendship_status: MediaUpdatedMediaResponseFriendshipStatus = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_favorite: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_unpublished: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object MediaUpdatedMediaResponseUser {
    
    @scala.inline
    def apply(
      friendship_status: MediaUpdatedMediaResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_favorite: Boolean,
      is_private: Boolean,
      is_unpublished: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): MediaUpdatedMediaResponseUser = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_favorite = is_favorite.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaUpdatedMediaResponseUser]
    }
    
    @scala.inline
    implicit class MediaUpdatedMediaResponseUserMutableBuilder[Self <: MediaUpdatedMediaResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: MediaUpdatedMediaResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_favorite(value: Boolean): Self = StObject.set(x, "is_favorite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
