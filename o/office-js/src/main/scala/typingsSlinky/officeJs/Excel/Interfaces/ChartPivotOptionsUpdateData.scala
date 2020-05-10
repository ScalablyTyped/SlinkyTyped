package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPivotOptions object, for use in `chartPivotOptions.set({ ... })`. */
@js.native
trait ChartPivotOptionsUpdateData extends js.Object {
  /**
    *
    * Specifies whether or not to display the axis field buttons on a PivotChart. The ShowAxisFieldButtons property corresponds to the "Show Axis Field Buttons" command on the "Field Buttons" drop-down list of the "Analyze" tab, which is available when a PivotChart is selected.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showAxisFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not to display the legend field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLegendFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not to display the report filter field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showReportFilterFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not to display the show value field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showValueFieldButtons: js.UndefOr[Boolean] = js.native
}

object ChartPivotOptionsUpdateData {
  @scala.inline
  def apply(): ChartPivotOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPivotOptionsUpdateData]
  }
  @scala.inline
  implicit class ChartPivotOptionsUpdateDataOps[Self <: ChartPivotOptionsUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowAxisFieldButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisFieldButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAxisFieldButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisFieldButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLegendFieldButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendFieldButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegendFieldButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendFieldButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowReportFilterFieldButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReportFilterFieldButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReportFilterFieldButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReportFilterFieldButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowValueFieldButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValueFieldButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowValueFieldButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValueFieldButtons")(js.undefined)
        ret
    }
  }
  
}

