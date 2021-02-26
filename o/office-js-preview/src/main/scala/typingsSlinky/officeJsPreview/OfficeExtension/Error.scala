package typingsSlinky.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
@js.native
trait Error extends StObject {
  
  /** Error code string, such as "InvalidArgument". */
  var code: String = js.native
  
  /** Debug info (useful for detailed logging of the error, i.e., via `JSON.stringify(...)`). */
  var debugInfo: DebugInfo = js.native
  
  /** Inner error, if applicable. */
  var innerError: Error = js.native
  
  /** The error message passed through from the host Office application. */
  var message: String = js.native
  
  /** Error name: "OfficeExtension.Error".*/
  var name: String = js.native
  
  /** Stack trace, if applicable. */
  var stack: String = js.native
  
  /**
    * Trace messages (if any) that were added via a `context.trace()` invocation before calling `context.sync()`.
    * If there was an error, this contains all trace messages that were executed before the error occurred.
    * These messages can help you monitor the program execution sequence and detect the case of the error.
    */
  var traceMessages: js.Array[String] = js.native
}
object Error {
  
  @scala.inline
  def apply(
    code: String,
    debugInfo: DebugInfo,
    innerError: Error,
    message: String,
    name: String,
    stack: String,
    traceMessages: js.Array[String]
  ): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], debugInfo = debugInfo.asInstanceOf[js.Any], innerError = innerError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], traceMessages = traceMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugInfo(value: DebugInfo): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerError(value: Error): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceMessages(value: js.Array[String]): Self = StObject.set(x, "traceMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceMessagesVarargs(value: String*): Self = StObject.set(x, "traceMessages", js.Array(value :_*))
  }
}
