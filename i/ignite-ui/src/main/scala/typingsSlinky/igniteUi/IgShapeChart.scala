package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgShapeChart
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets a value indicating whether grid and tick lines are aligned to device pixels.
  	 */
  var alignsGridLinesToPixels: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the series animations should be allowed when a range change has been detected on an axis.
  	 */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the bottom margin around the chart content.
  	 */
  var bottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the palette of brushes to use for coloring the chart series.
  	 * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Occurs when the style of a callout is updated.
  	 */
  var calloutStyleUpdating: js.UndefOr[CalloutStyleUpdatingEvent] = js.native
  /**
  	 * Gets or sets if event annotations should be displayed.
  	 */
  var calloutStyleUpdatingEventEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the member path of the content data for the callouts.
  	 */
  var calloutsContentMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the collection of callout data to be annotated.
  	 */
  var calloutsItemsSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the member path of the label data for the callouts.
  	 */
  var calloutsLabelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets if callouts should be displayed.
  	 */
  var calloutsVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the member path of the X data for the callouts.
  	 */
  var calloutsXMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the member path of the Y data for the callouts.
  	 */
  var calloutsYMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the type of chart series to generate from the data.
  	 *
  	 * Valid values:
  	 * "auto" Specifies automatic selection of chart type based on suggestion from internal Data Adapter
  	 * "point" Specifies point chart with small markers at X/Y data
  	 * "line" Specifies line chart with small markers at X/Y data and connected with lines
  	 * "spline" Specifies spline chart with small markers at X/Y data and connected with splines
  	 * "bubble" Specifies bubble chart with proportional markers at X/Y data
  	 * "highDensity" Specifies high density chart with colored bitmap pixels at X/Y data based on density of nearby points
  	 * "area" Specifies area chart with colored surface based on a triangulation of X/Y data with numeric values assigned to each point.
  	 * "contour" Specifies area chart with colored lines based on a triangulation of X/Y data with numeric values assigned to each point.
  	 * "polygon" Specifies polygon chart with polygons defined by X/Y data
  	 * "polyline" Specifies polyline chart with polylines defined by X/Y data
  	 */
  var chartType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets a function for creating wrapped tooltip
  	 */
  var createWrappedTooltip: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets whether annotations are shown along the axis for crosshair values
  	 */
  var crosshairsAnnotationEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the crosshairs to be displayed.
  	 *
  	 * Valid values:
  	 * "default" Display default number of crosshair lines in the chart.
  	 * "none" Display no crosshair lines in the chart.
  	 * "horizontal" Display horizontal line of crosshairs in the chart.
  	 * "vertical" Display vertical line of crosshairs in the chart.
  	 * "both" Display both horizontal and vertical lines of crosshairs in the chart.
  	 */
  var crosshairsDisplayMode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether crosshairs will snap to the nearest data point.
  	 */
  var crosshairsSnapToData: js.UndefOr[Boolean] = js.native
  /**
  	 * Event which is raised before data binding.
  	 * Return false in order to cancel data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
  	 * Event which is raised after data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.data to obtain reference to array actual data which is displayed by chart.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
  	 * Gets sets a valid data source.
  	 * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
  	 * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Gets sets url which is used for sending JSON on request for remote data.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * String The database source URI.
  	 */
  var databaseSource: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets a set of property paths that should be excluded from consideration by the category chart.
  	 */
  var excludedProperties: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets whether annotations for the final value of each series is displayed on the axis.
  	 */
  var finalValueAnnotationsVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * The height of the chart.
  	 */
  var height: js.UndefOr[Double] = js.native
  /**
  	 * Event which is raised before tooltip is hidden.
  	 * Return false in order to cancel hiding and keep tooltip visible.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.item to obtain reference to item.
  	 * Use ui.element to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
  	 */
  var hideTooltip: js.UndefOr[HideTooltipEvent] = js.native
  /**
  	 * Gets or sets a set of property paths that should be included for consideration by the category chart, leaving the remainder excluded. If null, all properties will be considered.
  	 */
  var includedProperties: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets whether the chart can be horizontally zoomed through user interactions.
  	 */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the chart can highlight series through user interactions.
  	 * This property applies to Category Chart and Financial Chart controls.
  	 */
  var isSeriesHighlightingEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the chart can be vertically zoomed through user interactions.
  	 */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets a collection of data items used to generate the chart.
  	 * The ItemsSource of this chart can be a list of objects containing one or more numeric properties.
  	 * Additionally, if the objects in the list implement the IEnumerable interface,
  	 * the Chart will attempt to delve into the sub-collections when reading through the data source.
  	 * Databinding can be further configured by attributing the data item classes
  	 * with the DataSeriesMemberIntentAttribute.
  	 */
  var itemsSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the left margin of the chart content.
  	 */
  var leftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the legend to connect this chart to.
  	 * When the legend property is set, the chart will use it to display information about its series.  Legends can be shared by multiple chart controls.
  	 */
  var legend: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the palette of brushes used for rendering fill area of data point markers.
  	 * This property applies only to these chart types: point, line, spline, bubble, and polygon
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var markerBrushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets collision avoidance between markers on series that support this behaviour.
  	 *
  	 * Valid values:
  	 * "none" Collision avoidance is disabled.
  	 * "omit" Items colliding with other items will be hidden from view.
  	 * "fade" Items colliding with other items will be partially hidden from view by reducing their opacity.
  	 * "omitAndShift" Items colliding with other items will be either hidden from view or moved to new positions.
  	 * "fadeAndShift" Items colliding with other items will be either partially hidden from view by reducing their opacity, or moved to new positions, or a combination of both.
  	 */
  var markerCollision: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the maximum number of markers displyed in the plot area of the chart.
  	 */
  var markerMaxCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the palette of brushes used for rendering outlines of data point markers.
  	 * This property applies only to these chart types: point, line, spline, bubble, and polygon
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var markerOutlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the marker shapes used for indicating location of data points in this chart.
  	 * This property applies only to these chart types: point, line, spline, bubble, and polygon
  	 */
  var markerTypes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the palette of brushes to use for outlines on the chart series.
  	 * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * Event raised when a property value is changed on this chart
  	 */
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.native
  /**
  	 * Gets or sets the rendering resolution for all series in this chart.
  	 * Where n = Resolution, for every n horizontal pixels, combine all items into a single datapoint.  When Resolution = 0, all datapoints will be rendered as graphical objects.  Charts with a higher resolution will have faster performance.
  	 */
  var resolution: js.UndefOr[Double] = js.native
  /**
  	 * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * See $.ig.DataSource. property in the response specifying the total number of records on the server.
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the right margin of the chart content.
  	 */
  var rightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Event raised when a series is initialized and added to this chart.
  	 */
  var seriesAdded: js.UndefOr[SeriesAddedEvent] = js.native
  /**
  	 * Occurs when the pointer is pressed down over a Series.
  	 */
  var seriesPointerDown: js.UndefOr[SeriesPointerDownEvent] = js.native
  /**
  	 * Occurs when the pointer enters a Series.
  	 */
  var seriesPointerEnter: js.UndefOr[SeriesPointerEnterEvent] = js.native
  /**
  	 * Occurs when the pointer leaves a Series.
  	 */
  var seriesPointerLeave: js.UndefOr[SeriesPointerLeaveEvent] = js.native
  /**
  	 * Occurs when the pointer moves over a Series.
  	 */
  var seriesPointerMove: js.UndefOr[SeriesPointerMoveEvent] = js.native
  /**
  	 * Occurs when the pointer is released over a Series.
  	 */
  var seriesPointerUp: js.UndefOr[SeriesPointerUpEvent] = js.native
  /**
  	 * Event raised when a series is removed from this chart.
  	 */
  var seriesRemoved: js.UndefOr[SeriesRemovedEvent] = js.native
  /**
  	 * The triangulated file source URI or an instance of $.ig.ShapeDataSource.
  	 */
  var shapeDataSource: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets text to display below the Title, above the plot area.
  	 */
  var subtitle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets horizontal alignment which determines the subtitle position, relative to the left and right edges of the control.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var subtitleAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the bottom margin of chart subtitle
  	 */
  var subtitleBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left margin of chart subtitle
  	 */
  var subtitleLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right margin of chart subtitle
  	 */
  var subtitleRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets color of chart subtitle
  	 */
  var subtitleTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets CSS font property for the chart subtitle
  	 */
  var subtitleTextStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the top margin of chart subtitle
  	 */
  var subtitleTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the thickness for all series in this chart. Depending on the ChartType, this can be the main brush used, or just the outline.
  	 */
  var thickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets text to display above the plot area.
  	 */
  var title: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets horizontal alignment which determines the title position, relative to the left and right edges of the control.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var titleAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the bottom margin of chart title
  	 */
  var titleBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left margin of chart title
  	 */
  var titleLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right margin of chart title
  	 */
  var titleRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets color of chart title
  	 */
  var titleTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets CSS font property for the chart title
  	 */
  var titleTextStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the top margin of chart title
  	 */
  var titleTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the style of tooltip to be displayed.
  	 *
  	 * Valid values:
  	 * "default" Display default tooltip for each series in the chart.
  	 * "item" Display individual tooltips for all series in the chart.
  	 * "category" Display combined tooltip for all series in the chart.
  	 * "none" Display no tooltips in the chart.
  	 */
  var toolTipType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the id of a template element to use for tooltips, or markup representing the tooltip template.
  	 */
  var tooltipTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the names of tooltip templates
  	 */
  var tooltipTemplates: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the top margin of the chart content.
  	 */
  var topMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the duration used for animating series plots when the data is changing
  	 */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the easing function used for animating series plots when the data is changing.
  	 * This can be set to one of the known values "linear" or "cubic," or it can be set to an easing function which takes a single numeric parameter and returns a number.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the palette of brushes to used for coloring trend lines in this chart.
  	 * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var trendLineBrushes: js.UndefOr[js.Any] = js.native
  var trendLinePeriod: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the thickness of the trend lines in this chart.
  	 * This property applies only to these chart types: point, line, spline, and bubble
  	 */
  var trendLineThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the formula used for calculating trend lines in this chart.This property applies only to these chart types: point, line, spline, and bubble
  	 *
  	 *
  	 * Valid values:
  	 * "none" No trend line will be displayed.
  	 * "linearFit" Linear fit.
  	 * "quadraticFit" Quadratic polynomial fit.
  	 * "cubicFit" Cubic polynomial fit.
  	 * "quarticFit" Quartic polynomial fit.
  	 * "quinticFit" Quintic polynomial fit.
  	 * "logarithmicFit" Logarithmic fit.
  	 * "exponentialFit" Exponential fit.
  	 * "powerLawFit" Powerlaw fit.
  	 * "simpleAverage" Simple moving average.
  	 * "exponentialAverage" Exponential moving average.
  	 * "modifiedAverage" Modified moving average.
  	 * "cumulativeAverage" Cumulative moving average.
  	 * "weightedAverage" Weighted moving average.
  	 */
  var trendLineType: js.UndefOr[String] = js.native
  /**
  	 * The triangulated file source URI or an instance of $.ig.TriangulationDataSource.
  	 */
  var triangulationDataSource: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the behavior that determines how unknown values will be plotted on the chart.Null and Double.NaN are two examples of unknown values.
  	 *
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the chart.
  	 */
  var unknownValuePlotting: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised before tooltip is updated.
  	 * Return false in order to cancel updating and hide tooltip.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.text to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
  	 * Use ui.item to obtain reference to item. Value of that member can be modified or replaced by custom item.
  	 * Use ui.x to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 * Use ui.y to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 * Use ui.element to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
  	 */
  var updateTooltip: js.UndefOr[UpdateTooltipEvent] = js.native
  /**
  	 * Gets or sets the widget of this control
  	 */
  var widget: js.UndefOr[js.Any] = js.native
  /**
  	 * The width of the chart.
  	 */
  var width: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the rectangle representing the current scroll and zoom state of the chart.
  	 * WindowRect is expressed as a Rectangle with coordinates and sizes between 0 and 1.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var windowRect: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets whether the large numbers on the X-axis labels are abbreviated.
  	 */
  var xAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the distance between the X-axis and the bottom of the chart.
  	 */
  var xAxisExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets function which takes an context object and returns a formatted label for the X-axis.
  	 */
  var xAxisFormatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the frequency of displayed labels along the X-axis.
  	 * Gets or sets the set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
  	 */
  var xAxisInterval: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether to invert the direction of the X-axis by placing the first data items on the right side of the chart.
  	 */
  var xAxisInverted: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the X-axis will use a logarithmic scale, instead of a linear one.
  	 * Since log(-1) is imaginary and log(0) is undefined, it is recommended to enable this property only when the X-axis minimum is greater than zero.
  	 */
  var xAxisIsLogarithmic: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the format for labels along the X-axis.
  	 */
  var xAxisLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the angle of rotation for labels along the X-axis.
  	 */
  var xAxisLabelAngle: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the bottom margin of labels on the X-axis
  	 */
  var xAxisLabelBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets Horizontal alignment of X-axis labels.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var xAxisLabelHorizontalAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the left margin of labels on the X-axis
  	 */
  var xAxisLabelLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right margin of labels on the X-axis
  	 */
  var xAxisLabelRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets color of labels on the X-axis
  	 */
  var xAxisLabelTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets CSS font property for labels on X-axis
  	 */
  var xAxisLabelTextStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the top margin of labels on the X-axis
  	 */
  var xAxisLabelTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets Vertical alignment of X-axis labels.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var xAxisLabelVerticalAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets Visibility of X-axis labels.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var xAxisLabelVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the base value to use in the log function when mapping the position of data items along the X-axis.
  	 * This property is effective only when y-axis is logarithmic
  	 */
  var xAxisLogarithmBase: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the data value corresponding to the maximum value on the X-axis.
  	 */
  var xAxisMaximumValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the data value corresponding to the minimum value on the X-axis.
  	 */
  var xAxisMinimumValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the frequency of displayed minor lines along the X-axis.
  	 * Gets or sets the set value is a factor that determines how the minor lines will be displayed.
  	 */
  var xAxisMinorInterval: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to stripes along the X-axis.
  	 */
  var xAxisStrip: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the color to apply to the X-axis line.
  	 */
  var xAxisStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to the X-axis line.
  	 */
  var xAxisStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the length of tickmarks along the X-axis.
  	 */
  var xAxisTickLength: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to tickmarks along the X-axis.
  	 */
  var xAxisTickStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to tickmarks along the X-axis.
  	 */
  var xAxisTickStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the Text to display below the X-axis.
  	 */
  var xAxisTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets Horizontal alignment of the X-axis title.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var xAxisTitleAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the angle of rotation for the X-axis title.
  	 */
  var xAxisTitleAngle: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the bottom margin of a title on the X-axis
  	 */
  var xAxisTitleBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left margin of a title on the X-axis
  	 */
  var xAxisTitleLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the margin around a title on the X-axis
  	 */
  var xAxisTitleMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right margin of a title on the X-axis
  	 */
  var xAxisTitleRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets color of title on the X-axis
  	 */
  var xAxisTitleTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets CSS font property for title on X-axis
  	 */
  var xAxisTitleTextStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the top margin of a title on the X-axis
  	 */
  var xAxisTitleTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether the large numbers on the Y-axis labels are abbreviated.
  	 */
  var yAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the distance between the Y-axis and the left edge of the chart.
  	 */
  var yAxisExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets function which takes a context object and returns a formatted label for the Y-axis.
  	 */
  var yAxisFormatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the distance between each label and grid line along the Y-axis.
  	 */
  var yAxisInterval: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether to invert the direction of the Y-axis by placing the minimum numeric value at the top of the chart.
  	 */
  var yAxisInverted: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the Y-axis should use a logarithmic scale instead of a linear one.
  	 * Since log(-1) is imaginary and log(0) is undefined, it is recommended to enable this property only when the Y-axis minimum is greater than zero.
  	 */
  var yAxisIsLogarithmic: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the property or string from which the labels are derived.
  	 */
  var yAxisLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the angle of rotation for labels along the Y-axis.
  	 */
  var yAxisLabelAngle: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the bottom margin of labels on the Y-axis
  	 */
  var yAxisLabelBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets Horizontal alignment of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var yAxisLabelHorizontalAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the left margin of labels on the Y-axis
  	 */
  var yAxisLabelLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * The location of Y-axis labels, relative to the plot area.
  	 *
  	 * Valid values:
  	 * "outsideTop" Places the axis labels at the top, outside of the plotting area.
  	 * "outsideBottom" Places the axis labels at the bottom, outside of the plotting area
  	 * "outsideLeft" Places the axis labels to the left, outside of the plotting area.
  	 * "outsideRight" Places the axis labels to the right, outside of the plotting area.
  	 * "insideTop" Places the axis labels inside the plotting area above the axis line.
  	 * "insideBottom" Places the axis labels inside the plotting area below the axis line.
  	 * "insideLeft" Places the axis labels inside the plotting area and to the left of the axis line.
  	 * "insideRight" Places the axis labels inside the plotting area and to the right of the axis line.
  	 */
  var yAxisLabelLocation: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the right margin of labels on the Y-axis
  	 */
  var yAxisLabelRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets color of labels on the Y-axis
  	 */
  var yAxisLabelTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets CSS font property for labels on Y-axis
  	 */
  var yAxisLabelTextStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the top margin of labels on the Y-axis
  	 */
  var yAxisLabelTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets Vertical alignment of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var yAxisLabelVerticalAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets Visibility of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var yAxisLabelVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the base value to use in the log function when mapping the position of data items along the Y-axis.
  	 * This property is effective only when YAxisIsLogarithmic is true.
  	 */
  var yAxisLogarithmBase: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to major gridlines along the Y-axis.
  	 */
  var yAxisMajorStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to major gridlines along the Y-axis.
  	 */
  var yAxisMajorStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the data value corresponding to the maximum value of the Y-axis.
  	 */
  var yAxisMaximumValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the data value corresponding to the minimum value of the Y-axis.
  	 */
  var yAxisMinimumValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the frequency of displayed minor lines along the Y-axis.
  	 */
  var yAxisMinorInterval: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to minor gridlines along the Y-axis.
  	 */
  var yAxisMinorStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to minor gridlines along the Y-axis.
  	 */
  var yAxisMinorStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to stripes along the Y-axis.
  	 */
  var yAxisStrip: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the color to apply to the Y-axis line.
  	 */
  var yAxisStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to the Y-axis line.
  	 */
  var yAxisStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the length of tickmarks along the Y-axis.
  	 */
  var yAxisTickLength: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to apply to tickmarks along the Y-axis.
  	 */
  var yAxisTickStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the thickness to apply to tickmarks along the Y-axis.
  	 */
  var yAxisTickStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the Text to display to the left of the Y-axis.
  	 */
  var yAxisTitle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets Vertical alignment of the Y-axis title.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var yAxisTitleAlignment: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the angle of rotation for the Y-axis title.
  	 */
  var yAxisTitleAngle: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the bottom margin of a title on the Y-axis
  	 */
  var yAxisTitleBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left margin of a title on the Y-axis
  	 */
  var yAxisTitleLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the margin around a title on the Y-axis
  	 */
  var yAxisTitleMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right margin of a title on the Y-axis
  	 */
  var yAxisTitleRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets color of title on the Y-axis
  	 */
  var yAxisTitleTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets CSS font property for title on Y-axis
  	 */
  var yAxisTitleTextStyle: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the top margin of a title on the Y-axis
  	 */
  var yAxisTitleTopMargin: js.UndefOr[Double] = js.native
}

