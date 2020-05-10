package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeChannelResource extends js.Object {
  /**
    * The brandingSettings object encapsulates information about the branding of the channel.
    */
  var brandingSettings: AnonChannel = js.native
  /**
    * The contentDetails object encapsulates information about the channels content.
    */
  var contentDetails: AnonGooglePlusUserId = js.native
  /**
    * The ETag for the channel resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: String = js.native
  /**
    * The invideoPromotion object encapsulates information about a promotional campaign associated with the channel. A channel can use an in-video promotional campaign to display the thumbnail image of a promoted video in the video player during playback of the channels videos
    */
  var invideoPromotion: AnonItems = js.native
  /**
    * The type of the API resource. For channel resources, the value will be youtube#channel.
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
    */
  var snippet: AnonDescription = js.native
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: AnonCommentCount = js.native
  /**
    * The status object encapsulates information about the privacy status of the channel.
    */
  var status: AnonIsLinked = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the channel.
    */
  var topicDetails: AnonTopicIds = js.native
}

object GoogleApiYouTubeChannelResource {
  @scala.inline
  def apply(
    brandingSettings: AnonChannel,
    contentDetails: AnonGooglePlusUserId,
    etag: String,
    id: String,
    invideoPromotion: AnonItems,
    kind: String,
    snippet: AnonDescription,
    statistics: AnonCommentCount,
    status: AnonIsLinked,
    topicDetails: AnonTopicIds
  ): GoogleApiYouTubeChannelResource = {
    val __obj = js.Dynamic.literal(brandingSettings = brandingSettings.asInstanceOf[js.Any], contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invideoPromotion = invideoPromotion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeChannelResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeChannelResourceOps[Self <: GoogleApiYouTubeChannelResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrandingSettings(value: AnonChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentDetails(value: AnonGooglePlusUserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvideoPromotion(value: AnonItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invideoPromotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippet(value: AnonDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: AnonCommentCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AnonIsLinked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicDetails(value: AnonTopicIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

