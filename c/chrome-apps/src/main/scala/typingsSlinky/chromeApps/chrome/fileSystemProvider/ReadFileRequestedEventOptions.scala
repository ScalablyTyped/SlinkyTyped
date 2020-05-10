package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadFileRequestedEventOptions extends RequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: double = js.native
  /** Position in the file (in bytes) to start reading from. */
  var offset: double = js.native
  /** A request ID used to open the file. */
  var openRequestId: integer = js.native
}

object ReadFileRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, length: double, offset: double, openRequestId: integer, requestId: integer): ReadFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileRequestedEventOptions]
  }
  @scala.inline
  implicit class ReadFileRequestedEventOptionsOps[Self <: ReadFileRequestedEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenRequestId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openRequestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

