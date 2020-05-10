package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxisDefaults extends js.Object {
  var background: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var crosshair: js.UndefOr[ChartAxisDefaultsCrosshair] = js.native
  var labels: js.UndefOr[ChartAxisDefaultsLabels] = js.native
  var line: js.UndefOr[ChartAxisDefaultsLine] = js.native
  var majorGridLines: js.UndefOr[ChartAxisDefaultsMajorGridLines] = js.native
  var majorTicks: js.UndefOr[ChartAxisDefaultsMajorTicks] = js.native
  var minorGridLines: js.UndefOr[ChartAxisDefaultsMinorGridLines] = js.native
  var minorTicks: js.UndefOr[ChartAxisDefaultsMinorTicks] = js.native
  var narrowRange: js.UndefOr[Boolean] = js.native
  var pane: js.UndefOr[String] = js.native
  var plotBands: js.UndefOr[js.Array[ChartAxisDefaultsPlotBand]] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var title: js.UndefOr[ChartAxisDefaultsTitle] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartAxisDefaults {
  @scala.inline
  def apply(): ChartAxisDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisDefaults]
  }
  @scala.inline
  implicit class ChartAxisDefaultsOps[Self <: ChartAxisDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
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
    def withCrosshair(value: ChartAxisDefaultsCrosshair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ChartAxisDefaultsLabels): Self = {
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
    def withLine(value: ChartAxisDefaultsLine): Self = {
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
    def withMajorGridLines(value: ChartAxisDefaultsMajorGridLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTicks(value: ChartAxisDefaultsMajorTicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridLines(value: ChartAxisDefaultsMinorGridLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTicks(value: ChartAxisDefaultsMinorTicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withNarrowRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrowRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNarrowRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrowRange")(js.undefined)
        ret
    }
    @scala.inline
    def withPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotBands(value: js.Array[ChartAxisDefaultsPlotBand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotBands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotBands")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: ChartAxisDefaultsTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

