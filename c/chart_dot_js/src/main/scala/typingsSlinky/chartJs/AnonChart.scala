package typingsSlinky.chartJs

import typingsSlinky.chartJs.mod.Chart
import typingsSlinky.chartJs.mod.ChartDataSets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChart extends js.Object {
  var chart: js.UndefOr[Chart] = js.native
  var dataIndex: js.UndefOr[Double] = js.native
  var dataset: js.UndefOr[ChartDataSets] = js.native
  var datasetIndex: js.UndefOr[Double] = js.native
}

object AnonChart {
  @scala.inline
  def apply(): AnonChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChart]
  }
  @scala.inline
  implicit class AnonChartOps[Self <: AnonChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: ChartDataSets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetIndex")(js.undefined)
        ret
    }
  }
  
}

