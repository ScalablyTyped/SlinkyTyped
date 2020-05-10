package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.ChartDeactivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartDeactivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is deactivated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartDeactivated = js.native
  /**
    *
    * Gets the id of the worksheet in which the chart is deactivated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String = js.native
}

object ChartDeactivatedEventArgs {
  @scala.inline
  def apply(chartId: String, `type`: ChartDeactivated, worksheetId: String): ChartDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDeactivatedEventArgs]
  }
  @scala.inline
  implicit class ChartDeactivatedEventArgsOps[Self <: ChartDeactivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ChartDeactivated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorksheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

