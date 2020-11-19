package typingsSlinky.blueprintjsDatetime.dateRangeSelectionStrategyMod

import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy")
@js.native
class DateRangeSelectionStrategy () extends js.Object
/* static members */
@JSImport("@blueprintjs/datetime/lib/esm/dateRangeSelectionStrategy", "DateRangeSelectionStrategy")
@js.native
object DateRangeSelectionStrategy extends js.Object {
  
  var createRange: js.Any = js.native
  
  var createRangeForBoundary: js.Any = js.native
  
  var getBoundaryDate: js.Any = js.native
  
  var getDefaultNextState: js.Any = js.native
  
  /**
    * Returns the new date-range and the boundary that would be affected if `day` were clicked. The
    * affected boundary may be different from the provided `boundary` in some cases. For example,
    * clicking a particular boundary's selected date will always deselect it regardless of which
    * `boundary` you provide to this function (because it's simply a more intuitive interaction).
    */
  def getNextState(currentRange: DateRange, day: js.Date, allowSingleDayRange: Boolean): IDateRangeSelectionState = js.native
  def getNextState(currentRange: DateRange, day: js.Date, allowSingleDayRange: Boolean, boundary: Boundary): IDateRangeSelectionState = js.native
  
  var getNextStateForBoundary: js.Any = js.native
  
  var getOtherBoundary: js.Any = js.native
  
  var isOverlappingOtherBoundary: js.Any = js.native
}
