package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContentModerationResponse extends js.Object {
  /**
    * The current status of the unsafe content analysis job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * The detected unsafe content labels and the time(s) they were detected.
    */
  var ModerationLabels: js.UndefOr[ContentModerationDetections] = js.native
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of unsafe content labels. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from GetContentModeration. 
    */
  var VideoMetadata: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetContentModerationResponse {
  @scala.inline
  def apply(): GetContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentModerationResponse]
  }
  @scala.inline
  implicit class GetContentModerationResponseOps[Self <: GetContentModerationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobStatus(value: VideoJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withModerationLabels(value: ContentModerationDetections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withModerationModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModerationModelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoMetadata(value: VideoMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoMetadata")(js.undefined)
        ret
    }
  }
  
}

