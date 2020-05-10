package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMap
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets or gets the automatic height to add when automatically adding margins to the map.
  	 */
  var autoMarginHeight: js.UndefOr[Double] = js.native
  /**
  	 * Sets or gets the automatic width to add when automatically adding margins to the map.
  	 */
  var autoMarginWidth: js.UndefOr[Double] = js.native
  /**
  	 * Background content object
  	 */
  var backgroundContent: js.UndefOr[IgMapBackgroundContent] = js.native
  /**
  	 * Event fired when the control is displayed on a non HTML5 compliant browser
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  /**
  	 * Gets or sets the template to use for circle markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of circle.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var circleMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the cross hair point (in world coordinates)
  	 * Either or both of the crosshair point's X and Y may be set to double.NaN, in which
  	 * case the relevant crosshair line is hidden.
  	 */
  var crosshairPoint: js.UndefOr[IgMapCrosshairPoint] = js.native
  /**
  	 * Gets or sets the current Map's crosshair visibility override.
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
  	 * Gets or sets the DefaultInteraction property. The default interaction state defines the map's response to mouse events.
  	 *
  	 * Valid values:
  	 * "none" User gesture will not change the state of the map.
  	 * "dragZoom" User gesture will start a drag rectangle to zoom the map.
  	 * "dragPan" User gesture will start a pan action to move the map's window.
  	 */
  var defaultInteraction: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the template to use for diamond markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of diamond.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var diamondMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the current Map's DragModifier property.
  	 *
  	 * Valid values:
  	 * "none" No modifier key is set.
  	 * "alt" The modifier is set to alt key.
  	 * "control" The modifier is set to control key.
  	 * "shift" The modifier is set to shift key.
  	 */
  var dragModifier: js.UndefOr[String] = js.native
  /**
  	 * Occurs just after the current Map's grid area rectangle is changed.
  	 * The grid area may change as the result of the Map being resized.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
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
  	 * The height of the map. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets or sets the template to use for hexagon markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of hexagon.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var hexagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the template to use for hexagram markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of hexagram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var hexagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * The background image uri use in the overview detail pane.
  	 */
  var overviewPlusDetailPaneBackgroundImageUri: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the current Map's PanModifier property.
  	 *
  	 * Valid values:
  	 * "none" No modifier key is set.
  	 * "alt" The modifier is set to alt key.
  	 * "control" The modifier is set to control key.
  	 * "shift" The modifier is set to shift key.
  	 */
  var panModifier: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the template to use for pentagon markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of pentagon.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pentagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the template to use for pentragram markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of pentagram.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pentagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the brush used as the background for the current Map object's plot area.
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
  	 * Gets or sets the template to use for pyramid markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of pyramid.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var pyramidMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Raised when the map's processing for an update has completed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
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
  	 * An array of series objects
  	 */
  var series: js.UndefOr[js.Array[IgMapSeries]] = js.native
  /**
  	 * Occurs when the cursors are moved over a series in this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesCursorMouseMove: js.UndefOr[SeriesCursorMouseMoveEvent] = js.native
  /**
  	 * Occurs when the left mouse pointer enters an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseEnter: js.UndefOr[SeriesMouseEnterEvent] = js.native
  /**
  	 * Occurs when the left mouse pointer leaves an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeave: js.UndefOr[SeriesMouseLeaveEvent] = js.native
  /**
  	 * Occurs when the left mouse button is pressed while the mouse pointer is over an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeftButtonDown: js.UndefOr[SeriesMouseLeftButtonDownEvent] = js.native
  /**
  	 * Occurs when the left mouse button is released while the mouse pointer is over an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseLeftButtonUp: js.UndefOr[SeriesMouseLeftButtonUpEvent] = js.native
  /**
  	 * Occurs when the left mouse pointer moves while over an element of this map.
  	 * Function takes arguments evt and ui.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 * Use ui.positionX to get mouse X position.
  	 * Use ui.positionY to get mouse Y position.
  	 */
  var seriesMouseMove: js.UndefOr[SeriesMouseMoveEvent] = js.native
  /**
  	 * Gets or sets the template to use for square markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of square.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var squareMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the template to use for tetragram markers on the map.
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
  	 * Event fired after a tooltip is hidden
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.map to get reference to map object.
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
  	 * Use ui.map to get reference to map object.
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
  	 * Use ui.map to get reference to map object.
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
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  /**
  	 * Gets or sets the template to use for triangle markers on the map.
  	 * Defines the marker template used for
  	 * series with a marker type of triangle.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var triangleMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired when the status of an ongoing Triangulation has changed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.currentStatus to get current status.
  	 */
  var triangulationStatusChanged: js.UndefOr[TriangulationStatusChangedEvent] = js.native
  /**
  	 * Sets whether the series viewer should use cached tiles during zooms rather than the default live content.
  	 */
  var useTiledZooming: js.UndefOr[Boolean] = js.native
  /**
  	 * The width of the map. It can be set as a number in pixels, string (px) or percentage (%).
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
  	 * A rectangle representing the portion of the map currently in view.
  	 * A rectangle at X=0, Y=0 with a Height and Width of 1 implies the entire plotting area is in view.  A Height and Width of .5 would imply that the view is halfway zoomed in.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var windowRect: js.UndefOr[js.Any] = js.native
  /**
  	 * Occurs just after the current Map's window rectangle is changed.
  	 * Function takes arguments evt and ui.
  	 * Use ui.map to get reference to map object.
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
  	 * Gets or sets the current Map's zoom scale.
  	 */
  var windowScale: js.UndefOr[Double] = js.native
  /**
  	 * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
  	 */
  var zoomTileCacheSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the current Map's zoomability.
  	 */
  var zoomable: js.UndefOr[Boolean] = js.native
}

