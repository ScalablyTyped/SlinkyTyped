package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicChartSeries extends js.Object {
  /**
    * The color for elements (such as bars, lines, and points) associated with
    * this series.  If empty, a default color is used.
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * The color for elements (such as bars, lines, and points) associated with
    * this series.  If empty, a default color is used.
    * If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The line style of this series. Valid only if the
    * chartType is AREA,
    * LINE, or SCATTER.
    * COMBO charts are also supported if the
    * series chart type is
    * AREA or LINE.
    */
  var lineStyle: js.UndefOr[LineStyle] = js.native
  /** The data being visualized in this chart series. */
  var series: js.UndefOr[ChartData] = js.native
  /**
    * The minor axis that will specify the range of values for this series.
    * For example, if charting stocks over time, the "Volume" series
    * may want to be pinned to the right with the prices pinned to the left,
    * because the scale of trading volume is different than the scale of
    * prices.
    * It is an error to specify an axis that isn't a valid minor axis
    * for the chart's type.
    */
  var targetAxis: js.UndefOr[String] = js.native
  /**
    * The type of this series. Valid only if the
    * chartType is
    * COMBO.
    * Different types will change the way the series is visualized.
    * Only LINE, AREA,
    * and COLUMN are supported.
    */
  var `type`: js.UndefOr[String] = js.native
}

object BasicChartSeries {
  @scala.inline
  def apply(): BasicChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartSeries]
  }
  @scala.inline
  implicit class BasicChartSeriesOps[Self <: BasicChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
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
    def withColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: LineStyle): Self = {
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
    def withSeries(value: ChartData): Self = {
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

