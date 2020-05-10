package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAxes.toJSON()`. */
@js.native
trait ChartAxesData extends js.Object {
  /**
    *
    * Represents the category axis in a chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisData] = js.native
  /**
    *
    * Represents the series axis of a 3-dimensional chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisData] = js.native
  /**
    *
    * Represents the value axis in an axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisData] = js.native
}

object ChartAxesData {
  @scala.inline
  def apply(): ChartAxesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesData]
  }
  @scala.inline
  implicit class ChartAxesDataOps[Self <: ChartAxesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryAxis(value: ChartAxisData): Self = {
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
    def withSeriesAxis(value: ChartAxisData): Self = {
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
    def withValueAxis(value: ChartAxisData): Self = {
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

