package typingsSlinky.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationRequestedEventOptions extends RequestedEventOptions {
  
  /** An ID of the request to which this operation is related. */
  var operationRequestId: Double = js.native
}
object OperationRequestedEventOptions {
  
  @scala.inline
  def apply(fileSystemId: String, operationRequestId: Double, requestId: Double): OperationRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], operationRequestId = operationRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationRequestedEventOptions]
  }
  
  @scala.inline
  implicit class OperationRequestedEventOptionsMutableBuilder[Self <: OperationRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationRequestId(value: Double): Self = StObject.set(x, "operationRequestId", value.asInstanceOf[js.Any])
  }
}
