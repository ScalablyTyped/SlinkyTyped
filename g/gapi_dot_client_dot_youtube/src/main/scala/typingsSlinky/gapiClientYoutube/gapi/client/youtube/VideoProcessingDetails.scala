package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProcessingDetails extends js.Object {
  /**
    * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You
    * can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var editorSuggestionsAvailability: js.UndefOr[String] = js.native
  /**
    * This value indicates whether file details are available for the uploaded video. You can retrieve a video's file details by requesting the fileDetails
    * part in your videos.list() request.
    */
  var fileDetailsAvailability: js.UndefOr[String] = js.native
  /** The reason that YouTube failed to process the video. This property will only have a value if the processingStatus property's value is failed. */
  var processingFailureReason: js.UndefOr[String] = js.native
  /**
    * This value indicates whether the video processing engine has generated suggestions that might improve YouTube's ability to process the the video,
    * warnings that explain video processing problems, or errors that cause video processing problems. You can retrieve these suggestions by requesting the
    * suggestions part in your videos.list() request.
    */
  var processingIssuesAvailability: js.UndefOr[String] = js.native
  /**
    * The processingProgress object contains information about the progress YouTube has made in processing the video. The values are really only relevant if
    * the video's processing status is processing.
    */
  var processingProgress: js.UndefOr[VideoProcessingDetailsProcessingProgress] = js.native
  /** The video's processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed. */
  var processingStatus: js.UndefOr[String] = js.native
  /**
    * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a video's metadata to make it easier for other
    * users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: js.UndefOr[String] = js.native
  /** This value indicates whether thumbnail images have been generated for the video. */
  var thumbnailsAvailability: js.UndefOr[String] = js.native
}

object VideoProcessingDetails {
  @scala.inline
  def apply(): VideoProcessingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoProcessingDetails]
  }
  @scala.inline
  implicit class VideoProcessingDetailsOps[Self <: VideoProcessingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorSuggestionsAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorSuggestionsAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorSuggestionsAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorSuggestionsAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withFileDetailsAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetailsAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileDetailsAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetailsAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingFailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingFailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingIssuesAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingIssuesAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingIssuesAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingIssuesAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingProgress(value: VideoProcessingDetailsProcessingProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSuggestionsAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSuggestionsAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSuggestionsAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSuggestionsAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailsAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailsAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailsAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailsAvailability")(js.undefined)
        ret
    }
  }
  
}

