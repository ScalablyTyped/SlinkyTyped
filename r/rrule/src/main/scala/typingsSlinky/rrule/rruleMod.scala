package typingsSlinky.rrule

import typingsSlinky.rrule.distEsmSrcNlpI18nMod.Language
import typingsSlinky.rrule.distEsmSrcRrulestrMod.RRuleStrOptions
import typingsSlinky.rrule.distEsmSrcTypesMod.Options
import typingsSlinky.rrule.distEsmSrcWeekdayMod.WeekdayStr
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule", JSImport.Namespace)
@js.native
object rruleMod extends js.Object {
  @js.native
  class RRule ()
    extends typingsSlinky.rrule.distEsmSrcRruleMod.default {
    def this(options: Partial[Options]) = this()
    def this(options: Partial[Options], noCache: Boolean) = this()
  }
  
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class RRuleSet ()
    extends typingsSlinky.rrule.distEsmSrcRrulesetMod.default {
    def this(noCache: Boolean) = this()
  }
  
  @js.native
  class Weekday protected ()
    extends typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  
  @js.native
  class default ()
    extends typingsSlinky.rrule.distEsmSrcRruleMod.default {
    def this(options: Partial[Options]) = this()
    def this(options: Partial[Options], noCache: Boolean) = this()
  }
  
  def rrulestr(s: String): typingsSlinky.rrule.distEsmSrcRruleMod.default | typingsSlinky.rrule.distEsmSrcRrulesetMod.default = js.native
  def rrulestr(s: String, options: Partial[RRuleStrOptions]): typingsSlinky.rrule.distEsmSrcRruleMod.default | typingsSlinky.rrule.distEsmSrcRrulesetMod.default = js.native
  @js.native
  object Frequency extends js.Object {
    /* 3 */ val DAILY: typingsSlinky.rrule.distEsmSrcTypesMod.Frequency.DAILY with Double = js.native
    /* 4 */ val HOURLY: typingsSlinky.rrule.distEsmSrcTypesMod.Frequency.HOURLY with Double = js.native
    /* 5 */ val MINUTELY: typingsSlinky.rrule.distEsmSrcTypesMod.Frequency.MINUTELY with Double = js.native
    /* 1 */ val MONTHLY: typingsSlinky.rrule.distEsmSrcTypesMod.Frequency.MONTHLY with Double = js.native
    /* 6 */ val SECONDLY: typingsSlinky.rrule.distEsmSrcTypesMod.Frequency.SECONDLY with Double = js.native
    /* 2 */ val WEEKLY: typingsSlinky.rrule.distEsmSrcTypesMod.Frequency.WEEKLY with Double = js.native
    /* 0 */ val YEARLY: typingsSlinky.rrule.distEsmSrcTypesMod.Frequency.YEARLY with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.rrule.distEsmSrcTypesMod.Frequency with Double] = js.native
  }
  
  /* static members */
  @js.native
  object RRule extends js.Object {
    val DAILY: String | Double = js.native
    val FR: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TH: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TU: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WE: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ Partial[Options], String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, Partial[Options]] = js.native
    def fromString(str: String): typingsSlinky.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String): typingsSlinky.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String, language: Language): typingsSlinky.rrule.distEsmSrcRruleMod.RRule = js.native
    def optionsToString(options: Partial[Options]): String = js.native
    def parseString(rfcString: String): Partial[Options] = js.native
    def parseText(text: String): Partial[Options] | Null = js.native
    def parseText(text: String, language: Language): Partial[Options] | Null = js.native
  }
  
  /* static members */
  @js.native
  object Weekday extends js.Object {
    def fromStr(str: WeekdayStr): typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DAILY: String | Double = js.native
    val FR: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val FREQUENCIES: js.Array[String] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TH: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val TU: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WE: typingsSlinky.rrule.distEsmSrcWeekdayMod.Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ Partial[Options], String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, Partial[Options]] = js.native
    def fromString(str: String): typingsSlinky.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String): typingsSlinky.rrule.distEsmSrcRruleMod.RRule = js.native
    def fromText(text: String, language: Language): typingsSlinky.rrule.distEsmSrcRruleMod.RRule = js.native
    def optionsToString(options: Partial[Options]): String = js.native
    def parseString(rfcString: String): Partial[Options] = js.native
    def parseText(text: String): Partial[Options] | Null = js.native
    def parseText(text: String, language: Language): Partial[Options] | Null = js.native
  }
  
}

