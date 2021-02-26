package typingsSlinky.momentRange

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.unitOfTime.Diff
import typingsSlinky.momentRange.anon.Adjacent
import typingsSlinky.momentRange.anon.ExcludeEnd
import typingsSlinky.momentRange.anon.ExcludeStart
import typingsSlinky.momentRange.anon.Exclusive
import typingsSlinky.momentRange.anon.FnCall
import typingsSlinky.momentRange.anon.MomentRangeNoneinpundefin
import typingsSlinky.momentRange.anon.Step
import typingsSlinky.momentRange.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-range", "DateRange")
  @js.native
  class DateRange () extends StObject {
    def this(range: String) = this()
    def this(range: js.Tuple2[js.Date | Moment, js.Date | Moment]) = this()
    def this(start: js.Date, end: js.Date) = this()
    def this(start: js.Date, end: Moment) = this()
    def this(start: Moment, end: js.Date) = this()
    def this(start: Moment, end: Moment) = this()
    
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
    
    def contains(other: js.Date): Boolean = js.native
    def contains(other: js.Date, options: ExcludeStart): Boolean = js.native
    def contains(other: js.Date, options: `0`): Boolean = js.native
    def contains(other: Moment): Boolean = js.native
    def contains(other: Moment, options: ExcludeStart): Boolean = js.native
    def contains(other: Moment, options: `0`): Boolean = js.native
    def contains(other: DateRange): Boolean = js.native
    def contains(other: DateRange, options: ExcludeStart): Boolean = js.native
    def contains(other: DateRange, options: `0`): Boolean = js.native
    
    def diff(): Double = js.native
    def diff(unit: js.UndefOr[scala.Nothing], precise: Boolean): Double = js.native
    def diff(unit: Diff): Double = js.native
    def diff(unit: Diff, precise: Boolean): Double = js.native
    
    def duration(): Double = js.native
    def duration(unit: js.UndefOr[scala.Nothing], precise: Boolean): Double = js.native
    def duration(unit: Diff): Double = js.native
    def duration(unit: Diff, precise: Boolean): Double = js.native
    
    var end: Moment = js.native
    
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
    
    var start: Moment = js.native
    
    def subtract(other: DateRange): js.Array[DateRange] = js.native
    
    def toDate(): js.Tuple2[js.Date, js.Date] = js.native
  }
  
  @JSImport("moment-range", "extendMoment")
  @js.native
  def extendMoment(momentClass: FnCall): MomentRangeNoneinpundefin = js.native
  
  @js.native
  trait MomentRange extends MomentRangeStaticMethods {
    
    def apply(args: js.Any*): MomentRangeStaticMethods with Moment = js.native
  }
  
  @js.native
  trait MomentRangeStaticMethods extends StObject {
    
    // @deprecated 4.0.0
    def parseZoneRange(isoTimeInterval: String): DateRange = js.native
    
    def range(): DateRange = js.native
    def range(range: String): DateRange = js.native
    def range(range: js.Tuple2[js.Date | Moment, js.Date | Moment]): DateRange = js.native
    def range(start: js.Date, end: js.Date): DateRange = js.native
    def range(start: js.Date, end: Moment): DateRange = js.native
    def range(start: Moment, end: js.Date): DateRange = js.native
    def range(start: Moment, end: Moment): DateRange = js.native
    
    def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
    
    def rangeFromInterval(interval: Diff): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: js.Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: Moment): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: js.Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
  }
  
  /* augmented module */
  object momentAugmentingMod {
    
    @js.native
    trait Moment extends StObject {
      
      def isRange(range: js.Any): Boolean = js.native
      
      def within(range: DateRange): Boolean = js.native
    }
    object Moment {
      
      @scala.inline
      def apply(isRange: js.Any => Boolean, within: DateRange => Boolean): typingsSlinky.momentRange.mod.momentAugmentingMod.Moment = {
        val __obj = js.Dynamic.literal(isRange = js.Any.fromFunction1(isRange), within = js.Any.fromFunction1(within))
        __obj.asInstanceOf[typingsSlinky.momentRange.mod.momentAugmentingMod.Moment]
      }
      
      @scala.inline
      implicit class MomentMutableBuilder[Self <: typingsSlinky.momentRange.mod.momentAugmentingMod.Moment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsRange(value: js.Any => Boolean): Self = StObject.set(x, "isRange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWithin(value: DateRange => Boolean): Self = StObject.set(x, "within", js.Any.fromFunction1(value))
      }
    }
  }
}
