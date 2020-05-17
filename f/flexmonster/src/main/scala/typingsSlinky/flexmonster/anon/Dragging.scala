package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dragging extends js.Object {
  var dragging: js.UndefOr[Boolean] = js.native
  var drillThroughMaxRows: js.UndefOr[Double] = js.native
  var grandTotalsPosition: js.UndefOr[String] = js.native
  var showAutoCalculationBar: js.UndefOr[Boolean] = js.native
  var showEmptyValues: js.UndefOr[Boolean] = js.native
  var showFilter: js.UndefOr[Boolean] = js.native
  var showGrandTotals: js.UndefOr[String] = js.native
  var showHeaders: js.UndefOr[Boolean] = js.native
  var showHierarchies: js.UndefOr[Boolean] = js.native
  var showHierarchyCaptions: js.UndefOr[Boolean] = js.native
  var showReportFiltersArea: js.UndefOr[Boolean] = js.native
  var showTotals: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Dragging {
  @scala.inline
  def apply(): Dragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dragging]
  }
  @scala.inline
  implicit class DraggingOps[Self <: Dragging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillThroughMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThroughMaxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillThroughMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThroughMaxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGrandTotalsPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grandTotalsPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrandTotalsPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grandTotalsPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAutoCalculationBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAutoCalculationBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAutoCalculationBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAutoCalculationBar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmptyValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmptyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGrandTotals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrandTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGrandTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrandTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHierarchies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHierarchies")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHierarchyCaptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHierarchyCaptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHierarchyCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHierarchyCaptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowReportFiltersArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReportFiltersArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReportFiltersArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReportFiltersArea")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

