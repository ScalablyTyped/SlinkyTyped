package typingsSlinky.momentRange.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.unitOfTime.Diff
import typingsSlinky.momentRange.anon.Adjacent
import typingsSlinky.momentRange.anon.ExcludeEnd
import typingsSlinky.momentRange.anon.ExcludeStart
import typingsSlinky.momentRange.anon.Exclusive
import typingsSlinky.momentRange.anon.Step
import typingsSlinky.momentRange.anon.`0`
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
  def add(other: DateRange, options: Adjacent): DateRange | Null = js.native
  def adjacent(other: DateRange): Boolean = js.native
  def by(interval: Diff): js.Iterable[Moment] = js.native
  def by(interval: Diff, options: ExcludeEnd): js.Iterable[Moment] = js.native
  def by(interval: Diff, options: Exclusive): js.Iterable[Moment] = js.native
  def byRange(interval: DateRange): js.Iterable[Moment] = js.native
  def byRange(interval: DateRange, options: ExcludeEnd): js.Iterable[Moment] = js.native
  def byRange(interval: DateRange, options: Exclusive): js.Iterable[Moment] = js.native
  def center(): Moment = js.native
  def contains(other: Moment): Boolean = js.native
  def contains(other: Moment, options: ExcludeStart): Boolean = js.native
  def contains(other: Moment, options: `0`): Boolean = js.native
  def contains(other: DateRange): Boolean = js.native
  def contains(other: DateRange, options: ExcludeStart): Boolean = js.native
  def contains(other: DateRange, options: `0`): Boolean = js.native
  def contains(other: js.Date): Boolean = js.native
  def contains(other: js.Date, options: ExcludeStart): Boolean = js.native
  def contains(other: js.Date, options: `0`): Boolean = js.native
  def diff(): Double = js.native
  def diff(unit: js.UndefOr[scala.Nothing], precise: Boolean): Double = js.native
  def diff(unit: Diff): Double = js.native
  def diff(unit: Diff, precise: Boolean): Double = js.native
  def duration(): Double = js.native
  def duration(unit: js.UndefOr[scala.Nothing], precise: Boolean): Double = js.native
  def duration(unit: Diff): Double = js.native
  def duration(unit: Diff, precise: Boolean): Double = js.native
  def intersect(other: DateRange): DateRange | Null = js.native
  def isEqual(other: DateRange): Boolean = js.native
  def isSame(other: DateRange): Boolean = js.native
  def overlaps(other: DateRange): Boolean = js.native
  def overlaps(other: DateRange, options: Adjacent): Boolean = js.native
  def reverseBy(interval: Diff): js.Iterable[Moment] = js.native
  def reverseBy(interval: Diff, options: Exclusive): js.Iterable[Moment] = js.native
  def reverseBy(interval: Diff, options: Step): js.Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange): js.Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange, options: Exclusive): js.Iterable[Moment] = js.native
  def reverseByRange(interval: DateRange, options: Step): js.Iterable[Moment] = js.native
  def snapTo(interval: Diff): DateRange = js.native
  def subtract(other: DateRange): js.Array[DateRange] = js.native
  def toDate(): js.Tuple2[js.Date, js.Date] = js.native
}

