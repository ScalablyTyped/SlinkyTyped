package typingsSlinky.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about an error.
  */
@js.native
trait DebugInfo extends StObject {
  
  /** Error code string, such as "InvalidArgument". */
  var code: String = js.native
  
  /** The object type and property or method name (or similar information), if available. */
  var errorLocation: js.UndefOr[String] = js.native
  
  /**
    * All statements in the batch request (including any potentially-sensitive information that was specified in the request), if available.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var fullStatements: js.UndefOr[js.Array[String]] = js.native
  
  /** Inner error, if applicable. */
  var innerError: js.UndefOr[DebugInfo | String] = js.native
  
  /** The error message passed through from the host Office application. */
  var message: String = js.native
  
  /**
    * The statement that caused the error, if available.
    *
    * This statement will never contain any potentially-sensitive data and may not match the code exactly as written,
    * but will be a close approximation.
    */
  var statements: js.UndefOr[String] = js.native
  
  /**
    * The statements that closely precede and follow the statement that caused the error, if available.
    *
    * These statements will never contain any potentially-sensitive data and may not match the code exactly as written,
    * but will be a close approximation.
    */
  var surroundingStatements: js.UndefOr[js.Array[String]] = js.native
}
object DebugInfo {
  
  @scala.inline
  def apply(code: String, message: String): DebugInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
  
  @scala.inline
  implicit class DebugInfoMutableBuilder[Self <: DebugInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLocation(value: String): Self = StObject.set(x, "errorLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLocationUndefined: Self = StObject.set(x, "errorLocation", js.undefined)
    
    @scala.inline
    def setFullStatements(value: js.Array[String]): Self = StObject.set(x, "fullStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullStatementsUndefined: Self = StObject.set(x, "fullStatements", js.undefined)
    
    @scala.inline
    def setFullStatementsVarargs(value: String*): Self = StObject.set(x, "fullStatements", js.Array(value :_*))
    
    @scala.inline
    def setInnerError(value: DebugInfo | String): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatements(value: String): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    @scala.inline
    def setSurroundingStatements(value: js.Array[String]): Self = StObject.set(x, "surroundingStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundingStatementsUndefined: Self = StObject.set(x, "surroundingStatements", js.undefined)
    
    @scala.inline
    def setSurroundingStatementsVarargs(value: String*): Self = StObject.set(x, "surroundingStatements", js.Array(value :_*))
  }
}
