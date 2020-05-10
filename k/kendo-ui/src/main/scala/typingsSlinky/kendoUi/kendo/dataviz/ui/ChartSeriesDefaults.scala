package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesDefaults extends js.Object {
  var area: js.UndefOr[js.Any] = js.native
  var bar: js.UndefOr[js.Any] = js.native
  var border: js.UndefOr[ChartSeriesDefaultsBorder] = js.native
  var bubble: js.UndefOr[js.Any] = js.native
  var candlestick: js.UndefOr[js.Any] = js.native
  var column: js.UndefOr[js.Any] = js.native
  var donut: js.UndefOr[js.Any] = js.native
  var gap: js.UndefOr[Double] = js.native
  var labels: js.UndefOr[ChartSeriesDefaultsLabels] = js.native
  var line: js.UndefOr[js.Any] = js.native
  var notes: js.UndefOr[ChartSeriesDefaultsNotes] = js.native
  var ohlc: js.UndefOr[js.Any] = js.native
  var overlay: js.UndefOr[ChartSeriesDefaultsOverlay] = js.native
  var pie: js.UndefOr[js.Any] = js.native
  var rangeArea: js.UndefOr[js.Any] = js.native
  var scatter: js.UndefOr[js.Any] = js.native
  var scatterLine: js.UndefOr[js.Any] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var stack: js.UndefOr[Boolean | ChartSeriesDefaultsStack] = js.native
  var tooltip: js.UndefOr[ChartSeriesDefaultsTooltip] = js.native
  var `type`: js.UndefOr[String] = js.native
  var verticalArea: js.UndefOr[js.Any] = js.native
  var verticalLine: js.UndefOr[js.Any] = js.native
  var verticalRangeArea: js.UndefOr[js.Any] = js.native
  var visual: js.UndefOr[js.Function] = js.native
}

object ChartSeriesDefaults {
  @scala.inline
  def apply(): ChartSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaults]
  }
  @scala.inline
  implicit class ChartSeriesDefaultsOps[Self <: ChartSeriesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withBar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: ChartSeriesDefaultsBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withCandlestick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandlestick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candlestick")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withDonut(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ChartSeriesDefaultsLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: ChartSeriesDefaultsNotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOhlc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ohlc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOhlc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ohlc")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: ChartSeriesDefaultsOverlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPie(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pie")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeArea")(js.undefined)
        ret
    }
    @scala.inline
    def withScatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Boolean | ChartSeriesDefaultsStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ChartSeriesDefaultsTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
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
    @scala.inline
    def withVerticalArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArea")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalRangeArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRangeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalRangeArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRangeArea")(js.undefined)
        ret
    }
    @scala.inline
    def withVisual(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(js.undefined)
        ret
    }
  }
  
}

