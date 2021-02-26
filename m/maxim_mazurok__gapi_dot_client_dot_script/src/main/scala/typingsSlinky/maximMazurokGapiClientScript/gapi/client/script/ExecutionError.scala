package typingsSlinky.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionError extends StObject {
  
  /** The error message thrown by Apps Script, usually localized into the user's language. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** The error type, for example `TypeError` or `ReferenceError`. If the error type is unavailable, this field is not included. */
  var errorType: js.UndefOr[String] = js.native
  
  /** An array of objects that provide a stack trace through the script to show where the execution failed, with the deepest call first. */
  var scriptStackTraceElements: js.UndefOr[js.Array[ScriptStackTraceElement]] = js.native
}
object ExecutionError {
  
  @scala.inline
  def apply(): ExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionError]
  }
  
  @scala.inline
  implicit class ExecutionErrorMutableBuilder[Self <: ExecutionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    @scala.inline
    def setScriptStackTraceElements(value: js.Array[ScriptStackTraceElement]): Self = StObject.set(x, "scriptStackTraceElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptStackTraceElementsUndefined: Self = StObject.set(x, "scriptStackTraceElements", js.undefined)
    
    @scala.inline
    def setScriptStackTraceElementsVarargs(value: ScriptStackTraceElement*): Self = StObject.set(x, "scriptStackTraceElements", js.Array(value :_*))
  }
}
