package typingsSlinky.moment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * @param strict Strict parsing requires that the format and input match exactly, including delimiters.
    * Strict parsing is frequently the best parsing option. For more information about choosing strict vs
    * forgiving parsing, see the [parsing guide](https://momentjs.com/guides/#/parsing/).
    */
  @scala.inline
  def apply(): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: java.lang.String
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: java.lang.String,
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def apply(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: typingsSlinky.moment.mod.MomentFormatSpecification
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def apply(inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput], strict: scala.Boolean): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def apply(inp: typingsSlinky.moment.mod.MomentInput): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.momentStrings.sameDay
    - typingsSlinky.moment.momentStrings.nextDay
    - typingsSlinky.moment.momentStrings.lastDay
    - typingsSlinky.moment.momentStrings.nextWeek
    - typingsSlinky.moment.momentStrings.lastWeek
    - typingsSlinky.moment.momentStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typingsSlinky.moment.mod._CalendarKey | java.lang.String
  
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typingsSlinky.moment.mod.MomentInput], 
    /* now */ js.UndefOr[typingsSlinky.moment.mod.Moment], 
    java.lang.String
  ])
  
  // null | undefined
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.mod.Duration_
    - scala.Double
    - java.lang.String
    - typingsSlinky.moment.mod.FromTo
    - typingsSlinky.moment.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typingsSlinky.moment.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  
  // null | undefined
  type DurationInputArg2 = typingsSlinky.moment.mod.unitOfTime.DurationConstructor
  
  @scala.inline
  def ISO_8601: typingsSlinky.moment.mod.MomentBuiltinFormat = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ISO_8601").asInstanceOf[typingsSlinky.moment.mod.MomentBuiltinFormat]
  @scala.inline
  def ISO_8601_=(x: typingsSlinky.moment.mod.MomentBuiltinFormat): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("ISO_8601")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.moment.mod.Moment
    - typingsSlinky.moment.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typingsSlinky.moment.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  
  type MomentFormatSpecification = java.lang.String | typingsSlinky.moment.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typingsSlinky.moment.mod.MomentBuiltinFormat])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.mod.Moment
    - typingsSlinky.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsSlinky.moment.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typingsSlinky.moment.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | js.Date | java.lang.String | scala.Double | scala.Unit
  
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsSlinky.moment.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  @scala.inline
  def RFC_2822: typingsSlinky.moment.mod.MomentBuiltinFormat = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RFC_2822").asInstanceOf[typingsSlinky.moment.mod.MomentBuiltinFormat]
  @scala.inline
  def RFC_2822_=(x: typingsSlinky.moment.mod.MomentBuiltinFormat): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("RFC_2822")(x.asInstanceOf[js.Any])
  
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typingsSlinky.moment.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsSlinky.moment.mod.Moment, java.lang.String]
  
  @scala.inline
  def calendarFormat(m: typingsSlinky.moment.mod.Moment, now: typingsSlinky.moment.mod.Moment): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("calendarFormat")(m.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def defaultFormat: java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultFormat").asInstanceOf[java.lang.String]
  
  @scala.inline
  def defaultFormatUtc: java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultFormatUtc").asInstanceOf[java.lang.String]
  @scala.inline
  def defaultFormatUtc_=(x: java.lang.String): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatUtc")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultFormat_=(x: java.lang.String): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def defineLocale(language: java.lang.String, localeSpec: scala.Unit): typingsSlinky.moment.mod.Locale_ = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Locale_]
  @scala.inline
  def defineLocale(language: java.lang.String, localeSpec: typingsSlinky.moment.mod.LocaleSpecification): typingsSlinky.moment.mod.Locale_ = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Locale_]
  
  @scala.inline
  def deprecationHandler: (js.Function2[/* name */ java.lang.String | scala.Unit, /* msg */ java.lang.String, scala.Unit]) | scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("deprecationHandler").asInstanceOf[(js.Function2[/* name */ java.lang.String | scala.Unit, /* msg */ java.lang.String, scala.Unit]) | scala.Unit]
  @scala.inline
  def deprecationHandler_=(
    x: (js.Function2[/* name */ java.lang.String | scala.Unit, /* msg */ java.lang.String, scala.Unit]) | scala.Unit
  ): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("deprecationHandler")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def duration(): typingsSlinky.moment.mod.Duration_ = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("duration")().asInstanceOf[typingsSlinky.moment.mod.Duration_]
  @scala.inline
  def duration(
    inp: js.UndefOr[typingsSlinky.moment.mod.DurationInputArg1],
    unit: typingsSlinky.moment.mod.DurationInputArg2
  ): typingsSlinky.moment.mod.Duration_ = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Duration_]
  @scala.inline
  def duration(inp: typingsSlinky.moment.mod.DurationInputArg1): typingsSlinky.moment.mod.Duration_ = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("duration")(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Duration_]
  
  @scala.inline
  def fn: typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fn").asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def fn_=(x: typingsSlinky.moment.mod.Moment): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def invalid(): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def invalid(flags: typingsSlinky.moment.mod.MomentParsingFlagsOpt): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(flags.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  
  @scala.inline
  def isDate(m: js.Any): /* is std.Date */ scala.Boolean = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(m.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ scala.Boolean]
  
  @scala.inline
  def isDuration(d: js.Any): /* is moment.moment.Duration */ scala.Boolean = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is moment.moment.Duration */ scala.Boolean]
  
  @scala.inline
  def isMoment(m: js.Any): /* is moment.moment.Moment */ scala.Boolean = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isMoment")(m.asInstanceOf[js.Any]).asInstanceOf[/* is moment.moment.Moment */ scala.Boolean]
  
  @scala.inline
  def lang(): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")().asInstanceOf[java.lang.String]
  @scala.inline
  def lang(language: js.UndefOr[scala.Nothing], definition: typingsSlinky.moment.mod.Locale_): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def lang(language: java.lang.String): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def lang(language: java.lang.String, definition: typingsSlinky.moment.mod.Locale_): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lang")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def locale(): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: js.UndefOr[scala.Nothing], definition: scala.Unit): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: js.UndefOr[scala.Nothing], definition: typingsSlinky.moment.mod.LocaleSpecification): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: java.lang.String): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: java.lang.String, definition: scala.Unit): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: java.lang.String, definition: typingsSlinky.moment.mod.LocaleSpecification): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def locale(language: js.Array[java.lang.String]): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locale")(language.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def localeData(): typingsSlinky.moment.mod.Locale_ = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[typingsSlinky.moment.mod.Locale_]
  @scala.inline
  def localeData(key: java.lang.String): typingsSlinky.moment.mod.Locale_ = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Locale_]
  @scala.inline
  def localeData(key: js.Array[java.lang.String]): typingsSlinky.moment.mod.Locale_ = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("localeData")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Locale_]
  
  @scala.inline
  def locales(): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locales")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def max(moments: typingsSlinky.moment.mod.Moment*): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def max(moments: js.Array[typingsSlinky.moment.mod.Moment]): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("max")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  
  @scala.inline
  def min(moments: typingsSlinky.moment.mod.Moment*): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def min(moments: js.Array[typingsSlinky.moment.mod.Moment]): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("min")(moments.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  
  @scala.inline
  def months(): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def months(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def months(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def months(index: scala.Double): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("months")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def monthsShort(): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def monthsShort(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def monthsShort(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def monthsShort(index: scala.Double): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def normalizeUnits(unit: typingsSlinky.moment.mod.unitOfTime.All): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeUnits")(unit.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def now(): scala.Double = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[scala.Double]
  
  type numberlike = scala.Double | java.lang.String
  
  @scala.inline
  def parseTwoDigitYear(input: java.lang.String): scala.Double = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseTwoDigitYear")(input.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def parseZone(): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")().asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: java.lang.String
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: java.lang.String,
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def parseZone(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: typingsSlinky.moment.mod.MomentFormatSpecification
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def parseZone(inp: typingsSlinky.moment.mod.MomentInput): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseZone")(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  
  @scala.inline
  def relativeTimeRounding(): js.Function1[/* num */ scala.Double, scala.Double] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")().asInstanceOf[js.Function1[/* num */ scala.Double, scala.Double]]
  @scala.inline
  def relativeTimeRounding(fn: js.Function1[/* num */ scala.Double, scala.Double]): scala.Boolean = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeRounding")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def relativeTimeThreshold(threshold: java.lang.String): scala.Double | scala.Boolean = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any]).asInstanceOf[scala.Double | scala.Boolean]
  @scala.inline
  def relativeTimeThreshold(threshold: java.lang.String, limit: scala.Double): scala.Boolean = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relativeTimeThreshold")(threshold.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def suppressDeprecationWarnings: scala.Boolean = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("suppressDeprecationWarnings").asInstanceOf[scala.Boolean]
  @scala.inline
  def suppressDeprecationWarnings_=(x: scala.Boolean): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("suppressDeprecationWarnings")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def unix(timestamp: scala.Double): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unix")(timestamp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  
  @scala.inline
  def updateLocale(language: java.lang.String, localeSpec: scala.Unit): typingsSlinky.moment.mod.Locale_ = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Locale_]
  @scala.inline
  def updateLocale(language: java.lang.String, localeSpec: typingsSlinky.moment.mod.LocaleSpecification): typingsSlinky.moment.mod.Locale_ = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(language.asInstanceOf[js.Any], localeSpec.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Locale_]
  
  @scala.inline
  def utc(): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: java.lang.String
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    language: java.lang.String,
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], language.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: js.UndefOr[typingsSlinky.moment.mod.MomentFormatSpecification],
    strict: scala.Boolean
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def utc(
    inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput],
    format: typingsSlinky.moment.mod.MomentFormatSpecification
  ): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def utc(inp: js.UndefOr[typingsSlinky.moment.mod.MomentInput], strict: scala.Boolean): typingsSlinky.moment.mod.Moment = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.moment.mod.Moment]
  @scala.inline
  def utc(inp: typingsSlinky.moment.mod.MomentInput): typingsSlinky.moment.mod.Moment = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("utc")(inp.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.moment.mod.Moment]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdays(): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdays(index: scala.Double): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdays(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def weekdaysMin(): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysMin(index: scala.Double): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysMin(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def weekdaysShort(): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(format: java.lang.String): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysShort(index: scala.Double): java.lang.String = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(index.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean): js.Array[java.lang.String] = typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], format.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def weekdaysShort(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = (typingsSlinky.moment.mod.^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localeSorted.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
