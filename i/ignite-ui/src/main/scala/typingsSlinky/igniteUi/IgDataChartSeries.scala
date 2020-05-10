package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDataChartSeries
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets the effective angle axis for the current series object.
  	 */
  var angleAxis: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
  	 */
  var angleMemberPath: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the opacity modifier to apply to the area fill shape of the series, if applicable.
  	 */
  var areaFillOpacity: js.UndefOr[Double] = js.native
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the axis annotation.
  	 */
  var axisAnnoationFormatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the color to use for the axis annotation backing. Leave unset for an automatic value.
  	 */
  var axisAnnotationBackground: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the precision to use displaying values for interpolated crosshair positions.
  	 */
  var axisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the axis annotation outline. Leave unset for an automatic value.
  	 */
  var axisAnnotationOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the bottom padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingBottom: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingLeft: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingRight: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the top padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingTop: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness for the axis annotation backing. Leave unset for an automatic value.
  	 */
  var axisAnnotationStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the axis annotation text. Leave unset for an automatic value.
  	 */
  var axisAnnotationTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the width to use for the highlight region if highlighting items in a grid aligned series (line, spline, etc), with a banded shape.
  	 */
  var bandHighlightWidth: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the series.
  	 */
  var brush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush that specifies how the backgrounds for the callouts of the layer are painted.
  	 */
  var calloutBackground: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the strategy to use for avoiding collisions between the callouts in this layer. Leave unset for an automatic value.
  	 *
  	 * Valid values:
  	 * "auto" automatically decide the collision strategy.
  	 * "simulatedAnnealing" use a simulated annealing based collision strategy. This is higher quality, but takes longer, and is performed time-sliced in the background until an acceptable quality is reached.
  	 * "greedy" use a greedy algorithm to avoid collisions. This is cheap and predictable, but of comparatively low quality.
  	 * "greedyCenterOfMass" use a greedy algorithm with localized center of mass hints to avoid collisions. This is relatively cheap to perform, compared to the simulated annealing approach, but is of comparatively lower quality.
  	 */
  var calloutCollisionMode: js.UndefOr[String] = js.native
  /**
  	 * Sets or gets a function which lets you modify or provide the content for an automatically created callout.
  	 */
  var calloutContentUpdating: js.UndefOr[js.Any] = js.native
  /**
  	 * Sets or gets a function which lets you modify or provide the label for an automatically created callout.
  	 */
  var calloutLabelUpdating: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the brush that specifies how the leader lines for the callouts of the layer are painted.
  	 */
  var calloutLeaderBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush that specifies how the outlines for the callouts of the layer are painted.
  	 */
  var calloutOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the bottom padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingBottom: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingLeft: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingRight: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the top padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingTop: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the padding to add to the callout positioning. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPositionPadding: js.UndefOr[Double] = js.native
  /**
  	 * Sets or gets a function which lets you modify or provide the associated series for a data source provided callout.
  	 */
  var calloutSeriesSelecting: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the stroke thickness for the callout backing. Leave unset for an automatic value.
  	 */
  var calloutStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the callout text. Leave unset for an automatic value.
  	 */
  var calloutTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether to clip the series to the bounds.
  	 * Setting this to true can effect performance.
  	 */
  var clipSeriesToBounds: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the close mapping property for the current series object.
  	 */
  var closeMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or gets the coercion methods to use when loading data from data sources.
  	 * Should be specified before setting any member paths, if being used. Setting it later
  	 * will not cause data to be reimported into the chart.
  	 */
  var coercionMethods: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets value that is used to determine positioning logic for data items which have been consolidated into a single visual element.
  	 *
  	 * Valid values:
  	 * "maximum" Consolidated items will be positioned using their maximum value.
  	 * "minimum" Consolidated items will be positioned using their minimum value.
  	 * "median" Consolidated items will be positioned at the midpoint of the range.
  	 * "relativeMinimum" Consolidated items will be positioned using the value nearest to the reference value of the corresponding axis.
  	 * "relativeMaximum" Consolidated items will be positioned using the value farthest from the reference value of the corresponding axis.
  	 */
  var consolidatedColumnVerticalPosition: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the content mapping property for the callouts.
  	 */
  var contentMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Sets the position a cursor position to use instead of the current mouse cursor position for displaying the annotations in this layer.
  	 * Should be an object with an x and a y property in world coordinates (ranging from 0 to 1)
  	 */
  var cursorPosition: js.UndefOr[js.Any] = js.native
  /**
  	 * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the DiscreteLegendItemTemplate property.
  	 * The legend item control content is created according to the DiscreteLegendItemTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var discreteLegendItemTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the display for the current FinancialIndicator object.
  	 *
  	 * Valid values:
  	 * "candlestick" Displays prices as a Japanese Candlestick.
  	 * "OHLC" Displays prices as an OHLC bar.
  	 */
  var displayType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the series should expect that its data source members need to be called as functions to get their values.
  	 */
  var expectFunctions: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the fill mapping property for the current series object.
  	 */
  var fillMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush scale for the marker brush.
  	 */
  var fillScale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the stroke thickness for the y axis annotation backing. Leave unset for an automatic value.
  	 *
  	 * Valid values:
  	 * "auto" a mode is selected automatically
  	 * "finalVisible" displays the last value visible.
  	 * "finalVisibleInterpolated" displays an interploated last value for when the series leaves view.
  	 * "final" displays the last value in the series, whether visible or not.
  	 */
  var finalValueSelectionMode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the value that maps to the maximum heat color.
  	 */
  var heatMaximum: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the maximum heat color for the density scale.
  	 */
  var heatMaximumColor: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the density value that maps to the minimum heat color.
  	 */
  var heatMinimum: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the minimum heat color for the density scale.
  	 */
  var heatMinimumColor: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var highMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets which type of highlight shape to use when highlighting items.
  	 *
  	 * Valid values:
  	 * "auto" use an automatic highlight type for this series.
  	 * "marker" use a marker highlight type for this series.
  	 * "shape" use a shape highlight type for this series.
  	 */
  var highlightType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets which type of hit testing the series should use.
  	 *
  	 * Valid values:
  	 * "auto" automatically decide the appropriate hit test mode for the series.
  	 * "computational" use a computational based approach to determine whether the series has been hit. This uses loose bounding boxes, in some cases, and can range in time complexity between O(1) and O(log n) to find a hit. This decreases frame render time compared to color encoded.
  	 * "colorEncoded" use a color encoded off screen buffer for hit testing. This can have extremely rare false positives where the wrong series is hit (this is due to our inability to disable anti-aliasing in our color buffer), but should always be O(1) time for determining a hit series. This increases frame render time, however. Consider using this if hit testing time is degrading performance.
  	 */
  var hitTestMode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the color to use for the horizontal line. Leave null for an automatic value.
  	 */
  var horizontalLineStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the horizontal crosshair portion of the layer should be visible.
  	 *
  	 * Valid values:
  	 * "visible" the horizontal crosshair portion of the layer should be visible.
  	 * "collapsed" the horizontal crosshair portion of the layer should not be visible.
  	 */
  var horizontalLineVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the number of values to hide at the beginning of the indicator.
  	 */
  var ignoreFirst: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether to draw annotations over the axes where the crosshair meets with them.
  	 */
  var isAxisAnnotationEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether to allow the callouts to be variable distances from the target points, for suppporting collision modes.
  	 */
  var isCalloutOffsettingEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether a custom category marker style is allowed. Setting this to true will case the assigningCategoryMarkerStyle event to get fired, if provided.
  	 */
  var isCustomCategoryMarkerStyleAllowed: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether a custom category style is allowed. Setting this to true will case the assigningCategoryStyle event to get fired, if provided.
  	 */
  var isCustomCategoryStyleAllowed: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets if the presence of this layer should disable the default crosshair behavior of the chart, if present.
  	 */
  var isDefaultCrosshairDisabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether drop shadow should be enabled for this series.
  	 */
  var isDropShadowEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether highlighting should be enabled for the series, if supported.
  	 */
  var isHighlightingEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets if the series should play a transition in animation when the data source is assigned. Note: Transitions are not currently supported for stacked series.
  	 */
  var isTransitionInEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the key mapping property for the callouts.
  	 */
  var keyMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the Label mapping property for the current series object.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
  	 */
  var legend: js.UndefOr[IgDataChartSeriesLegend] = js.native
  /**
  	 * Gets or sets the LegendItemBadgeTemplate property.
  	 * The legend item badge is created according to the LegendItemBadgeTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure.
  	 * These are functions which will be called that will be called to handle the user specified custom rendering.
  	 * measure will be passed an object that looks like this:
  	 * {
  	 * context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
  	 * width: [if value is present, specifies the available width, user may set to desired width for content],
  	 * height: [if value is present, specifies the available height, user may set to desired height for content],
  	 * isConstant: [user should set to true if desired with and height will always be the same for this template],
  	 * data: [if present, represents the contextual data for this template]
  	 * }
  	 * render will be passed an object that looks like this:
  	 * {
  	 * context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
  	 * xPosition: [if present, specifies the x position at which to render the content],
  	 * yPosition: [if present, specifies the y position at which to render the content],
  	 * availableWidth: [if present, specifies the available width in which to render the content],
  	 * availableHeight: [if present, specifies the available height in which to render the content],
  	 * data: [if present, specifies the data that is in context for this content],
  	 * isHitTestRender: [if true, indicates that this is a special render pass for hit testing, in which case the brushes from the data should be used]
  	 * }
  	 */
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the LegendItemTemplate property.
  	 * The legend item control content is created according to the LegendItemTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var legendItemTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the legend item visibility for the current series object.
  	 *
  	 * Valid values:
  	 * "visible" The legend item should be visible.
  	 * "collapsed" The legend item should not be visible.
  	 */
  var legendItemVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for long AVO periods is 30.
  	 */
  var longPeriod: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var lowMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush that specifies how the current series object's marker interiors are painted.
  	 */
  var markerBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the MarkerCollisionAvoidance
  	 *
  	 * Valid values:
  	 * "none" No collision avoidance is attempted.
  	 * "omit" Markers that collide will be omitted.
  	 * "fade" Markers that collide will be faded in opacity.
  	 * "omitAndShift" Markers that collide may be shifted or omitted.
  	 */
  var markerCollisionAvoidance: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush that specifies how the current series object's marker outlines are painted.
  	 */
  var markerOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the MarkerTemplate for the current series object.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var markerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the marker type for the current series object. If the MarkerTemplate property is set, the setting of the MarkerType property will be ignored.
  	 *
  	 * Valid values:
  	 * "unset" Marker hasn't been set.
  	 * "none" No markerItems.
  	 * "automatic" Automatic marker shape.
  	 * "circle" Circle marker shape.
  	 * "triangle" Flat-top triangle marker shape.
  	 * "pyramid" Flat-base triangle marker shape.
  	 * "square" Square marker shape.
  	 * "diamond" Diamond marker shape.
  	 * "pentagon" Pentagon marker shape.
  	 * "hexagon" Hexagon marker shape.
  	 * "tetragram" Four-pointed star marker shape.
  	 * "pentagram" Five-pointed star marker shape.
  	 * "hexagram" Six-pointed star marker shape.
  	 */
  var markerType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the maximum number of markerItems displayed by the current series.
  	 * If more than the specified number of markerItems are visible, the series will automatically
  	 * choose a representative set.
  	 */
  var maximumMarkers: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether the chart reacts to mouse move events.
  	 */
  var mouseOverEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * The unique identifier of the series.
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for negative portions of the series.
  	 */
  var negativeBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the open mapping property for the current series object.
  	 */
  var openMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for the outline of the series.
  	 * Some series types, such as LineSeries, do not display outlines.  Therefore, this property does not affect some charts.
  	 */
  var outline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the moving average period for the current AverageDirectionalIndexIndicator object.
  	 * The typical, and initial, value for AverageDirectionalIndexIndicator periods is 14.
  	 */
  var period: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether to progressively load the data into the chart.
  	 */
  var progressiveLoad: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the corner radius to use for the series, if applicable.
  	 */
  var radius: js.UndefOr[Double] = js.native
  /**
  	 * Gets the effective radius axis for the current series object.
  	 */
  var radiusAxis: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the radius mapping property for the current series object.
  	 */
  var radiusMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the radius size scale for the bubbles.
  	 */
  var radiusScale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
  	 */
  var radiusX: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the y-radius of the ellipse that is used to round the corners of the column.
  	 */
  var radiusY: js.UndefOr[Double] = js.native
  /**
  	 * Set to true in order to have an existing series removed from the chart, by name
  	 */
  var remove: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the current series object's rendering resolution.
  	 */
  var resolution: js.UndefOr[Double] = js.native
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Sets whether the order of the fragment series should be reversed in the legend. Note: Reversing the legend order is only supported on stacked series.
  	 */
  var reverseLegendOrder: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the series for stacked charts. It should contain array of series objects. Each item in array should represent a series with  and it may have most options supported by top-level series object, such as xAxis, yAxis, valueMemberPath, etc.
  	 */
  var series: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets or sets the blur amount to use for the drop shadow.
  	 */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the drop shadow.
  	 */
  var shadowColor: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the x offset amount to use for the drop shadow.
  	 */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the y offset amount to use for the drop shadow.
  	 */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for short AVO periods is 10.
  	 */
  var shortPeriod: js.UndefOr[Double] = js.native
  /**
  	 * Whether the chart should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the hover layer should skip unknown values when trying to find the closest values.
  	 */
  var skipUnknownValues: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the type of spline to be rendered.
  	 *
  	 * Valid values:
  	 * "natural" Calculates the spline using a natural spline calculation formula.
  	 * "clamped" Calculated the spline using a clamped spline calculation formula.
  	 */
  var splineType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the name of the target axis for the layer, if desired. Setting the target axis will scope the layer to target just that axis.
  	 */
  var targetAxis: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the name of the target series for the layer, if desired. Setting the target series will scope the layer to target just that series.
  	 */
  var targetSeries: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the width of the current series object's line thickness.
  	 */
  var thickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the Title property.
  	 * The legend item control is created according to the Title on-demand by
  	 * the series object itself.
  	 */
  var title: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the Position to apply to the tooltip containers.
  	 *
  	 * Valid values:
  	 * "auto" use an automatic position for the category tooltips.
  	 * "outsideStart" position the category tooltip at the outside start of the value axis.
  	 * "insideStart" position the category tooltip at the inside start of the value axis.
  	 * "insideEnd" position the category tooltip at the inside end of the value axis.
  	 * "outsideEnd" position the category tooltip at the outside end of the value axis.
  	 */
  var tooltipPosition: js.UndefOr[String] = js.native
  /**
  	 * The name of template or the template itself that chart tooltip will use to render.
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the duration of the current series's morph.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
  	 * Provides an easing function to use for the transitions. This should either be a well known name of an easing function (The only currently supported name is cubic), or it should be a function that takes a number and returns the output with the function applied.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the duration of the current series's transition in morph in milliseconds.
  	 */
  var transitionInDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the method to transition in the series. Note: Transitions are not currently supported for stacked series.
  	 *
  	 * Valid values:
  	 * "auto" Series transitions in an automatically chosen way.
  	 * "fromZero" Series transitions in from the reference value of the value axis.
  	 * "sweepFromLeft" Series sweeps in from the left.
  	 * "sweepFromRight" Series sweeps in from the right.
  	 * "sweepFromTop" Series sweeps in from the top.
  	 * "sweepFromBottom" Series sweeps in from the bottom.
  	 * "sweepFromCenter" Series sweeps in from the center.
  	 * "accordionFromLeft" Series accordions in from the left.
  	 * "accordionFromRight" Series accordions in from the right.
  	 * "accordionFromTop" Series accordions in from the top.
  	 * "accordionFromBottom" Series accordions in from the bottom.
  	 * "expand" Series expands from the value midpoints.
  	 * "sweepFromCategoryAxisMinimum" Series sweeps in from the category axis minimum.
  	 * "sweepFromCategoryAxisMaximum" Series sweeps in from the category axis maximum.
  	 * "sweepFromValueAxisMinimum" Series sweeps in from the value axis minimum.
  	 * "sweepFromValueAxisMaximum" Series sweeps in from the value axis maximum.
  	 * "accordionFromCategoryAxisMinimum" Series accordions in from the category axis minimum.
  	 * "accordionFromCategoryAxisMaximum" Series accordions in from the category axis maximum.
  	 * "accordionFromValueAxisMinimum" Series accordions in from the value axis minimum.
  	 * "accordionFromValueAxisMaximum" Series accordions in from the value axis maximum.
  	 */
  var transitionInMode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the speed to transition in the series data points.
  	 *
  	 * Valid values:
  	 * "auto" A speed type is automatically selected.
  	 * "normal" All speeds are normal, data points will arrive at the same time.
  	 * "valueScaled" Data points will arrive later if their value is further from the start point.
  	 * "indexScaled" Data points will arrive later if their index is further from the axis origin.
  	 * "random" Data points will arrive at random times.
  	 */
  var transitionInSpeedType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use to draw the trend line.
  	 */
  var trendLineBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the moving average period for the current scatter series object.
  	 * The typical, and initial, value for trend line period is 7.
  	 */
  var trendLinePeriod: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the thickness of the current scatter series object's trend line.
  	 */
  var trendLineThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the trend type for the current scatter series.
  	 *
  	 * Valid values:
  	 * "none" No trendline should display.
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
  	 * Gets or sets the Z-Index of the trend line.  Values greater than 1000 will result in the trend line being rendered in front of the series data.
  	 */
  var trendLineZIndex: js.UndefOr[Double] = js.native
  /**
  	 * Type of the series.
  	 *
  	 * Valid values:
  	 * "area" Specify the series as Area series.
  	 * "bar" Specify the series as Bar series.
  	 * "column" Specify the series as Column series.
  	 * "line" Specify the series as Line series.
  	 * "rangeArea" Specify the series as Range Area series.
  	 * "rangeColumn" Specify the series as Range Column series.
  	 * "splineArea" Specify the series as Spline Area series.
  	 * "spline" Specify the series as Spline series.
  	 * "stepArea" Specify the series as Step Area series.
  	 * "stepLine" Specify the series as Step Line series.
  	 * "waterfall" Specify the series as Waterfall series.
  	 * "financial" Specify the series as Financial series.
  	 * "typicalPriceIndicator" Specify the series as Typical Price Indicator series.
  	 * "point" Specify the series as Point series.
  	 * "polarSplineArea" Specify the series as Polar Spline Area series.
  	 * "polarSpline" Specify the series as Polar Spline series.
  	 * "polarArea" Specify the series as Polar Area series.
  	 * "polarLine" Specify the series as Polar Line series.
  	 * "polarScatter" Specify the series as Polar Scatter series.
  	 * "radialColumn" Specify the series as Radial Column series.
  	 * "radialLine" Specify the series as Radial Line series.
  	 * "radialPie" Specify the series as Radial Pie series.
  	 * "radialArea" Specify the series as Radial Area series.
  	 * "scatter" Specify the series as Scatter series.
  	 * "scatterLine" Specify the series as Scatter Line series.
  	 * "scatterSpline" Specify the series as Scatter Spline series.
  	 * "scatterArea" Specify the series as Scatter Area series.
  	 * "scatterContour" Specify the series as Scatter Contour series.
  	 * "scatterPolygon" Specify the series as Scatter Polygon series.
  	 * "scatterPolyline" Specify the series as Scatter Polyline series.
  	 * "bubble" Specify the series as Bubble series.
  	 * "absoluteVolumeOscillatorIndicator" Specify the series as Absolute Volume Oscillator Indicator series.
  	 * "averageTrueRangeIndicator" Specify the series as Average True Range Indicator series.
  	 * "accumulationDistributionIndicator" Specify the series as Accumulation Distribution Indicator series
  	 * "averageDirectionalIndexIndicator" Specify the series as Average Directional Index Indicator series.
  	 * "bollingerBandWidthIndicator" Specify the series as Bollinger Band Width Indicator series.
  	 * "chaikinOscillatorIndicator" Specify the series as Chaikin Oscillator Indicator series.
  	 * "chaikinVolatilityIndicator" Specify the series as Chaikin Volitility Indicator series.
  	 * "commodityChannelIndexIndicator" Specify the series as Commodity Channel Index Indicator series.
  	 * "detrendedPriceOscillatorIndicator" Specify the series as Detrended Price Oscillator Indicator series.
  	 * "easeOfMovementIndicator" Specify the series as Ease Of Movement Indicator series.
  	 * "fastStochasticOscillatorIndicator" Specify the series as Fast Stochastic Oscillator Indicator series.
  	 * "forceIndexIndicator" Specify the series as Force Index Indicator series.
  	 * "fullStochasticOscillatorIndicator" Specify the series as Full Stochastic Oscillator Indicator series.
  	 * "marketFacilitationIndexIndicator" Specify the series as Market Facilitation Index Indicator series.
  	 * "massIndexIndicator" Specify the series as Mass Index Indicator series.
  	 * "medianPriceIndicator" Specify the series as Median Price Indicator series.
  	 * "moneyFlowIndexIndicator" Specify the series as Money Flow Index Indicator series.
  	 * "movingAverageConvergenceDivergenceIndicator" Specify the series as Moving Average Convergence Divergence Indicator series.
  	 * "negativeVolumeIndexIndicator" Specify the series as Negative Volume Index Indicator series.
  	 * "onBalanceVolumeIndicator" Specify the series as On Balance Volume Indicator series.
  	 * "percentagePriceOscillatorIndicator" Specify the series as Percentage Price Oscillator Indicator series.
  	 * "percentageVolumeOscillatorIndicator" Specify the series as Percentage Volume Oscillator Indicator series.
  	 * "positiveVolumeIndexIndicator" Specify the series as Positive Volume Index Indicator series.
  	 * "priceVolumeTrendIndictor" Specify the series as Price Volume Trend Indictor series.
  	 * "rateOfChangeAndMomentumIndicator" Specify the series as Rate Of Change And Momentum Indicator series.
  	 * "relativeStrengthIndexIndicator" Specify the series as Relative Strength Index Indicator series.
  	 * "slowStochasticOscillatorIndicator" Specify the series as Slow Stochastic Oscillator Indicator series.
  	 * "standardDeviationIndicator" Specify the series as Standard Deviation Indicator series.
  	 * "stochRSIIndicator" Specify the series as Stoch RSI Indicator series.
  	 * "trixIndicator" Specify the series as Trix Indicator series.
  	 * "ultimateOscillatorIndicator" Specify the series as Ultimate Oscillator Indicator series.
  	 * "weightedCloseIndicator" Specify the series as Weighted Close Indicator series.
  	 * "williamsPercentRIndicator" Specify the series as Williams Percent R Indicator series.
  	 * "bollingerBandsOverlay" Specify the series as Bollinger Bands Overlay series.
  	 * "priceChannelOverlay" Specify the series as Price Channel Overlay series.
  	 * "customIndicator" Specify the series as Custom Indicator series.
  	 * "stackedBar" Specify the series as Stacked Bar series.
  	 * "stacked100Bar" Specify the series as Stacked 100 Bar series.
  	 * "stackedArea" Specify the series as Stacked Area series.
  	 * "stacked100Area" Specify the series as Stacked 100 Area series.
  	 * "stackedColumn" Specify the series as Stacked Column series.
  	 * "stacked100Column" Specify the series as Stacked 100 Column series.
  	 * "stackedLine" Specify the series as Stacked Line series.
  	 * "stacked100Line" Specify the series as Stacked 100 Line series.
  	 * "stackedSpline" Specify the series as Stacked Spline series.
  	 * "stacked100Spline" Specify the series as Stacked 100 Spline series.
  	 * "stackedSplineArea" Specify the series as Stacked Spline Area series.
  	 * "stacked100SplineArea" Specify the series as Stacked 100 Spline Area series.
  	 * "crosshairLayer" Specify the series as a crosshair layer.
  	 * "categoryHighlightLayer" Specify the series as a category highlight layer.
  	 * "categoryItemHighlightLayer" Specify the series as a category item highlight layer.
  	 * "itemToolTipLayer" Specify the series as an item tooltip layer.
  	 * "categoryToolTipLayer" Specify the series as a category tooltip layer.
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Determines how unknown values will be plotted on the chart. Null and Double.NaN are two examples of unknown values.
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the chart.
  	 */
  var unknownValuePlotting: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether to use use brute force mode.
  	 */
  var useBruteForce: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether Cartesian Interpolation should be used rather than Archimedian
  	 * spiral based interpolation.
  	 */
  var useCartesianInterpolation: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets or Gets whether to increase marker fidelity for extreme data shapes that have lots of Y variation over short X intervals.
  	 */
  var useHighMarkerFidelity: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets if the current layer should take up a brush/ordering index in the series collection to derive its color automatically.
  	 */
  var useIndex: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the hover layer should use interpolation to position itself relative the closest values.
  	 */
  var useInterpolation: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets if the current layer should have an entry in the legend of the chart. By default annotation layers are not present in the legend.
  	 */
  var useLegend: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether drop shadow is applied to the whole series visual or to each of the individual shapes forming the series.
  	 */
  var useSingleShadow: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether to use squares when halting a render traversal rather than the shape of the coalesced area.
  	 */
  var useSquareCutoffStyle: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the effective value axis for the current series object.
  	 */
  var valueAxis: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the item path that provides the values for the current series.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the color to use for the vertical line. Leave null for an automatic value.
  	 */
  var verticalLineStroke: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether the vertical crosshair portion of the layer should be visible.
  	 *
  	 * Valid values:
  	 * "visible" the vertical crosshair portion of the layer should be visible.
  	 * "collapsed" the vertical crosshair portion of the layer should not be visible.
  	 */
  var verticalLineVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the volume mapping property for the current series object.
  	 */
  var volumeMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the effective x-axis for the current object.
  	 */
  var xAxis: js.UndefOr[String] = js.native
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the x axis annotation.
  	 */
  var xAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the color to use for the x axis annotation backing. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationBackground: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the precision to use displaying values for interpolated crosshair positions.
  	 */
  var xAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the x axis annotation outline. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the bottom padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingRight: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the top padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingTop: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness for the x axis annotation backing. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the x axis annotation text. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var xMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the effective y-axis for the current object.
  	 */
  var yAxis: js.UndefOr[String] = js.native
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the y axis annotation.
  	 */
  var yAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the color to use for the y axis annotation backing. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationBackground: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the precision to use displaying values for interpolated crosshair positions.
  	 */
  var yAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the y axis annotation outline. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the bottom padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the left padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the right padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingRight: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the top padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingTop: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness for the y axis annotation backing. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the color to use for the y axis annotation text. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationTextColor: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var yMemberPath: js.UndefOr[String] = js.native
}

