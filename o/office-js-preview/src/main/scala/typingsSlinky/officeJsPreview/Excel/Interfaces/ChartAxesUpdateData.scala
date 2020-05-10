package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxes object, for use in `chartAxes.set({ ... })`. */
@js.native
trait ChartAxesUpdateData extends js.Object {
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisUpdateData] = js.native
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisUpdateData] = js.native
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisUpdateData] = js.native
}

object ChartAxesUpdateData {
  @scala.inline
  def apply(): ChartAxesUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesUpdateData]
  }
  @scala.inline
  implicit class ChartAxesUpdateDataOps[Self <: ChartAxesUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryAxis(value: ChartAxisUpdateData): Self = {
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
    def withSeriesAxis(value: ChartAxisUpdateData): Self = {
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
    def withValueAxis(value: ChartAxisUpdateData): Self = {
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

