package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var axisDefaults: js.UndefOr[ChartAxisDefaults] = js.native
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ ChartAxisLabelClickEvent, Unit]] = js.native
  var categoryAxis: js.UndefOr[ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]] = js.native
  var chartArea: js.UndefOr[ChartChartArea] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ ChartDataBoundEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ ChartDragEvent, Unit]] = js.native
  var dragEnd: js.UndefOr[js.Function1[/* e */ ChartDragEndEvent, Unit]] = js.native
  var dragStart: js.UndefOr[js.Function1[/* e */ ChartDragStartEvent, Unit]] = js.native
  var legend: js.UndefOr[ChartLegend] = js.native
  var legendItemClick: js.UndefOr[js.Function1[/* e */ ChartLegendItemClickEvent, Unit]] = js.native
  var legendItemHover: js.UndefOr[js.Function1[/* e */ ChartLegendItemHoverEvent, Unit]] = js.native
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ ChartLegendItemLeaveEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var noteClick: js.UndefOr[js.Function1[/* e */ ChartNoteClickEvent, Unit]] = js.native
  var noteHover: js.UndefOr[js.Function1[/* e */ ChartNoteHoverEvent, Unit]] = js.native
  var noteLeave: js.UndefOr[js.Function1[/* e */ ChartNoteLeaveEvent, Unit]] = js.native
  var paneRender: js.UndefOr[js.Function1[/* e */ ChartPaneRenderEvent, Unit]] = js.native
  var panes: js.UndefOr[js.Array[ChartPane]] = js.native
  var pannable: js.UndefOr[Boolean | ChartPannable] = js.native
  var pdf: js.UndefOr[ChartPdf] = js.native
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.native
  var plotArea: js.UndefOr[ChartPlotArea] = js.native
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ ChartPlotAreaClickEvent, Unit]] = js.native
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ ChartPlotAreaHoverEvent, Unit]] = js.native
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ ChartPlotAreaLeaveEvent, Unit]] = js.native
  var render: js.UndefOr[js.Function1[/* e */ ChartRenderEvent, Unit]] = js.native
  var renderAs: js.UndefOr[String] = js.native
  var select: js.UndefOr[js.Function1[/* e */ ChartSelectEvent, Unit]] = js.native
  var selectEnd: js.UndefOr[js.Function1[/* e */ ChartSelectEndEvent, Unit]] = js.native
  var selectStart: js.UndefOr[js.Function1[/* e */ ChartSelectStartEvent, Unit]] = js.native
  var series: js.UndefOr[js.Array[ChartSeriesItem]] = js.native
  var seriesClick: js.UndefOr[js.Function1[/* e */ ChartSeriesClickEvent, Unit]] = js.native
  var seriesColors: js.UndefOr[js.Any] = js.native
  var seriesDefaults: js.UndefOr[ChartSeriesDefaults] = js.native
  var seriesHover: js.UndefOr[js.Function1[/* e */ ChartSeriesHoverEvent, Unit]] = js.native
  var seriesLeave: js.UndefOr[js.Function1[/* e */ ChartSeriesLeaveEvent, Unit]] = js.native
  var seriesOver: js.UndefOr[js.Function1[/* e */ ChartSeriesOverEvent, Unit]] = js.native
  var theme: js.UndefOr[String] = js.native
  var title: js.UndefOr[String | ChartTitle] = js.native
  var tooltip: js.UndefOr[ChartTooltip] = js.native
  var transitions: js.UndefOr[Boolean] = js.native
  var valueAxis: js.UndefOr[ChartValueAxisItem | js.Array[ChartValueAxisItem]] = js.native
  var xAxis: js.UndefOr[ChartXAxisItem | js.Array[ChartXAxisItem]] = js.native
  var yAxis: js.UndefOr[ChartYAxisItem | js.Array[ChartYAxisItem]] = js.native
  var zoom: js.UndefOr[js.Function1[/* e */ ChartZoomEvent, Unit]] = js.native
  var zoomEnd: js.UndefOr[js.Function1[/* e */ ChartZoomEndEvent, Unit]] = js.native
  var zoomStart: js.UndefOr[js.Function1[/* e */ ChartZoomStartEvent, Unit]] = js.native
  var zoomable: js.UndefOr[Boolean | ChartZoomable] = js.native
}

