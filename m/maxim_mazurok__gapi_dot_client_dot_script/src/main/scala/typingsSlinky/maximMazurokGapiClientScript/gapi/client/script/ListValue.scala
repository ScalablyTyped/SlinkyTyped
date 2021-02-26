package typingsSlinky.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListValue extends StObject {
  
  /** Repeated field of dynamically typed values. */
  var values: js.UndefOr[js.Array[Value]] = js.native
}
object ListValue {
  
  @scala.inline
  def apply(): ListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListValue]
  }
  
  @scala.inline
  implicit class ListValueMutableBuilder[Self <: ListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
