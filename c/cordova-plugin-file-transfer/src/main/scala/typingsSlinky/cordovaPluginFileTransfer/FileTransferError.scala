package typingsSlinky.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileTransferError object is passed to an error callback when an error occurs. */
@js.native
trait FileTransferError extends js.Object {
  /* Response body. This attribute is only available when a response is received from the HTTP connection. */
  var body: String = js.native
  /**
    * One of the predefined error codes listed below.
    *     FileTransferError.FILE_NOT_FOUND_ERR
    *     FileTransferError.INVALID_URL_ERR
    *     FileTransferError.CONNECTION_ERR
    *     FileTransferError.ABORT_ERR
    *     FileTransferError.NOT_MODIFIED_ERR
    */
  var code: Double = js.native
  /* Exception that is thrown by native code */
  var exception: js.Any = js.native
  /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
  var http_status: Double = js.native
  /** URL to the source. */
  var source: String = js.native
  /** URL to the target. */
  var target: String = js.native
}

object FileTransferError {
  @scala.inline
  def apply(body: String, code: Double, exception: js.Any, http_status: Double, source: String, target: String): FileTransferError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], http_status = http_status.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransferError]
  }
  @scala.inline
  implicit class FileTransferErrorOps[Self <: FileTransferError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withException(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp_status(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