object IgMap {
  @scala.inline
  def apply(): IgMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMap]
  }
  @scala.inline
  implicit class IgMapOps[Self <: IgMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBackgroundContent(value: IgMapBackgroundContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundContent")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserNotSupported(value: (/* event */ Event_, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = {
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
    def withCrosshairPoint(value: IgMapCrosshairPoint): Self = {
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
    def withGridAreaRectChanged(value: (/* event */ Event_, /* ui */ GridAreaRectChangedEventUIParam) => Unit): Self = {
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
    def withOverviewPlusDetailPaneBackgroundImageUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewPlusDetailPaneBackgroundImageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewPlusDetailPaneBackgroundImageUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewPlusDetailPaneBackgroundImageUri")(js.undefined)
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
    def withRefreshCompleted(value: (/* event */ Event_, /* ui */ RefreshCompletedEventUIParam) => Unit): Self = {
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
    def withSeries(value: js.Array[IgMapSeries]): Self = {
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
    def withSeriesCursorMouseMove(value: (/* event */ Event_, /* ui */ SeriesCursorMouseMoveEventUIParam) => Unit): Self = {
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
    def withSeriesMouseEnter(value: (/* event */ Event_, /* ui */ SeriesMouseEnterEventUIParam) => Unit): Self = {
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
    def withSeriesMouseLeave(value: (/* event */ Event_, /* ui */ SeriesMouseLeaveEventUIParam) => Unit): Self = {
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
    def withSeriesMouseLeftButtonDown(value: (/* event */ Event_, /* ui */ SeriesMouseLeftButtonDownEventUIParam) => Unit): Self = {
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
    def withSeriesMouseLeftButtonUp(value: (/* event */ Event_, /* ui */ SeriesMouseLeftButtonUpEventUIParam) => Unit): Self = {
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
    def withSeriesMouseMove(value: (/* event */ Event_, /* ui */ SeriesMouseMoveEventUIParam) => Unit): Self = {
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
    def withTooltipHidden(value: (/* event */ Event_, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = {
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
    def withTooltipHiding(value: (/* event */ Event_, /* ui */ TooltipHidingEventUIParam) => Unit): Self = {
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
    def withTooltipShowing(value: (/* event */ Event_, /* ui */ TooltipShowingEventUIParam) => Unit): Self = {
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
    def withTooltipShown(value: (/* event */ Event_, /* ui */ TooltipShownEventUIParam) => Unit): Self = {
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
    def withTriangulationStatusChanged(value: (/* event */ Event_, /* ui */ TriangulationStatusChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangulationStatusChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTriangulationStatusChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangulationStatusChanged")(js.undefined)
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
    def withWindowRectChanged(value: (/* event */ Event_, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = {
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
    def withWindowScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowScale")(js.undefined)
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
    @scala.inline
    def withZoomable(value: Boolean): Self = {
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

