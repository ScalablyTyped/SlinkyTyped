package typingsSlinky.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  var result: js.Array[_] = js.native
  
  var success: Boolean = js.native
}
object Result {
  
  @scala.inline
  def apply(result: js.Array[_], success: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[_]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: js.Any*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
