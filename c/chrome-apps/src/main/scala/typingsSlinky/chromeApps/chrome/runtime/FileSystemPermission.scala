package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chromeAppsStrings.directory
import typingsSlinky.chromeApps.chromeAppsStrings.requestFileSystem
import typingsSlinky.chromeApps.chromeAppsStrings.retainEntries
import typingsSlinky.chromeApps.chromeAppsStrings.write_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class FileSystemPermissionMutableBuilder[Self <: FileSystemPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystem(value: js.Array[write_ | retainEntries | directory | requestFileSystem]): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemVarargs(value: (write_ | retainEntries | directory | requestFileSystem)*): Self = StObject.set(x, "fileSystem", js.Array(value :_*))
  }
}
