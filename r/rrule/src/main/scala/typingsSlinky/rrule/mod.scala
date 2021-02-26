package typingsSlinky.rrule

import typingsSlinky.rrule.anon.PartialOptions
import typingsSlinky.rrule.anon.PartialRRuleStrOptions
import typingsSlinky.rrule.i18nMod.Language
import typingsSlinky.rrule.weekdayMod.WeekdayStr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rrule", JSImport.Default)
  @js.native
  class default ()
    extends typingsSlinky.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rrule", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule", "default.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule", "default.FR")
    @js.native
    val FR: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule", "default.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule", "default.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule", "default.MO")
    @js.native
    val MO: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule", "default.SA")
    @js.native
    val SA: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule", "default.SU")
    @js.native
    val SU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.TH")
    @js.native
    val TH: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.TU")
    @js.native
    val TU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.WE")
    @js.native
    val WE: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "default.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule", "default.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    @JSImport("rrule", "default.fromString")
    @js.native
    def fromString(str: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    @JSImport("rrule", "default.fromText")
    @js.native
    def fromText(text: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    @JSImport("rrule", "default.fromText")
    @js.native
    def fromText(text: String, language: Language): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    @JSImport("rrule", "default.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    @JSImport("rrule", "default.optionsToString")
    @js.native
    def optionsToString(options: PartialOptions): String = js.native
    @scala.inline
    def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule", "default.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    @JSImport("rrule", "default.parseString")
    @js.native
    def parseString(rfcString: String): PartialOptions = js.native
    @scala.inline
    def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule", "default.parseText")
    @js.native
    def parseText(text: String): PartialOptions | Null = js.native
    @JSImport("rrule", "default.parseText")
    @js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
  @JSImport("rrule", "Frequency")
  @js.native
  object Frequency extends StObject {
    
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
  
  @JSImport("rrule", "RRule")
  @js.native
  class RRule ()
    extends typingsSlinky.rrule.rruleMod.default {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  object RRule {
    
    @JSImport("rrule", "RRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule", "RRule.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule", "RRule.FR")
    @js.native
    val FR: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule", "RRule.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule", "RRule.MO")
    @js.native
    val MO: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.SA")
    @js.native
    val SA: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.SU")
    @js.native
    val SU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.TH")
    @js.native
    val TH: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.TU")
    @js.native
    val TU: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.WE")
    @js.native
    val WE: typingsSlinky.rrule.weekdayMod.Weekday = js.native
    
    @JSImport("rrule", "RRule.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    @JSImport("rrule", "RRule.fromString")
    @js.native
    def fromString(str: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    @JSImport("rrule", "RRule.fromText")
    @js.native
    def fromText(text: String): typingsSlinky.rrule.rruleMod.RRule = js.native
    @JSImport("rrule", "RRule.fromText")
    @js.native
    def fromText(text: String, language: Language): typingsSlinky.rrule.rruleMod.RRule = js.native
    
    @JSImport("rrule", "RRule.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    @JSImport("rrule", "RRule.optionsToString")
    @js.native
    def optionsToString(options: PartialOptions): String = js.native
    @scala.inline
    def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule", "RRule.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    @JSImport("rrule", "RRule.parseString")
    @js.native
    def parseString(rfcString: String): PartialOptions = js.native
    @scala.inline
    def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule", "RRule.parseText")
    @js.native
    def parseText(text: String): PartialOptions | Null = js.native
    @JSImport("rrule", "RRule.parseText")
    @js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
  @JSImport("rrule", "RRuleSet")
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
  
  @JSImport("rrule", "Weekday")
  @js.native
  class Weekday protected ()
    extends typingsSlinky.rrule.weekdayMod.Weekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
  }
  /* static members */
  object Weekday {
    
    @JSImport("rrule", "Weekday.fromStr")
    @js.native
    def fromStr(str: WeekdayStr): typingsSlinky.rrule.weekdayMod.Weekday = js.native
  }
  
  @JSImport("rrule", "rrulestr")
  @js.native
  def rrulestr(s: String): typingsSlinky.rrule.rruleMod.default | typingsSlinky.rrule.rrulesetMod.default = js.native
  @JSImport("rrule", "rrulestr")
  @js.native
  def rrulestr(s: String, options: PartialRRuleStrOptions): typingsSlinky.rrule.rruleMod.default | typingsSlinky.rrule.rrulesetMod.default = js.native
}
