package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangeSelectionStrategyMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy")
  @js.native
  class DateRangeSelectionStrategy () extends StObject
  /* static members */
  object DateRangeSelectionStrategy {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.createRange")
    @js.native
    def createRange: js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.createRangeForBoundary")
    @js.native
    def createRangeForBoundary: js.Any = js.native
    @scala.inline
    def createRangeForBoundary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRangeForBoundary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def createRange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRange")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getBoundaryDate")
    @js.native
    def getBoundaryDate: js.Any = js.native
    @scala.inline
    def getBoundaryDate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBoundaryDate")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getDefaultNextState")
    @js.native
    def getDefaultNextState: js.Any = js.native
    @scala.inline
    def getDefaultNextState_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultNextState")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the new date-range and the boundary that would be affected if `day` were clicked. The
      * affected boundary may be different from the provided `boundary` in some cases. For example,
      * clicking a particular boundary's selected date will always deselect it regardless of which
      * `boundary` you provide to this function (because it's simply a more intuitive interaction).
      */
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getNextState")
    @js.native
    def getNextState(currentRange: DateRange, day: js.Date, allowSingleDayRange: Boolean): IDateRangeSelectionState = js.native
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getNextState")
    @js.native
    def getNextState(currentRange: DateRange, day: js.Date, allowSingleDayRange: Boolean, boundary: Boundary): IDateRangeSelectionState = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getNextStateForBoundary")
    @js.native
    def getNextStateForBoundary: js.Any = js.native
    @scala.inline
    def getNextStateForBoundary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getNextStateForBoundary")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.getOtherBoundary")
    @js.native
    def getOtherBoundary: js.Any = js.native
    @scala.inline
    def getOtherBoundary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOtherBoundary")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy.isOverlappingOtherBoundary")
    @js.native
    def isOverlappingOtherBoundary: js.Any = js.native
    @scala.inline
    def isOverlappingOtherBoundary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOverlappingOtherBoundary")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDateRangeSelectionState extends StObject {
    
    /**
      * The boundary that would be modified by clicking the provided `day`.
      */
    var boundary: js.UndefOr[Boundary] = js.native
    
    /**
      * The date range that would be selected after clicking the provided `day`.
      */
    var dateRange: DateRange = js.native
  }
  object IDateRangeSelectionState {
    
    @scala.inline
    def apply(dateRange: DateRange): IDateRangeSelectionState = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateRangeSelectionState]
    }
    
    @scala.inline
    implicit class IDateRangeSelectionStateMutableBuilder[Self <: IDateRangeSelectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    }
  }
}
