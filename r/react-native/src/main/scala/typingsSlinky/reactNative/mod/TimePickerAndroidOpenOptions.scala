package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.clock
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerAndroidOpenOptions extends StObject {
  
  var hour: js.UndefOr[Double] = js.native
  
  var is24Hour: js.UndefOr[Boolean] = js.native
  
  var minute: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[clock | spinner | default] = js.native
}
object TimePickerAndroidOpenOptions {
  
  @scala.inline
  def apply(): TimePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerAndroidOpenOptions]
  }
  
  @scala.inline
  implicit class TimePickerAndroidOpenOptionsMutableBuilder[Self <: TimePickerAndroidOpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setMode(value: clock | spinner | default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
