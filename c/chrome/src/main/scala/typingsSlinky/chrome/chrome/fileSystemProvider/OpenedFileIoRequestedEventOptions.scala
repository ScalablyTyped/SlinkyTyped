package typingsSlinky.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenedFileIoRequestedEventOptions extends OpenedFileRequestedEventOptions {
  
  /** Buffer of bytes to be operated on the file. */
  var data: js.typedarray.ArrayBuffer = js.native
  
  /** Position in the file (in bytes) to start operating from. */
  var offset: Double = js.native
}
object OpenedFileIoRequestedEventOptions {
  
  @scala.inline
  def apply(
    data: js.typedarray.ArrayBuffer,
    fileSystemId: String,
    offset: Double,
    openRequestId: Double,
    requestId: Double
  ): OpenedFileIoRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileIoRequestedEventOptions]
  }
  
  @scala.inline
  implicit class OpenedFileIoRequestedEventOptionsMutableBuilder[Self <: OpenedFileIoRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
