package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chromeAppsStrings.directory
import typingsSlinky.chromeApps.chromeAppsStrings.requestFileSystem
import typingsSlinky.chromeApps.chromeAppsStrings.retainEntries
import typingsSlinky.chromeApps.chromeAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemPermission extends ChromeOSOnlyPermissions {
  /**
    * @enum {string}
    * @requires(CrOS) 'requestFileSystem' is only for ChromeOS
    */
  var fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem]
}

object FileSystemPermission {
  @scala.inline
  def apply(fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem]): FileSystemPermission = {
    val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystemPermission]
  }
}

