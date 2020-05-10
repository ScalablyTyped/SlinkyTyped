package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicChartSpec extends js.Object {
  var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.native
  var chartType: js.UndefOr[String] = js.native
  var compareMode: js.UndefOr[String] = js.native
  var domains: js.UndefOr[js.Array[BasicChartDomain]] = js.native
  var headerCount: js.UndefOr[Double] = js.native
  var interpolateNulls: js.UndefOr[Boolean] = js.native
  var legendPosition: js.UndefOr[String] = js.native
  var lineSmoothing: js.UndefOr[Boolean] = js.native
  var series: js.UndefOr[js.Array[BasicChartSeries]] = js.native
  var stackedType: js.UndefOr[String] = js.native
  var threeDimensional: js.UndefOr[Boolean] = js.native
}

object BasicChartSpec {
  @scala.inline
  def apply(): BasicChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartSpec]
  }
  @scala.inline
  implicit class BasicChartSpecOps[Self <: BasicChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Array[BasicChartAxis]): Self = {
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
    @scala.inline
    def withChartType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: js.Array[BasicChartDomain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolateNulls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateNulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolateNulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateNulls")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSmoothing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSmoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSmoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[BasicChartSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreeDimensional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDimensional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreeDimensional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDimensional")(js.undefined)
        ret
    }
  }
  
}

