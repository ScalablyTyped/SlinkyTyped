package typingsSlinky.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: String = js.native
}

object DirectoryPathRequestedEventOptions {
  @scala.inline
  def apply(directoryPath: String, fileSystemId: String, requestId: Double): DirectoryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryPathRequestedEventOptions]
  }
  @scala.inline
  implicit class DirectoryPathRequestedEventOptionsOps[Self <: DirectoryPathRequestedEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

