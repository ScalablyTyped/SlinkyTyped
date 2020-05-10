package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMapSeries
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
  	 */
  var angleMemberPath: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the series.
  	 */
  var brush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets whether to clip the series to the bounds.
  	 * Setting this to true can affect performance.
  	 */
  var clipSeriesToBounds: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the close mapping property for the current series object.
  	 */
  var closeMemberPath: js.UndefOr[String] = js.native
  /**
  	 * The name of the property on each data item containing a numeric value which can be converted to a color by the ColorScale.
  	 */
  var colorMemberPath: js.UndefOr[String] = js.native
  /**
  	 * The ColorScale used to resolve the color values of points in the series.
  	 */
  var colorScale: js.UndefOr[js.Any] = js.native
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
  	 * String The database source URI.
  	 */
  var databaseSource: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the DiscreteLegendItemTemplate property.
  	 * The legend item control content is created according to the DiscreteLegendItemTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var discreteLegendItemTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * The name of the property on data source items which contains a numeric value to convert to a Brush using the FillScale.
  	 */
  var fillMemberPath: js.UndefOr[String] = js.native
  /**
  	 * The ValueBrushScale to use when determining Brushes for each Shape, based on the values found in FillMemberPath.
  	 */
  var fillScale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the value that maps to the maximum heat color.
  	 */
  var heatMaximum: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the density value that maps to the minimum heat color.
  	 */
  var heatMinimum: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var highMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the number of values to hide at the beginning of the indicator.
  	 */
  var ignoreFirst: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the Label mapping property for the current series object.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
  	 * The name of the property of data source items which contains the latitude coordinate of the symbol.
  	 */
  var latitudeMemberPath: js.UndefOr[String] = js.native
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
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for long AVO periods is 30.
  	 */
  var longPeriod: js.UndefOr[Double] = js.native
  /**
  	 * The name of the property of data source items which contains the longitude coordinate of the symbol.
  	 */
  var longitudeMemberPath: js.UndefOr[String] = js.native
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
  var markerTemplate: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the marker type for the current series object.If the MarkerTemplate property is set, the setting of the MarkerType property will be ignored.
  	 *
  	 *
  	 * Valid values:
  	 * "unset"
  	 * "none"
  	 * "automatic"
  	 * "circle"
  	 * "triangle"
  	 * "pyramid"
  	 * "square"
  	 * "diamond"
  	 * "pentagon"
  	 * "hexagon"
  	 * "tetragram"
  	 * "pentagram"
  	 * "hexagram"
  	 */
  var markerType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the maximum number of markerItems displayed by the current series.
  	 * If more than the specified number of markerItems are visible, the series will automatically
  	 * choose a representative set.
  	 */
  var maximumMarkers: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the whether the map reacts to mouse move events.
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
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var openMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for the outline of the series.
  	 * Some series types, such as LineSeries, do not display outlines.
  	 */
  var outline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the moving average period for the current AverageDirectionalIndexIndicator object.
  	 * The typical, and initial, value for AverageDirectionalIndexIndicator periods is 14.
  	 */
  var period: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the whether to progressively load the data into the map.
  	 */
  var progressiveLoad: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the radius mapping property for the current series object.
  	 */
  var radiusMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the radius size scale for the bubbles.
  	 */
  var radiusScale: js.UndefOr[js.Any] = js.native
  /**
  	 * Set to true in order to have an existing series removed from the map, by name
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
  	 * The triangulated file source URI or an instance of $.ig.ShapeDataSource.
  	 */
  var shapeDataSource: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the resolution at which to filter out shapes in the series.
  	 * For example, if the shapeFilterResolution is set to 3, then elements with a bounding rectangle smaller than 3 X 3 pixels will be filtered out.
  	 */
  var shapeFilterResolution: js.UndefOr[Double] = js.native
  /**
  	 * The name of the property on data source items which, for each shape, contains a list of points to be converted to a polygon.
  	 * To be consistent with the Shapefile technical description, it is expected that each list of points is defined as an IEnumerable of IEnumerable of Point, or in other words, a list of lists of points.
  	 */
  var shapeMemberPath: js.UndefOr[String] = js.native
  /**
  	 * The default style to apply to all Shapes in the series.
  	 */
  var shapeStyle: js.UndefOr[js.Any] = js.native
  /**
  	 * The StyleSelector which is used to select a style for each Shape.
  	 */
  var shapeStyleSelector: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for short AVO periods is 10.
  	 */
  var shortPeriod: js.UndefOr[Double] = js.native
  /**
  	 * Whether the map should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the type of spline to be rendered.
  	 *
  	 * Valid values:
  	 * "natural" Calculates the spline using a natural spline calculation formula.
  	 * "clamped" Calculated the spline using a clamped spline calculation formula.
  	 */
  var splineType: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the Stiffness property.
  	 */
  var stiffness: js.UndefOr[Double] = js.native
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
  	 * Gets or sets the duration of the current series's morph.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.native
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
  	 * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the first vertex point in the data source.
  	 */
  var triangleVertexMemberPath1: js.UndefOr[String] = js.native
  /**
  	 * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the second vertex point in the data source.
  	 */
  var triangleVertexMemberPath2: js.UndefOr[String] = js.native
  /**
  	 * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the third vertex point in the data source.
  	 */
  var triangleVertexMemberPath3: js.UndefOr[String] = js.native
  /**
  	 * The source of triangulation data.
  	 * This property is optional.  If it is left as null, the triangulation will be created based on the items in the data source.  Triangulation is a demanding operation, so the runtime performance will be better when specifying a TriangulationSource, especially when a large number of data items are present.
  	 */
  var trianglesSource: js.UndefOr[js.Any] = js.native
  /**
  	 * The triangulated file source URI or an instance of $.ig.TriangulationDataSource.
  	 */
  var triangulationDataSource: js.UndefOr[String] = js.native
  /**
  	 * Type of the series.
  	 *
  	 * Valid values:
  	 * "geographicSymbolSeries" Specify the series as geographic Symbol Series series.
  	 * "geographicPolyLine" Specify the series as geographic Polyline series.
  	 * "geographicScatterArea" Specify the series as geographic Scatter Area series.
  	 * "geographicShape" Specify the series as geographic Shape series.
  	 * "geographicContourLine" Specify the series as geographic Contour Line series.
  	 * "geographicHighDensityScatter" Specify the series as geographic High Density Scatter series.
  	 * "geographicProportionalSymbol" Specify the series as geographic Proportional Symbol series.
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Determines how unknown values will be plotted on the map. Null and Double.NaN are two examples of unknown values.
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the map.
  	 */
  var unknownValuePlotting: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the whether to use use brute force mode.
  	 */
  var useBruteForce: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether Cartesian Interpolation should be used rather than Archimedian
  	 * spiral based interpolation.
  	 */
  var useCartesianInterpolation: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the whether to use squares when halting a render traversal rather than the shape of the coalesced area.
  	 */
  var useSquareCutoffStyle: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the item path that provides the values for the current series.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the ContourValueResolver used to determine the numeric values of contours.
  	 */
  var valueResolver: js.UndefOr[js.Any] = js.native
  /**
  	 * The minimum scale at which this series becomes visible.
  	 * The default value for this property is 1.0, which means the series will always be visible.  At a VisibleFromScale setting of 0.0, the series will never be visible.  At a VisibleFromScale setting of 0.5, the series will be visible as long as the map is zoomed in to at least 200%.
  	 */
  var visibleFromScale: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the volume mapping property for the current series object.
  	 */
  var volumeMemberPath: js.UndefOr[String] = js.native
}

