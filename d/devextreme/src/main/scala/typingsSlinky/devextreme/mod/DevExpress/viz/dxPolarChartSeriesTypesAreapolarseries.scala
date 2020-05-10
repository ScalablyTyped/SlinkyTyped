package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.excludePoints
import typingsSlinky.devextreme.devextremeStrings.includePoints
import typingsSlinky.devextreme.devextremeStrings.nearestPoint
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypesAreapolarseries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** Specifies series elements to be highlighted when a user points to the series. */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesAreapolarseries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** An object defining configuration options for points in line and area series. */
  @JSName("point")
  var point_dxPolarChartSeriesTypesAreapolarseries: js.UndefOr[dxPolarChartSeriesTypesAreapolarseriesPoint] = js.native
  /** Specifies series elements to be highlighted when a user selects the series. */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesAreapolarseries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxPolarChartSeriesTypesAreapolarseries {
  @scala.inline
  def apply(): dxPolarChartSeriesTypesAreapolarseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesAreapolarseries]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesAreapolarseriesOps[Self <: dxPolarChartSeriesTypesAreapolarseries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: dxPolarChartSeriesTypesAreapolarseriesPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: includePoints | excludePoints | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
  }
  
}

