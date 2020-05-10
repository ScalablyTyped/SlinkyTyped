package typingsSlinky.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenedFileInfo extends js.Object {
  /** The path of the opened file. */
  var filePath: String = js.native
  /** Whether the file was opened for reading or writing. */
  var mode: String = js.native
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: Double = js.native
}

object OpenedFileInfo {
  @scala.inline
  def apply(filePath: String, mode: String, openRequestId: Double): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileInfo]
  }
  @scala.inline
  implicit class OpenedFileInfoOps[Self <: OpenedFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openRequestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

