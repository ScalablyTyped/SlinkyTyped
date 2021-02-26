package typingsSlinky.luxon.mod

import typingsSlinky.luxon.anon.Separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luxon", "Interval")
@js.native
class Interval () extends StObject {
  
  def abutsEnd(other: Interval): Boolean = js.native
  
  def abutsStart(other: Interval): Boolean = js.native
  
  def contains(dateTime: DateTime): Boolean = js.native
  
  def count(): Double = js.native
  def count(unit: DurationUnit): Double = js.native
  
  def difference(intervals: Interval*): js.Array[Interval] = js.native
  
  def divideEqually(): js.Array[Interval] = js.native
  def divideEqually(numberOfParts: Double): js.Array[Interval] = js.native
  
  var end: DateTime = js.native
  
  def engulfs(other: Interval): Boolean = js.native
  
  def equals(other: Interval): Boolean = js.native
  
  def hasSame(unit: DurationUnit): Boolean = js.native
  
  def intersection(other: Interval): Interval | Null = js.native
  
  var invalidExplanation: String | Null = js.native
  
  var invalidReason: String | Null = js.native
  
  def isAfter(dateTime: DateTime): Boolean = js.native
  
  def isBefore(dateTime: DateTime): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  var isValid: Boolean = js.native
  
  def length(): Double = js.native
  def length(unit: DurationUnit): Double = js.native
  
  def mapEndpoints(cb: js.Function1[/* d */ DateTime, DateTime]): Interval = js.native
  
  def overlaps(other: Interval): Boolean = js.native
  
  def set(values: IntervalObject): Interval = js.native
  
  def splitAt(dateTimes: DateTime*): js.Array[Interval] = js.native
  
  def splitBy(duration: Double): js.Array[Interval] = js.native
  def splitBy(duration: Duration): js.Array[Interval] = js.native
  def splitBy(duration: DurationObject): js.Array[Interval] = js.native
  
  var start: DateTime = js.native
  
  def toDuration(): Duration = js.native
  def toDuration(unit: js.UndefOr[scala.Nothing], options: DiffOptions): Duration = js.native
  def toDuration(unit: js.Array[DurationUnit]): Duration = js.native
  def toDuration(unit: js.Array[DurationUnit], options: DiffOptions): Duration = js.native
  def toDuration(unit: DurationUnit): Duration = js.native
  def toDuration(unit: DurationUnit, options: DiffOptions): Duration = js.native
  
  def toFormat(dateFormat: String): String = js.native
  def toFormat(dateFormat: String, options: Separator): String = js.native
  
  def toISO(): String = js.native
  def toISO(options: ToISOTimeOptions): String = js.native
  
  def toISODate(): String = js.native
  
  def toISOTime(): String = js.native
  def toISOTime(options: ToISOTimeOptions): String = js.native
  
  def union(other: Interval): Interval = js.native
}
/* static members */
object Interval {
  
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: js.Date, duration: Double): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: js.Date, duration: Duration): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: js.Date, duration: DurationObject): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: DateObject, duration: Double): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: DateObject, duration: Duration): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: DateObject, duration: DurationObject): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: DateTime, duration: Double): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: DateTime, duration: Duration): Interval = js.native
  @JSImport("luxon", "Interval.after")
  @js.native
  def after(start: DateTime, duration: DurationObject): Interval = js.native
  
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: js.Date, duration: Double): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: js.Date, duration: Duration): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: js.Date, duration: DurationObject): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: DateObject, duration: Double): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: DateObject, duration: Duration): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: DateObject, duration: DurationObject): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: DateTime, duration: Double): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: DateTime, duration: Duration): Interval = js.native
  @JSImport("luxon", "Interval.before")
  @js.native
  def before(end: DateTime, duration: DurationObject): Interval = js.native
  
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: js.Date, end: js.Date): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: js.Date, end: DateObject): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: js.Date, end: DateTime): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: DateObject, end: js.Date): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: DateObject, end: DateObject): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: DateObject, end: DateTime): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: DateTime, end: js.Date): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: DateTime, end: DateObject): Interval = js.native
  @JSImport("luxon", "Interval.fromDateTimes")
  @js.native
  def fromDateTimes(start: DateTime, end: DateTime): Interval = js.native
  
  @JSImport("luxon", "Interval.fromISO")
  @js.native
  def fromISO(string: String): Interval = js.native
  @JSImport("luxon", "Interval.fromISO")
  @js.native
  def fromISO(string: String, options: DateTimeOptions): Interval = js.native
  
  @JSImport("luxon", "Interval.invalid")
  @js.native
  def invalid(): Interval = js.native
  @JSImport("luxon", "Interval.invalid")
  @js.native
  def invalid(reason: String): Interval = js.native
  
  @JSImport("luxon", "Interval.isInterval")
  @js.native
  def isInterval(o: js.Any): /* is luxon.luxon.Interval */ Boolean = js.native
  
  @JSImport("luxon", "Interval.merge")
  @js.native
  def merge(intervals: js.Array[Interval]): js.Array[Interval] = js.native
  
  @JSImport("luxon", "Interval.xor")
  @js.native
  def xor(intervals: js.Array[Interval]): js.Array[Interval] = js.native
}
