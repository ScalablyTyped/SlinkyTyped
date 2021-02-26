package typingsSlinky.baseui.datepickerMod

import typingsSlinky.baseui.selectMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimezonePickerState extends StObject {
  
  var timezones: js.Array[Option] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TimezonePickerState {
  
  @scala.inline
  def apply(timezones: js.Array[Option]): TimezonePickerState = {
    val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerState]
  }
  
  @scala.inline
  implicit class TimezonePickerStateMutableBuilder[Self <: TimezonePickerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimezones(value: js.Array[Option]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezonesVarargs(value: Option*): Self = StObject.set(x, "timezones", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
