package typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod

import typingsSlinky.formatjsEcma402Abstract.anon.FnCall
import typingsSlinky.formatjsEcma402Abstract.anon.RecordTABLE2defaultRangePAmpm
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`2-digit`
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.full
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.long
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.medium
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.narrow
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.numeric
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlDateTimeFormatInternal extends js.Object {
  
  var boundFormat: js.UndefOr[FnCall] = js.native
  
  var calendar: js.UndefOr[String] = js.native
  
  var dataLocale: String = js.native
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var day: `2-digit` | numeric = js.native
  
  var era: narrow | short | long = js.native
  
  var format: Formats = js.native
  
  var hour: `2-digit` | numeric = js.native
  
  var hourCycle: String = js.native
  
  var locale: String = js.native
  
  var minute: `2-digit` | numeric = js.native
  
  var month: `2-digit` | numeric | narrow | short | long = js.native
  
  var numberingSystem: String = js.native
  
  var pattern: String = js.native
  
  var rangePatterns: RecordTABLE2defaultRangePAmpm = js.native
  
  var second: `2-digit` | numeric = js.native
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.native
  
  var timeZone: String = js.native
  
  var timeZoneName: short | long = js.native
  
  var weekday: narrow | short | long = js.native
  
  var year: `2-digit` | numeric = js.native
}
object IntlDateTimeFormatInternal {
  
  @scala.inline
  def apply(
    dataLocale: String,
    day: `2-digit` | numeric,
    era: narrow | short | long,
    format: Formats,
    hour: `2-digit` | numeric,
    hourCycle: String,
    locale: String,
    minute: `2-digit` | numeric,
    month: `2-digit` | numeric | narrow | short | long,
    numberingSystem: String,
    pattern: String,
    rangePatterns: RecordTABLE2defaultRangePAmpm,
    second: `2-digit` | numeric,
    timeZone: String,
    timeZoneName: short | long,
    weekday: narrow | short | long,
    year: `2-digit` | numeric
  ): IntlDateTimeFormatInternal = {
    val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], era = era.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hourCycle = hourCycle.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rangePatterns = rangePatterns.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlDateTimeFormatInternal]
  }
  
  @scala.inline
  implicit class IntlDateTimeFormatInternalOps[Self <: IntlDateTimeFormatInternal] (val x: Self) extends AnyVal {
    
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
    def setDataLocale(value: String): Self = this.set("dataLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: `2-digit` | numeric): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEra(value: narrow | short | long): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Formats): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: `2-digit` | numeric): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourCycle(value: String): Self = this.set("hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: `2-digit` | numeric): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: `2-digit` | numeric | narrow | short | long): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePatterns(value: RecordTABLE2defaultRangePAmpm): Self = this.set("rangePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: `2-digit` | numeric): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneName(value: short | long): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: narrow | short | long): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: `2-digit` | numeric): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundFormat(value: FnCall): Self = this.set("boundFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundFormat: Self = this.set("boundFormat", js.undefined)
    
    @scala.inline
    def setCalendar(value: String): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setDateStyle(value: full | long | medium | short): Self = this.set("dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStyle: Self = this.set("dateStyle", js.undefined)
    
    @scala.inline
    def setTimeStyle(value: full | long | medium | short): Self = this.set("timeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStyle: Self = this.set("timeStyle", js.undefined)
  }
}
