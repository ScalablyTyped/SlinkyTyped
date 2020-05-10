package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  var ageGating: js.UndefOr[VideoAgeGating] = js.native
  var contentDetails: js.UndefOr[VideoContentDetails] = js.native
  var etag: js.UndefOr[String] = js.native
  var fileDetails: js.UndefOr[VideoFileDetails] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.native
  var localizations: js.UndefOr[js.Object] = js.native
  var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.native
  var player: js.UndefOr[VideoPlayer] = js.native
  var processingDetails: js.UndefOr[VideoProcessingDetails] = js.native
  var projectDetails: js.UndefOr[VideoProjectDetails] = js.native
  var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.native
  var snippet: js.UndefOr[VideoSnippet] = js.native
  var statistics: js.UndefOr[VideoStatistics] = js.native
  var status: js.UndefOr[VideoStatus] = js.native
  var suggestions: js.UndefOr[VideoSuggestions] = js.native
  var topicDetails: js.UndefOr[VideoTopicDetails] = js.native
}

object Video {
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  @scala.inline
  implicit class VideoOps[Self <: Video] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgeGating(value: VideoAgeGating): Self = {
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
    def withContentDetails(value: VideoContentDetails): Self = {
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
    def withFileDetails(value: VideoFileDetails): Self = {
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
    def withLiveStreamingDetails(value: VideoLiveStreamingDetails): Self = {
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
    def withLocalizations(value: js.Object): Self = {
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
    def withMonetizationDetails(value: VideoMonetizationDetails): Self = {
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
    def withPlayer(value: VideoPlayer): Self = {
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
    def withProcessingDetails(value: VideoProcessingDetails): Self = {
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
    def withProjectDetails(value: VideoProjectDetails): Self = {
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
    def withRecordingDetails(value: VideoRecordingDetails): Self = {
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
    def withSnippet(value: VideoSnippet): Self = {
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
    def withStatistics(value: VideoStatistics): Self = {
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
    def withStatus(value: VideoStatus): Self = {
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
    def withSuggestions(value: VideoSuggestions): Self = {
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
    def withTopicDetails(value: VideoTopicDetails): Self = {
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

