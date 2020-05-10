package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var axisDefaults: js.UndefOr[js.Any] = js.native
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ StockChartAxisLabelClickEvent, Unit]] = js.native
  var categoryAxis: js.UndefOr[StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]] = js.native
  var chartArea: js.UndefOr[StockChartChartArea] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ StockChartEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any] = js.native
  var dateField: js.UndefOr[String] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ StockChartDragEvent, Unit]] = js.native
  var dragEnd: js.UndefOr[js.Function1[/* e */ StockChartDragEndEvent, Unit]] = js.native
  var dragStart: js.UndefOr[js.Function1[/* e */ StockChartDragStartEvent, Unit]] = js.native
  var legend: js.UndefOr[StockChartLegend] = js.native
  var legendItemClick: js.UndefOr[js.Function1[/* e */ StockChartLegendItemClickEvent, Unit]] = js.native
  var legendItemHover: js.UndefOr[js.Function1[/* e */ StockChartLegendItemHoverEvent, Unit]] = js.native
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ StockChartLegendItemLeaveEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var navigator: js.UndefOr[StockChartNavigator] = js.native
  var noteClick: js.UndefOr[js.Function1[/* e */ StockChartNoteClickEvent, Unit]] = js.native
  var noteHover: js.UndefOr[js.Function1[/* e */ StockChartNoteHoverEvent, Unit]] = js.native
  var noteLeave: js.UndefOr[js.Function1[/* e */ StockChartNoteLeaveEvent, Unit]] = js.native
  var paneRender: js.UndefOr[js.Function1[/* e */ StockChartPaneRenderEvent, Unit]] = js.native
  var panes: js.UndefOr[js.Array[StockChartPane]] = js.native
  var pdf: js.UndefOr[StockChartPdf] = js.native
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.native
  var plotArea: js.UndefOr[StockChartPlotArea] = js.native
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaClickEvent, Unit]] = js.native
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaHoverEvent, Unit]] = js.native
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaLeaveEvent, Unit]] = js.native
  var render: js.UndefOr[js.Function1[/* e */ StockChartRenderEvent, Unit]] = js.native
  var renderAs: js.UndefOr[String] = js.native
  var select: js.UndefOr[js.Function1[/* e */ StockChartSelectEvent, Unit]] = js.native
  var selectEnd: js.UndefOr[js.Function1[/* e */ StockChartSelectEndEvent, Unit]] = js.native
  var selectStart: js.UndefOr[js.Function1[/* e */ StockChartSelectStartEvent, Unit]] = js.native
  var series: js.UndefOr[js.Array[StockChartSeriesItem]] = js.native
  var seriesClick: js.UndefOr[js.Function1[/* e */ StockChartSeriesClickEvent, Unit]] = js.native
  var seriesColors: js.UndefOr[js.Any] = js.native
  var seriesDefaults: js.UndefOr[StockChartSeriesDefaults] = js.native
  var seriesHover: js.UndefOr[js.Function1[/* e */ StockChartSeriesHoverEvent, Unit]] = js.native
  var seriesLeave: js.UndefOr[js.Function1[/* e */ StockChartSeriesLeaveEvent, Unit]] = js.native
  var seriesOver: js.UndefOr[js.Function1[/* e */ StockChartSeriesOverEvent, Unit]] = js.native
  var theme: js.UndefOr[String] = js.native
  var title: js.UndefOr[StockChartTitle] = js.native
  var tooltip: js.UndefOr[StockChartTooltip] = js.native
  var transitions: js.UndefOr[Boolean] = js.native
  var valueAxis: js.UndefOr[StockChartValueAxisItem | js.Array[StockChartValueAxisItem]] = js.native
  var zoom: js.UndefOr[js.Function1[/* e */ StockChartZoomEvent, Unit]] = js.native
  var zoomEnd: js.UndefOr[js.Function1[/* e */ StockChartZoomEndEvent, Unit]] = js.native
  var zoomStart: js.UndefOr[js.Function1[/* e */ StockChartZoomStartEvent, Unit]] = js.native
}