object IgShapeChart {
  @scala.inline
  def apply(): IgShapeChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgShapeChart]
  }
  @scala.inline
  implicit class IgShapeChartOps[Self <: IgShapeChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignsGridLinesToPixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignsGridLinesToPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignsGridLinesToPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignsGridLinesToPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateSeriesWhenAxisRangeChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateSeriesWhenAxisRangeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateSeriesWhenAxisRangeChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateSeriesWhenAxisRangeChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushes")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutStyleUpdating(value: (/* event */ Event, /* ui */ CalloutStyleUpdatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStyleUpdating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCalloutStyleUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStyleUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutStyleUpdatingEventEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStyleUpdatingEventEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutStyleUpdatingEventEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStyleUpdatingEventEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutsContentMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsContentMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutsContentMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsContentMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutsItemsSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsItemsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutsItemsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsItemsSource")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutsLabelMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsLabelMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutsLabelMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsLabelMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutsXMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsXMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutsXMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsXMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutsYMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsYMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutsYMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutsYMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withChartType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateWrappedTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWrappedTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateWrappedTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWrappedTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairsAnnotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairsAnnotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairsAnnotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairsAnnotationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairsDisplayMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairsDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairsDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairsDisplayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairsSnapToData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairsSnapToData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairsSnapToData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairsSnapToData")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction2(value))
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
    def withDataSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseSource")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalValueAnnotationsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalValueAnnotationsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalValueAnnotationsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalValueAnnotationsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHideTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHorizontalZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalZoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHorizontalZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalZoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSeriesHighlightingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSeriesHighlightingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSeriesHighlightingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSeriesHighlightingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVerticalZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerticalZoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVerticalZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerticalZoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSource")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: js.Any): Self = {
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
    def withMarkerBrushes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBrushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerBrushes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBrushes")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerCollision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerCollision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerCollision")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMaxCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMaxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMaxCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOutlines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOutlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOutlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOutlines")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRecCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlines")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyChanged(value: (/* event */ Event, /* ui */ PropertyChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPropertyChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTotalRecCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTotalRecCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesAdded(value: (/* event */ Event, /* ui */ SeriesAddedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesPointerDown(value: (/* event */ Event, /* ui */ SeriesPointerDownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesPointerEnter(value: (/* event */ Event, /* ui */ SeriesPointerEnterEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesPointerLeave(value: (/* event */ Event, /* ui */ SeriesPointerLeaveEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesPointerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesPointerMove(value: (/* event */ Event, /* ui */ SeriesPointerMoveEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesPointerUp(value: (/* event */ Event, /* ui */ SeriesPointerUpEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesRemoved(value: (/* event */ Event, /* ui */ SeriesRemovedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesRemoved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeDataSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withTitleAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTipType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTipType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipType")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEasingFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEasingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEasingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEasingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLineBrushes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineBrushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineBrushes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineBrushes")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLinePeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLinePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLinePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLinePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineType")(js.undefined)
        ret
    }
    @scala.inline
    def withTriangulationDataSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangulationDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangulationDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangulationDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownValuePlotting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownValuePlotting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownValuePlotting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownValuePlotting")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowRect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRect")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAbbreviateLargeNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAbbreviateLargeNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAbbreviateLargeNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAbbreviateLargeNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisFormatLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisFormatLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisFormatLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisFormatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisInverted")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisIsLogarithmic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIsLogarithmic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisIsLogarithmic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIsLogarithmic")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelHorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelHorizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelVerticalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelVerticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelVerticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLabelVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLabelVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLabelVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisLogarithmBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLogarithmBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisLogarithmBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisLogarithmBase")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisMajorStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMajorStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisMajorStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMajorStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisMajorStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMajorStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisMajorStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMajorStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisMaximumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMaximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMaximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisMinimumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisMinorInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinorInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisMinorInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinorInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisMinorStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinorStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisMinorStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinorStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisMinorStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinorStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisMinorStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisMinorStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisStrip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisStrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisStrip")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTickLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTickLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTickLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTickLength")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTickStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTickStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTickStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTickStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTickStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTickStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTickStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTickStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisTitleTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisTitleTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisTitleTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAbbreviateLargeNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAbbreviateLargeNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAbbreviateLargeNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAbbreviateLargeNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisFormatLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisFormatLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisFormatLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisFormatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisInverted")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisIsLogarithmic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIsLogarithmic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisIsLogarithmic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIsLogarithmic")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelHorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelHorizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelVerticalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelVerticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelVerticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLabelVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLabelVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLabelVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisLogarithmBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLogarithmBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisLogarithmBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisLogarithmBase")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisMajorStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMajorStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisMajorStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMajorStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisMajorStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMajorStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisMajorStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMajorStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisMaximumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMaximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMaximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisMinimumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisMinorInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinorInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisMinorInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinorInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisMinorStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinorStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisMinorStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinorStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisMinorStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinorStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisMinorStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisMinorStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisStrip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisStrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisStrip")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTickLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTickLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTickLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTickLength")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTickStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTickStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTickStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTickStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTickStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTickStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTickStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTickStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleLeftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleRightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisTitleTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisTitleTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisTitleTopMargin")(js.undefined)
        ret
    }
  }
  
}