object ChartOptions {
  @scala.inline
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
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
    def withAxisDefaults(value: ChartAxisDefaults): Self = {
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
    def withAxisLabelClick(value: /* e */ ChartAxisLabelClickEvent => Unit): Self = {
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
    def withCategoryAxis(value: ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]): Self = {
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
    def withChartArea(value: ChartChartArea): Self = {
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
    def withDataBound(value: /* e */ ChartDataBoundEvent => Unit): Self = {
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
    def withDataSource(value: js.Any | DataSource): Self = {
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
    def withDrag(value: /* e */ ChartDragEvent => Unit): Self = {
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
    def withDragEnd(value: /* e */ ChartDragEndEvent => Unit): Self = {
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
    def withDragStart(value: /* e */ ChartDragStartEvent => Unit): Self = {
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
    def withLegend(value: ChartLegend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemClick(value: /* e */ ChartLegendItemClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemHover(value: /* e */ ChartLegendItemHoverEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemHover")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemLeave(value: /* e */ ChartLegendItemLeaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemLeave")(js.undefined)
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
    def withNoteClick(value: /* e */ ChartNoteClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoteClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteHover(value: /* e */ ChartNoteHoverEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoteHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteHover")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteLeave(value: /* e */ ChartNoteLeaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoteLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withPaneRender(value: /* e */ ChartPaneRenderEvent => Unit): Self = {
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
    def withPanes(value: js.Array[ChartPane]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(js.undefined)
        ret
    }
    @scala.inline
    def withPannable(value: Boolean | ChartPannable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pannable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPannable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pannable")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: ChartPdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistSeriesVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSeriesVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistSeriesVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSeriesVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotArea(value: ChartPlotArea): Self = {
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
    def withPlotAreaClick(value: /* e */ ChartPlotAreaClickEvent => Unit): Self = {
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
    def withPlotAreaHover(value: /* e */ ChartPlotAreaHoverEvent => Unit): Self = {
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
    def withPlotAreaLeave(value: /* e */ ChartPlotAreaLeaveEvent => Unit): Self = {
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
    def withRender(value: /* e */ ChartRenderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
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
    def withSelect(value: /* e */ ChartSelectEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectEnd(value: /* e */ ChartSelectEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectStart(value: /* e */ ChartSelectStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[ChartSeriesItem]): Self = {
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
    def withSeriesClick(value: /* e */ ChartSeriesClickEvent => Unit): Self = {
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
    def withSeriesDefaults(value: ChartSeriesDefaults): Self = {
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
    def withSeriesHover(value: /* e */ ChartSeriesHoverEvent => Unit): Self = {
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
    def withSeriesLeave(value: /* e */ ChartSeriesLeaveEvent => Unit): Self = {
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
    def withSeriesOver(value: /* e */ ChartSeriesOverEvent => Unit): Self = {
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
    def withTitle(value: String | ChartTitle): Self = {
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
    def withTooltip(value: ChartTooltip): Self = {
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
    def withValueAxis(value: ChartValueAxisItem | js.Array[ChartValueAxisItem]): Self = {
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
    def withXAxis(value: ChartXAxisItem | js.Array[ChartXAxisItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: ChartYAxisItem | js.Array[ChartYAxisItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: /* e */ ChartZoomEvent => Unit): Self = {
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
    def withZoomEnd(value: /* e */ ChartZoomEndEvent => Unit): Self = {
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
    def withZoomStart(value: /* e */ ChartZoomStartEvent => Unit): Self = {
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
    @scala.inline
    def withZoomable(value: Boolean | ChartZoomable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(js.undefined)
        ret
    }
  }
  
}

