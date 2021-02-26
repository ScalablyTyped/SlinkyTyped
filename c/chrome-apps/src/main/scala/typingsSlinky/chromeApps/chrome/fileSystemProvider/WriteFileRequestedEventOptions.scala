package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteFileRequestedEventOptions extends RequestedEventOptions {
  
  /** Buffer of bytes to be operated on the file. */
  var data: js.typedarray.ArrayBuffer = js.native
  
  /** Position in the file (in bytes) to start operating from. */
  var offset: integer = js.native
  
  /** A request ID used to open the file. */
  var openRequestId: integer = js.native
}
object WriteFileRequestedEventOptions {
  
  @scala.inline
  def apply(
    data: js.typedarray.ArrayBuffer,
    fileSystemId: String,
    offset: integer,
    openRequestId: integer,
    requestId: integer
  ): WriteFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileRequestedEventOptions]
  }
  
  @scala.inline
  implicit class WriteFileRequestedEventOptionsMutableBuilder[Self <: WriteFileRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