object StockChartOptions {
  @scala.inline
  def apply(): StockChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartOptions]
  }
  @scala.inline
  implicit class StockChartOptionsOps[Self <: StockChartOptions] (val x: Self) extends AnyVal {
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
    def withAxisLabelClick(value: /* e */ StockChartAxisLabelClickEvent => Unit): Self = {
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
    def withCategoryAxis(value: StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]): Self = {
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
    def withChartArea(value: StockChartChartArea): Self = {
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
    def withDataBound(value: /* e */ StockChartEvent => Unit): Self = {
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
    def withDateField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateField")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* e */ StockChartDragEvent => Unit): Self = {
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
    def withDragEnd(value: /* e */ StockChartDragEndEvent => Unit): Self = {
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
    def withDragStart(value: /* e */ StockChartDragStartEvent => Unit): Self = {
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
    def withLegend(value: StockChartLegend): Self = {
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
    def withLegendItemClick(value: /* e */ StockChartLegendItemClickEvent => Unit): Self = {
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
    def withLegendItemHover(value: /* e */ StockChartLegendItemHoverEvent => Unit): Self = {
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
    def withLegendItemLeave(value: /* e */ StockChartLegendItemLeaveEvent => Unit): Self = {
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
    def withNavigator(value: StockChartNavigator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigator")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteClick(value: /* e */ StockChartNoteClickEvent => Unit): Self = {
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
    def withNoteHover(value: /* e */ StockChartNoteHoverEvent => Unit): Self = {
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
    def withNoteLeave(value: /* e */ StockChartNoteLeaveEvent => Unit): Self = {
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
    def withPaneRender(value: /* e */ StockChartPaneRenderEvent => Unit): Self = {
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
    def withPanes(value: js.Array[StockChartPane]): Self = {
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
    def withPdf(value: StockChartPdf): Self = {
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
    def withPlotArea(value: StockChartPlotArea): Self = {
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
    def withPlotAreaClick(value: /* e */ StockChartPlotAreaClickEvent => Unit): Self = {
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
    def withPlotAreaHover(value: /* e */ StockChartPlotAreaHoverEvent => Unit): Self = {
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
    def withPlotAreaLeave(value: /* e */ StockChartPlotAreaLeaveEvent => Unit): Self = {
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
    def withRender(value: /* e */ StockChartRenderEvent => Unit): Self = {
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
    def withSelect(value: /* e */ StockChartSelectEvent => Unit): Self = {
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
    def withSelectEnd(value: /* e */ StockChartSelectEndEvent => Unit): Self = {
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
    def withSelectStart(value: /* e */ StockChartSelectStartEvent => Unit): Self = {
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
    def withSeries(value: js.Array[StockChartSeriesItem]): Self = {
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
    def withSeriesClick(value: /* e */ StockChartSeriesClickEvent => Unit): Self = {
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
    def withSeriesDefaults(value: StockChartSeriesDefaults): Self = {
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
    def withSeriesHover(value: /* e */ StockChartSeriesHoverEvent => Unit): Self = {
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
    def withSeriesLeave(value: /* e */ StockChartSeriesLeaveEvent => Unit): Self = {
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
    def withSeriesOver(value: /* e */ StockChartSeriesOverEvent => Unit): Self = {
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
    def withTitle(value: StockChartTitle): Self = {
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
    def withTooltip(value: StockChartTooltip): Self = {
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
    def withValueAxis(value: StockChartValueAxisItem | js.Array[StockChartValueAxisItem]): Self = {
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
    def withZoom(value: /* e */ StockChartZoomEvent => Unit): Self = {
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
    def withZoomEnd(value: /* e */ StockChartZoomEndEvent => Unit): Self = {
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
    def withZoomStart(value: /* e */ StockChartZoomStartEvent => Unit): Self = {
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

