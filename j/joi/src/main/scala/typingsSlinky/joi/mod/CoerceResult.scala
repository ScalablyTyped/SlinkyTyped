package typingsSlinky.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoerceResult extends StObject {
  
  var errors: js.UndefOr[js.Array[ErrorReport]] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object CoerceResult {
  
  @scala.inline
  def apply(): CoerceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoerceResult]
  }
  
  @scala.inline
  implicit class CoerceResultMutableBuilder[Self <: CoerceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ErrorReport]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ErrorReport*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
