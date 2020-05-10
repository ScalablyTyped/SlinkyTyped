package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryRequestedEventOptions extends RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: String = js.native
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean = js.native
}

object CreateDirectoryRequestedEventOptions {
  @scala.inline
  def apply(directoryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): CreateDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequestedEventOptions]
  }
  @scala.inline
  implicit class CreateDirectoryRequestedEventOptionsOps[Self <: CreateDirectoryRequestedEventOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

