package typingsSlinky.dayjs

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.dayjs.anon.Format
import typingsSlinky.dayjs.anon.PartialILocale
import typingsSlinky.dayjs.dayjsStrings.m_
import typingsSlinky.dayjs.durationMod.Duration
import typingsSlinky.dayjs.durationMod.DurationInputType
import typingsSlinky.dayjs.isoWeekMod.ISOUnitType
import typingsSlinky.dayjs.toObjectMod.DayjsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  def apply(): Dayjs = js.native
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  def apply(
    date: js.UndefOr[ConfigType],
    format: js.UndefOr[OptionType],
    locale: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Dayjs = js.native
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  def apply(date: js.UndefOr[ConfigType], format: js.UndefOr[OptionType], locale: String): Dayjs = js.native
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  def apply(date: js.UndefOr[ConfigType], format: js.UndefOr[OptionType], locale: String, strict: Boolean): Dayjs = js.native
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  def apply(date: js.UndefOr[ConfigType], format: js.UndefOr[OptionType], strict: Boolean): Dayjs = js.native
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  def apply(date: js.UndefOr[ConfigType], format: OptionType): Dayjs = js.native
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  def apply(date: ConfigType): Dayjs = js.native
  
  @JSImport("dayjs/esm", "Dayjs")
  @js.native
  class Dayjs () extends StObject {
    def this(config: ConfigType) = this()
    
    def add(argument: js.Object): typingsSlinky.dayjs.objectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object with a specified amount of time added.
      * ```
      * dayjs().add(7, 'day')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/add
      */
    def add(value: Double): Dayjs = js.native
    def add(value: Double, unit: OpUnitType): Dayjs = js.native
    def add(value: Double, unit: QUnitType): typingsSlinky.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def add(value: Duration): typingsSlinky.dayjs.durationMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def calendar(): String = js.native
    def calendar(referenceTime: js.UndefOr[ConfigType], formats: js.Object): String = js.native
    def calendar(referenceTime: ConfigType): String = js.native
    
    /**
      * Get the date of the month.
      * ```
      * dayjs().date()// => 1-31
      * ```
      * Docs: https://day.js.org/docs/en/get-set/date
      */
    def date(): Double = js.native
    /**
      * Set the date of the month.
      *
      * Accepts numbers from 1 to 31. If the range is exceeded, it will bubble up to the months.
      * ```
      * dayjs().date(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/date
      */
    def date(value: Double): Dayjs = js.native
    
    def dates(): Double = js.native
    def dates(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the day of the week.
      *
      * Returns numbers from 0 (Sunday) to 6 (Saturday).
      * ```
      * dayjs().day()// 0-6
      * ```
      * Docs: https://day.js.org/docs/en/get-set/day
      */
    def day(): Double = js.native
    /**
      * Set the day of the week.
      *
      * Accepts numbers from 0 (Sunday) to 6 (Saturday). If the range is exceeded, it will bubble up to other weeks.
      * ```
      * dayjs().day(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/day
      */
    def day(value: Double): Dayjs = js.native
    
    def dayOfYear(): Double = js.native
    def dayOfYear(value: Double): typingsSlinky.dayjs.dayOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def days(): Double = js.native
    def days(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the number of days in the current month.
      * ```
      * dayjs('2019-01-25').daysInMonth() // 31
      * ```
      * Docs: https://day.js.org/docs/en/display/days-in-month
      */
    def daysInMonth(): Double = js.native
    
    /**
      * This indicates the difference between two date-time in the specified unit.
      *
      * To get the difference in milliseconds, use `dayjs#diff`
      * ```
      * const date1 = dayjs('2019-01-25')
      * const date2 = dayjs('2018-06-05')
      * date1.diff(date2) // 20214000000 default milliseconds
      * ```
      * To get the difference in another unit of measurement, pass that measurement as the second argument.
      * ```
      * const date1 = dayjs('2019-01-25')
      * date1.diff('2018-06-05', 'month') // 7
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/display/difference
      */
    def diff(date: ConfigType): Double = js.native
    def diff(date: ConfigType, unit: js.UndefOr[scala.Nothing], float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType, float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: QUnitType): Double = js.native
    def diff(date: ConfigType, unit: QUnitType, float: Boolean): Double = js.native
    
    /**
      * Returns a cloned Day.js object and set it to the end of a unit of time.
      * ```
      * dayjs().endOf('month')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/end-of
      */
    def endOf(unit: OpUnitType): Dayjs = js.native
    def endOf(unit: QUnitType): typingsSlinky.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def endOf(unit: ISOUnitType): typingsSlinky.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the formatted date according to the string of tokens passed in.
      *
      * To escape characters, wrap them in square brackets (e.g. [MM]).
      * ```
      * dayjs().format()// => current date in ISO8601, without fraction seconds e.g. '2020-04-02T08:02:17-05:00'
      * dayjs('2019-01-25').format('[YYYYescape] YYYY-MM-DDTHH:mm:ssZ[Z]')// 'YYYYescape 2019-01-25T00:00:00-02:00Z'
      * dayjs('2019-01-25').format('DD/MM/YYYY') // '25/01/2019'
      * ```
      * Docs: https://day.js.org/docs/en/display/format
      */
    def format(): String = js.native
    def format(template: String): String = js.native
    
    def from(compared: ConfigType): String = js.native
    def from(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    
    def fromNow(): String = js.native
    def fromNow(withoutSuffix: Boolean): String = js.native
    
    /**
      * String getter, returns the corresponding information getting from Day.js object.
      *
      * In general:
      * ```
      * dayjs().get(unit) === dayjs()[unit]()
      * ```
      * Units are case insensitive, and support plural and short forms.
      * ```
      * dayjs().get('year')
      * dayjs().get('month') // start 0
      * dayjs().get('date')
      * ```
      * Docs: https://day.js.org/docs/en/get-set/get
      */
    def get(unit: UnitType): Double = js.native
    
    /**
      * Get the hour.
      * ```
      * dayjs().hour()// => 0-23
      * ```
      * Docs: https://day.js.org/docs/en/get-set/hour
      */
    def hour(): Double = js.native
    /**
      * Set the hour.
      *
      * Accepts numbers from 0 to 23. If the range is exceeded, it will bubble up to the day.
      * ```
      * dayjs().hour(12)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/hour
      */
    def hour(value: Double): Dayjs = js.native
    
    def hours(): Double = js.native
    def hours(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * This indicates whether the Day.js object is after the other supplied date-time.
      * ```
      * dayjs().isAfter(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isAfter('2011-01-01', 'year')// => boolean
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/query/is-after
      */
    def isAfter(date: ConfigType): Boolean = js.native
    def isAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isAfter(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    
    /**
      * This indicates whether the Day.js object is before the other supplied date-time.
      * ```
      * dayjs().isBefore(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isBefore('2011-01-01', 'year')// => boolean
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/query/is-before
      */
    def isBefore(date: ConfigType): Boolean = js.native
    def isBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isBefore(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    
    def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: js.UndefOr[scala.Nothing], d: String): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Null, d: String): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: String): Boolean = js.native
    
    def isLeapYear(): Boolean = js.native
    
    /**
      * This indicates whether the Day.js object is the same as the other supplied date-time.
      * ```
      * dayjs().isSame(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isSame('2011-01-01', 'year')// => boolean
      * ```
      * Docs: https://day.js.org/docs/en/query/is-same
      */
    def isSame(date: ConfigType): Boolean = js.native
    def isSame(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isSame(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    
    def isSameOrAfter(date: ConfigType): Boolean = js.native
    def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    
    def isSameOrBefore(date: ConfigType): Boolean = js.native
    def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
    
    def isToday(): Boolean = js.native
    
    def isTomorrow(): Boolean = js.native
    
    def isUTC(): Boolean = js.native
    
    /**
      * This returns a `boolean` indicating whether the Day.js object contains a valid date or not.
      * ```
      * dayjs().isValid()// => boolean
      * ```
      * Docs: https://day.js.org/docs/en/parse/is-valid
      */
    def isValid(): Boolean = js.native
    
    def isYesterday(): Boolean = js.native
    
    def isoWeek(): Double = js.native
    def isoWeek(value: Double): typingsSlinky.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def isoWeekYear(): Double = js.native
    
    def isoWeekday(): Double = js.native
    def isoWeekday(value: Double): typingsSlinky.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def isoWeeksInYear(): Double = js.native
    
    def local(): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def locale(): String = js.native
    def locale(preset: String): Dayjs = js.native
    def locale(preset: String, `object`: PartialILocale): Dayjs = js.native
    def locale(preset: ILocale): Dayjs = js.native
    def locale(preset: ILocale, `object`: PartialILocale): Dayjs = js.native
    
    def localeData(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.InstanceLocaleDataReturn = js.native
    
    /**
      * Get the milliseconds.
      * ```
      * dayjs().millisecond()// => 0-999
      * ```
      * Docs: https://day.js.org/docs/en/get-set/millisecond
      */
    def millisecond(): Double = js.native
    /**
      * Set the milliseconds.
      *
      * Accepts numbers from 0 to 999. If the range is exceeded, it will bubble up to the seconds.
      * ```
      * dayjs().millisecond(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/millisecond
      */
    def millisecond(value: Double): Dayjs = js.native
    
    def milliseconds(): Double = js.native
    def milliseconds(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the minutes.
      * ```
      * dayjs().minute()// => 0-59
      * ```
      * Docs: https://day.js.org/docs/en/get-set/minute
      */
    def minute(): Double = js.native
    /**
      * Set the minutes.
      *
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the hour.
      * ```
      * dayjs().minute(59)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/minute
      */
    def minute(value: Double): Dayjs = js.native
    
    def minutes(): Double = js.native
    def minutes(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the month.
      *
      * Months are zero indexed, so January is month 0.
      * ```
      * dayjs().month()// => 0-11
      * ```
      * Docs: https://day.js.org/docs/en/get-set/month
      */
    def month(): Double = js.native
    /**
      * Set the month.
      *
      * Months are zero indexed, so January is month 0.
      *
      * Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the year.
      * ```
      * dayjs().month(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/month
      */
    def month(value: Double): Dayjs = js.native
    
    def months(): Double = js.native
    def months(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def quarter(): Double = js.native
    def quarter(quarter: Double): typingsSlinky.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the seconds.
      * ```
      * dayjs().second()// => 0-59
      * ```
      * Docs: https://day.js.org/docs/en/get-set/second
      */
    def second(): Double = js.native
    /**
      * Set the seconds.
      *
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the minutes.
      * ```
      * dayjs().second(1)// Dayjs
      * ```
      */
    def second(value: Double): Dayjs = js.native
    
    def seconds(): Double = js.native
    def seconds(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def set(argument: js.Object): typingsSlinky.dayjs.objectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Generic setter, accepting unit as first argument, and value as second, returns a new instance with the applied changes.
      *
      * In general:
      * ```
      * dayjs().set(unit, value) === dayjs()[unit](value)
      * ```
      * Units are case insensitive, and support plural and short forms.
      * ```
      * dayjs().set('date', 1)
      * dayjs().set('month', 3) // April
      * dayjs().set('second', 30)
      * ```
      * Docs: https://day.js.org/docs/en/get-set/set
      */
    def set(unit: UnitType, value: Double): Dayjs = js.native
    
    /**
      * Returns a cloned Day.js object and set it to the start of a unit of time.
      * ```
      * dayjs().startOf('year')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/start-of
      */
    def startOf(unit: OpUnitType): Dayjs = js.native
    def startOf(unit: QUnitType): typingsSlinky.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def startOf(unit: ISOUnitType): typingsSlinky.dayjs.isoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def subtract(argument: js.Object): typingsSlinky.dayjs.objectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object with a specified amount of time subtracted.
      * ```
      * dayjs().subtract(7, 'year')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/subtract
      */
    def subtract(value: Double): Dayjs = js.native
    def subtract(value: Double, unit: OpUnitType): Dayjs = js.native
    def subtract(value: Double, unit: QUnitType): typingsSlinky.dayjs.quarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def subtract(value: Duration): typingsSlinky.dayjs.durationMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def to(compared: ConfigType): String = js.native
    def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    /**
      * To get a copy of the native `Date` object parsed from the Day.js object use `dayjs#toDate`.
      * ```
      * dayjs('2019-01-25').toDate()// => Date
      * ```
      */
    def toDate(): js.Date = js.native
    
    /**
      * To format as an ISO 8601 string.
      * ```
      * dayjs('2019-01-25').toISOString() // '2019-01-25T02:00:00.000Z'
      * ```
      * Docs: https://day.js.org/docs/en/display/as-iso-string
      */
    def toISOString(): String = js.native
    
    /**
      * To serialize as an ISO 8601 string.
      * ```
      * dayjs('2019-01-25').toJSON() // '2019-01-25T02:00:00.000Z'
      * ```
      * Docs: https://day.js.org/docs/en/display/as-json
      */
    def toJSON(): String = js.native
    
    def toNow(): String = js.native
    def toNow(withoutSuffix: Boolean): String = js.native
    
    def toObject(): DayjsObject = js.native
    
    def tz(): typingsSlinky.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: js.UndefOr[scala.Nothing], keepLocalTime: Boolean): typingsSlinky.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: String): typingsSlinky.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: String, keepLocalTime: Boolean): typingsSlinky.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * This returns the Unix timestamp (the number of **seconds** since the Unix Epoch) of the Day.js object.
      * ```
      * dayjs('2019-01-25').unix() // 1548381600
      * ```
      * This value is floored to the nearest second, and does not include a milliseconds component.
      *
      * Docs: https://day.js.org/docs/en/display/unix-timestamp
      */
    def unix(): Double = js.native
    
    def utc(): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utc(keepLocalTime: Boolean): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the UTC offset in minutes.
      * ```
      * dayjs().utcOffset()
      * ```
      * Docs: https://day.js.org/docs/en/manipulate/utc-offset
      */
    def utcOffset(): Double = js.native
    def utcOffset(offset: Double): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utcOffset(offset: Double, keepLocalTime: Boolean): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def week(): Double = js.native
    def week(value: Double): typingsSlinky.dayjs.weekOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def weekYear(): Double = js.native
    
    def weekday(): Double = js.native
    def weekday(value: Double): typingsSlinky.dayjs.weekdayMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def weeks(): Double = js.native
    def weeks(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the year.
      * ```
      * dayjs().year()// => 2020
      * ```
      * Docs: https://day.js.org/docs/en/get-set/year
      */
    def year(): Double = js.native
    /**
      * Set the year.
      * ```
      * dayjs().year(2000)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/year
      */
    def year(value: Double): Dayjs = js.native
    
    def years(): Double = js.native
    def years(value: Double): typingsSlinky.dayjs.pluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  }
  
  @JSImport("dayjs/esm", "duration")
  @js.native
  def duration(): Duration = js.native
  @JSImport("dayjs/esm", "duration")
  @js.native
  def duration(input: js.UndefOr[DurationInputType], unit: String): Duration = js.native
  @JSImport("dayjs/esm", "duration")
  @js.native
  def duration(input: DurationInputType): Duration = js.native
  
  @JSImport("dayjs/esm", "extend")
  @js.native
  def extend[T](plugin: PluginFunc[T]): Dayjs = js.native
  @JSImport("dayjs/esm", "extend")
  @js.native
  def extend[T](plugin: PluginFunc[T], option: T): Dayjs = js.native
  
  @JSImport("dayjs/esm", "isDayjs")
  @js.native
  def isDayjs(d: js.Any): /* is dayjs.dayjs/esm.Dayjs */ Boolean = js.native
  
  @JSImport("dayjs/esm", "isDuration")
  @js.native
  def isDuration(d: js.Any): /* is dayjs.dayjs/esm/plugin/duration.Duration */ Boolean = js.native
  
  @JSImport("dayjs/esm", "isMoment")
  @js.native
  def isMoment(input: js.Any): Boolean = js.native
  
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: js.UndefOr[scala.Nothing], `object`: js.UndefOr[scala.Nothing], isLocal: Boolean): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: js.UndefOr[scala.Nothing], `object`: PartialILocale): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: js.UndefOr[scala.Nothing], `object`: PartialILocale, isLocal: Boolean): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: String): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: String, `object`: js.UndefOr[scala.Nothing], isLocal: Boolean): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: String, `object`: PartialILocale): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: String, `object`: PartialILocale, isLocal: Boolean): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: ILocale): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: ILocale, `object`: js.UndefOr[scala.Nothing], isLocal: Boolean): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: ILocale, `object`: PartialILocale): String = js.native
  @JSImport("dayjs/esm", "locale")
  @js.native
  def locale(preset: ILocale, `object`: PartialILocale, isLocal: Boolean): String = js.native
  
  @JSImport("dayjs/esm", "localeData")
  @js.native
  def localeData(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.GlobalLocaleDataReturn = js.native
  
  @JSImport("dayjs/esm", "max")
  @js.native
  def max(dayjs: Dayjs*): Dayjs = js.native
  @JSImport("dayjs/esm", "max")
  @js.native
  def max(dayjs: js.Array[Dayjs]): Dayjs = js.native
  
  @JSImport("dayjs/esm", "min")
  @js.native
  def min(dayjs: Dayjs*): Dayjs = js.native
  @JSImport("dayjs/esm", "min")
  @js.native
  def min(dayjs: js.Array[Dayjs]): Dayjs = js.native
  
  @JSImport("dayjs/esm", "months")
  @js.native
  def months(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  
  @JSImport("dayjs/esm", "monthsShort")
  @js.native
  def monthsShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  
  @JSImport("dayjs/esm", "unix")
  @js.native
  def unix(t: Double): Dayjs = js.native
  
  @JSImport("dayjs/esm", "updateLocale")
  @js.native
  def updateLocale(localeName: String, customConfig: js.Object): js.Any = js.native
  
  @JSImport("dayjs/esm", "utc")
  @js.native
  def utc(): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  @JSImport("dayjs/esm", "utc")
  @js.native
  def utc(config: js.UndefOr[ConfigType], format: String): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  @JSImport("dayjs/esm", "utc")
  @js.native
  def utc(config: ConfigType): typingsSlinky.dayjs.utcMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  @JSImport("dayjs/esm", "weekdays")
  @js.native
  def weekdays(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  @JSImport("dayjs/esm", "weekdays")
  @js.native
  def weekdays(localOrder: Boolean): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  
  @JSImport("dayjs/esm", "weekdaysMin")
  @js.native
  def weekdaysMin(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  @JSImport("dayjs/esm", "weekdaysMin")
  @js.native
  def weekdaysMin(localOrder: Boolean): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  
  @JSImport("dayjs/esm", "weekdaysShort")
  @js.native
  def weekdaysShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  @JSImport("dayjs/esm", "weekdaysShort")
  @js.native
  def weekdaysShort(localOrder: Boolean): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  
  type ConfigType = String | Double | js.Date | Dayjs
  
  @js.native
  trait DayjsTimezone extends StObject {
    
    def apply(date: ConfigType): typingsSlinky.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, format: String, timezone: String): typingsSlinky.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, timezone: String): typingsSlinky.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def guess(): String = js.native
    
    def setDefault(): Unit = js.native
    def setDefault(timezone: String): Unit = js.native
  }
  
  @js.native
  trait GlobalLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: js.UndefOr[scala.Nothing], minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
    def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double): String = js.native
    def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    
    def months(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def monthsShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def weekdays(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  }
  
  @js.native
  trait InstanceLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: js.UndefOr[scala.Nothing], minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
    def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double): String = js.native
    def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    
    def months(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    def months(instance: typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def monthsShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    def monthsShort(instance: typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def weekdays(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdays(instance: typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdaysMin(instance: typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdaysShort(instance: typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.Dayjs): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  }
  
  type MonthNames = js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dayjs.dayjsStrings.week
    - typingsSlinky.dayjs.dayjsStrings.w
    - typingsSlinky.dayjs.dayjsStrings.millisecond
    - typingsSlinky.dayjs.dayjsStrings.second
    - typingsSlinky.dayjs.dayjsStrings.minute
    - typingsSlinky.dayjs.dayjsStrings.hour
    - typingsSlinky.dayjs.dayjsStrings.day
    - typingsSlinky.dayjs.dayjsStrings.month
    - typingsSlinky.dayjs.dayjsStrings.year
    - typingsSlinky.dayjs.dayjsStrings.date
    - typingsSlinky.dayjs.dayjsStrings.d
    - typingsSlinky.dayjs.dayjsStrings.M
    - typingsSlinky.dayjs.dayjsStrings.y
    - typingsSlinky.dayjs.dayjsStrings.h
    - typingsSlinky.dayjs.dayjsStrings.m_
    - typingsSlinky.dayjs.dayjsStrings.s
    - typingsSlinky.dayjs.dayjsStrings.ms
  */
  trait OpUnitType extends StObject
  object OpUnitType {
    
    @scala.inline
    def M: typingsSlinky.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: typingsSlinky.dayjs.dayjsStrings.d = "d".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.d]
    
    @scala.inline
    def date: typingsSlinky.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.date]
    
    @scala.inline
    def day: typingsSlinky.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.day]
    
    @scala.inline
    def h: typingsSlinky.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.h]
    
    @scala.inline
    def hour: typingsSlinky.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.hour]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def millisecond: typingsSlinky.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.millisecond]
    
    @scala.inline
    def minute: typingsSlinky.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.minute]
    
    @scala.inline
    def month: typingsSlinky.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.month]
    
    @scala.inline
    def ms: typingsSlinky.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.ms]
    
    @scala.inline
    def s: typingsSlinky.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.s]
    
    @scala.inline
    def second: typingsSlinky.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.second]
    
    @scala.inline
    def w: typingsSlinky.dayjs.dayjsStrings.w = "w".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.w]
    
    @scala.inline
    def week: typingsSlinky.dayjs.dayjsStrings.week = "week".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.week]
    
    @scala.inline
    def y: typingsSlinky.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.y]
    
    @scala.inline
    def year: typingsSlinky.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.year]
  }
  
  type OptionType = Format | String | js.Array[String]
  
  type PluginFunc[T] = js.Function3[
    /* option */ T, 
    /* c */ Instantiable1[/* config */ js.UndefOr[ConfigType], Dayjs], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dayjs.dayjsStrings.quarter
    - typingsSlinky.dayjs.dayjsStrings.Q
    - typingsSlinky.dayjs.dayjsStrings.millisecond
    - typingsSlinky.dayjs.dayjsStrings.second
    - typingsSlinky.dayjs.dayjsStrings.minute
    - typingsSlinky.dayjs.dayjsStrings.hour
    - typingsSlinky.dayjs.dayjsStrings.day
    - typingsSlinky.dayjs.dayjsStrings.month
    - typingsSlinky.dayjs.dayjsStrings.year
    - typingsSlinky.dayjs.dayjsStrings.date
    - typingsSlinky.dayjs.dayjsStrings.d
    - typingsSlinky.dayjs.dayjsStrings.M
    - typingsSlinky.dayjs.dayjsStrings.y
    - typingsSlinky.dayjs.dayjsStrings.h
    - typingsSlinky.dayjs.dayjsStrings.m_
    - typingsSlinky.dayjs.dayjsStrings.s
    - typingsSlinky.dayjs.dayjsStrings.ms
  */
  trait QUnitType extends StObject
  object QUnitType {
    
    @scala.inline
    def M: typingsSlinky.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.M]
    
    @scala.inline
    def Q: typingsSlinky.dayjs.dayjsStrings.Q = "Q".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.Q]
    
    @scala.inline
    def d: typingsSlinky.dayjs.dayjsStrings.d = "d".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.d]
    
    @scala.inline
    def date: typingsSlinky.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.date]
    
    @scala.inline
    def day: typingsSlinky.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.day]
    
    @scala.inline
    def h: typingsSlinky.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.h]
    
    @scala.inline
    def hour: typingsSlinky.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.hour]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def millisecond: typingsSlinky.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.millisecond]
    
    @scala.inline
    def minute: typingsSlinky.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.minute]
    
    @scala.inline
    def month: typingsSlinky.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.month]
    
    @scala.inline
    def ms: typingsSlinky.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.ms]
    
    @scala.inline
    def quarter: typingsSlinky.dayjs.dayjsStrings.quarter = "quarter".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.quarter]
    
    @scala.inline
    def s: typingsSlinky.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.s]
    
    @scala.inline
    def second: typingsSlinky.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.second]
    
    @scala.inline
    def y: typingsSlinky.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.y]
    
    @scala.inline
    def year: typingsSlinky.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dayjs.dayjsStrings.millisecond
    - typingsSlinky.dayjs.dayjsStrings.second
    - typingsSlinky.dayjs.dayjsStrings.minute
    - typingsSlinky.dayjs.dayjsStrings.hour
    - typingsSlinky.dayjs.dayjsStrings.day
    - typingsSlinky.dayjs.dayjsStrings.month
    - typingsSlinky.dayjs.dayjsStrings.year
    - typingsSlinky.dayjs.dayjsStrings.date
    - typingsSlinky.dayjs.dayjsStrings.d
    - typingsSlinky.dayjs.dayjsStrings.M
    - typingsSlinky.dayjs.dayjsStrings.y
    - typingsSlinky.dayjs.dayjsStrings.h
    - typingsSlinky.dayjs.dayjsStrings.m_
    - typingsSlinky.dayjs.dayjsStrings.s
    - typingsSlinky.dayjs.dayjsStrings.ms
  */
  trait UnitType extends StObject
  object UnitType {
    
    @scala.inline
    def M: typingsSlinky.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: typingsSlinky.dayjs.dayjsStrings.d = "d".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.d]
    
    @scala.inline
    def date: typingsSlinky.dayjs.dayjsStrings.date = "date".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.date]
    
    @scala.inline
    def day: typingsSlinky.dayjs.dayjsStrings.day = "day".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.day]
    
    @scala.inline
    def h: typingsSlinky.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.h]
    
    @scala.inline
    def hour: typingsSlinky.dayjs.dayjsStrings.hour = "hour".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.hour]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def millisecond: typingsSlinky.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.millisecond]
    
    @scala.inline
    def minute: typingsSlinky.dayjs.dayjsStrings.minute = "minute".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.minute]
    
    @scala.inline
    def month: typingsSlinky.dayjs.dayjsStrings.month = "month".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.month]
    
    @scala.inline
    def ms: typingsSlinky.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.ms]
    
    @scala.inline
    def s: typingsSlinky.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.s]
    
    @scala.inline
    def second: typingsSlinky.dayjs.dayjsStrings.second = "second".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.second]
    
    @scala.inline
    def y: typingsSlinky.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.y]
    
    @scala.inline
    def year: typingsSlinky.dayjs.dayjsStrings.year = "year".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dayjs.dayjsStrings.d
    - typingsSlinky.dayjs.dayjsStrings.M
    - typingsSlinky.dayjs.dayjsStrings.y
    - typingsSlinky.dayjs.dayjsStrings.h
    - typingsSlinky.dayjs.dayjsStrings.m_
    - typingsSlinky.dayjs.dayjsStrings.s
    - typingsSlinky.dayjs.dayjsStrings.ms
  */
  trait UnitTypeShort extends StObject
  object UnitTypeShort {
    
    @scala.inline
    def M: typingsSlinky.dayjs.dayjsStrings.M = "M".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: typingsSlinky.dayjs.dayjsStrings.d = "d".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.d]
    
    @scala.inline
    def h: typingsSlinky.dayjs.dayjsStrings.h = "h".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.h]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def ms: typingsSlinky.dayjs.dayjsStrings.ms = "ms".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.ms]
    
    @scala.inline
    def s: typingsSlinky.dayjs.dayjsStrings.s = "s".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.s]
    
    @scala.inline
    def y: typingsSlinky.dayjs.dayjsStrings.y = "y".asInstanceOf[typingsSlinky.dayjs.dayjsStrings.y]
  }
  
  type WeekdayNames = js.Tuple7[String, String, String, String, String, String, String]
}
