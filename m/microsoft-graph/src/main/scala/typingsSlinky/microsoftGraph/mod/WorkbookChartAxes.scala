package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartAxes extends Entity {
  // Represents the category axis in a chart. Read-only.
  var categoryAxis: js.UndefOr[WorkbookChartAxis] = js.native
  // Represents the series axis of a 3-dimensional chart. Read-only.
  var seriesAxis: js.UndefOr[WorkbookChartAxis] = js.native
  // Represents the value axis in an axis. Read-only.
  var valueAxis: js.UndefOr[WorkbookChartAxis] = js.native
}

object WorkbookChartAxes {
  @scala.inline
  def apply(): WorkbookChartAxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxes]
  }
  @scala.inline
  implicit class WorkbookChartAxesOps[Self <: WorkbookChartAxes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryAxis(value: WorkbookChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesAxis(value: WorkbookChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAxis(value: WorkbookChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(js.undefined)
        ret
    }
  }
  
}

