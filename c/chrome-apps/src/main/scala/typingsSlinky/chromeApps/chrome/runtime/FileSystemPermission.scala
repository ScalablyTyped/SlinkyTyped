package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chromeAppsStrings.directory
import typingsSlinky.chromeApps.chromeAppsStrings.requestFileSystem
import typingsSlinky.chromeApps.chromeAppsStrings.retainEntries
import typingsSlinky.chromeApps.chromeAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemPermission extends ChromeOSOnlyPermissions {
  /**
    * @enum {string}
    * @requires(CrOS) 'requestFileSystem' is only for ChromeOS
    */
  var fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem] = js.native
}

object FileSystemPermission {
  @scala.inline
  def apply(fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem]): FileSystemPermission = {
    val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPermission]
  }
  @scala.inline
  implicit class FileSystemPermissionOps[Self <: FileSystemPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileSystemVarargs(value: (write_ | retainEntries | directory | requestFileSystem)*): Self = this.set("fileSystem", js.Array(value :_*))
    @scala.inline
    def setFileSystem(value: js.Array[write_ | retainEntries | directory | requestFileSystem]): Self = this.set("fileSystem", value.asInstanceOf[js.Any])
  }
  
}

