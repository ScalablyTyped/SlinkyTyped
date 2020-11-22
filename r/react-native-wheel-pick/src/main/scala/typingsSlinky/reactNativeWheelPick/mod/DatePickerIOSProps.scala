package typingsSlinky.reactNativeWheelPick.mod

import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeWheelPick.reactNativeWheelPickStrings.date
import typingsSlinky.reactNativeWheelPick.reactNativeWheelPickStrings.datetime
import typingsSlinky.reactNativeWheelPick.reactNativeWheelPickStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerIOSProps extends ViewProps {
  
  var date: js.UndefOr[js.Date] = js.native
  
  var maximumDate: js.UndefOr[js.Date] = js.native
  
  var minimumDate: js.UndefOr[js.Date] = js.native
  
  var mode: js.UndefOr[date | time | datetime] = js.native
  
  def onDateChange(newDate: js.Date): Unit = js.native
}
object DatePickerIOSProps {
  
  @scala.inline
  def apply(onDateChange: js.Date => Unit): DatePickerIOSProps = {
    val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
    __obj.asInstanceOf[DatePickerIOSProps]
  }
  
  @scala.inline
  implicit class DatePickerIOSPropsOps[Self <: DatePickerIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnDateChange(value: js.Date => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setMaximumDate(value: js.Date): Self = this.set("maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumDate: Self = this.set("maximumDate", js.undefined)
    
    @scala.inline
    def setMinimumDate(value: js.Date): Self = this.set("minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumDate: Self = this.set("minimumDate", js.undefined)
    
    @scala.inline
    def setMode(value: date | time | datetime): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
