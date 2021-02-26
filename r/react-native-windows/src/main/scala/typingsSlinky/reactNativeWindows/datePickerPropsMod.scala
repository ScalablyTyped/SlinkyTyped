package typingsSlinky.reactNativeWindows

import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeWindows.anon.NewDate
import typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`0`
import typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`1`
import typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`2`
import typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`3`
import typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`4`
import typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`5`
import typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`6`
import typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket
import typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket
import typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotfullRightcurlybracket
import typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`day month year`
import typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`dayofweek day month`
import typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.longdate
import typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.shortdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerPropsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`0`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`1`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`2`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`3`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`4`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`5`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsNumbers.`6`
  */
  trait DayOfWeek extends StObject
  object DayOfWeek {
    
    @scala.inline
    def Friday: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def Monday: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def Saturday: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def Sunday: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Thursday: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Tuesday: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Wednesday: `3` = 3.asInstanceOf[`3`]
  }
  
  @js.native
  trait IDatePickerChangeEvent extends StObject {
    
    var nativeEvent: NewDate = js.native
  }
  object IDatePickerChangeEvent {
    
    @scala.inline
    def apply(nativeEvent: NewDate): IDatePickerChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerChangeEvent]
    }
    
    @scala.inline
    implicit class IDatePickerChangeEventMutableBuilder[Self <: IDatePickerChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: NewDate): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDatePickerProps extends ViewProps {
    
    var dateFormat: js.UndefOr[(`day month year`) | (`dayofweek day month`) | longdate | shortdate] = js.native
    
    var dayOfWeekFormat: js.UndefOr[
        LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotfullRightcurlybracket
      ] = js.native
    
    var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
    
    var maxDate: js.UndefOr[js.Date] = js.native
    
    var minDate: js.UndefOr[js.Date] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* event */ IDatePickerChangeEvent, Unit]] = js.native
    
    var onDateChange: js.UndefOr[js.Function1[/* newDate */ js.Date, Unit]] = js.native
    
    var placeholderText: js.UndefOr[String] = js.native
    
    var selectedDate: js.UndefOr[js.Date] = js.native
    
    var timeZoneOffsetInSeconds: js.UndefOr[Double] = js.native
  }
  object IDatePickerProps {
    
    @scala.inline
    def apply(): IDatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerProps]
    }
    
    @scala.inline
    implicit class IDatePickerPropsMutableBuilder[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateFormat(value: (`day month year`) | (`dayofweek day month`) | longdate | shortdate): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDayOfWeekFormat(
        value: LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotfullRightcurlybracket
      ): Self = StObject.set(x, "dayOfWeekFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayOfWeekFormatUndefined: Self = StObject.set(x, "dayOfWeekFormat", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ IDatePickerChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDateChange(value: /* newDate */ js.Date => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      @scala.inline
      def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      @scala.inline
      def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
      
      @scala.inline
      def setTimeZoneOffsetInSeconds(value: Double): Self = StObject.set(x, "timeZoneOffsetInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneOffsetInSecondsUndefined: Self = StObject.set(x, "timeZoneOffsetInSeconds", js.undefined)
    }
  }
}
