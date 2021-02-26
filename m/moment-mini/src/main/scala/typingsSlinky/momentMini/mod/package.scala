package typingsSlinky.momentMini

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: java.lang.String
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: java.lang.String,
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: typingsSlinky.momentMini.mod.MomentFormatSpecification
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def apply(inp: typingsSlinky.momentMini.mod.MomentInput): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.momentMini.momentMiniStrings.sameDay
    - typingsSlinky.momentMini.momentMiniStrings.nextDay
    - typingsSlinky.momentMini.momentMiniStrings.lastDay
    - typingsSlinky.momentMini.momentMiniStrings.nextWeek
    - typingsSlinky.momentMini.momentMiniStrings.lastWeek
    - typingsSlinky.momentMini.momentMiniStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typingsSlinky.momentMini.mod._CalendarKey | java.lang.String
  
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typingsSlinky.momentMini.mod.MomentInput], 
    /* now */ js.UndefOr[typingsSlinky.momentMini.mod.Moment], 
    java.lang.String
  ])
  
  // null | undefined
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.momentMini.mod.Duration_
    - scala.Double
    - java.lang.String
    - typingsSlinky.momentMini.mod.FromTo
    - typingsSlinky.momentMini.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typingsSlinky.momentMini.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  
  // null | undefined
  type DurationInputArg2 = typingsSlinky.momentMini.mod.unitOfTime.DurationConstructor
  
  @scala.inline
  def ISO_8601: typingsSlinky.momentMini.mod.MomentBuiltinFormat = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ISO_8601").asInstanceOf[typingsSlinky.momentMini.mod.MomentBuiltinFormat]
  @scala.inline
  def ISO_8601_=(x: typingsSlinky.momentMini.mod.MomentBuiltinFormat): scala.Unit = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].updateDynamic("ISO_8601")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.momentMini.mod.Moment
    - typingsSlinky.momentMini.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typingsSlinky.momentMini.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  
  type MomentFormatSpecification = java.lang.String | typingsSlinky.momentMini.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typingsSlinky.momentMini.mod.MomentBuiltinFormat])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.momentMini.mod.Moment
    - typingsSlinky.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsSlinky.momentMini.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typingsSlinky.momentMini.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | js.Date | java.lang.String | scala.Double | scala.Unit
  
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsSlinky.momentMini.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  @scala.inline
  def RFC_2822: typingsSlinky.momentMini.mod.MomentBuiltinFormat = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RFC_2822").asInstanceOf[typingsSlinky.momentMini.mod.MomentBuiltinFormat]
  @scala.inline
  def RFC_2822_=(x: typingsSlinky.momentMini.mod.MomentBuiltinFormat): scala.Unit = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].updateDynamic("RFC_2822")(x.asInstanceOf[js.Any])
  
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typingsSlinky.momentMini.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsSlinky.momentMini.mod.Moment, java.lang.String]
  
  @scala.inline
  def calendarFormat(m: typingsSlinky.momentMini.mod.Moment, now: typingsSlinky.momentMini.mod.Moment): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("calendarFormat")(m.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def defaultFormat: java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultFormat").asInstanceOf[java.lang.String]
  
  @scala.inline
  def defaultFormatUtc: java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultFormatUtc").asInstanceOf[java.lang.String]
  @scala.inline
  def defaultFormatUtc_=(x: java.lang.String): scala.Unit = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatUtc")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultFormat_=(x: java.lang.String): scala.Unit = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defineLocale(language: java.lang.String, localeSpec: scala.Unit): typingsSlinky.momentMini.mod.Locale_ = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Locale_]
  @scala.inline
  def defineLocale(language: java.lang.String, localeSpec: typingsSlinky.momentMini.mod.LocaleSpecification): typingsSlinky.momentMini.mod.Locale_ = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Locale_]
  
  @scala.inline
  def duration(): typingsSlinky.momentMini.mod.Duration_ = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("duration")().asInstanceOf[typingsSlinky.momentMini.mod.Duration_]
  @scala.inline
  def duration(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.DurationInputArg1],
    unit: typingsSlinky.momentMini.mod.DurationInputArg2
  ): typingsSlinky.momentMini.mod.Duration_ = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Duration_]
  @scala.inline
  def duration(inp: typingsSlinky.momentMini.mod.DurationInputArg1): typingsSlinky.momentMini.mod.Duration_ = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Duration_]
  
  @scala.inline
  def fn: typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fn").asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def fn_=(x: typingsSlinky.momentMini.mod.Moment): scala.Unit = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def invalid(): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def invalid(flags: typingsSlinky.momentMini.mod.MomentParsingFlagsOpt): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(flags.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  
  @scala.inline
  def isDate(m: js.Any): /* is std.Date */ scala.Boolean = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(m.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ scala.Boolean]
  
  @scala.inline
  def isDuration(d: js.Any): /* is moment-mini.moment-mini.Duration */ scala.Boolean = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is moment-mini.moment-mini.Duration */ scala.Boolean]
  
  @scala.inline
  def isMoment(m: js.Any): /* is moment-mini.moment-mini.Moment */ scala.Boolean = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isMoment")(m.asInstanceOf[js.Any]).asInstanceOf[/* is moment-mini.moment-mini.Moment */ scala.Boolean]
  
  @scala.inline
  def lang(): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")().asInstanceOf[java.lang.String]
  @scala.inline
  def lang(language: js.UndefOr[scala.Nothing], definition: typingsSlinky.momentMini.mod.Locale_): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def lang(language: java.lang.String): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def lang(language: java.lang.String, definition: typingsSlinky.momentMini.mod.Locale_): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def locale(): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: js.UndefOr[scala.Nothing], definition: scala.Unit): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: js.UndefOr[scala.Nothing], definition: typingsSlinky.momentMini.mod.LocaleSpecification): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: java.lang.String): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: java.lang.String, definition: scala.Unit): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: java.lang.String, definition: typingsSlinky.momentMini.mod.LocaleSpecification): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: js.Array[java.lang.String]): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def localeData(): typingsSlinky.momentMini.mod.Locale_ = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[typingsSlinky.momentMini.mod.Locale_]
  @scala.inline
  def localeData(key: java.lang.String): typingsSlinky.momentMini.mod.Locale_ = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Locale_]
  @scala.inline
  def localeData(key: js.Array[java.lang.String]): typingsSlinky.momentMini.mod.Locale_ = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Locale_]
  
  @scala.inline
  def locales(): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locales")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def max(moments: typingsSlinky.momentMini.mod.Moment*): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def max(moments: js.Array[typingsSlinky.momentMini.mod.Moment]): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  
  @scala.inline
  def min(moments: typingsSlinky.momentMini.mod.Moment*): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def min(moments: js.Array[typingsSlinky.momentMini.mod.Moment]): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  
  @scala.inline
  def months(): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def months(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def months(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def months(index: scala.Double): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def monthsShort(): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def monthsShort(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def monthsShort(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def monthsShort(index: scala.Double): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def normalizeUnits(unit: typingsSlinky.momentMini.mod.unitOfTime.All): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUnits")(unit.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def now(): scala.Double = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[scala.Double]
  
  @scala.inline
  def parseTwoDigitYear(input: java.lang.String): scala.Double = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTwoDigitYear")(input.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def parseZone(): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")().asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: java.lang.String
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: java.lang.String,
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: typingsSlinky.momentMini.mod.MomentFormatSpecification
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def parseZone(inp: typingsSlinky.momentMini.mod.MomentInput): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  
  @scala.inline
  def relativeTimeRounding(): js.Function1[/* num */ scala.Double, scala.Double] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")().asInstanceOf[js.Function1[/* num */ scala.Double, scala.Double]]
  @scala.inline
  def relativeTimeRounding(fn: js.Function1[/* num */ scala.Double, scala.Double]): scala.Boolean = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def relativeTimeThreshold(threshold: java.lang.String): scala.Double | scala.Boolean = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any]).asInstanceOf[scala.Double | scala.Boolean]
  @scala.inline
  def relativeTimeThreshold(threshold: java.lang.String, limit: scala.Double): scala.Boolean = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def unix(timestamp: scala.Double): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unix")(timestamp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  
  @scala.inline
  def updateLocale(language: java.lang.String, localeSpec: scala.Unit): typingsSlinky.momentMini.mod.Locale_ = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Locale_]
  @scala.inline
  def updateLocale(language: java.lang.String, localeSpec: typingsSlinky.momentMini.mod.LocaleSpecification): typingsSlinky.momentMini.mod.Locale_ = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Locale_]
  
  @scala.inline
  def utc(): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: java.lang.String
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    language: java.lang.String,
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.momentMini.mod.MomentFormatSpecification],
    strict: scala.Boolean
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.momentMini.mod.MomentInput],
    format: typingsSlinky.momentMini.mod.MomentFormatSpecification
  ): typingsSlinky.momentMini.mod.Moment = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  @scala.inline
  def utc(inp: typingsSlinky.momentMini.mod.MomentInput): typingsSlinky.momentMini.mod.Moment = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.momentMini.mod.Moment]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdays(): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdays(index: scala.Double): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def weekdaysMin(): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysMin(index: scala.Double): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def weekdaysShort(): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysShort(index: scala.Double): java.lang.String = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean): js.Array[java.lang.String] = typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = (typingsSlinky.momentMini.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
