package typingsSlinky.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryPathRecursiveRequestedEventOptions extends DirectoryPathRequestedEventOptions {
  
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean = js.native
}
object DirectoryPathRecursiveRequestedEventOptions {
  
  @scala.inline
  def apply(directoryPath: String, fileSystemId: String, recursive: Boolean, requestId: Double): DirectoryPathRecursiveRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryPathRecursiveRequestedEventOptions]
  }
  
  @scala.inline
  implicit class DirectoryPathRecursiveRequestedEventOptionsMutableBuilder[Self <: DirectoryPathRecursiveRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
