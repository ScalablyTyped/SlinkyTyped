package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDataChart
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Set to true in order to override the default behavior in which series do not animate if an axis range changes
  	 */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired to allow you to override the style of markers for the items in a category or financial series. Only fires if you set allowCustomCategoryMarkerStyle to true for a series.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.startIndex to get the start index for the current items.
  	 * Use ui.endIndex to get the end index for the current items.
  	 * Use ui.hasDateRange to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
  	 * Use ui.startDate if ui.hasDateRange is true.
  	 * Use ui.endDate if ui.hasDateRange is true.
  	 * Use ui.getItems to get all the items associated with the event (only if necessary).
  	 * Use ui.fill to get or set the fill to use for the current item.
  	 * Use ui.stroke to get or set the stroke to use for the current item.
  	 * Use ui.opacity to get or set the opacity to use for the current item.
  	 * Use ui.highlightingHandled to set if the default highlighting behavior should not run, given that you are handling it in this event.
  	 * Use ui.maxAllSeriesHighlightingProgress to get the maximum highlighted progress across all series.
  	 * Use ui.sumAllSeriesHighlightingProgress to get the sum of highlighting progtess across all series.
  	 * Use ui.highlightingInfo.progress to tell what the highlighting progress is for the current item, if highlightingInfo is not null.
  	 * Use ui.highlightingInfo.state to tell whether the current item is currently highlighting in or out, is static, if highlightingInfo is not null.
  	 */
  var assigningCategoryMarkerStyle: js.UndefOr[AssigningCategoryMarkerStyleEvent] = js.native
  /**
  	 * Event fired to allow you to override the style of items in a category or financial series. Only fires if you set allowCustomCategoryStyle to true for a series.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.startIndex to get the start index for the current items.
  	 * Use ui.endIndex to get the end index for the current items.
  	 * Use ui.hasDateRange to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
  	 * Use ui.startDate if ui.hasDateRange is true.
  	 * Use ui.endDate if ui.hasDateRange is true.
  	 * Use ui.getItems to get all the items associated with the event (only if necessary).
  	 * Use ui.fill to get or set the fill to use for the current item.
  	 * Use ui.stroke to get or set the stroke to use for the current item.
  	 * Use ui.opacity to get or set the opacity to use for the current item.
  	 * Use ui.highlightingHandled to set if the default highlighting behavior should not run, given that you are handling it in this event.
  	 * Use ui.maxAllSeriesHighlightingProgress to get the maximum highlighted progress across all series.
  	 * Use ui.sumAllSeriesHighlightingProgress to get the sum of highlighting progtess across all series.
  	 * Use ui.highlightingInfo.progress to tell what the highlighting progress is for the current item, if highlightingInfo is not null.
  	 * Use ui.highlightingInfo.state to tell whether the current item is currently highlighting in or out, is static, if highlightingInfo is not null.
  	 */
  var assigningCategoryStyle: js.UndefOr[AssigningCategoryStyleEvent] = js.native
  /**
  	 * Sets or gets the automatic height to add when automatically adding margins to the chart.
  	 */
  var autoMarginHeight: js.UndefOr[Double] = js.native
  /**
  	 * Sets or gets the automatic width to add when automatically adding margins to the chart.
  	 */
  var autoMarginWidth: js.UndefOr[Double] = js.native
  /**
  	 * An array of axis objects
  	 */
  var axes: js.UndefOr[js.Array[IgDataChartAxes]] = js.native
  /**
  	 * Event fired when the range of and axis on the chart changes.
  	 * Function takes arguments evt and ui.
  	 * Use ui.axis to get reference to current chart axis object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.newMaximumValue to get new maximum value.
  	 * Use ui.newMinimumValue to get new minimum value.
  	 * Use ui.oldMaximumValue to get old maximum value.
  	 * Use ui.oldMinimumValue to get old minimum value.
  	 */
  var axisRangeChanged: js.UndefOr[AxisRangeChangedEvent] = js.native
  /**
  	 * Sets or gets the bottom margin to use around the chart content in the canvas.
  	 */
  var bottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * Event fired when the control is displayed on a non HTML5 compliant browser
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  /**
  	 * Gets or sets the Brushes property.
  	 * The brushes property defines the palette from which automatically assigned series brushes are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the template to use for circle markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of circle.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var circleMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets which type of hit testing the series should use.
  	 *
  	 * Valid values:
  	 * "auto" automatically decide the appropriate hit test mode for the series.
  	 * "computational" use a computational based approach to determine which series has been hit. This uses loose bounding boxes, in some cases, and can range in time complexity between O(1) and O(log n) to find a hit. This decreases frame render time compared to color encoded.
  	 * "colorEncoded" use a color encoded off screen buffer for hit testing. This can have extremely rare false positives where the wrong series is hit (this is due to our inability to disable anti-aliasing in our color buffer), but should always be O(1) time for determining a hit series. This increases frame render time, however. Consider using this if hit testing time is degrading performance.
  	 * "mixed" let each series decide which hit testing mode to use individually based on their own hit test mode.
  	 * "mixedFavoringComputational" let each series decide which hit testing mode to use individually based on their own hit test mode, but evaluate all computational hits before evaluating any color encoding hits.
  	 */
  var contentHitTestMode: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the cross hair point (in world coordinates)
  	 * Either or both of the crosshair point's X and Y may be set to double.NaN, in which
  	 * case the relevant crosshair line is hidden.
  	 */
  var crosshairPoint: js.UndefOr[IgDataChartCrosshairPoint] = js.native
  /**
  	 * Gets or sets the current Chart's crosshair visibility override.  Note: setting this property does not affect the mobile browser version of the chart.
  	 *
  	 * Valid values:
  	 * "visible" Crosshair should be visible.
  	 * "collapsed" Crosshair should not be visible.
  	 */
  var crosshairVisibility: js.UndefOr[String] = js.native
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
  	 * Gets or sets the DefaultInteraction property. The default interaction state defines the chart's response to mouse events.
  	 *
  	 * Valid values:
  	 * "none" User gesture will not change the state of the chart.
  	 * "dragZoom" User gesture will start a drag rectangle to zoom the chart.
  	 * "dragPan" User gesture will start a pan action to move the chart's window.
  	 */
  var defaultInteraction: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the template to use for diamond markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of diamond.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var diamondMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the current Chart's DragModifier property.
  	 *
  	 * Valid values:
  	 * "none" No modifier key is set.
  	 * "alt" The modifier is set to alt key.
  	 * "control" The modifier is set to control key.
  	 * "shift" The modifier is set to shift key.
  	 */
  var dragModifier: js.UndefOr[String] = js.native
  /**
  	 * Occurs just after the current Chart's grid area rectangle is changed.
  	 * The grid area may change as the result of the Chart being resized, or
  	 * of an axis being added or changing size, possibly in another Chart.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.newHeight to get new height value.
  	 * Use ui.newLeft to get new left value.
  	 * Use ui.newTop to get new top value.
  	 * Use ui.newWidth to get new top value.
  	 * Use ui.oldHeight to get old height value.
  	 * Use ui.oldLeft to get old left value.
  	 * Use ui.oldTop to get old top value.
  	 * Use ui.oldWidth to get old top value.
  	 */
  var gridAreaRectChanged: js.UndefOr[GridAreaRectChangedEvent] = js.native
  /**
  	 * Gets or sets the GridMode property.
  	 *
  	 * Valid values:
  	 * "none" No chart grid.
  	 * "beforeSeries" Chart grid should be rendered before or in front of the data series.
  	 * "behindSeries" Chart grid should be rendered behind or in back of the data series.
  	 */
  var gridMode: js.UndefOr[String] = js.native
  /**
  	 * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets or sets the template to use for hexagon markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of hexagon.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var hexagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the template to use for hexagram markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of hexagram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var hexagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * The length, in milliseconds of the highlighting transition.
  	 */
  var highlightingTransitionDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the current Chart's horizontal zoomability.  This option is deprecated - please use `isHorizontalZoomEnabled` instead.
  	 */
  var horizontalZoomable: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the current Chart's horizontal zoomability.
  	 */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether the series viewer can allow the page to pan if a control pan is not possible in the requested direction.
  	 */
  var isPagePanningAllowed: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether to use a square aspect ratio for the chart. This is locked to true for polar and radial charts.
  	 */
  var isSquare: js.UndefOr[Boolean] = js.native
  /**
  	 * Set to true in order to disable any interactions with the plot surface.
  	 */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the current Chart's vertical zoomability.
  	 */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Sets or gets the left margin to use around the chart content in the canvas.
  	 */
  var leftMargin: js.UndefOr[Double] = js.native
  /**
  	 * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
  	 */
  var legend: js.UndefOr[IgDataChartLegend] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the MarkerBrushes property.
  	 * The marker brushes property defines the palette from which automatically assigned marker brushes are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var markerBrushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the MarkerOutlines property.
  	 * The marker outlines property defines the palette from which automatically assigned marker outlines are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var markerOutlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the Outlines property.
  	 * The outlines property defines the palette from which automatically assigned series outlines are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.native
  /**
  	 * The visibility of the OverviewPlusDetailPane.
  	 *
  	 * Valid values:
  	 * "visible" The overview pane should be visible.
  	 * "collapsed" The overview pane should not be visible.
  	 */
  var overviewPlusDetailPaneVisibility: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the current Chart's PanModifier property.
  	 *
  	 * Valid values:
  	 * "none" No modifier key is set.
  	 * "alt" The modifier is set to alt key.
  	 * "control" The modifier is set to control key.
  	 * "shift" The modifier is set to shift key.
  	 */
  var panModifier: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the template to use for pentagon markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of pentagon.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pentagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the template to use for pentragram markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of pentagram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pentagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the scaling value used by the main canvas rendering context to apply a scale transform to it.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush used as the background for the current Chart object's plot area.
  	 */
  var plotAreaBackground: js.UndefOr[String] = js.native
  /**
  	 * Sets whether the series viewer should prefer selecting higher resolution tiles over lower resolution tiles when performing tile zooming. Setting this to true will lower performance but increase quality.
  	 */
  var preferHigherResolutionTiles: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the preview rectangle.
  	 * The preview rectangle may be set to Rect.Empty, in which case the visible preview
  	 * strokePath is hidden.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var previewRect: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired when the progressive loading state of the series has changed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.currentStatus to get current status.
  	 */
  var progressiveLoadStatusChanged: js.UndefOr[ProgressiveLoadStatusChangedEvent] = js.native
  /**
  	 * Gets or sets the template to use for pyramid markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of pyramid.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pyramidMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Raised when the chart's processing for an update has completed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var refreshCompleted: js.UndefOr[RefreshCompletedEvent] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Sets or gets the right margin to use around the chart content in the canvas.
  	 */
  var rightMargin: js.UndefOr[Double] = js.native
  /**
  	 * An array of series objects
  	 */
  var series: js.UndefOr[js.Array[IgDataChartSeries]] = js.native
  /**
  	 * Occurs when the cursors are moved over a series in this chart.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesCursorMouseMove: js.UndefOr[SeriesCursorMouseMoveEvent] = js.native
  /**
  	 * Occurs when the left mouse pointer enters an element of this chart.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseEnter: js.UndefOr[SeriesMouseEnterEvent] = js.native
  /**
  	 * Occurs when the left mouse pointer leaves an element of this chart.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeave: js.UndefOr[SeriesMouseLeaveEvent] = js.native
  /**
  	 * Occurs when the left mouse button is pressed while the mouse pointer is over an element of this chart.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeftButtonDown: js.UndefOr[SeriesMouseLeftButtonDownEvent] = js.native
  /**
  	 * Occurs when the left mouse button is released while the mouse pointer is over an element of this chart.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeftButtonUp: js.UndefOr[SeriesMouseLeftButtonUpEvent] = js.native
  /**
  	 * Occurs when the left mouse pointer moves while over an element of this chart.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseMove: js.UndefOr[SeriesMouseMoveEvent] = js.native
  /**
  	 * To set both dimensions of the chart simultaneously an object with a width and height property can be provided
  	 */
  var size: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the template to use for square markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of square.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var squareMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * The subtitle to display for the component.
  	 */
  var subtitle: js.UndefOr[String] = js.native
  /**
  	 * The bottom margin to use for the subtitle.
  	 */
  var subtitleBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * the horizontal alignment to use for the subtitle.
  	 *
  	 * Valid values:
  	 * "left" left aligns the subtitle.
  	 * "center" center aligns the subtitle.
  	 * "right" right aligns the subtitle.
  	 */
  var subtitleHorizontalAlignment: js.UndefOr[String] = js.native
  /**
  	 * The left margin to use for the subtitle.
  	 */
  var subtitleLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * The right margin to use for the subtitle.
  	 */
  var subtitleRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * The color to use for the subtitle.
  	 */
  var subtitleTextColor: js.UndefOr[js.Any] = js.native
  /**
  	 * The css font property to use for the title.
  	 */
  var subtitleTextStyle: js.UndefOr[String] = js.native
  /**
  	 * The top margin to use for the subtitle.
  	 */
  var subtitleTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * The channel name to use to sync this chart with other charts.
  	 */
  var syncChannel: js.UndefOr[String] = js.native
  /**
  	 * Whether the chart should be synchronized horizontally
  	 */
  var synchronizeHorizontally: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether the chart should be synchronized vertically
  	 */
  var synchronizeVertically: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the template to use for tetragram markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of tetragram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var tetragramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * The swatch used to style this widget
  	 */
  var theme: js.UndefOr[String] = js.native
  /**
  	 * The title to display for the component.
  	 */
  var title: js.UndefOr[String] = js.native
  /**
  	 * The bottom margin to use for the title.
  	 */
  var titleBottomMargin: js.UndefOr[Double] = js.native
  /**
  	 * the horizontal alignment to use for the title.
  	 *
  	 * Valid values:
  	 * "left" left aligns the title.
  	 * "center" center aligns the title.
  	 * "right" right aligns the title.
  	 */
  var titleHorizontalAlignment: js.UndefOr[String] = js.native
  /**
  	 * The left margin to use for the title.
  	 */
  var titleLeftMargin: js.UndefOr[Double] = js.native
  /**
  	 * The right margin to use for the title.
  	 */
  var titleRightMargin: js.UndefOr[Double] = js.native
  /**
  	 * The color to use for the title.
  	 */
  var titleTextColor: js.UndefOr[js.Any] = js.native
  /**
  	 * The css font property to use for the title.
  	 */
  var titleTextStyle: js.UndefOr[String] = js.native
  /**
  	 * The top margin to use for the title.
  	 */
  var titleTopMargin: js.UndefOr[Double] = js.native
  /**
  	 * Event fired after a tooltip is hidden
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  /**
  	 * Event fired when the mouse has left a series and the tooltip is about to hide
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  /**
  	 * Event fired when the mouse has hovered on a series and the tooltip is about to show
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  /**
  	 * Event fired after a tooltip is shown
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  /**
  	 * Sets or gets the top margin to use around the chart content in the canvas.
  	 */
  var topMargin: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the template to use for triangle markers on the chart.
  	 * Defines the marker template used for
  	 * series with a marker type of triangle.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var triangleMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Handle this event in order to specify which columns the Typical price calculation is based on.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.count to get the number of positions that should be calculated from the start.
  	 * Use ui.position to get the beginning position that should be calculated from.
  	 * Use ui.supportingCalculations to get the supporting calculations to use in the calculation.
  	 * Use ui.dataSource to get the data to use for the calculation.
  	 * Use ui.basedOn to specify which columns changing will invalidate the series and cause it to be recalculated.
  	 */
  var typicalBasedOn: js.UndefOr[TypicalBasedOnEvent] = js.native
  /**
  	 * Sets whether the series viewer should use cached tiles during zooms rather than the default live content.
  	 */
  var useTiledZooming: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the current Chart's vertical zoomability.  This option is deprecated - please use `isVerticalZoomEnabled` instead.
  	 */
  var verticalZoomable: js.UndefOr[Boolean] = js.native
  /**
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.native
  /**
  	 * A number between 0 and 1 determining the position of the horizontal scroll.
  	 * This property is effectively a shortcut to the X position of the WindowRect property.
  	 */
  var windowPositionHorizontal: js.UndefOr[Double] = js.native
  /**
  	 * A number between 0 and 1 determining the position of the vertical scroll.
  	 * This property is effectively a shortcut to the Y position of the WindowRect property.
  	 */
  var windowPositionVertical: js.UndefOr[Double] = js.native
  /**
  	 * A rectangle representing the portion of the chart currently in view.
  	 * A rectangle at X=0, Y=0 with a Height and Width of 1 implies the entire plotting area is in view.  A Height and Width of .5 would imply that the view is halfway zoomed in.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var windowRect: js.UndefOr[js.Any] = js.native
  /**
  	 * Occurs just after the current Chart's window rectangle is changed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.newHeight to get new height value.
  	 * Use ui.newLeft to get new left value.
  	 * Use ui.newTop to get new top value.
  	 * Use ui.newWidth to get new top value.
  	 * Use ui.oldHeight to get old height value.
  	 * Use ui.oldLeft to get old left value.
  	 * Use ui.oldTop to get old top value.
  	 * Use ui.oldWidth to get old top value.
  	 */
  var windowRectChanged: js.UndefOr[WindowRectChangedEvent] = js.native
  /**
  	 * Sets or gets the minimum width that the window rect is allowed to reach before being clamped.
  	 * Decrease this value if you want to allow for further zooming into the viewer.
  	 * If this value is lowered too much it can cause graphical corruption due to floating point arithmetic inaccuracy.
  	 */
  var windowRectMinWidth: js.UndefOr[Double] = js.native
  /**
  	 * The response to user panning and zooming: whether to update the view immediately while the user action is happening, or to defer the update to after the user action is complete.  The user action will be an action such as a mouse drag which causes panning and/or zooming to occur.
  	 *
  	 *
  	 * Valid values:
  	 * "deferred" Defer the view update until after the user action is complete.
  	 * "immediate" Update the view immediately while the user action is happening.
  	 */
  var windowResponse: js.UndefOr[String] = js.native
  /**
  	 * A number between 0 and 1 determining the scale of the horizontal zoom.
  	 * This property is effectively a shortcut to the Width of the WindowRect property.
  	 */
  var windowScaleHorizontal: js.UndefOr[Double] = js.native
  /**
  	 * A number between 0 and 1 determining the scale of the vertical zoom.
  	 * This property is effectively a shortcut to the Height of the WindowRect property.
  	 */
  var windowScaleVertical: js.UndefOr[Double] = js.native
  /**
  	 * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
  	 */
  var zoomTileCacheSize: js.UndefOr[Double] = js.native
}

