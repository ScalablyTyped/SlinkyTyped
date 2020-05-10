package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadProgressCallbackResult extends js.Object {
  var jobId: Double = js.native
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var totalBytesExpectedToSend: Double = js.native
  // The total number of bytes that will be sent to the server
  var totalBytesSent: Double = js.native
}

object UploadProgressCallbackResult {
  @scala.inline
  def apply(jobId: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): UploadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressCallbackResult]
  }
  @scala.inline
  implicit class UploadProgressCallbackResultOps[Self <: UploadProgressCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesExpectedToSend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesExpectedToSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesSent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

