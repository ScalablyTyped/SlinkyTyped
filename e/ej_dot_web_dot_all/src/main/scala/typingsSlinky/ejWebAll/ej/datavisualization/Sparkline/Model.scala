package typingsSlinky.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the sparkline.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Options for customizing the color,dashArray and width of the axisLine.
    */
  var axisLineSettings: js.UndefOr[AxisLineSettings] = js.native
  /** Background color of the plot area.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  /** Options for customizing the color, opacity and width of the sparkline border.
    */
  var border: js.UndefOr[Border] = js.native
  /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Fires, on double clicking the sparkline.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Controls whether Sparkline has to be rendered as Canvas or SVG.Canvas rendering supports all functionalities in SVG rendering.
    * @Default {false}
    */
  var enableCanvasRendering: js.UndefOr[Boolean] = js.native
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  /** Color for series end point.
    * @Default {null}
    */
  var endPointColor: js.UndefOr[String] = js.native
  /** Fill color for the sparkline series.
    * @Default {#33ccff}
    */
  var fill: js.UndefOr[String] = js.native
  /** Color for series high point.
    * @Default {null}
    */
  var highPointColor: js.UndefOr[String] = js.native
  /** Controls whether sparkline has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Fires before loading the sparkline.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Fires after loaded the sparkline.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.native
  /** Name of the culture based on which sparkline should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Color for series low point.
    * @Default {null}
    */
  var lowPointColor: js.UndefOr[String] = js.native
  /** Options for displaying and customizing marker for a data point.
    */
  var markerSettings: js.UndefOr[MarkerSettings] = js.native
  /** Color for series negative point.
    * @Default {null}
    */
  var negativePointColor: js.UndefOr[String] = js.native
  /** Opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Gap or padding for sparkline.
    * @Default {8}
    */
  var padding: js.UndefOr[Double] = js.native
  /** Name of a field in data source, where the fill color for all the data points is generated.
    */
  var palette: js.UndefOr[String] = js.native
  /** Fires on clicking a point in sparkline. You can use this event to handle clicks made on points.
    */
  var pointRegionMouseClick: js.UndefOr[js.Function1[/* e */ PointRegionMouseClickEventArgs, Unit]] = js.native
  /** Fires when mouse is moved over a point.
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.native
  /** Options for customizing the color, opacity of the sparkline start and end range.
    */
  var rangeBandSettings: js.UndefOr[RangeBandSettings] = js.native
  /** Fires, on right clicking the sparkline.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Fires before rendering a series. This event is fired for each series in Sparkline.
    */
  var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, Unit]] = js.native
  /** Options to customize the Sparkline size.
    */
  var size: js.UndefOr[Size] = js.native
  /** Fires on moving mouse outside the sparkline.
    */
  var sparklineMouseLeave: js.UndefOr[js.Function1[/* e */ SparklineMouseLeaveEventArgs, Unit]] = js.native
  /** Fires on moving mouse over the sparkline.
    */
  var sparklineMouseMove: js.UndefOr[js.Function1[/* e */ SparklineMouseMoveEventArgs, Unit]] = js.native
  /** Color for series start point.
    * @Default {null}
    */
  var startPointColor: js.UndefOr[String] = js.native
  /** Border color of the series.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.native
  /** Specifies the theme for Sparkline.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[Theme | String] = js.native
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /** Fires before rendering trackball tooltip. You can use this event to customize the text displayed in trackball tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.native
  /** Specifies the type of the series to render in sparkline.
    * @Default {line. See Type}
    */
  var `type`: js.UndefOr[Type | String] = js.native
  /** Border width of the series.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
  /** Name of the property in the datasource that contains x value for the series.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.native
  /** Name of the property in the datasource that contains y value for the series.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLineSettings(value: AxisLineSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLineSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
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
    def withDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCanvasRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCanvasRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCanvasRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCanvasRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withEndPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHighPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: /* e */ LoadedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
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
    def withLowPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowPointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowPointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSettings(value: MarkerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativePointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativePointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativePointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativePointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRegionMouseClick(value: /* e */ PointRegionMouseClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionMouseClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointRegionMouseClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionMouseClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointRegionMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeBandSettings(value: RangeBandSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBandSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeBandSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBandSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClick(value: /* e */ RightClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesRendering(value: /* e */ SeriesRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeriesRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
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
    def withSparklineMouseLeave(value: /* e */ SparklineMouseLeaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparklineMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSparklineMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparklineMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withSparklineMouseMove(value: /* e */ SparklineMouseMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparklineMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSparklineMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparklineMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme | String): Self = {
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
    def withTooltip(value: Tooltip): Self = {
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
    def withTooltipInitialize(value: /* e */ TooltipInitializeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipInitialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltipInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type | String): Self = {
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
    def withXName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xName")(js.undefined)
        ret
    }
    @scala.inline
    def withYName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yName")(js.undefined)
        ret
    }
  }
  
}

