package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxParseResult extends StObject {
  
  var errors: js.Array[String] = js.native
  
  var parseable: Boolean = js.native
}
object SyntaxParseResult {
  
  @scala.inline
  def apply(errors: js.Array[String], parseable: Boolean): SyntaxParseResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseable = parseable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseResult]
  }
  
  @scala.inline
  implicit class SyntaxParseResultMutableBuilder[Self <: SyntaxParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setParseable(value: Boolean): Self = StObject.set(x, "parseable", value.asInstanceOf[js.Any])
  }
}
