package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptingCompleteResult extends StObject {
  
  var canceled: Boolean = js.native
  
  var errorDetails: String = js.native
  
  var errorMessage: String = js.native
  
  var hasError: Boolean = js.native
  
  var operationId: String = js.native
  
  var success: Boolean = js.native
}
object ScriptingCompleteResult {
  
  @scala.inline
  def apply(
    canceled: Boolean,
    errorDetails: String,
    errorMessage: String,
    hasError: Boolean,
    operationId: String,
    success: Boolean
  ): ScriptingCompleteResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], errorDetails = errorDetails.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingCompleteResult]
  }
  
  @scala.inline
  implicit class ScriptingCompleteResultMutableBuilder[Self <: ScriptingCompleteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
