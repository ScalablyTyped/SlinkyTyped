package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypes extends js.Object {
  /** An object that defines configuration options for polar chart series. */
  var CommonPolarChartSeries: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeries] = js.native
  /** An object defining a series of the area type. */
  var areapolarseries: js.UndefOr[dxPolarChartSeriesTypesAreapolarseries] = js.native
  /** An object defining a series of the bar type. */
  var barpolarseries: js.UndefOr[dxPolarChartSeriesTypesBarpolarseries] = js.native
  /** An object defining a series of the line type. */
  var linepolarseries: js.UndefOr[dxPolarChartSeriesTypesLinepolarseries] = js.native
  /** An object defining a series of the scatter type. */
  var scatterpolarseries: js.UndefOr[js.Any] = js.native
  /** An object defining a series of the stackedBar type. */
  var stackedbarpolarseries: js.UndefOr[dxPolarChartSeriesTypesStackedbarpolarseries] = js.native
}

object dxPolarChartSeriesTypes {
  @scala.inline
  def apply(): dxPolarChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypes]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesOps[Self <: dxPolarChartSeriesTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonPolarChartSeries(value: dxPolarChartSeriesTypesCommonPolarChartSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPolarChartSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonPolarChartSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPolarChartSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withAreapolarseries(value: dxPolarChartSeriesTypesAreapolarseries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areapolarseries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreapolarseries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areapolarseries")(js.undefined)
        ret
    }
    @scala.inline
    def withBarpolarseries(value: dxPolarChartSeriesTypesBarpolarseries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barpolarseries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarpolarseries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barpolarseries")(js.undefined)
        ret
    }
    @scala.inline
    def withLinepolarseries(value: dxPolarChartSeriesTypesLinepolarseries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linepolarseries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinepolarseries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linepolarseries")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterpolarseries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterpolarseries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterpolarseries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterpolarseries")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedbarpolarseries(value: dxPolarChartSeriesTypesStackedbarpolarseries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedbarpolarseries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedbarpolarseries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedbarpolarseries")(js.undefined)
        ret
    }
  }
  
}

