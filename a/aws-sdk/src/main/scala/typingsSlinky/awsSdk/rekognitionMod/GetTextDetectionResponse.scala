package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextDetectionResponse extends js.Object {
  /**
    * Current status of the text detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
    */
  var TextDetections: js.UndefOr[TextDetectionResults] = js.native
  /**
    * Version number of the text detection model that was used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.native
  var VideoMetadata: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetTextDetectionResponse {
  @scala.inline
  def apply(): GetTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTextDetectionResponse]
  }
  @scala.inline
  implicit class GetTextDetectionResponseOps[Self <: GetTextDetectionResponse] (val x: Self) extends AnyVal {
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
    def withTextDetections(value: TextDetectionResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDetections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDetections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDetections")(js.undefined)
        ret
    }
    @scala.inline
    def withTextModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextModelVersion")(js.undefined)
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

