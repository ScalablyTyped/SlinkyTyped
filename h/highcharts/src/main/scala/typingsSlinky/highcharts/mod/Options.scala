package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring
    * accessibility for the chart. Requires the accessibility module to be
    * loaded. For a description of the module and information on its features,
    * see Highcharts Accessibility.
    */
  var accessibility: js.UndefOr[AccessibilityOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation.
    * It allows to add custom labels or shapes. The items can be tied to
    * points, axis coordinates or chart pixel coordinates.
    */
  var annotations: js.UndefOr[js.Array[AnnotationsOptions]] = js.native
  
  var boost: js.UndefOr[BoostOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will
    * render below the chart and will be part of exported charts. The caption
    * can be updated after chart initialization through the `Chart.update` or
    * `Chart.caption.update` methods.
    */
  var caption: js.UndefOr[CaptionOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
    */
  var chart: js.UndefOr[ChartOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
    * color axis will appear as a gradient or as separate items inside the
    * legend, depending on whether the axis is scalar or based on data classes.
    *
    * For supported color formats, see the docs article about colors.
    *
    * A scalar color axis is represented by a gradient. The colors either range
    * between the minColor and the maxColor, or for more fine grained control
    * the colors can be defined in stops. Often times, the color axis needs to
    * be adjusted to get the right color spread for the data. In addition to
    * stops, consider using a logarithmic axis type, or setting min and max to
    * avoid the colors being determined by outliers.
    *
    * When dataClasses are used, the ranges are subdivided into separate
    * classes like categories based on their values. This can be used for
    * ranges between two values, but also for a true category. However, when
    * your data is categorized, it may be as convenient to add each category to
    * a separate series.
    *
    * Color axis does not work with: `sankey`, `sunburst`, `dependencywheel`,
    * `networkgraph`, `wordcloud`, `venn`, `gauge` and `solidgauge` series
    * types.
    *
    * Since v7.2.0 `colorAxis` can also be an array of options objects.
    *
    * See the Axis object for programmatic access to the axis.
    */
  var colorAxis: js.UndefOr[ColorAxisOptions | js.Array[ColorAxisOptions]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the default
    * colors for the chart's series. When all colors are used, new colors are
    * pulled from the start again.
    *
    * Default colors can also be set on a series or series.type basis, see
    * column.colors, pie.colors.
    *
    * In styled mode, the colors option doesn't exist. Instead, colors are
    * defined in CSS and applied either through series or point class names, or
    * through the chart.colorCount option.
    *
    * ### Legacy
    *
    * In Highcharts 3.x, the default colors were: (see online documentation for
    * example)
    *
    * In Highcharts 2.x, the default colors were: (see online documentation for
    * example)
    */
  var colors: js.UndefOr[js.Array[ColorString]] = js.native
  
  /**
    * (Gantt) The Pathfinder module allows you to define connections between
    * any two points, represented as lines - optionally with markers for the
    * start and/or end points. Multiple algorithms are available for
    * calculating how the connecting lines are drawn.
    *
    * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
    * charts, the connectors are used to draw dependencies between tasks.
    */
  var connectors: js.UndefOr[ConnectorsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a
    * credits label in the lower right corner of the chart. This can be changed
    * using these options.
    */
  var credits: js.UndefOr[CreditsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a
    * simplified interface for adding data to a chart from sources like CVS,
    * HTML tables or grid views. See also the tutorial article on the Data
    * module.
    *
    * It requires the `modules/data.js` file to be loaded.
    *
    * Please note that the default way of adding data in Highcharts, without
    * the need of a module, is through the series._type_.data option.
    */
  var data: js.UndefOr[DataOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring markers
    * for annotations.
    *
    * An example of the arrow marker: (see online documentation for example)
    */
  var defs: js.UndefOr[DefsOptions | Dictionary[SVGDefinitionObject]] = js.native
  
  /**
    * (Highcharts, Highmaps) Options for drill down, the concept of inspecting
    * increasingly high resolution data through clicking on chart items like
    * columns or pie slices.
    *
    * The drilldown feature requires the drilldown.js file to be loaded, found
    * in the modules directory of the download package, or online at
    * code.highcharts.com/modules/drilldown.js.
    */
  var drilldown: js.UndefOr[DrilldownOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting
    * module. For an overview on the matter, see the docs.
    */
  var exporting: js.UndefOr[ExportingOptions] = js.native
  
  var global: js.UndefOr[GlobalOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language
    * object is global and it can't be set on each chart initialization.
    * Instead, use `Highcharts.setOptions` to set it before any chart is
    * initialized. (see online documentation for example)
    */
  var lang: js.UndefOr[LangOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a
    * symbol and name for each series item or point item in the chart. Each
    * series (or points in case of pie charts) is represented by a symbol and
    * its name in the legend.
    *
    * It is possible to override the symbol creator function and create custom
    * legend symbols.
    */
  var legend: js.UndefOr[LegendOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the
    * appearance of the loading screen that covers the plot area on chart
    * operations. This screen only appears after an explicit call to
    * `chart.showLoading()`. It is a utility for developers to communicate to
    * the end user that something is going on, for example while retrieving new
    * data via an XHR connection. The "Loading..." text itself is not part of
    * this configuration object, but part of the `lang` object.
    */
  var loading: js.UndefOr[LoadingOptions] = js.native
  
  var mapNavigation: js.UndefOr[MapNavigationOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
    * buttons and menus appearing in the exporting module.
    */
  var navigation: js.UndefOr[NavigationOptions] = js.native
  
  /**
    * (Highstock, Gantt) The navigator is a small series below the main series,
    * displaying a view of the entire data set. It provides tools to zoom in
    * and out on parts of the data as well as panning across the dataset.
    */
  var navigator: js.UndefOr[NavigatorOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Options for displaying a message like "No
    * data to display". This feature requires the file no-data-to-display.js to
    * be loaded in the page. The actual text to display is set in the
    * lang.noData option.
    */
  var noData: js.UndefOr[NoDataOptions] = js.native
  
  /**
    * (Highcharts) The pane serves as a container for axes and backgrounds for
    * circular gauges and polar charts.
    */
  var pane: js.UndefOr[PaneOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper
    * object for config objects for each series type. The config objects for
    * each series can also be overridden for each series item as given in the
    * series array.
    *
    * Configuration options for the series are given in three levels. Options
    * for all series in a chart are given in the plotOptions.series object.
    * Then options for all series of a specific type are given in the
    * plotOptions of that type, for example `plotOptions.line`. Next, options
    * for one single series are given in the series array.
    */
  var plotOptions: js.UndefOr[PlotOptions] = js.native
  
  /**
    * (Highstock, Gantt) The range selector is a tool for selecting ranges to
    * display within the chart. It provides buttons to select preconfigured
    * ranges in the chart, like 1 day, 1 week, 1 month etc. It also provides
    * input boxes where min and max dates can be manually input.
    */
  var rangeSelector: js.UndefOr[RangeSelectorOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to
    * apply for different screen or chart sizes. Each rule specifies additional
    * chart options.
    */
  var responsive: js.UndefOr[ResponsiveOptions] = js.native
  
  /**
    * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of
    * a stock chart. Scrollbars can also be applied to other types of axes.
    *
    * Another approach to scrollable charts is the chart.scrollablePlotArea
    * option that is especially suitable for simpler cartesian charts on
    * mobile.
    *
    * In styled mode, all the presentational options for the scrollbar are
    * replaced by the classes `.highcharts-scrollbar-thumb`,
    * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
    * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
    */
  var scrollbar: js.UndefOr[ScrollbarOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Series options for specific data
    * and the data itself. In TypeScript you have to cast the series options to
    * specific series types, to get all possible options for a series.
    */
  var series: js.UndefOr[js.Array[SeriesOptionsType]] = js.native
  
  /**
    * (Highstock) Configure the stockTools gui strings in the chart. Requires
    * the [stockTools module]() to be loaded. For a description of the module
    * and information on its features, see [Highcharts StockTools]().
    */
  var stockTools: js.UndefOr[StockToolsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can
    * be used both to display a subtitle below the main title, and to display
    * random text anywhere in the chart. The subtitle can be updated after
    * chart initialization through the `Chart.setTitle` method.
    */
  var subtitle: js.UndefOr[SubtitleOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply
    * globally or to individual charts. These settings affect how `datetime`
    * axes are laid out, how tooltips are formatted, how series
    * pointIntervalUnit works and how the Highstock range selector handles
    * time.
    *
    * The common use case is that all charts in the same Highcharts object
    * share the same time settings, in which case the global settings are set
    * using `setOptions`. (see online documentation for example)
    *
    * Since v6.0.5, the time options were moved from the `global` obect to the
    * `time` object, and time options can be set on each individual chart.
    */
  var time: js.UndefOr[TimeOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
    */
  var title: js.UndefOr[TitleOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that
    * appears when the user hovers over a series or point.
    */
  var tooltip: js.UndefOr[TooltipOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis.
    * Normally this is the horizontal axis, though if the chart is inverted
    * this is the vertical axis. In case of multiple axes, the xAxis node is an
    * array of configuration objects.
    *
    * See the Axis class for programmatic access to the axis.
    */
  var xAxis: js.UndefOr[XAxisOptions | js.Array[XAxisOptions]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis.
    * Normally this is the vertical axis, though if the chart is inverted this
    * is the horizontal axis. In case of multiple axes, the yAxis node is an
    * array of configuration objects.
    *
    * See the Axis object for programmatic access to the axis.
    */
  var yAxis: js.UndefOr[YAxisOptions | js.Array[YAxisOptions]] = js.native
  
  /**
    * (Highcharts) The Z axis or depth axis for 3D plots.
    *
    * See the Axis class for programmatic access to the axis.
    */
  var zAxis: js.UndefOr[ZAxisOptions | js.Array[ZAxisOptions]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: AccessibilityOptions): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAnnotations(value: js.Array[AnnotationsOptions]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: AnnotationsOptions*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setBoost(value: BoostOptions): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    @scala.inline
    def setCaption(value: CaptionOptions): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setChart(value: ChartOptions): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    @scala.inline
    def setColorAxis(value: ColorAxisOptions | js.Array[ColorAxisOptions]): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    @scala.inline
    def setColorAxisVarargs(value: ColorAxisOptions*): Self = StObject.set(x, "colorAxis", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[ColorString]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: ColorString*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setConnectors(value: ConnectorsOptions): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    @scala.inline
    def setCredits(value: CreditsOptions): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    @scala.inline
    def setData(value: DataOptions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDefs(value: DefsOptions | Dictionary[SVGDefinitionObject]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    @scala.inline
    def setDrilldown(value: DrilldownOptions): Self = StObject.set(x, "drilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrilldownUndefined: Self = StObject.set(x, "drilldown", js.undefined)
    
    @scala.inline
    def setExporting(value: ExportingOptions): Self = StObject.set(x, "exporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportingUndefined: Self = StObject.set(x, "exporting", js.undefined)
    
    @scala.inline
    def setGlobal(value: GlobalOptions): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setLang(value: LangOptions): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLegend(value: LegendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLoading(value: LoadingOptions): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setMapNavigation(value: MapNavigationOptions): Self = StObject.set(x, "mapNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapNavigationUndefined: Self = StObject.set(x, "mapNavigation", js.undefined)
    
    @scala.inline
    def setNavigation(value: NavigationOptions): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setNavigator(value: NavigatorOptions): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
    
    @scala.inline
    def setNoData(value: NoDataOptions): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    @scala.inline
    def setPane(value: PaneOptions): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPlotOptions(value: PlotOptions): Self = StObject.set(x, "plotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotOptionsUndefined: Self = StObject.set(x, "plotOptions", js.undefined)
    
    @scala.inline
    def setRangeSelector(value: RangeSelectorOptions): Self = StObject.set(x, "rangeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeSelectorUndefined: Self = StObject.set(x, "rangeSelector", js.undefined)
    
    @scala.inline
    def setResponsive(value: ResponsiveOptions): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setScrollbar(value: ScrollbarOptions): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[SeriesOptionsType]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: SeriesOptionsType*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setStockTools(value: StockToolsOptions): Self = StObject.set(x, "stockTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockToolsUndefined: Self = StObject.set(x, "stockTools", js.undefined)
    
    @scala.inline
    def setSubtitle(value: SubtitleOptions): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTime(value: TimeOptions): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTitle(value: TitleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: TooltipOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setXAxis(value: XAxisOptions | js.Array[XAxisOptions]): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setXAxisVarargs(value: XAxisOptions*): Self = StObject.set(x, "xAxis", js.Array(value :_*))
    
    @scala.inline
    def setYAxis(value: YAxisOptions | js.Array[YAxisOptions]): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    @scala.inline
    def setYAxisVarargs(value: YAxisOptions*): Self = StObject.set(x, "yAxis", js.Array(value :_*))
    
    @scala.inline
    def setZAxis(value: ZAxisOptions | js.Array[ZAxisOptions]): Self = StObject.set(x, "zAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZAxisUndefined: Self = StObject.set(x, "zAxis", js.undefined)
    
    @scala.inline
    def setZAxisVarargs(value: ZAxisOptions*): Self = StObject.set(x, "zAxis", js.Array(value :_*))
  }
}
