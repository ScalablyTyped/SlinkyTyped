package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeNumbers.`10`
import typingsSlinky.reactNative.reactNativeNumbers.`12`
import typingsSlinky.reactNative.reactNativeNumbers.`15`
import typingsSlinky.reactNative.reactNativeNumbers.`1`
import typingsSlinky.reactNative.reactNativeNumbers.`20`
import typingsSlinky.reactNative.reactNativeNumbers.`2`
import typingsSlinky.reactNative.reactNativeNumbers.`30`
import typingsSlinky.reactNative.reactNativeNumbers.`3`
import typingsSlinky.reactNative.reactNativeNumbers.`4`
import typingsSlinky.reactNative.reactNativeNumbers.`5`
import typingsSlinky.reactNative.reactNativeNumbers.`6`
import typingsSlinky.reactNative.reactNativeStrings.date
import typingsSlinky.reactNative.reactNativeStrings.datetime
import typingsSlinky.reactNative.reactNativeStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerIOSProps extends ViewProps {
  
  /**
    * The currently selected date.
    */
  var date: js.UndefOr[js.Date | Null] = js.native
  
  /**
    * Provides an initial value that will change when the user starts selecting
    * a date. It is useful for simple use-cases where you do not want to deal
    * with listening to events and updating the date prop to keep the
    * controlled state in sync. The controlled state has known bugs which
    * causes it to go out of sync with native. The initialDate prop is intended
    * to allow you to have native be source of truth.
    */
  var initialDate: js.UndefOr[js.Date | Null] = js.native
  
  /**
    * The date picker locale.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var maximumDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var minimumDate: js.UndefOr[js.Date] = js.native
  
  /**
    *  enum(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)
    *  The interval at which minutes can be selected.
    */
  var minuteInterval: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30`] = js.native
  
  /**
    *  enum('date', 'time', 'datetime')
    *  The date picker mode.
    */
  var mode: js.UndefOr[date | time | datetime] = js.native
  
  /**
    * Date change handler.
    * This is called when the user changes the date or time in the UI.
    * The first and only argument is a Date object representing the new date and time.
    */
  def onDateChange(newDate: js.Date): Unit = js.native
  
  /**
    * Timezone offset in minutes.
    * By default, the date picker will use the device's timezone. With this parameter, it is possible to force a certain timezone offset.
    * For instance, to show times in Pacific Standard Time, pass -7 * 60.
    */
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.native
}
object DatePickerIOSProps {
  
  @scala.inline
  def apply(onDateChange: js.Date => Unit): DatePickerIOSProps = {
    val __obj = js.Dynamic.literal(onDateChange = js.Any.fromFunction1(onDateChange))
    __obj.asInstanceOf[DatePickerIOSProps]
  }
  
  @scala.inline
  implicit class DatePickerIOSPropsMutableBuilder[Self <: DatePickerIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateNull: Self = StObject.set(x, "date", null)
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDateNull: Self = StObject.set(x, "initialDate", null)
    
    @scala.inline
    def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
    
    @scala.inline
    def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
    
    @scala.inline
    def setMinuteInterval(value: `1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30`): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
    
    @scala.inline
    def setMode(value: date | time | datetime): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnDateChange(value: js.Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeZoneOffsetInMinutes(value: Double): Self = StObject.set(x, "timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneOffsetInMinutesUndefined: Self = StObject.set(x, "timeZoneOffsetInMinutes", js.undefined)
  }
}
