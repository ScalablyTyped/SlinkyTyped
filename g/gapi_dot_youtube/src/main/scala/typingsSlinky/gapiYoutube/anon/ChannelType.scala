package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelType extends StObject {
  
  /**
    * The channelId parameter indicates that the API response should only contain resources created by the channel
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The channelType parameter lets you restrict a search to a particular type of channel.
    */
  var channelType: js.UndefOr[String] = js.native
  
  /**
    * The forContentOwner parameter restricts the search to only retrieve resources owned by the content owner specified by the onBehalfOfContentOwner parameter. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    */
  var forContentOwner: js.UndefOr[Boolean] = js.native
  
  /**
    * The forMine parameter restricts the search to only retrieve videos owned by the authenticated user.
    */
  var forMine: js.UndefOr[Boolean] = js.native
  
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * The order parameter specifies the method that will be used to order resources in the API response.
    */
  var order: js.UndefOr[String] = js.native
  
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies a comma-separated list of one or more search resource properties that the API response will include. The part names that you can include in the parameter value are id and snippet. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a search result, the snippet property contains other properties that identify the result's title, description, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: String = js.native
  
  /**
    * The publishedAfter parameter indicates that the API response should only contain resources created after the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedAfter: js.UndefOr[String] = js.native
  
  /**
    * The publishedBefore parameter indicates that the API response should only contain resources created before the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedBefore: js.UndefOr[String] = js.native
  
  /**
    * The q parameter specifies the query term to search for.
    */
  var q: js.UndefOr[String] = js.native
  
  /**
    * The regionCode parameter instructs the API to return search results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * The relatedToVideoId parameter retrieves a list of videos that are related to the video that the parameter value identifies. The parameter value must be set to a YouTube video ID and, if you are using this parameter, the type parameter must be set to video.
    */
  var relatedToVideoId: js.UndefOr[String] = js.native
  
  /**
    * The safeSearch parameter indicates whether the search results should include restricted content as well as standard content.
    */
  var safeSearch: js.UndefOr[String] = js.native
  
  /**
    * The topicId parameter indicates that the API response should only contain resources associated with the specified topic. The value identifies a Freebase topic ID.
    */
  var topicId: js.UndefOr[String] = js.native
  
  /**
    * The type parameter restricts a search query to only retrieve a particular type of resource.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The videoCaption parameter indicates whether the API should filter video search results based on whether they have captions.
    */
  var videoCaption: js.UndefOr[String] = js.native
  
  /**
    * The videoCategoryId parameter filters video search results based on their category.
    */
  var videoCategoryId: js.UndefOr[String] = js.native
  
  /**
    * The videoDefinition parameter lets you restrict a search to only include either high definition (HD) or standard definition (SD) videos. HD videos are available for playback in at least 720p, though higher resolutions, like 1080p, might also be available.
    */
  var videoDefinition: js.UndefOr[String] = js.native
  
  /**
    * The videoDimension parameter lets you restrict a search to only retrieve 2D or 3D videos.
    */
  var videoDimension: js.UndefOr[String] = js.native
  
  /**
    * The videoDuration parameter filters video search results based on their duration.
    */
  var videoDuration: js.UndefOr[String] = js.native
  
  /**
    * The videoEmbeddable parameter lets you to restrict a search to only videos that can be embedded into a webpage.
    */
  var videoEmbeddable: js.UndefOr[String] = js.native
  
  /**
    * The videoLicense parameter filters search results to only include videos with a particular license. YouTube lets video uploaders choose to attach either the Creative Commons license or the standard YouTube license to each of their videos.
    */
  var videoLicense: js.UndefOr[String] = js.native
  
  /**
    * The videoSyndicated parameter lets you to restrict a search to only videos that can be played outside youtube.com.
    */
  var videoSyndicated: js.UndefOr[String] = js.native
  
  /**
    * The videoType parameter lets you restrict a search to a particular type of videos.
    */
  var videoType: js.UndefOr[String] = js.native
}
object ChannelType {
  
  @scala.inline
  def apply(part: String): ChannelType = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelType]
  }
  
  @scala.inline
  implicit class ChannelTypeMutableBuilder[Self <: ChannelType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    @scala.inline
    def setForContentOwner(value: Boolean): Self = StObject.set(x, "forContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForContentOwnerUndefined: Self = StObject.set(x, "forContentOwner", js.undefined)
    
    @scala.inline
    def setForMine(value: Boolean): Self = StObject.set(x, "forMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForMineUndefined: Self = StObject.set(x, "forMine", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAfter(value: String): Self = StObject.set(x, "publishedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAfterUndefined: Self = StObject.set(x, "publishedAfter", js.undefined)
    
    @scala.inline
    def setPublishedBefore(value: String): Self = StObject.set(x, "publishedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedBeforeUndefined: Self = StObject.set(x, "publishedBefore", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setRelatedToVideoId(value: String): Self = StObject.set(x, "relatedToVideoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedToVideoIdUndefined: Self = StObject.set(x, "relatedToVideoId", js.undefined)
    
    @scala.inline
    def setSafeSearch(value: String): Self = StObject.set(x, "safeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeSearchUndefined: Self = StObject.set(x, "safeSearch", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVideoCaption(value: String): Self = StObject.set(x, "videoCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCaptionUndefined: Self = StObject.set(x, "videoCaption", js.undefined)
    
    @scala.inline
    def setVideoCategoryId(value: String): Self = StObject.set(x, "videoCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCategoryIdUndefined: Self = StObject.set(x, "videoCategoryId", js.undefined)
    
    @scala.inline
    def setVideoDefinition(value: String): Self = StObject.set(x, "videoDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDefinitionUndefined: Self = StObject.set(x, "videoDefinition", js.undefined)
    
    @scala.inline
    def setVideoDimension(value: String): Self = StObject.set(x, "videoDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDimensionUndefined: Self = StObject.set(x, "videoDimension", js.undefined)
    
    @scala.inline
    def setVideoDuration(value: String): Self = StObject.set(x, "videoDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDurationUndefined: Self = StObject.set(x, "videoDuration", js.undefined)
    
    @scala.inline
    def setVideoEmbeddable(value: String): Self = StObject.set(x, "videoEmbeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEmbeddableUndefined: Self = StObject.set(x, "videoEmbeddable", js.undefined)
    
    @scala.inline
    def setVideoLicense(value: String): Self = StObject.set(x, "videoLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoLicenseUndefined: Self = StObject.set(x, "videoLicense", js.undefined)
    
    @scala.inline
    def setVideoSyndicated(value: String): Self = StObject.set(x, "videoSyndicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSyndicatedUndefined: Self = StObject.set(x, "videoSyndicated", js.undefined)
    
    @scala.inline
    def setVideoType(value: String): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoTypeUndefined: Self = StObject.set(x, "videoType", js.undefined)
  }
}
