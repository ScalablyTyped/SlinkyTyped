package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChannelType extends js.Object {
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

object AnonChannelType {
  @scala.inline
  def apply(part: String): AnonChannelType = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelType]
  }
  @scala.inline
  implicit class AnonChannelTypeOps[Self <: AnonChannelType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelType")(js.undefined)
        ret
    }
    @scala.inline
    def withForContentOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forContentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForContentOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forContentOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withForMine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forMine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForMine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forMine")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfContentOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfContentOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedToVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedToVideoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedToVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedToVideoId")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCategoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCategoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCategoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCategoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoEmbeddable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoEmbeddable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoEmbeddable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoEmbeddable")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoLicense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoLicense")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSyndicated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSyndicated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSyndicated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoSyndicated")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoType")(js.undefined)
        ret
    }
  }
  
}

