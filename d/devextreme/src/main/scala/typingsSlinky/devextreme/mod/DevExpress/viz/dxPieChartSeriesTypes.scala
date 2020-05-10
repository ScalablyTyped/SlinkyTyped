package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPieChartSeriesTypes extends js.Object {
  /** An object that defines configuration options for chart series. */
  var CommonPieChartSeries: js.UndefOr[dxPieChartSeriesTypesCommonPieChartSeries] = js.native
  /** An object defining a series of the doughnut type. */
  var DoughnutSeries: js.UndefOr[js.Any] = js.native
  /** An object defining a series of the pie type. */
  var PieSeries: js.UndefOr[js.Any] = js.native
}

object dxPieChartSeriesTypes {
  @scala.inline
  def apply(): dxPieChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartSeriesTypes]
  }
  @scala.inline
  implicit class dxPieChartSeriesTypesOps[Self <: dxPieChartSeriesTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonPieChartSeries(value: dxPieChartSeriesTypesCommonPieChartSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPieChartSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonPieChartSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPieChartSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withDoughnutSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoughnutSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoughnutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoughnutSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withPieSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PieSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PieSeries")(js.undefined)
        ret
    }
  }
  
}

