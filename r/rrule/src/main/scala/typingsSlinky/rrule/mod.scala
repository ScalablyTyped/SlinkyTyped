package typingsSlinky.rrule

import typingsSlinky.rrule.anon.PartialOptions
import typingsSlinky.rrule.anon.PartialRRuleStrOptions
import typingsSlinky.rrule.i18nMod.Language
import typingsSlinky.rrule.weekdayMod.WeekdayStr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def rrulestr(s: String): typingsSlinky.rrule.rruleMod.default | typingsSlinky.rrule.rrulesetMod.default = js.native
  def rrulestr(s: String, options: PartialRRuleStrOptions): typingsSlinky.rrule.rruleMod.default | typingsSlinky.rrule.rrulesetMod.default = js.native
  
  @js.native
  object Frequency extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.rrule.typesMod.Frequency with Double] = js.native
    
    /* 3 */ val DAILY: typingsSlinky.rrule.typesMod.Frequency.DAILY with Double = js.native
    
    /* 4 */ val HOURLY: typingsSlinky.rrule.typesMod.Frequency.HOURLY with Double = js.native
    
    /* 5 */ val MINUTELY: typingsSlinky.rrule.typesMod.Frequency.MINUTELY with Double = js.native
    
    /* 1 */ val MONTHLY: typingsSlinky.rrule.typesMod.Frequency.MONTHLY with Double = js.native
    
    /* 6 */ val SECONDLY: typingsSlinky.rrule.typesMod.Frequency.SECONDLY with Double = js.native
    
    /* 2 */ val WEEKLY: typingsSlinky.rrule.typesMod.Frequency.WEEKLY with Double = js.native
    
    /* 0 */ val YEARLY: typingsSlinky.rrule.typesMod.Frequency.YEARLY with Double = js.native
  }
  
  @js.native
  class RRule ()
    extends typingsSlinky.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  @js.native
  object RRule extends js.Object {
    
    val DAILY: String | Double = js.native
    
    val FR: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    val HOURLY: String | Double = js.native
    
    val MINUTELY: String | Double = js.native
    
    val MO: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val MONTHLY: String | Double = js.native
    
    val SA: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val SECONDLY: String | Double = js.native
    
    val SU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val TH: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val TU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val WE: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val WEEKLY: String | Double = js.native
    
    val YEARLY: String | Double = js.native
    
    def fromString(str: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    def fromText(text: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    def fromText(text: String, language: Language): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    def optionsToString(options: PartialOptions): String = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    
    def parseString(rfcString: String): PartialOptions = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class RRuleSet ()
    extends typingsSlinky.rrule.rrulesetMod.default {
    def this(noCache: Boolean) = this()
  }
  
  @js.native
  class Weekday protected ()
    extends typingsSlinky.rrule.weekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  /* static members */
  @js.native
  object Weekday extends js.Object {
    
    def fromStr(str: WeekdayStr): typingsSlinky.rrule.weekdayMod.Weekday = js.native
  }
  
  @js.native
  class default ()
    extends typingsSlinky.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    val DAILY: String | Double = js.native
    
    val FR: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    val HOURLY: String | Double = js.native
    
    val MINUTELY: String | Double = js.native
    
    val MO: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val MONTHLY: String | Double = js.native
    
    val SA: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val SECONDLY: String | Double = js.native
    
    val SU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val TH: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val TU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val WE: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    val WEEKLY: String | Double = js.native
    
    val YEARLY: String | Double = js.native
    
    def fromString(str: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    def fromText(text: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    def fromText(text: String, language: Language): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    def optionsToString(options: PartialOptions): String = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    
    def parseString(rfcString: String): PartialOptions = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
}
