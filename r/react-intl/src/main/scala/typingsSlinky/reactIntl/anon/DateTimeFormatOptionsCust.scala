package typingsSlinky.reactIntl.anon

import typingsSlinky.reactIntl.reactIntlStrings.buddhist
import typingsSlinky.reactIntl.reactIntlStrings.chinese
import typingsSlinky.reactIntl.reactIntlStrings.coptic
import typingsSlinky.reactIntl.reactIntlStrings.ethiopia
import typingsSlinky.reactIntl.reactIntlStrings.ethiopic
import typingsSlinky.reactIntl.reactIntlStrings.full
import typingsSlinky.reactIntl.reactIntlStrings.gregory
import typingsSlinky.reactIntl.reactIntlStrings.h11
import typingsSlinky.reactIntl.reactIntlStrings.h12
import typingsSlinky.reactIntl.reactIntlStrings.h23
import typingsSlinky.reactIntl.reactIntlStrings.h24
import typingsSlinky.reactIntl.reactIntlStrings.hebrew
import typingsSlinky.reactIntl.reactIntlStrings.indian
import typingsSlinky.reactIntl.reactIntlStrings.islamic
import typingsSlinky.reactIntl.reactIntlStrings.iso8601
import typingsSlinky.reactIntl.reactIntlStrings.japanese
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.medium
import typingsSlinky.reactIntl.reactIntlStrings.persian
import typingsSlinky.reactIntl.reactIntlStrings.roc
import typingsSlinky.reactIntl.reactIntlStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/ecma402-abstract.@formatjs/ecma402-abstract.DateTimeFormatOptions & @formatjs/intl.@formatjs/intl.CustomFormatConfig & {  value :string | number | std.Date | undefined} */
@js.native
trait DateTimeFormatOptionsCust extends StObject {
  
  var calendar: js.UndefOr[
    buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
  ] = js.native
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var day: js.UndefOr[String] = js.native
  
  var era: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var formatMatcher: js.UndefOr[String] = js.native
  
  var fractionalSecondDigits: js.UndefOr[Double] = js.native
  
  var hour: js.UndefOr[String] = js.native
  
  var hour12: js.UndefOr[Boolean] = js.native
  
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.native
  
  var localeMatcher: js.UndefOr[String] = js.native
  
  var minute: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var numberingSystem: js.UndefOr[String] = js.native
  
  var second: js.UndefOr[String] = js.native
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var timeZoneName: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double | js.Date] = js.native
  
  var weekday: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object DateTimeFormatOptionsCust {
  
  @scala.inline
  def apply(): DateTimeFormatOptionsCust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatOptionsCust]
  }
  
  @scala.inline
  implicit class DateTimeFormatOptionsCustMutableBuilder[Self <: DateTimeFormatOptionsCust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(
      value: buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
    ): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
    
    @scala.inline
    def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setEra(value: String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatMatcher(value: String): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFractionalSecondDigits(value: Double): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
    
    @scala.inline
    def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    @scala.inline
    def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    @scala.inline
    def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    @scala.inline
    def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
