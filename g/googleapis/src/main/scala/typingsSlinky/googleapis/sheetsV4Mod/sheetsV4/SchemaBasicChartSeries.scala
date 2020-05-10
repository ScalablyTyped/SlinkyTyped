package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single series of data in a chart. For example, if charting stock prices
  * over time, multiple series may exist, one for the &quot;Open Price&quot;,
  * &quot;High Price&quot;, &quot;Low Price&quot; and &quot;Close Price&quot;.
  */
@js.native
trait SchemaBasicChartSeries extends js.Object {
  /**
    * The color for elements (i.e. bars, lines, points) associated with this
    * series.  If empty, a default color is used.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  /**
    * The line style of this series. Valid only if the chartType is AREA, LINE,
    * or SCATTER. COMBO charts are also supported if the series chart type is
    * AREA or LINE.
    */
  var lineStyle: js.UndefOr[SchemaLineStyle] = js.native
  /**
    * The data being visualized in this chart series.
    */
  var series: js.UndefOr[SchemaChartData] = js.native
  /**
    * The minor axis that will specify the range of values for this series. For
    * example, if charting stocks over time, the &quot;Volume&quot; series may
    * want to be pinned to the right with the prices pinned to the left,
    * because the scale of trading volume is different than the scale of
    * prices. It is an error to specify an axis that isn&#39;t a valid minor
    * axis for the chart&#39;s type.
    */
  var targetAxis: js.UndefOr[String] = js.native
  /**
    * The type of this series. Valid only if the chartType is COMBO. Different
    * types will change the way the series is visualized. Only LINE, AREA, and
    * COLUMN are supported.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaBasicChartSeries {
  @scala.inline
  def apply(): SchemaBasicChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartSeries]
  }
  @scala.inline
  implicit class SchemaBasicChartSeriesOps[Self <: SchemaBasicChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: SchemaLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: SchemaChartData): Self = {
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
    def withTargetAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

