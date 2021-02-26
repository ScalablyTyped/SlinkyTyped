package typingsSlinky.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DirectoryPathRequestedEventOptionsMutableBuilder[Self <: DirectoryPathRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
  }
}
