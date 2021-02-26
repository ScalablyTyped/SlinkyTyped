package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.TimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTimePicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TimePicker = js.native
  
  /* static member */
  var fn: TimePicker = js.native
}
object TypeofTimePicker {
  
  @scala.inline
  def apply(extend: js.Object => TimePicker, fn: TimePicker): TypeofTimePicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimePicker]
  }
  
  @scala.inline
  implicit class TypeofTimePickerMutableBuilder[Self <: TypeofTimePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => TimePicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: TimePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
