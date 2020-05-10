package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadProgressCallbackResult extends js.Object {
  // The total size in bytes of the download resource
  var bytesWritten: Double = js.native
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var contentLength: Double = js.native
  var jobId: Double = js.native
}

object DownloadProgressCallbackResult {
  @scala.inline
  def apply(bytesWritten: Double, contentLength: Double, jobId: Double): DownloadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressCallbackResult]
  }
  @scala.inline
  implicit class DownloadProgressCallbackResultOps[Self <: DownloadProgressCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesWritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

