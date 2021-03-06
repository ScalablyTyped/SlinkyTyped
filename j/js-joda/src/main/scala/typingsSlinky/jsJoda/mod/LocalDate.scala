package typingsSlinky.jsJoda.mod

import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "LocalDate")
@js.native
class LocalDate protected () extends ChronoLocalDate {
  
  def atStartOfDay(): LocalDateTime = js.native
  def atStartOfDay(zone: ZoneId): ZonedDateTime = js.native
  
  def atStartOfDayWithZone(zone: ZoneId): ZonedDateTime = js.native
  
  def atTime(hour: Double, minute: Double): LocalDateTime = js.native
  def atTime(hour: Double, minute: Double, second: js.UndefOr[scala.Nothing], nanoOfSecond: Double): LocalDateTime = js.native
  def atTime(hour: Double, minute: Double, second: Double): LocalDateTime = js.native
  def atTime(hour: Double, minute: Double, second: Double, nanoOfSecond: Double): LocalDateTime = js.native
  def atTime(time: LocalTime): LocalDateTime = js.native
  
  def chronology(): Chronology = js.native
  
  def compareTo(other: LocalDate): Double = js.native
  
  def dayOfMonth(): Double = js.native
  
  def dayOfWeek(): DayOfWeek = js.native
  
  def dayOfYear(): Double = js.native
  
  def equals(otherDate: js.Any): Boolean = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def isAfter(other: LocalDate): Boolean = js.native
  
  def isBefore(other: LocalDate): Boolean = js.native
  
  def isEqual(other: LocalDate): Boolean = js.native
  
  def isLeapYear(): Boolean = js.native
  
  def isoWeekOfWeekyear(): Double = js.native
  
  //implemented in IsoFields.js
  def isoWeekyear(): Double = js.native
  
  //implemented in IsoFields.js
  def lengthOfMonth(): Double = js.native
  
  def lengthOfYear(): Double = js.native
  
  def minus(amountToSubtract: Double, unit: TemporalUnit): LocalDate = js.native
  def minus(amount: TemporalAmount): LocalDate = js.native
  
  def minusDays(daysToSubtract: Double): LocalDate = js.native
  
  def minusMonths(monthsToSubtract: Double): LocalDate = js.native
  
  def minusWeeks(weeksToSubtract: Double): LocalDate = js.native
  
  def minusYears(yearsToSubtract: Double): LocalDate = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def plus(amountToAdd: Double, unit: TemporalUnit): LocalDate = js.native
  def plus(amount: TemporalAmount): LocalDate = js.native
  
  def plusDays(daysToAdd: Double): LocalDate = js.native
  
  def plusMonths(monthsToAdd: Double): LocalDate = js.native
  
  def plusWeeks(weeksToAdd: Double): LocalDate = js.native
  
  def plusYears(yearsToAdd: Double): LocalDate = js.native
  
  def toEpochDay(): Double = js.native
  
  def toJSON(): String = js.native
  
  def until(endDate: TemporalAccessor): Period = js.native
  def until(endExclusive: TemporalAccessor, unit: TemporalUnit): Double = js.native
  
  def `with`(adjuster: TemporalAdjuster): LocalDate = js.native
  def `with`(fieldOrAdjuster: TemporalField, newValue: Number): LocalDate = js.native
  
  def withDayOfMonth(dayOfMonth: Double): LocalDate = js.native
  
  def withDayOfYear(dayOfYear: Double): LocalDate = js.native
  
  def withFieldAndValue(field: TemporalField, newValue: Double): LocalDate = js.native
  
  def withMonth(month: Double): LocalDate = js.native
  def withMonth(month: Month): LocalDate = js.native
  
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDate = js.native
  
  def withYear(year: Double): LocalDate = js.native
  
  def year(): Double = js.native
}
object LocalDate {
  
  @JSImport("js-joda", "LocalDate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDate.EPOCH_0")
  @js.native
  def EPOCH_0: LocalDate = js.native
  @scala.inline
  def EPOCH_0_=(x: LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH_0")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "LocalDate.MAX")
  @js.native
  def MAX: LocalDate = js.native
  @scala.inline
  def MAX_=(x: LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "LocalDate.MIN")
  @js.native
  def MIN: LocalDate = js.native
  @scala.inline
  def MIN_=(x: LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "LocalDate.from")
  @js.native
  def from(temporal: TemporalAccessor): LocalDate = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDate.now")
  @js.native
  def now(): LocalDate = js.native
  @JSImport("js-joda", "LocalDate.now")
  @js.native
  def now(clockOrZone: Clock): LocalDate = js.native
  @JSImport("js-joda", "LocalDate.now")
  @js.native
  def now(clockOrZone: ZoneId): LocalDate = js.native
  
  @JSImport("js-joda", "LocalDate.of")
  @js.native
  def of(year: Double, month: Double, dayOfMonth: Double): LocalDate = js.native
  /* static member */
  @JSImport("js-joda", "LocalDate.of")
  @js.native
  def of(year: Double, month: Month, dayOfMonth: Double): LocalDate = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDate.ofEpochDay")
  @js.native
  def ofEpochDay(epochDay: Double): LocalDate = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDate.ofInstant")
  @js.native
  def ofInstant(instant: Instant): LocalDate = js.native
  @JSImport("js-joda", "LocalDate.ofInstant")
  @js.native
  def ofInstant(instant: Instant, zoneId: ZoneId): LocalDate = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDate.ofYearDay")
  @js.native
  def ofYearDay(year: Double, dayOfYear: Double): LocalDate = js.native
  
  /* static member */
  @JSImport("js-joda", "LocalDate.parse")
  @js.native
  def parse(text: String): LocalDate = js.native
  @JSImport("js-joda", "LocalDate.parse")
  @js.native
  def parse(text: String, formatter: DateTimeFormatter): LocalDate = js.native
}
