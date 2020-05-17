package typingsSlinky.flexmonster.mod

import typingsSlinky.flexmonster.anon.Column
import typingsSlinky.flexmonster.anon.DrillAll
import typingsSlinky.flexmonster.anon.ExpandAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slice extends js.Object {
  var columns: js.UndefOr[js.Array[Hierarchy]] = js.native
  var drillThrough: js.UndefOr[js.Array[String]] = js.native
  var drills: js.UndefOr[DrillAll] = js.native
  var expands: js.UndefOr[ExpandAll] = js.native
  var flatOrder: js.UndefOr[js.Array[String]] = js.native
  var measures: js.UndefOr[js.Array[Measure]] = js.native
  var reportFilters: js.UndefOr[js.Array[Hierarchy]] = js.native
  var rows: js.UndefOr[js.Array[Hierarchy]] = js.native
  var sorting: js.UndefOr[Column] = js.native
}

object Slice {
  @scala.inline
  def apply(): Slice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slice]
  }
  @scala.inline
  implicit class SliceOps[Self <: Slice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Hierarchy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillThrough(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withDrills(value: DrillAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrills: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drills")(js.undefined)
        ret
    }
    @scala.inline
    def withExpands(value: ExpandAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expands")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasures(value: js.Array[Measure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.undefined)
        ret
    }
    @scala.inline
    def withReportFilters(value: js.Array[Hierarchy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Hierarchy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
  }
  
}

