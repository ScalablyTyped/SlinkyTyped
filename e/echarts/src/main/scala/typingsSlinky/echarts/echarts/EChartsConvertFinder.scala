package typingsSlinky.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsConvertFinder extends js.Object {
  var geoId: js.UndefOr[String] = js.native
  var geoIndex: js.UndefOr[Double] = js.native
  var geoName: js.UndefOr[String] = js.native
  var gridId: js.UndefOr[String] = js.native
  var gridIndex: js.UndefOr[Double] = js.native
  var gridName: js.UndefOr[String] = js.native
  var seriesId: js.UndefOr[String] = js.native
  var seriesIndex: js.UndefOr[Double] = js.native
  var seriesName: js.UndefOr[String] = js.native
  var xAxisId: js.UndefOr[String] = js.native
  var xAxisIndex: js.UndefOr[Double] = js.native
  var xAxisName: js.UndefOr[String] = js.native
  var yAxisId: js.UndefOr[String] = js.native
  var yAxisIndex: js.UndefOr[Double] = js.native
  var yAxisName: js.UndefOr[String] = js.native
}

object EChartsConvertFinder {
  @scala.inline
  def apply(): EChartsConvertFinder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsConvertFinder]
  }
  @scala.inline
  implicit class EChartsConvertFinderOps[Self <: EChartsConvertFinder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoId")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoName")(js.undefined)
        ret
    }
    @scala.inline
    def withGridId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridId")(js.undefined)
        ret
    }
    @scala.inline
    def withGridIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGridName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridName")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisId")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisId")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(js.undefined)
        ret
    }
  }
  
}

