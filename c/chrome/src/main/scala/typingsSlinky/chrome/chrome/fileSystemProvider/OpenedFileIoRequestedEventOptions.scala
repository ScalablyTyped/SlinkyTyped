package typingsSlinky.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenedFileIoRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: js.typedarray.ArrayBuffer = js.native
  /** Position in the file (in bytes) to start operating from. */
  var offset: Double = js.native
}

object OpenedFileIoRequestedEventOptions {
  @scala.inline
  def apply(
    data: js.typedarray.ArrayBuffer,
    fileSystemId: String,
    offset: Double,
    openRequestId: Double,
    requestId: Double
  ): OpenedFileIoRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileIoRequestedEventOptions]
  }
  @scala.inline
  implicit class OpenedFileIoRequestedEventOptionsOps[Self <: OpenedFileIoRequestedEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