object IgDataChart {
  @scala.inline
  def apply(): IgDataChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChart]
  }
  @scala.inline
  implicit class IgDataChartOps[Self <: IgDataChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAssigningCategoryMarkerStyle(value: (/* event */ Event, /* ui */ AssigningCategoryMarkerStyleEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigningCategoryMarkerStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAssigningCategoryMarkerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigningCategoryMarkerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAssigningCategoryStyle(value: (/* event */ Event, /* ui */ AssigningCategoryStyleEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigningCategoryStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAssigningCategoryStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigningCategoryStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMarginHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMarginHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMarginHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMarginHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMarginWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMarginWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMarginWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMarginWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAxes(value: js.Array[IgDataChartAxes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisRangeChanged(value: (/* event */ Event, /* ui */ AxisRangeChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRangeChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAxisRangeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRangeChanged")(js.undefined)
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
    def withBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBrowserNotSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.undefined)
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
    def withCircleMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleMarkerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHitTestMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHitTestMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHitTestMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHitTestMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairPoint(value: IgDataChartCrosshairPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairVisibility")(js.undefined)
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
    def withDefaultInteraction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withDiamondMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diamondMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiamondMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diamondMarkerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDragModifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAreaRectChanged(value: (/* event */ Event, /* ui */ GridAreaRectChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAreaRectChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGridAreaRectChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAreaRectChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withGridMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withHexagonMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexagonMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexagonMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexagonMarkerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHexagramMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexagramMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexagramMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexagramMarkerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightingTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightingTransitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightingTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightingTransitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalZoomable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalZoomable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalZoomable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalZoomable")(js.undefined)
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
    def withIsPagePanningAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPagePanningAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPagePanningAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPagePanningAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSquare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSquare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSquare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSquare")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSurfaceInteractionDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurfaceInteractionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSurfaceInteractionDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurfaceInteractionDisabled")(js.undefined)
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
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
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
    def withLegend(value: IgDataChartLegend): Self = {
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
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
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
    def withOverviewPlusDetailPaneVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewPlusDetailPaneVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewPlusDetailPaneVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewPlusDetailPaneVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withPanModifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withPentagonMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pentagonMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPentagonMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pentagonMarkerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPentagramMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pentagramMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPentagramMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pentagramMarkerTemplate")(js.undefined)
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
    def withPlotAreaBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotAreaBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotAreaBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferHigherResolutionTiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferHigherResolutionTiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferHigherResolutionTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferHigherResolutionTiles")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewRect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewRect")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveLoadStatusChanged(value: (/* event */ Event, /* ui */ ProgressiveLoadStatusChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveLoadStatusChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProgressiveLoadStatusChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveLoadStatusChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPyramidMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyramidMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPyramidMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyramidMarkerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshCompleted(value: (/* event */ Event, /* ui */ RefreshCompletedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshCompleted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRefreshCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
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
    def withSeries(value: js.Array[IgDataChartSeries]): Self = {
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
    def withSeriesCursorMouseMove(value: (/* event */ Event, /* ui */ SeriesCursorMouseMoveEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesCursorMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesCursorMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesCursorMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesMouseEnter(value: (/* event */ Event, /* ui */ SeriesMouseEnterEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesMouseLeave(value: (/* event */ Event, /* ui */ SeriesMouseLeaveEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesMouseLeftButtonDown(value: (/* event */ Event, /* ui */ SeriesMouseLeftButtonDownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseLeftButtonDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesMouseLeftButtonDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseLeftButtonDown")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesMouseLeftButtonUp(value: (/* event */ Event, /* ui */ SeriesMouseLeftButtonUpEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseLeftButtonUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesMouseLeftButtonUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseLeftButtonUp")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesMouseMove(value: (/* event */ Event, /* ui */ SeriesMouseMoveEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSeriesMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSquareMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squareMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquareMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squareMarkerTemplate")(js.undefined)
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
    def withSubtitleHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleHorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleHorizontalAlignment")(js.undefined)
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
    def withSubtitleTextColor(value: js.Any): Self = {
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
    def withSyncChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronizeHorizontally(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronizeHorizontally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeHorizontally")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronizeVertically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronizeVertically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeVertically")(js.undefined)
        ret
    }
    @scala.inline
    def withTetragramMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetragramMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTetragramMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetragramMarkerTemplate")(js.undefined)
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
    def withTitleHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHorizontalAlignment")(js.undefined)
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
    def withTitleTextColor(value: js.Any): Self = {
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
    def withTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.undefined)
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
    def withTriangleMarkerTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleMarkerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleMarkerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTypicalBasedOn(value: (/* event */ Event, /* ui */ TypicalBasedOnEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typicalBasedOn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTypicalBasedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typicalBasedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTiledZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTiledZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTiledZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTiledZooming")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalZoomable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalZoomable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalZoomable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalZoomable")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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
    def withWindowPositionHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPositionHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPositionHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPositionHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowPositionVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPositionVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPositionVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPositionVertical")(js.undefined)
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
    def withWindowRectChanged(value: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRectChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowRectChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRectChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowRectMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRectMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowRectMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRectMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowScaleHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowScaleHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowScaleHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowScaleHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowScaleVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowScaleVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowScaleVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowScaleVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomTileCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTileCacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomTileCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTileCacheSize")(js.undefined)
        ret
    }
  }
  
}