object IgMapSeries {
  @scala.inline
  def apply(): IgMapSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMapSeries]
  }
  @scala.inline
  implicit class IgMapSeriesOps[Self <: IgMapSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withColorMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(js.undefined)
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
    def withLatitudeMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitudeMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitudeMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitudeMemberPath")(js.undefined)
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
    def withLongitudeMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitudeMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitudeMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitudeMemberPath")(js.undefined)
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
    def withShapeFilterResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeFilterResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeFilterResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeFilterResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMemberPath")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeStyleSelector(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeStyleSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeStyleSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeStyleSelector")(js.undefined)
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
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(js.undefined)
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
    def withTriangleVertexMemberPath1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleVertexMemberPath1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleVertexMemberPath1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleVertexMemberPath1")(js.undefined)
        ret
    }
    @scala.inline
    def withTriangleVertexMemberPath2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleVertexMemberPath2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleVertexMemberPath2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleVertexMemberPath2")(js.undefined)
        ret
    }
    @scala.inline
    def withTriangleVertexMemberPath3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleVertexMemberPath3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleVertexMemberPath3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleVertexMemberPath3")(js.undefined)
        ret
    }
    @scala.inline
    def withTrianglesSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trianglesSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrianglesSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trianglesSource")(js.undefined)
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
    def withValueResolver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueResolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleFromScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleFromScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleFromScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleFromScale")(js.undefined)
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
  }
  
}

