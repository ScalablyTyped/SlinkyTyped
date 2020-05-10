package typingsSlinky.blueprintjsDatetime.dateRangeSelectionStrategyMod

import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsDatetime.dateUtilsMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateRangeSelectionState extends js.Object {
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
  implicit class IDateRangeSelectionStateOps[Self <: IDateRangeSelectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateRange(value: DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundary(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
  }
  
}

