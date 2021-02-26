package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a comment, such as its author and text.
  */
@js.native
trait SchemaCommentSnippet extends StObject {
  
  /**
    * The id of the author&#39;s YouTube channel, if any.
    */
  var authorChannelId: js.UndefOr[js.Any] = js.native
  
  /**
    * Link to the author&#39;s YouTube channel, if any.
    */
  var authorChannelUrl: js.UndefOr[String] = js.native
  
  /**
    * The name of the user who posted the comment.
    */
  var authorDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The URL for the avatar of the user who posted the comment.
    */
  var authorProfileImageUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether the current viewer can rate this comment.
    */
  var canRate: js.UndefOr[Boolean] = js.native
  
  /**
    * The id of the corresponding YouTube channel. In case of a channel comment
    * this is the channel the comment refers to. In case of a video comment
    * it&#39;s the video&#39;s channel.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The total number of likes this comment has received.
    */
  var likeCount: js.UndefOr[Double] = js.native
  
  /**
    * The comment&#39;s moderation status. Will not be set if the comments were
    * requested through the id filter.
    */
  var moderationStatus: js.UndefOr[String] = js.native
  
  /**
    * The unique id of the parent comment, only set for replies.
    */
  var parentId: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the comment was orignally published. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * The comment&#39;s text. The format is either plain text or HTML dependent
    * on what has been requested. Even the plain text representation may differ
    * from the text originally posted in that it may replace video links with
    * video titles etc.
    */
  var textDisplay: js.UndefOr[String] = js.native
  
  /**
    * The comment&#39;s original raw text as initially posted or last updated.
    * The original text will only be returned if it is accessible to the
    * viewer, which is only guaranteed if the viewer is the comment&#39;s
    * author.
    */
  var textOriginal: js.UndefOr[String] = js.native
  
  /**
    * The date and time when was last updated . The value is specified in ISO
    * 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var updatedAt: js.UndefOr[String] = js.native
  
  /**
    * The ID of the video the comment refers to, if any.
    */
  var videoId: js.UndefOr[String] = js.native
  
  /**
    * The rating the viewer has given to this comment. For the time being this
    * will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE.
    * This may change in the future.
    */
  var viewerRating: js.UndefOr[String] = js.native
}
object SchemaCommentSnippet {
  
  @scala.inline
  def apply(): SchemaCommentSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentSnippet]
  }
  
  @scala.inline
  implicit class SchemaCommentSnippetMutableBuilder[Self <: SchemaCommentSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorChannelId(value: js.Any): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
    
    @scala.inline
    def setAuthorChannelUrl(value: String): Self = StObject.set(x, "authorChannelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorChannelUrlUndefined: Self = StObject.set(x, "authorChannelUrl", js.undefined)
    
    @scala.inline
    def setAuthorDisplayName(value: String): Self = StObject.set(x, "authorDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorDisplayNameUndefined: Self = StObject.set(x, "authorDisplayName", js.undefined)
    
    @scala.inline
    def setAuthorProfileImageUrl(value: String): Self = StObject.set(x, "authorProfileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorProfileImageUrlUndefined: Self = StObject.set(x, "authorProfileImageUrl", js.undefined)
    
    @scala.inline
    def setCanRate(value: Boolean): Self = StObject.set(x, "canRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRateUndefined: Self = StObject.set(x, "canRate", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setLikeCount(value: Double): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
    
    @scala.inline
    def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTextDisplay(value: String): Self = StObject.set(x, "textDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDisplayUndefined: Self = StObject.set(x, "textDisplay", js.undefined)
    
    @scala.inline
    def setTextOriginal(value: String): Self = StObject.set(x, "textOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOriginalUndefined: Self = StObject.set(x, "textOriginal", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    @scala.inline
    def setViewerRating(value: String): Self = StObject.set(x, "viewerRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerRatingUndefined: Self = StObject.set(x, "viewerRating", js.undefined)
  }
}
