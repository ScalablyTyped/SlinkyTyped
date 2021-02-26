package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.DatePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDatePicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DatePicker = js.native
  
  /* static member */
  var fn: DatePicker = js.native
}
object TypeofDatePicker {
  
  @scala.inline
  def apply(extend: js.Object => DatePicker, fn: DatePicker): TypeofDatePicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDatePicker]
  }
  
  @scala.inline
  implicit class TypeofDatePickerMutableBuilder[Self <: TypeofDatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => DatePicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: DatePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
