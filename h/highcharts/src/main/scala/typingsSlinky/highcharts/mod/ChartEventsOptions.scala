package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartEventsOptions extends StObject {
  
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
    * axis is milliseconds since 1970-01-01 00:00:00. (see online documentation
    * for example)
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
    * - `category`: If a category label was clicked, which index.
    *
    * - `originalEvent`: The original browser event (usually click) that
    * triggered the drilldown.
    *
    * - `point`: The originating point.
    *
    * - `points`: If a category label was clicked, this array holds all points
    * corresponding to the category.
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
    * since 1970-01-01 00:00:00. (see online documentation for example)
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
  implicit class ChartEventsOptionsMutableBuilder[Self <: ChartEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSeries(value: ChartAddSeriesCallbackFunction): Self = StObject.set(x, "addSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSeriesUndefined: Self = StObject.set(x, "addSeries", js.undefined)
    
    @scala.inline
    def setAfterPrint(value: (/* chart */ Chart_, /* event */ Event) => Unit): Self = StObject.set(x, "afterPrint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterPrintUndefined: Self = StObject.set(x, "afterPrint", js.undefined)
    
    @scala.inline
    def setBeforePrint(value: (/* chart */ Chart_, /* event */ Event) => Unit): Self = StObject.set(x, "beforePrint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforePrintUndefined: Self = StObject.set(x, "beforePrint", js.undefined)
    
    @scala.inline
    def setClick(value: ChartClickCallbackFunction): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setDrilldown(value: DrilldownCallbackFunction): Self = StObject.set(x, "drilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrilldownUndefined: Self = StObject.set(x, "drilldown", js.undefined)
    
    @scala.inline
    def setDrillup(value: DrillupCallbackFunction): Self = StObject.set(x, "drillup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillupUndefined: Self = StObject.set(x, "drillup", js.undefined)
    
    @scala.inline
    def setDrillupall(value: DrillupAllCallbackFunction): Self = StObject.set(x, "drillupall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillupallUndefined: Self = StObject.set(x, "drillupall", js.undefined)
    
    @scala.inline
    def setExportData(value: ExportDataCallbackFunction): Self = StObject.set(x, "exportData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDataUndefined: Self = StObject.set(x, "exportData", js.undefined)
    
    @scala.inline
    def setLoad(value: ChartLoadCallbackFunction): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setRedraw(value: ChartRedrawCallbackFunction): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
    
    @scala.inline
    def setRender(value: ChartRenderCallbackFunction): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setSelection(value: ChartSelectionCallbackFunction): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
