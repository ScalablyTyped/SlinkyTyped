package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.DateRangePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDateRangePicker extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: DateRangePicker = js.native
}
object TypeofDateRangePicker {
  
  @scala.inline
  def apply(Locale: js.Any, fn: DateRangePicker): TypeofDateRangePicker = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateRangePicker]
  }
  
  @scala.inline
  implicit class TypeofDateRangePickerMutableBuilder[Self <: TypeofDateRangePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: DateRangePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
