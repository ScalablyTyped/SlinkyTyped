package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCelebrityRecognitionResponse extends js.Object {
  /**
    * Array of celebrities recognized in the video.
    */
  var Celebrities: js.UndefOr[CelebrityRecognitions] = js.native
  /**
    * The current status of the celebrity recognition job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of celebrities.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
    */
  var VideoMetadata: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetCelebrityRecognitionResponse {
  @scala.inline
  def apply(): GetCelebrityRecognitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCelebrityRecognitionResponse]
  }
  @scala.inline
  implicit class GetCelebrityRecognitionResponseOps[Self <: GetCelebrityRecognitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCelebrities(value: CelebrityRecognitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Celebrities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCelebrities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Celebrities")(js.undefined)
        ret
    }
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

