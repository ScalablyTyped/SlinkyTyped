package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.calendar
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAndroidOpenOptions extends StObject {
  
  var date: js.UndefOr[js.Date | Double] = js.native
  
  var maxDate: js.UndefOr[js.Date | Double] = js.native
  
  var minDate: js.UndefOr[js.Date | Double] = js.native
  
  var mode: js.UndefOr[calendar | spinner | default] = js.native
}
object DatePickerAndroidOpenOptions {
  
  @scala.inline
  def apply(): DatePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerAndroidOpenOptions]
  }
  
  @scala.inline
  implicit class DatePickerAndroidOpenOptionsMutableBuilder[Self <: DatePickerAndroidOpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date | Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Date | Double): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Date | Double): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMode(value: calendar | spinner | default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
