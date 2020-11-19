package typingsSlinky.momentDurationFormat.anon

import typingsSlinky.moment.mod.DurationInputArg1
import typingsSlinky.moment.mod.DurationInputArg2
import typingsSlinky.moment.mod.Duration_
import typingsSlinky.moment.mod.LocaleSpecification
import typingsSlinky.moment.mod.Locale_
import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentBuiltinFormat
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import typingsSlinky.moment.mod.MomentParsingFlagsOpt
import typingsSlinky.moment.mod.unitOfTime.All
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(): Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  
  var HTML5_FMT: DATE = js.native
  
  var ISO_8601: MomentBuiltinFormat = js.native
  
  var RFC_2822: MomentBuiltinFormat = js.native
  
  def calendarFormat(m: Moment, now: Moment): String = js.native
  
  var defaultFormat: String = js.native
  
  var defaultFormatUtc: String = js.native
  
  def defineLocale(language: String, localeSpec: Unit): Locale_ = js.native
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  val duration: Typeofduration = js.native
  def duration(inp: js.UndefOr[DurationInputArg1], unit: DurationInputArg2): Duration_ = js.native
  def duration(inp: DurationInputArg1): Duration_ = js.native
  
  var fn: Moment = js.native
  
  def invalid(): Moment = js.native
  def invalid(flags: MomentParsingFlagsOpt): Moment = js.native
  
  def isDate(m: js.Any): /* is std.Date */ Boolean = js.native
  
  def isDuration(d: js.Any): /* is moment.moment.Duration */ Boolean = js.native
  
  def isMoment(m: js.Any): /* is moment.moment.Moment */ Boolean = js.native
  
  def lang(): String = js.native
  def lang(language: js.UndefOr[scala.Nothing], definition: Locale_): String = js.native
  def lang(language: String): String = js.native
  def lang(language: String, definition: Locale_): String = js.native
  
  def locale(): String = js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: Unit): String = js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: LocaleSpecification): String = js.native
  def locale(language: String): String = js.native
  def locale(language: String, definition: Unit): String = js.native
  def locale(language: String, definition: LocaleSpecification): String = js.native
  def locale(language: js.Array[String]): String = js.native
  
  def localeData(): Locale_ = js.native
  def localeData(key: String): Locale_ = js.native
  def localeData(key: js.Array[String]): Locale_ = js.native
  
  def locales(): js.Array[String] = js.native
  
  def max(moments: Moment*): Moment = js.native
  def max(moments: js.Array[Moment]): Moment = js.native
  
  def min(moments: Moment*): Moment = js.native
  def min(moments: js.Array[Moment]): Moment = js.native
  
  def months(): js.Array[String] = js.native
  def months(format: String): js.Array[String] = js.native
  def months(format: String, index: Double): String = js.native
  def months(index: Double): String = js.native
  
  def monthsShort(): js.Array[String] = js.native
  def monthsShort(format: String): js.Array[String] = js.native
  def monthsShort(format: String, index: Double): String = js.native
  def monthsShort(index: Double): String = js.native
  
  def normalizeUnits(unit: All): String = js.native
  
  def now(): Double = js.native
  
  def parseTwoDigitYear(input: String): Double = js.native
  
  def parseZone(): Moment = js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def parseZone(inp: MomentInput): Moment = js.native
  
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = js.native
  
  def relativeTimeThreshold(threshold: String): Double | Boolean = js.native
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = js.native
  
  val unitOfTime: js.Any = js.native
  
  def unix(timestamp: Double): Moment = js.native
  
  def updateLocale(language: String, localeSpec: Unit): Locale_ = js.native
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  
  def utc(): Moment = js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def utc(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def utc(inp: MomentInput): Moment = js.native
  
  var version: String = js.native
  
  def weekdays(): js.Array[String] = js.native
  def weekdays(format: String): js.Array[String] = js.native
  def weekdays(format: String, index: Double): String = js.native
  def weekdays(index: Double): String = js.native
  def weekdays(localeSorted: Boolean): js.Array[String] = js.native
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdays(localeSorted: Boolean, index: Double): String = js.native
  
  def weekdaysMin(): js.Array[String] = js.native
  def weekdaysMin(format: String): js.Array[String] = js.native
  def weekdaysMin(format: String, index: Double): String = js.native
  def weekdaysMin(index: Double): String = js.native
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = js.native
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdaysMin(localeSorted: Boolean, index: Double): String = js.native
  
  def weekdaysShort(): js.Array[String] = js.native
  def weekdaysShort(format: String): js.Array[String] = js.native
  def weekdaysShort(format: String, index: Double): String = js.native
  def weekdaysShort(index: Double): String = js.native
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = js.native
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdaysShort(localeSorted: Boolean, index: Double): String = js.native
}
