package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextDetectionResponse extends js.Object {
  /**
    * Identifier for the text detection job. Use JobId to identify the job in a subsequent call to GetTextDetection.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.JobId] = js.native
}

object StartTextDetectionResponse {
  @scala.inline
  def apply(): StartTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTextDetectionResponse]
  }
  @scala.inline
  implicit class StartTextDetectionResponseOps[Self <: StartTextDetectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
  }
  
}

