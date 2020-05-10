package typingsSlinky.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileWatchersInfo extends js.Object {
  /** The path of the entry being observed. */
  var entryPath: String = js.native
  /** Optional. Tag used by the last notification for the watcher.  */
  var lastTag: js.UndefOr[String] = js.native
  /** Whether watching should include all child entries recursively. It can be true for directories only. */
  var recursive: Boolean = js.native
}

object FileWatchersInfo {
  @scala.inline
  def apply(entryPath: String, recursive: Boolean): FileWatchersInfo = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileWatchersInfo]
  }
  @scala.inline
  implicit class FileWatchersInfoOps[Self <: FileWatchersInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntryPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTag")(js.undefined)
        ret
    }
  }
  
}

