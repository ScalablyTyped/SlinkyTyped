package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseFileRequestedEventOptions extends RequestedEventOptions {
  
  /** A request ID used to open the file. */
  var openRequestId: integer = js.native
}
object CloseFileRequestedEventOptions {
  
  @scala.inline
  def apply(fileSystemId: String, openRequestId: integer, requestId: integer): CloseFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseFileRequestedEventOptions]
  }
  
  @scala.inline
  implicit class CloseFileRequestedEventOptionsMutableBuilder[Self <: CloseFileRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
