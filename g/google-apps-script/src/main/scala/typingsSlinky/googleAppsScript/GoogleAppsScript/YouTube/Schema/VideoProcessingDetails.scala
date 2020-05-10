package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProcessingDetails extends js.Object {
  var editorSuggestionsAvailability: js.UndefOr[String] = js.native
  var fileDetailsAvailability: js.UndefOr[String] = js.native
  var processingFailureReason: js.UndefOr[String] = js.native
  var processingIssuesAvailability: js.UndefOr[String] = js.native
  var processingProgress: js.UndefOr[VideoProcessingDetailsProcessingProgress] = js.native
  var processingStatus: js.UndefOr[String] = js.native
  var tagSuggestionsAvailability: js.UndefOr[String] = js.native
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

