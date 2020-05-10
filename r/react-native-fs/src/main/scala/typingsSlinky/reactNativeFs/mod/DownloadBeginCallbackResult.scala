package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadBeginCallbackResult extends js.Object {
  // The HTTP status code
  var contentLength: Double = js.native
  // The total size in bytes of the download resource
  var headers: Headers = js.native
  var jobId: Double = js.native
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var statusCode: Double = js.native
}

object DownloadBeginCallbackResult {
  @scala.inline
  def apply(contentLength: Double, headers: Headers, jobId: Double, statusCode: Double): DownloadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadBeginCallbackResult]
  }
  @scala.inline
  implicit class DownloadBeginCallbackResultOps[Self <: DownloadBeginCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

