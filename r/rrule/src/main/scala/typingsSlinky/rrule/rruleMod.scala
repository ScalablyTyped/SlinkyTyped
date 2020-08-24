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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/rrule", JSImport.Namespace)
@js.native
object rruleMod extends js.Object {
  @js.native
  trait RRule extends QueryMethods {
    var _cache: Cache | Null = js.native
    var _cacheGet: js.Any = js.native
    var options: ParsedOptions = js.native
    var origOptions: PartialOptions = js.native
    def _cacheAdd(what: CacheKeys): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date]): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: Null, args: PartialIterArgs): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date): Unit = js.native
    def _cacheAdd(what: CacheKeys, value: js.Date, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date]): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: Null, args: PartialIterArgs): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date): Unit = js.native
    @JSName("_cacheAdd")
    def _cacheAdd_all(what: all, value: js.Date, args: PartialIterArgs): Unit = js.native
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
  
  @js.native
  class default () extends RRule {
    def this(options: PartialOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], noCache: Boolean) = this()
    def this(options: PartialOptions, noCache: Boolean) = this()
  }
  
  val DEFAULT_OPTIONS: Options = js.native
  val defaultKeys: js.Array[
    freq | dtstart | interval | wkst | count | until | tzid | bysetpos | bymonth | bymonthday | bynmonthday | byyearday | byweekno | byweekday | bynweekday | byhour | byminute | bysecond | byeaster
  ] = js.native
  @js.native
  object Days extends js.Object {
    var FR: Weekday = js.native
    var MO: Weekday = js.native
    var SA: Weekday = js.native
    var SU: Weekday = js.native
    var TH: Weekday = js.native
    var TU: Weekday = js.native
    var WE: Weekday = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DAILY: String | Double = js.native
    val FR: Weekday = js.native
    val FREQUENCIES: js.Array[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Frequency * / any */ String
      ] = js.native
    val HOURLY: String | Double = js.native
    val MINUTELY: String | Double = js.native
    val MO: Weekday = js.native
    val MONTHLY: String | Double = js.native
    val SA: Weekday = js.native
    val SECONDLY: String | Double = js.native
    val SU: Weekday = js.native
    val TH: Weekday = js.native
    val TU: Weekday = js.native
    val WE: Weekday = js.native
    val WEEKLY: String | Double = js.native
    val YEARLY: String | Double = js.native
    @JSName("optionsToString")
    var optionsToString_Original: js.Function1[/* options */ PartialOptions, String] = js.native
    @JSName("parseString")
    var parseString_Original: js.Function1[/* rfcString */ String, PartialOptions] = js.native
    def fromString(str: String): RRule = js.native
    def fromText(text: String): RRule = js.native
    def fromText(text: String, language: Language): RRule = js.native
    def optionsToString(options: PartialOptions): String = js.native
    def parseString(rfcString: String): PartialOptions = js.native
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
  }
  
}

