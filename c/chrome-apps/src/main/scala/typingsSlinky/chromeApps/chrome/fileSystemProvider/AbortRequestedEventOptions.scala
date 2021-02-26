package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortRequestedEventOptions extends RequestedEventOptions {
  
  /** An ID of the request to which this operation is related. */
  var operationRequestId: integer = js.native
}
object AbortRequestedEventOptions {
  
  @scala.inline
  def apply(fileSystemId: String, operationRequestId: integer, requestId: integer): AbortRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], operationRequestId = operationRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortRequestedEventOptions]
  }
  
  @scala.inline
  implicit class AbortRequestedEventOptionsMutableBuilder[Self <: AbortRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationRequestId(value: integer): Self = StObject.set(x, "operationRequestId", value.asInstanceOf[js.Any])
  }
}
