package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CreateDirectoryRequestedEventOptionsMutableBuilder[Self <: CreateDirectoryRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
