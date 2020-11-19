package typingsSlinky.chromeApps.global.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.FileSystemInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.fileSystemProvider.get")
@js.native
object get extends js.Object {
  
  /**
    * Returns information about a file system with the passed fileSystemId.
    * @since Chrome 42.
    * @param callback Callback to receive the result of get function.
    */
  def apply(fileSystemId: String, callback: js.Function1[/* fileSystem */ FileSystemInfo, Unit]): Unit = js.native
}
