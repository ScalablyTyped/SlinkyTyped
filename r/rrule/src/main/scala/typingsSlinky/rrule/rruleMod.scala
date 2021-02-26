package typingsSlinky.rrule

import typingsSlinky.rrule.anon.PartialIterArgs
import typingsSlinky.rrule.anon.PartialOptions
import typingsSlinky.rrule.cacheMod.Cache
import typingsSlinky.rrule.cacheMod.CacheKeys
import typingsSlinky.rrule.i18nMod.Language
import typingsSlinky.rrule.rruleStrings.all
import typingsSlinky.rrule.rruleStrings.byeaster
import typingsSlinky.rrule.rruleStrings.byhour
import typingsSlinky.rrule.rruleStrings.byminute
import typingsSlinky.rrule.rruleStrings.bymonth
import typingsSlinky.rrule.rruleStrings.bymonthday
import typingsSlinky.rrule.rruleStrings.bynmonthday
import typingsSlinky.rrule.rruleStrings.bynweekday
import typingsSlinky.rrule.rruleStrings.bysecond
import typingsSlinky.rrule.rruleStrings.bysetpos
import typingsSlinky.rrule.rruleStrings.byweekday
import typingsSlinky.rrule.rruleStrings.byweekno
import typingsSlinky.rrule.rruleStrings.byyearday
import typingsSlinky.rrule.rruleStrings.count
import typingsSlinky.rrule.rruleStrings.dtstart
import typingsSlinky.rrule.rruleStrings.freq
import typingsSlinky.rrule.rruleStrings.interval
import typingsSlinky.rrule.rruleStrings.tzid
import typingsSlinky.rrule.rruleStrings.until
import typingsSlinky.rrule.rruleStrings.wkst
import typingsSlinky.rrule.totextMod.DateFormatter
import typingsSlinky.rrule.totextMod.GetText
import typingsSlinky.rrule.typesMod.IterResultType
import typingsSlinky.rrule.typesMod.Options
import typingsSlinky.rrule.typesMod.ParsedOptions
import typingsSlinky.rrule.typesMod.QueryMethodTypes
import typingsSlinky.rrule.typesMod.QueryMethods
import typingsSlinky.rrule.weekdayMod.Weekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rruleMod {
  
  @JSImport("rrule/dist/esm/src/rrule", JSImport.Default)
  @js.native
  class default () extends RRule {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rrule/dist/esm/src/rrule", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.DAILY")
    @js.native
    val DAILY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.FR")
    @js.native
    val FR: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.FREQUENCIES")
    @js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.HOURLY")
    @js.native
    val HOURLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.MINUTELY")
    @js.native
    val MINUTELY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.MO")
    @js.native
    val MO: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.MONTHLY")
    @js.native
    val MONTHLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.SA")
    @js.native
    val SA: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.SECONDLY")
    @js.native
    val SECONDLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.SU")
    @js.native
    val SU: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.TH")
    @js.native
    val TH: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.TU")
    @js.native
    val TU: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.WE")
    @js.native
    val WE: Weekday = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.WEEKLY")
    @js.native
    val WEEKLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.YEARLY")
    @js.native
    val YEARLY: String | Double = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.fromString")
    @js.native
    def fromString(str: String): RRule = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.fromText")
    @js.native
    def fromText(text: String): RRule = js.native
    @JSImport("rrule/dist/esm/src/rrule", "default.fromText")
    @js.native
    def fromText(text: String, language: Language): RRule = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "default.optionsToString")
    @js.native
    def optionsToString: js.Function1[/* options */ PartialOptions, String] = js.native
    @JSImport("rrule/dist/esm/src/rrule", "default.optionsToString")
    @js.native
    def optionsToString(options: PartialOptions): String = js.native
    @scala.inline
    def optionsToString_=(x: js.Function1[/* options */ PartialOptions, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsToString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "default.parseString")
    @js.native
    def parseString: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    @JSImport("rrule/dist/esm/src/rrule", "default.parseString")
    @js.native
    def parseString(rfcString: String): PartialOptions = js.native
    @scala.inline
    def parseString_=(x: js.Function1[/* rfcString */ String, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseString")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "default.parseText")
    @js.native
    def parseText(text: String): PartialOptions | Null = js.native
    @JSImport("rrule/dist/esm/src/rrule", "default.parseText")
    @js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
  @JSImport("rrule/dist/esm/src/rrule", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: Options = js.native
  
  object Days {
    
    @JSImport("rrule/dist/esm/src/rrule", "Days")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.FR")
    @js.native
    def FR: Weekday = js.native
    @scala.inline
    def FR_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FR")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.MO")
    @js.native
    def MO: Weekday = js.native
    @scala.inline
    def MO_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MO")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.SA")
    @js.native
    def SA: Weekday = js.native
    @scala.inline
    def SA_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SA")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.SU")
    @js.native
    def SU: Weekday = js.native
    @scala.inline
    def SU_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SU")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.TH")
    @js.native
    def TH: Weekday = js.native
    @scala.inline
    def TH_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TH")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.TU")
    @js.native
    def TU: Weekday = js.native
    @scala.inline
    def TU_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TU")(x.asInstanceOf[js.Any])
    
    @JSImport("rrule/dist/esm/src/rrule", "Days.WE")
    @js.native
    def WE: Weekday = js.native
    @scala.inline
    def WE_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rrule/dist/esm/src/rrule", "defaultKeys")
  @js.native
  val defaultKeys: js.Array[
    freq | dtstart | interval | wkst | count | until | tzid | bysetpos | bymonth | bymonthday | bynmonthday | byyearday | byweekno | byweekday | bynweekday | byhour | byminute | bysecond | byeaster
  ] = js.native
  
  @js.native
  trait RRule extends QueryMethods {
    
    var _cache: Cache | Null = js.native
    
    def _cacheAdd(what: CacheKeys): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date, args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Null, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Null, args: PartialIterArgs): Unit = js.native
    
    var _cacheGet: js.Any = js.native
    
    /* protected */ def _iter[M /* <: QueryMethodTypes */](iterResult: typingsSlinky.rrule.iterresultMod.default[M]): IterResultType[M] = js.native
    
    /**
      * Returns the first recurrence after the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      * @return Date or null
      */
    def after(dt: js.Date): js.Date = js.native
    
    def all(iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]): js.Array[js.Date] = js.native
    
    /**
      * Returns the last recurrence before the given datetime instance.
      * The inc keyword defines what happens if dt is an occurrence.
      * With inc == True, if dt itself is an occurrence, it will be returned.
      * @return Date or null
      */
    def before(dt: js.Date): js.Date = js.native
    
    /**
      * Returns all the occurrences of the rrule between after and before.
      * The inc keyword defines what happens if after and/or before are
      * themselves occurrences. With inc == True, they will be included in the
      * list, if they are found in the recurrence set.
      * @return Array
      */
    def between(after: js.Date, before: js.Date): js.Array[js.Date] = js.native
    def between(
      after: js.Date,
      before: js.Date,
      inc: js.UndefOr[scala.Nothing],
      iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
    ): js.Array[js.Date] = js.native
    def between(
      after: js.Date,
      before: js.Date,
      inc: Boolean,
      iterator: js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
    ): js.Array[js.Date] = js.native
    
    /**
      * Returns the number of recurrences in this set. It will have go trough
      * the whole recurrence, if this hasn't been done before.
      */
    def count(): Double = js.native
    
    def isFullyConvertibleToText(): Boolean = js.native
    
    var options: ParsedOptions = js.native
    
    var origOptions: PartialOptions = js.native
    
    /**
      * Will convert all rules described in nlp:ToText
      * to text.
      */
    def toText(): String = js.native
    def toText(
      gettext: js.UndefOr[scala.Nothing],
      language: js.UndefOr[scala.Nothing],
      dateFormatter: DateFormatter
    ): String = js.native
    def toText(gettext: js.UndefOr[scala.Nothing], language: Language): String = js.native
    def toText(gettext: js.UndefOr[scala.Nothing], language: Language, dateFormatter: DateFormatter): String = js.native
    def toText(gettext: GetText): String = js.native
    def toText(gettext: GetText, language: js.UndefOr[scala.Nothing], dateFormatter: DateFormatter): String = js.native
    def toText(gettext: GetText, language: Language): String = js.native
    def toText(gettext: GetText, language: Language, dateFormatter: DateFormatter): String = js.native
  }
}
