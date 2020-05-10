package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A video resource represents a YouTube video.
  */
@js.native
trait SchemaVideo extends js.Object {
  /**
    * Age restriction details related to a video. This data can only be
    * retrieved by the video owner.
    */
  var ageGating: js.UndefOr[SchemaVideoAgeGating] = js.native
  /**
    * The contentDetails object contains information about the video content,
    * including the length of the video and its aspect ratio.
    */
  var contentDetails: js.UndefOr[SchemaVideoContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The fileDetails object encapsulates information about the video file that
    * was uploaded to YouTube, including the file&#39;s resolution, duration,
    * audio and video codecs, stream bitrates, and more. This data can only be
    * retrieved by the video owner.
    */
  var fileDetails: js.UndefOr[SchemaVideoFileDetails] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#video&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The liveStreamingDetails object contains metadata about a live video
    * broadcast. The object will only be present in a video resource if the
    * video is an upcoming, live, or completed live broadcast.
    */
  var liveStreamingDetails: js.UndefOr[SchemaVideoLiveStreamingDetails] = js.native
  /**
    * List with all localizations.
    */
  var localizations: js.UndefOr[StringDictionary[SchemaVideoLocalization]] = js.native
  /**
    * The monetizationDetails object encapsulates information about the
    * monetization status of the video.
    */
  var monetizationDetails: js.UndefOr[SchemaVideoMonetizationDetails] = js.native
  /**
    * The player object contains information that you would use to play the
    * video in an embedded player.
    */
  var player: js.UndefOr[SchemaVideoPlayer] = js.native
  /**
    * The processingDetails object encapsulates information about YouTube&#39;s
    * progress in processing the uploaded video file. The properties in the
    * object identify the current processing status and an estimate of the time
    * remaining until YouTube finishes processing the video. This part also
    * indicates whether different types of data or content, such as file
    * details or thumbnail images, are available for the video.  The
    * processingProgress object is designed to be polled so that the video
    * uploaded can track the progress that YouTube has made in processing the
    * uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: js.UndefOr[SchemaVideoProcessingDetails] = js.native
  /**
    * The projectDetails object contains information about the project specific
    * video metadata.
    */
  var projectDetails: js.UndefOr[SchemaVideoProjectDetails] = js.native
  /**
    * The recordingDetails object encapsulates information about the location,
    * date and address where the video was recorded.
    */
  var recordingDetails: js.UndefOr[SchemaVideoRecordingDetails] = js.native
  /**
    * The snippet object contains basic details about the video, such as its
    * title, description, and category.
    */
  var snippet: js.UndefOr[SchemaVideoSnippet] = js.native
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: js.UndefOr[SchemaVideoStatistics] = js.native
  /**
    * The status object contains information about the video&#39;s uploading,
    * processing, and privacy statuses.
    */
  var status: js.UndefOr[SchemaVideoStatus] = js.native
  /**
    * The suggestions object encapsulates suggestions that identify
    * opportunities to improve the video quality or the metadata for the
    * uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: js.UndefOr[SchemaVideoSuggestions] = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics
    * associated with the video.
    */
  var topicDetails: js.UndefOr[SchemaVideoTopicDetails] = js.native
}

object SchemaVideo {
  @scala.inline
  def apply(): SchemaVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideo]
  }
  @scala.inline
  implicit class SchemaVideoOps[Self <: SchemaVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgeGating(value: SchemaVideoAgeGating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeGating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGating")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDetails(value: SchemaVideoContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withFileDetails(value: SchemaVideoFileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveStreamingDetails(value: SchemaVideoLiveStreamingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveStreamingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveStreamingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveStreamingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizations(value: StringDictionary[SchemaVideoLocalization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizations")(js.undefined)
        ret
    }
    @scala.inline
    def withMonetizationDetails(value: SchemaVideoMonetizationDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monetizationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonetizationDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monetizationDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayer(value: SchemaVideoPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingDetails(value: SchemaVideoProcessingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectDetails(value: SchemaVideoProjectDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingDetails(value: SchemaVideoRecordingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: SchemaVideoSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: SchemaVideoStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaVideoStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: SchemaVideoSuggestions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicDetails(value: SchemaVideoTopicDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicDetails")(js.undefined)
        ret
    }
  }
  
}