object IgDataChartSeries {
  @scala.inline
  def apply(): IgDataChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartSeries]
  }
  @scala.inline
  implicit class IgDataChartSeriesOps[Self <: IgDataChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withAngleMemberPath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withAreaFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaFillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaFillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnoationFormatLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnoationFormatLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnoationFormatLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnoationFormatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationInterpolatedValuePrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationInterpolatedValuePrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationInterpolatedValuePrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationInterpolatedValuePrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationPaddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisAnnotationTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisAnnotationTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisAnnotationTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBandHighlightWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandHighlightWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandHighlightWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandHighlightWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutCollisionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutCollisionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutCollisionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutCollisionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutContentUpdating(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutContentUpdating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutContentUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutContentUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutLabelUpdating(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutLabelUpdating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutLabelUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutLabelUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutLeaderBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutLeaderBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutLeaderBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutLeaderBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPaddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutPositionPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPositionPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutPositionPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutPositionPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutSeriesSelecting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutSeriesSelecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutSeriesSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutSeriesSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClipSeriesToBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipSeriesToBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipSeriesToBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipSeriesToBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCoercionMethods(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoercionMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withConsolidatedColumnVerticalPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidatedColumnVerticalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsolidatedColumnVerticalPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidatedColumnVerticalPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withContentMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorPosition")(js.undefined)
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
    def withDiscreteLegendItemTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discreteLegendItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscreteLegendItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discreteLegendItemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withFillMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withFillScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillScale")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalValueSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalValueSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalValueSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalValueSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatMaximumColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMaximumColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatMaximumColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMaximumColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatMinimumColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMinimumColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatMinimumColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMinimumColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHighMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightType")(js.undefined)
        ret
    }
    @scala.inline
    def withHitTestMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTestMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitTestMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTestMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLineStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLineStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLineStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLineStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLineVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLineVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLineVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLineVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAxisAnnotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAxisAnnotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAxisAnnotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAxisAnnotationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCalloutOffsettingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalloutOffsettingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCalloutOffsettingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalloutOffsettingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCustomCategoryMarkerStyleAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomCategoryMarkerStyleAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCustomCategoryMarkerStyleAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomCategoryMarkerStyleAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCustomCategoryStyleAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomCategoryStyleAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCustomCategoryStyleAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomCategoryStyleAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultCrosshairDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultCrosshairDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultCrosshairDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultCrosshairDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDropShadowEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropShadowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropShadowEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropShadowEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHighlightingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHighlightingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHighlightingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHighlightingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTransitionInEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransitionInEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTransitionInEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransitionInEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: IgDataChartSeriesLegend): Self = {
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
    def withLegendItemBadgeTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemBadgeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendItemBadgeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemBadgeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendItemVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withLongPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withLowMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerCollisionAvoidance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerCollisionAvoidance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerCollisionAvoidance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerCollisionAvoidance")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumMarkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseOverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverEnabled")(js.undefined)
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
    def withNegativeBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusScale")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusX")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusY")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
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
    def withReverseLegendOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseLegendOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseLegendOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseLegendOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[_]): Self = {
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
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withShortPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipUnknownValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUnknownValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipUnknownValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUnknownValues")(js.undefined)
        ret
    }
    @scala.inline
    def withSplineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splineType")(js.undefined)
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
    def withTargetSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSeries")(js.undefined)
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
    def withTooltipPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplate(value: String): Self = {
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
    def withTransitionInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionInDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionInMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionInMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionInSpeedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInSpeedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionInSpeedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInSpeedType")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendLineBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineBrush")(js.undefined)
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
    def withTrendLineZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrendLineZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendLineZIndex")(js.undefined)
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
    def withUseBruteForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBruteForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBruteForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBruteForce")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCartesianInterpolation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCartesianInterpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCartesianInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCartesianInterpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHighMarkerFidelity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighMarkerFidelity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHighMarkerFidelity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHighMarkerFidelity")(js.undefined)
        ret
    }
    @scala.inline
    def withUseIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUseInterpolation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInterpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInterpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSingleShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSingleShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSquareCutoffStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSquareCutoffStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSquareCutoffStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSquareCutoffStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAxis(value: String): Self = {
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
    def withValueMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLineStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLineStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLineStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLineStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLineVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLineVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLineVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLineVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: String): Self = {
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
    def withXAxisAnnoationFormatLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnoationFormatLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnoationFormatLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnoationFormatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationInterpolatedValuePrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationInterpolatedValuePrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationInterpolatedValuePrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationInterpolatedValuePrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationPaddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisAnnotationTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisAnnotationTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisAnnotationTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withXMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: String): Self = {
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
    def withYAxisAnnoationFormatLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnoationFormatLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnoationFormatLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnoationFormatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationInterpolatedValuePrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationInterpolatedValuePrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationInterpolatedValuePrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationInterpolatedValuePrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationPaddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisAnnotationTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisAnnotationTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisAnnotationTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withYMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMemberPath")(js.undefined)
        ret
    }
  }
  
}

