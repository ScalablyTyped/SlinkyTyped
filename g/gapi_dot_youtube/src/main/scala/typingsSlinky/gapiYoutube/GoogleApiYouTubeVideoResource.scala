package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeVideoResource extends js.Object {
  /**
    * The contentDetails object contains information about the video content, including the length of the video and its aspect ratio.
    */
  var contentDetails: AnonCaption = js.native
  /**
    * The ETag of the video resource.
    */
  var etag: String = js.native
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the files resolution, duration, audio and video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: AnonAudioStreams = js.native
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
  var player: AnonEmbedHtml = js.native
  /**
    * The processingProgress object encapsulates information about YouTubes progress in processing the uploaded video file. The properties in the object identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details or thumbnail images, are available for the video.
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: AnonEditorSuggestionsAvailability = js.native
  /**
    * The recordingDetails object encapsulates information about the location, date and address where the video was recorded. This object will only be returned for a video if the videos geolocation data or recording time has been set.
    */
  var recordingDetails: AnonLocation = js.native
  /**
    * The snippet object contains basic details about the video, such as its title, description, and category.
    */
  var snippet: AnonTags = js.native
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: AnonDislikeCount = js.native
  /**
    * The status object contains information about the videos uploading, processing, and privacy statuses.
    */
  var status: AnonEmbeddable = js.native
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: AnonEditorSuggestions = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the video.
    */
  var topicDetails: AnonTopicIds = js.native
}

object GoogleApiYouTubeVideoResource {
  @scala.inline
  def apply(
    contentDetails: AnonCaption,
    etag: String,
    fileDetails: AnonAudioStreams,
    id: String,
    kind: String,
    player: AnonEmbedHtml,
    processingDetails: AnonEditorSuggestionsAvailability,
    recordingDetails: AnonLocation,
    snippet: AnonTags,
    statistics: AnonDislikeCount,
    status: AnonEmbeddable,
    suggestions: AnonEditorSuggestions,
    topicDetails: AnonTopicIds
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
    def withContentDetails(value: AnonCaption): Self = {
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
    def withFileDetails(value: AnonAudioStreams): Self = {
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
    def withPlayer(value: AnonEmbedHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingDetails(value: AnonEditorSuggestionsAvailability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordingDetails(value: AnonLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippet(value: AnonTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: AnonDislikeCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AnonEmbeddable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: AnonEditorSuggestions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
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

