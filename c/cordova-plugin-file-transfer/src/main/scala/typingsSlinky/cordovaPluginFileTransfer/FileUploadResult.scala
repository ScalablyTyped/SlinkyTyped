package typingsSlinky.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileUploadResult object is passed to the success callback of the FileTransfer object's upload() method. */
@js.native
trait FileUploadResult extends js.Object {
  /** The number of bytes sent to the server as part of the upload. */
  var bytesSent: Double = js.native
  /** The HTTP response headers by the server. Currently supported on iOS only.*/
  var headers: js.Any = js.native
  /** The HTTP response returned by the server. */
  var response: String = js.native
  /** The HTTP response code returned by the server. */
  var responseCode: Double = js.native
}

object FileUploadResult {
  @scala.inline
  def apply(bytesSent: Double, headers: js.Any, response: String, responseCode: Double): FileUploadResult = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadResult]
  }
  @scala.inline
  implicit class FileUploadResultOps[Self <: FileUploadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

