package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var axisDefaults: js.UndefOr[js.Any] = js.native
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ SparklineAxisLabelClickEvent, Unit]] = js.native
  var categoryAxis: js.UndefOr[SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]] = js.native
  var chartArea: js.UndefOr[SparklineChartArea] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ SparklineEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ SparklineDragEvent, Unit]] = js.native
  var dragEnd: js.UndefOr[js.Function1[/* e */ SparklineDragEndEvent, Unit]] = js.native
  var dragStart: js.UndefOr[js.Function1[/* e */ SparklineDragStartEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var paneRender: js.UndefOr[js.Function1[/* e */ SparklinePaneRenderEvent, Unit]] = js.native
  var plotArea: js.UndefOr[SparklinePlotArea] = js.native
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaClickEvent, Unit]] = js.native
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaHoverEvent, Unit]] = js.native
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaLeaveEvent, Unit]] = js.native
  var pointWidth: js.UndefOr[Double] = js.native
  var renderAs: js.UndefOr[String] = js.native
  var series: js.UndefOr[js.Array[SparklineSeriesItem]] = js.native
  var seriesClick: js.UndefOr[js.Function1[/* e */ SparklineSeriesClickEvent, Unit]] = js.native
  var seriesColors: js.UndefOr[js.Any] = js.native
  var seriesDefaults: js.UndefOr[SparklineSeriesDefaults] = js.native
  var seriesHover: js.UndefOr[js.Function1[/* e */ SparklineSeriesHoverEvent, Unit]] = js.native
  var seriesLeave: js.UndefOr[js.Function1[/* e */ SparklineSeriesLeaveEvent, Unit]] = js.native
  var seriesOver: js.UndefOr[js.Function1[/* e */ SparklineSeriesOverEvent, Unit]] = js.native
  var theme: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[SparklineTooltip] = js.native
  var transitions: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var valueAxis: js.UndefOr[SparklineValueAxisItem | js.Array[SparklineValueAxisItem]] = js.native
  var zoom: js.UndefOr[js.Function1[/* e */ SparklineZoomEvent, Unit]] = js.native
  var zoomEnd: js.UndefOr[js.Function1[/* e */ SparklineZoomEndEvent, Unit]] = js.native
  var zoomStart: js.UndefOr[js.Function1[/* e */ SparklineZoomStartEvent, Unit]] = js.native
}

object SparklineOptions {
  @scala.inline
  def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  @scala.inline
  implicit class SparklineOptionsOps[Self <: SparklineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabelClick(value: /* e */ SparklineAxisLabelClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAxisLabelClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryAxis(value: SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withChartArea(value: SparklineChartArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartArea")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ SparklineEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* e */ SparklineDragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnd(value: /* e */ SparklineDragEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: /* e */ SparklineDragStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPaneRender(value: /* e */ SparklinePaneRenderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaneRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotArea(value: SparklinePlotArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotArea")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotAreaClick(value: /* e */ SparklinePlotAreaClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlotAreaClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotAreaHover(value: /* e */ SparklinePlotAreaHoverEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlotAreaHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotAreaLeave(value: /* e */ SparklinePlotAreaLeaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlotAreaLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withPointWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAs")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[SparklineSeriesItem]): Self = {
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
    def withSeriesClick(value: /* e */ SparklineSeriesClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeriesClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesColors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesColors")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesDefaults(value: SparklineSeriesDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesHover(value: /* e */ SparklineSeriesHoverEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeriesHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesLeave(value: /* e */ SparklineSeriesLeaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeriesLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesOver(value: /* e */ SparklineSeriesOverEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeriesOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesOver")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: SparklineTooltip): Self = {
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
    def withTransitions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(js.undefined)
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
    def withValueAxis(value: SparklineValueAxisItem | js.Array[SparklineValueAxisItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: /* e */ SparklineZoomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnd(value: /* e */ SparklineZoomEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomStart(value: /* e */ SparklineZoomStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.undefined)
        ret
    }
  }
  
}

