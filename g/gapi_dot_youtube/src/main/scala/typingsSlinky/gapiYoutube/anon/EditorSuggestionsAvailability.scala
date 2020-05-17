package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorSuggestionsAvailability extends js.Object {
  /**
    * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var editorSuggestionsAvailability: String = js.native
  /**
    * The reason that YouTube failed to process the video. This property will only have a value if the processingStatus propertys value is failed.
    */
  var fileDetailsAvailability: String = js.native
  var processingFailureReason: String = js.native
  /**
    * This value indicates whether file details are available for the uploaded video. You can retrieve a videos file details by requesting the fileDetails part in your videos.list() request.
    */
  var processingIssuesAvailability: String = js.native
  /**
    * The processingProgress object contains information about the progress YouTube has made in processing the video. The values are really only relevant if the videos processing status is processing.
    */
  var processingProgress: PartsProcessed = js.native
  /**
    * The videos processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.
    */
  var processingStatus: String = js.native
  /**
    * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a videos metadata to make it easier for other users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: String = js.native
  /**
    * This value indicates whether thumbnail images have been generated for the video.
    */
  var thumbnailsAvailability: String = js.native
}

object EditorSuggestionsAvailability {
  @scala.inline
  def apply(
    editorSuggestionsAvailability: String,
    fileDetailsAvailability: String,
    processingFailureReason: String,
    processingIssuesAvailability: String,
    processingProgress: PartsProcessed,
    processingStatus: String,
    tagSuggestionsAvailability: String,
    thumbnailsAvailability: String
  ): EditorSuggestionsAvailability = {
    val __obj = js.Dynamic.literal(editorSuggestionsAvailability = editorSuggestionsAvailability.asInstanceOf[js.Any], fileDetailsAvailability = fileDetailsAvailability.asInstanceOf[js.Any], processingFailureReason = processingFailureReason.asInstanceOf[js.Any], processingIssuesAvailability = processingIssuesAvailability.asInstanceOf[js.Any], processingProgress = processingProgress.asInstanceOf[js.Any], processingStatus = processingStatus.asInstanceOf[js.Any], tagSuggestionsAvailability = tagSuggestionsAvailability.asInstanceOf[js.Any], thumbnailsAvailability = thumbnailsAvailability.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSuggestionsAvailability]
  }
  @scala.inline
  implicit class EditorSuggestionsAvailabilityOps[Self <: EditorSuggestionsAvailability] (val x: Self) extends AnyVal {
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
    def withFileDetailsAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDetailsAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingFailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingIssuesAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingIssuesAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingProgress(value: PartsProcessed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagSuggestionsAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSuggestionsAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailsAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailsAvailability")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

