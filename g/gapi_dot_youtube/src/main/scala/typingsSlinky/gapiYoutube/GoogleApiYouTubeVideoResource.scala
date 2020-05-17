package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.AudioStreams
import typingsSlinky.gapiYoutube.anon.Caption
import typingsSlinky.gapiYoutube.anon.CategoryId
import typingsSlinky.gapiYoutube.anon.DislikeCount
import typingsSlinky.gapiYoutube.anon.EditorSuggestions
import typingsSlinky.gapiYoutube.anon.EditorSuggestionsAvailability
import typingsSlinky.gapiYoutube.anon.EmbedHtml
import typingsSlinky.gapiYoutube.anon.Embeddable
import typingsSlinky.gapiYoutube.anon.Location
import typingsSlinky.gapiYoutube.anon.TopicIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeVideoResource extends js.Object {
  /**
    * The contentDetails object contains information about the video content, including the length of the video and its aspect ratio.
    */
  var contentDetails: Caption = js.native
  /**
    * The ETag of the video resource.
    */
  var etag: String = js.native
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the files resolution, duration, audio and video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: AudioStreams = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For video resources, the value will be youtube#video.
    */
  var kind: String = js.native
  /**
    * The player object contains information that you would use to play the video in an embedded player.
    */
  var player: EmbedHtml = js.native
  /**
    * The processingProgress object encapsulates information about YouTubes progress in processing the uploaded video file. The properties in the object identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details or thumbnail images, are available for the video.
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: EditorSuggestionsAvailability = js.native
  /**
    * The recordingDetails object encapsulates information about the location, date and address where the video was recorded. This object will only be returned for a video if the videos geolocation data or recording time has been set.
    */
  var recordingDetails: Location = js.native
  /**
    * The snippet object contains basic details about the video, such as its title, description, and category.
    */
  var snippet: CategoryId = js.native
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: DislikeCount = js.native
  /**
    * The status object contains information about the videos uploading, processing, and privacy statuses.
    */
  var status: Embeddable = js.native
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: EditorSuggestions = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the video.
    */
  var topicDetails: TopicIds = js.native
}

object GoogleApiYouTubeVideoResource {
  @scala.inline
  def apply(
    contentDetails: Caption,
    etag: String,
    fileDetails: AudioStreams,
    id: String,
    kind: String,
    player: EmbedHtml,
    processingDetails: EditorSuggestionsAvailability,
    recordingDetails: Location,
    snippet: CategoryId,
    statistics: DislikeCount,
    status: Embeddable,
    suggestions: EditorSuggestions,
    topicDetails: TopicIds
  ): GoogleApiYouTubeVideoResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], fileDetails = fileDetails.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], processingDetails = processingDetails.asInstanceOf[js.Any], recordingDetails = recordingDetails.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeVideoResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeVideoResourceOps[Self <: GoogleApiYouTubeVideoResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDetails(value: Caption): Self = {
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
    def withFileDetails(value: AudioStreams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayer(value: EmbedHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingDetails(value: EditorSuggestionsAvailability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordingDetails(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippet(value: CategoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: DislikeCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Embeddable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: EditorSuggestions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicDetails(value: TopicIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

