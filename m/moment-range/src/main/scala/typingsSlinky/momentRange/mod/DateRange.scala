package typingsSlinky.momentRange.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.unitOfTime.Diff
import typingsSlinky.momentRange.AnonAdjacent
import typingsSlinky.momentRange.AnonExcludeEnd
import typingsSlinky.momentRange.AnonExcludeStart
import typingsSlinky.momentRange.AnonExclusive
import typingsSlinky.momentRange.AnonExclusiveBoolean
import typingsSlinky.momentRange.AnonStep
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-range", "DateRange")
@js.native
class DateRange () extends js.Object {
  def this(range: String) = this()
  def this(range: js.Tuple2[js.Date | Moment, js.Date | Moment]) = this()
  def this(start: Moment, end: Moment) = this()
  def this(start: Moment, end: js.Date) = this()
  def this(start: js.Date, end: Moment) = this()
  def this(start: js.Date, end: js.Date) = this()
  var end: Moment = js.native
  var start: Moment = js.native
  def add(other: DateRange): DateRange | Null = js.native
  def add(other: DateRange, options: AnonAdjacent): DateRange | Null = js.native
  def adjacent(other: DateRange): Boolean = js.native
  def by(interval: Diff): js.Iterable[Moment] = js.native
  def by(interval: Diff, options: AnonExcludeEnd): js.Iterable[Moment] = js.native
  def by(interval: Diff, options: AnonExclusive): js.Iterable[Moment] = js.native
  def byRange(interval: DateRange): js.Iterable[Moment] = js.native
  def byRange(interval: DateRange, options: AnonExcludeEnd): js.Iterable[Moment] = js.native
  def byRange(interval: DateRange, options: AnonExclusive): js.Iterable[Moment] = js.native
  def center(): Moment = js.native
  def contains(other: Moment): Boolean = js.native
  def contains(other: Moment, options: AnonExcludeStart): Boolean = js.native
  def contains(other: Moment, options: AnonExclusiveBoolean): Boolean = js.native
  def contains(other: DateRange): Boolean = js.native
  def contains(other: DateRange, options: AnonExcludeStart): Boolean = js.native
  def contains(other: DateRange, options: AnonExclusiveBoolean): Boolean = js.native
  def contains(other: Date): Boolean = js.native
  def contains(other: Date, options: AnonExcludeStart): Boolean = js.native
  def contains(other: Date, options: AnonExclusiveBoolean): Boolean = js.native
  def diff(): Double = js.native
  def diff(unit: Diff): Double = js.native
  def diff(unit: Diff, precise: Boolean): Double = js.native
  def duration(): Double = js.native
  def duration(unit: Diff): Double = js.native
  def duration(unit: Diff, precise: Boolean): Double = js.native
  def intersect(other: DateRange): DateRange | Null = js.native
  def isEqual(other: DateRange): Boolean = js.native
  def isSame(other: DateRange): Boolean = js.native
  def overlaps(other: DateRange): Boolean = js.native
  def overlaps(other: DateRange, options: AnonAdjacent): Boolean = js.native
  def reverseBy(interval: Diff): js.Iterable[Moment] = js.native
  def reverseBy(interval: Diff, options: AnonExclusive): js.Iterable[Moment] = js.native
  def reverseBy(interval: Diff, options: AnonStep): js.Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange): js.Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange, options: AnonExclusive): js.Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange, options: AnonStep): js.Iterable[Moment] = js.native
  def snapTo(interval: Diff): DateRange = js.native
  def subtract(other: DateRange): js.Array[DateRange] = js.native
  def toDate(): js.Tuple2[js.Date, js.Date] = js.native
}

