package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.chart.series.IBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnChart extends IBar {
  /** [Config Option] (String) */
  @JSName("axis")
  var axis_IColumnChart: js.UndefOr[String] = js.native
}

object IColumnChart {
  @scala.inline
  def apply(): IColumnChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnChart]
  }
  @scala.inline
  implicit class IColumnChartOps[Self <: IColumnChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
  }
  
}

