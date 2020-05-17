package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when a series is added to
    * the chart after load time, using the `addSeries` method. One parameter,
    * `event`, is passed to the function, containing common event information.
    * Through `event.options` you can access the series options that were
    * passed to the `addSeries` method. Returning false prevents the series
    * from being added.
    */
  var addSeries: js.UndefOr[ChartAddSeriesCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires after a chart is printed
    * through the context menu item or the `Chart.print` method.
    */
  var afterPrint: js.UndefOr[ExportingAfterPrintCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires before a chart is printed
    * through the context menu item or the `Chart.print` method.
    */
  var beforePrint: js.UndefOr[ExportingBeforePrintCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when clicking on the plot
    * background. One parameter, `event`, is passed to the function, containing
    * common event information.
    *
    * Information on the clicked spot can be found through `event.xAxis` and
    * `event.yAxis`, which are arrays containing the axes of each dimension and
    * each axis' value at the clicked spot. The primary axes are
    * `event.xAxis[0]` and `event.yAxis[0]`. Remember the unit of a datetime
    * axis is milliseconds since 1970-01-01 00:00:00.
    *
    *  (see online documentation for example)
    */
  var click: js.UndefOr[ChartClickCallbackFunction] = js.native
  /**
    * (Highcharts, Highmaps) Fires when a drilldown point is clicked, before
    * the new series is added. This event is also utilized for async drilldown,
    * where the seriesOptions are not added by option, but rather loaded async.
    * Note that when clicking a category label to trigger multiple series
    * drilldown, one `drilldown` event is triggered per point in the category.
    *
    * Event arguments:
    *
    * - `category`: If a category label was clicked, which index.</dd>
    *
    * - `originalEvent`: The original browser event (usually click) that
    * triggered the drilldown.
    *
    * - `point`: The originating point.
    *
    * - `points`: If a category label was clicked, this array holds all points
    * corresponing to the category.</dd>
    *
    * - `seriesOptions`: Options for the new series.
    */
  var drilldown: js.UndefOr[DrilldownCallbackFunction] = js.native
  /**
    * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
    */
  var drillup: js.UndefOr[DrillupCallbackFunction] = js.native
  /**
    * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
    * event fires after all the series have been drilled up.
    */
  var drillupall: js.UndefOr[DrillupAllCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback that fires while
    * exporting data. This allows the modification of data rows before
    * processed into the final format.
    */
  var exportData: js.UndefOr[ExportDataCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is finished
    * loading. Since v4.2.2, it also waits for images to be loaded, for example
    * from point markers. One parameter, `event`, is passed to the function,
    * containing common event information.
    *
    * There is also a second parameter to the chart constructor where a
    * callback function can be passed to be executed on chart.load.
    */
  var load: js.UndefOr[ChartLoadCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is redrawn,
    * either after a call to `chart.redraw()` or after an axis, series or point
    * is modified with the `redraw` option set to `true`. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var redraw: js.UndefOr[ChartRedrawCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires after initial load of the
    * chart (directly after the `load` event), and after each redraw (directly
    * after the `redraw` event).
    */
  var render: js.UndefOr[ChartRenderCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when an area of the chart
    * has been selected. Selection is enabled by setting the chart's zoomType.
    * One parameter, `event`, is passed to the function, containing common
    * event information. The default action for the selection event is to zoom
    * the chart to the selected area. It can be prevented by calling
    * `event.preventDefault()` or return false.
    *
    * Information on the selected area can be found through `event.xAxis` and
    * `event.yAxis`, which are arrays containing the axes of each dimension and
    * each axis' min and max values. The primary axes are `event.xAxis[0]` and
    * `event.yAxis[0]`. Remember the unit of a datetime axis is milliseconds
    * since 1970-01-01 00:00:00.
    *
    *  (see online documentation for example)
    */
  var selection: js.UndefOr[ChartSelectionCallbackFunction] = js.native
}

object ChartEventsOptions {
  @scala.inline
  def apply(): ChartEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartEventsOptions]
  }
  @scala.inline
  implicit class ChartEventsOptionsOps[Self <: ChartEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSeries(value: ChartAddSeriesCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPrint(value: (/* chart */ Chart_, /* event */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePrint(value: (/* chart */ Chart_, /* event */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforePrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrint")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: ChartClickCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilldown(value: DrilldownCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillup(value: DrillupCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillup")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillupall(value: DrillupAllCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillupall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillupall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillupall")(js.undefined)
        ret
    }
    @scala.inline
    def withExportData(value: ExportDataCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportData")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: ChartLoadCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withRedraw(value: ChartRedrawCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: ChartRenderCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: ChartSelectionCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
  }
  
}

