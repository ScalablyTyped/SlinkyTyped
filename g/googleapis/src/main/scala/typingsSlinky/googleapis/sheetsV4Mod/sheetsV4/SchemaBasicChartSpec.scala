package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for a basic chart.  See BasicChartType for the list of
  * charts this supports.
  */
@js.native
trait SchemaBasicChartSpec extends js.Object {
  /**
    * The axis on the chart.
    */
  var axis: js.UndefOr[js.Array[SchemaBasicChartAxis]] = js.native
  /**
    * The type of the chart.
    */
  var chartType: js.UndefOr[String] = js.native
  /**
    * The behavior of tooltips and data highlighting when hovering on data and
    * chart area.
    */
  var compareMode: js.UndefOr[String] = js.native
  /**
    * The domain of data this is charting. Only a single domain is supported.
    */
  var domains: js.UndefOr[js.Array[SchemaBasicChartDomain]] = js.native
  /**
    * The number of rows or columns in the data that are &quot;headers&quot;.
    * If not set, Google Sheets will guess how many rows are headers based on
    * the data.  (Note that BasicChartAxis.title may override the axis title
    * inferred from the header values.)
    */
  var headerCount: js.UndefOr[Double] = js.native
  /**
    * If some values in a series are missing, gaps may appear in the chart
    * (e.g, segments of lines in a line chart will be missing).  To eliminate
    * these gaps set this to true. Applies to Line, Area, and Combo charts.
    */
  var interpolateNulls: js.UndefOr[Boolean] = js.native
  /**
    * The position of the chart legend.
    */
  var legendPosition: js.UndefOr[String] = js.native
  /**
    * Gets whether all lines should be rendered smooth or straight by default.
    * Applies to Line charts.
    */
  var lineSmoothing: js.UndefOr[Boolean] = js.native
  /**
    * The data this chart is visualizing.
    */
  var series: js.UndefOr[js.Array[SchemaBasicChartSeries]] = js.native
  /**
    * The stacked type for charts that support vertical stacking. Applies to
    * Area, Bar, Column, Combo, and Stepped Area charts.
    */
  var stackedType: js.UndefOr[String] = js.native
  /**
    * True to make the chart 3D. Applies to Bar and Column charts.
    */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}

object SchemaBasicChartSpec {
  @scala.inline
  def apply(): SchemaBasicChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartSpec]
  }
  @scala.inline
  implicit class SchemaBasicChartSpecOps[Self <: SchemaBasicChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Array[SchemaBasicChartAxis]): Self = {
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
    def withDomains(value: js.Array[SchemaBasicChartDomain]): Self = {
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
    def withSeries(value: js.Array[SchemaBasicChartSeries]): Self = {
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

