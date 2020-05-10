package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, after the chart is resized.
    */
  var afterResize: js.UndefOr[js.Function1[/* e */ AfterResizeEventArgs, scala.Unit]] = js.native
  /** Fires after the series animation is completed. This event will be triggered for each series when animation is enabled.
    */
  var animationComplete: js.UndefOr[js.Function1[/* e */ AnimationCompleteEventArgs, scala.Unit]] = js.native
  /** Fires on clicking the annotation.
    */
  var annotationClick: js.UndefOr[js.Function1[/* e */ AnnotationClickEventArgs, scala.Unit]] = js.native
  /** Options for adding and customizing annotations in Chart.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.native
  /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s
    * xAxisName property to link both axis and series.
    */
  var axes: js.UndefOr[js.Array[Axis]] = js.native
  /** Fires before rendering the labels. This event is fired for each label in axis. You can use this event to add custom text to axis labels.
    */
  var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, scala.Unit]] = js.native
  /** Fires during the initialization of axis labels.
    */
  var axesLabelsInitialize: js.UndefOr[js.Function1[/* e */ AxesLabelsInitializeEventArgs, scala.Unit]] = js.native
  /** Fires during axes range calculation. This event is fired for each axis present in Chart. You can use this event to customize axis range as required.
    */
  var axesRangeCalculate: js.UndefOr[js.Function1[/* e */ AxesRangeCalculateEventArgs, scala.Unit]] = js.native
  /** Fires before rendering the axis title. This event is triggered for each axis with title. You can use this event to add custom text to axis title.
    */
  var axesTitleRendering: js.UndefOr[js.Function1[/* e */ AxesTitleRenderingEventArgs, scala.Unit]] = js.native
  /** Fires, on clicking the axis label.
    */
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ AxisLabelClickEventArgs, scala.Unit]] = js.native
  /** Fires on moving mouse over the axis label.
    */
  var axisLabelMouseMove: js.UndefOr[js.Function1[/* e */ AxisLabelMouseMoveEventArgs, scala.Unit]] = js.native
  /** URL of the image to be used as chart background.
    * @Default {null}
    */
  var backGroundImageUrl: js.UndefOr[String] = js.native
  /** Sets the background color of the  chart.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.native
  /** Fires, when chart size is changing.
    */
  var beforeResize: js.UndefOr[js.Function1[/* e */ BeforeResizeEventArgs, scala.Unit]] = js.native
  /** Options for customizing the color, opacity and width of the chart border.
    */
  var border: js.UndefOr[Border] = js.native
  /** Options for configuring the border and background of the plot area.
    */
  var chartArea: js.UndefOr[ChartArea] = js.native
  /** Fires during the calculation of chart area bounds. You can use this event to customize the bounds of chart area.
    */
  var chartAreaBoundsCalculate: js.UndefOr[js.Function1[/* e */ ChartAreaBoundsCalculateEventArgs, scala.Unit]] = js.native
  /** Fires, on the clicking the chart.
    */
  var chartClick: js.UndefOr[js.Function1[/* e */ ChartClickEventArgs, scala.Unit]] = js.native
  /** Fires, on double clicking the chart.
    */
  var chartDoubleClick: js.UndefOr[js.Function1[/* e */ ChartDoubleClickEventArgs, scala.Unit]] = js.native
  /** Fires when the mouse pointer leaves the chart
    */
  var chartMouseLeave: js.UndefOr[js.Function1[/* e */ ChartMouseLeaveEventArgs, scala.Unit]] = js.native
  /** Fires on moving mouse over the chart.
    */
  var chartMouseMove: js.UndefOr[js.Function1[/* e */ ChartMouseMoveEventArgs, scala.Unit]] = js.native
  /** Options to split Chart into multiple plotting areas vertically. Each object in the collection represents a plotting area in Chart.
    */
  var columnDefinitions: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  /** Options for configuring the properties of all the series. You can also override the options for specific series by using series collection.
    */
  var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.native
  /** Fires after chart is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.native
  /** Options for displaying and customizing the crosshair.
    */
  var crosshair: js.UndefOr[Crosshair] = js.native
  /** Depth of the 3D Chart from front view of series to background wall. This property is applicable only for 3D view.
    * @Default {100}
    */
  var depth: js.UndefOr[Double] = js.native
  /** Fires when chart is destroyed completely.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.native
  /** Fires before rendering the data labels. This event is triggered for each data label in the series. You can use this event to add custom text in data labels.
    */
  var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit]] = js.native
  /** Fires when the dragging is completed
    */
  var dragEnd: js.UndefOr[js.Function1[/* e */ DragEndEventArgs, scala.Unit]] = js.native
  /** Fires when the dragging is started
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.native
  /** Fires while  dragging
    */
  var dragging: js.UndefOr[js.Function1[/* e */ DraggingEventArgs, scala.Unit]] = js.native
  /** Controls whether 3D view has to be enabled or not. 3D view is supported only for column, bar. Stacking column, stacking bar, pie and doughnut series types.
    * @Default {false}
    */
  var enable3D: js.UndefOr[Boolean] = js.native
  /** Controls whether Chart has to be rendered as Canvas or SVG. Canvas rendering supports all functionalities in SVG rendering except 3D Charts.
    * @Default {false}
    */
  var enableCanvasRendering: js.UndefOr[Boolean] = js.native
  /** Controls whether 3D view has to be rotated on dragging. This property is applicable only for 3D view.
    * @Default {false}
    */
  var enableRotation: js.UndefOr[Boolean] = js.native
  /** Fires, when error bar is rendering.
    */
  var errorBarRendering: js.UndefOr[js.Function1[/* e */ ErrorBarRenderingEventArgs, scala.Unit]] = js.native
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  /** Options to customize the technical indicators.
    */
  var indicators: js.UndefOr[js.Array[Indicator]] = js.native
  /** Controls whether the series has to be rendered at initial loading of chart, this will be useful in scenarios where chart is placed at the bottom of the web page and we need to
    * render the series only when the chart is visible while scrolling to the top.
    * @Default {true}
    */
  var initSeriesRender: js.UndefOr[Boolean] = js.native
  /** Controls whether Chart has to be responsive while resizing.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Options to customize the legend items and legend title.
    */
  var legend: js.UndefOr[Legend] = js.native
  /** Fires during the calculation of legend bounds. You can use this event to customize the bounds of legend.
    */
  var legendBoundsCalculate: js.UndefOr[js.Function1[/* e */ LegendBoundsCalculateEventArgs, scala.Unit]] = js.native
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit]] = js.native
  /** Fires when moving mouse over legend item. You can use this event for hit testing on legend items.
    */
  var legendItemMouseMove: js.UndefOr[js.Function1[/* e */ LegendItemMouseMoveEventArgs, scala.Unit]] = js.native
  /** Fires before rendering the legend item. This event is fired for each legend item in Chart. You can use this event to customize legend item shape or add custom text to legend item.
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit]] = js.native
  /** Fires before loading the chart.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.native
  /** Name of the culture based on which chart should be localized. Number and date time values are localized with respect to the culture name.String type properties like title text are
    * not localized automatically. Provide localized text as value to string type properties.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Options to customize the left, right, top and bottom margins of chart area.
    */
  var margin: js.UndefOr[Margin] = js.native
  /** Fires, on the clicking the Multi level labels of the chart .
    */
  var multiLevelLabelClick: js.UndefOr[js.Function1[/* e */ MultiLevelLabelClickEventArgs, scala.Unit]] = js.native
  /** Fires, when multi level labels are rendering.
    */
  var multiLevelLabelRendering: js.UndefOr[js.Function1[/* e */ MultiLevelLabelRenderingEventArgs, scala.Unit]] = js.native
  /** Palette is used to store the series fill color in array and apply the color to series collection in the order of series index.
    * @Default {null}
    */
  var palette: js.UndefOr[js.Array[_]] = js.native
  /** Perspective angle of the 3D view. Chart appears closer when perspective angle is decreased, and distant when perspective angle is increased.This property is applicable only when
    * 3D view is enabled
    * @Default {90}
    */
  var perspectiveAngle: js.UndefOr[Double] = js.native
  /** Fires on clicking a point in chart. You can use this event to handle clicks made on points.
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit]] = js.native
  /** Fires when mouse is moved over a point.
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit]] = js.native
  /** Fires before rendering chart.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, scala.Unit]] = js.native
  /** This is a horizontal axis that contains options to configure axis and it is the primary x axis for all the series in series array. To override x axis for particular series, create
    * an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both axis and series.
    */
  var primaryXAxis: js.UndefOr[PrimaryXAxis] = js.native
  /** This is a vertical axis that contains options to configure axis. This is the primary y axis for all the series in series array. To override y axis for particular series, create an
    * axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both axis and series.
    */
  var primaryYAxis: js.UndefOr[PrimaryYAxis] = js.native
  /** Fires after selected the data in chart.
    */
  var rangeSelected: js.UndefOr[js.Function1[/* e */ RangeSelectedEventArgs, scala.Unit]] = js.native
  /** Rotation angle of the 3D view. This property is applicable only when 3D view is enabled.
    * @Default {0}
    */
  var rotation: js.UndefOr[Double] = js.native
  /** Options to split Chart into multiple plotting areas horizontally. Each object in the collection represents a plotting area in Chart.
    */
  var rowDefinitions: js.UndefOr[js.Array[RowDefinition]] = js.native
  /** Trigger, after the scrollbar position is changed.
    */
  var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit]] = js.native
  /** Event triggered when scroll end
    */
  var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, scala.Unit]] = js.native
  /** Event triggered when scroll starts
    */
  var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, scala.Unit]] = js.native
  /** Options for displaying the chart along with selected points while loading
    * @Default {[ ]}
    */
  var selectedDataPointIndexes: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the properties used for customizing the series.
    */
  var series: js.UndefOr[js.Array[Series]] = js.native
  /** Fires after selecting a series. This event is triggered after selecting a series only if selection mode is series.
    */
  var seriesRegionClick: js.UndefOr[js.Function1[/* e */ SeriesRegionClickEventArgs, scala.Unit]] = js.native
  /** Fires before rendering a series. This event is fired for each series in Chart.
    */
  var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit]] = js.native
  /** Controls whether data points has to be displayed side by side or along the depth of the axis.
    * @Default {false}
    */
  var sideBySideSeriesPlacement: js.UndefOr[Boolean] = js.native
  /** Options to customize the Chart size.
    */
  var size: js.UndefOr[Size] = js.native
  /** Fires when the sub Title of the chart is rendered
    */
  var subTitleRendering: js.UndefOr[js.Function1[/* e */ SubTitleRenderingEventArgs, scala.Unit]] = js.native
  /** Fires before rendering the marker symbols. This event is triggered for each marker in Chart.
    */
  var symbolRendering: js.UndefOr[js.Function1[/* e */ SymbolRenderingEventArgs, scala.Unit]] = js.native
  /** Specifies the theme for Chart.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[Theme | String] = js.native
  /** Slope angle of 3D Chart. This property is applicable only when 3D view is enabled.
    * @Default {0}
    */
  var tilt: js.UndefOr[Double] = js.native
  /** Options for customizing the title and subtitle of Chart.
    */
  var title: js.UndefOr[Title] = js.native
  /** Fires before rendering the Chart title. You can use this event to add custom text in Chart title.
    */
  var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit]] = js.native
  /** Fires before rendering the tooltip. This event is fired when tooltip is enabled and mouse is hovered on a Chart point. You can use this event to customize tooltip before rendering.
    */
  var toolTipInitialize: js.UndefOr[js.Function1[/* e */ ToolTipInitializeEventArgs, scala.Unit]] = js.native
  /** Fires before rendering crosshair tooltip in axis. This event is fired for each axis with crosshair label enabled. You can use this event to customize crosshair label before
    * rendering
    */
  var trackAxisToolTip: js.UndefOr[js.Function1[/* e */ TrackAxisToolTipEventArgs, scala.Unit]] = js.native
  /** Fires before rendering trackball tooltip. This event is fired for each series in Chart because trackball tooltip is displayed for all the series. You can use this event to
    * customize the text displayed in trackball tooltip.
    */
  var trackToolTip: js.UndefOr[js.Function1[/* e */ TrackToolTipEventArgs, scala.Unit]] = js.native
  /** Fires, when trendlines are rendering.
    */
  var trendlineRendering: js.UndefOr[js.Function1[/* e */ TrendlineRenderingEventArgs, scala.Unit]] = js.native
  /** Width of the wall used in 3D Chart. Wall is present only in Cartesian type 3D series and not in 3D pie or Doughnut series. This property is applicable only when 3D view is enabled.
    * @Default {2}
    */
  var wallSize: js.UndefOr[Double] = js.native
  /** Fires while performing rectangle zooming in chart.
    */
  var zoomed: js.UndefOr[js.Function1[/* e */ ZoomedEventArgs, scala.Unit]] = js.native
  /** Options for enabling zooming feature of chart.
    */
  var zooming: js.UndefOr[Zooming] = js.native
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
    def withAfterResize(value: /* e */ AfterResizeEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResize")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationComplete(value: /* e */ AnimationCompleteEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimationComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationClick(value: /* e */ AnnotationClickEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnnotationClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationClick")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withAxes(value: js.Array[Axis]): Self = {
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
    def withAxesLabelRendering(value: /* e */ AxesLabelRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesLabelRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAxesLabelRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesLabelRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withAxesLabelsInitialize(value: /* e */ AxesLabelsInitializeEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesLabelsInitialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAxesLabelsInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesLabelsInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withAxesRangeCalculate(value: /* e */ AxesRangeCalculateEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesRangeCalculate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAxesRangeCalculate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesRangeCalculate")(js.undefined)
        ret
    }
    @scala.inline
    def withAxesTitleRendering(value: /* e */ AxesTitleRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesTitleRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAxesTitleRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axesTitleRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabelClick(value: /* e */ AxisLabelClickEventArgs => scala.Unit): Self = {
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
    def withAxisLabelMouseMove(value: /* e */ AxisLabelMouseMoveEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAxisLabelMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withBackGroundImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backGroundImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackGroundImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backGroundImageUrl")(js.undefined)
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
    def withBeforeResize(value: /* e */ BeforeResizeEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeResize")(js.undefined)
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
    def withChartArea(value: ChartArea): Self = {
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
    def withChartAreaBoundsCalculate(value: /* e */ ChartAreaBoundsCalculateEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartAreaBoundsCalculate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChartAreaBoundsCalculate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartAreaBoundsCalculate")(js.undefined)
        ret
    }
    @scala.inline
    def withChartClick(value: /* e */ ChartClickEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChartClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartClick")(js.undefined)
        ret
    }
    @scala.inline
    def withChartDoubleClick(value: /* e */ ChartDoubleClickEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChartDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withChartMouseLeave(value: /* e */ ChartMouseLeaveEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChartMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withChartMouseMove(value: /* e */ ChartMouseMoveEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChartMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDefinitions(value: js.Array[ColumnDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonSeriesOptions(value: CommonSeriesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonSeriesOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshair(value: Crosshair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTextRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisplayTextRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTextRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnd(value: /* e */ DragEndEventArgs => scala.Unit): Self = {
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
    def withDragStart(value: /* e */ DragStartEventArgs => scala.Unit): Self = {
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
    def withDragging(value: /* e */ DraggingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable3D(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable3D: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable3D")(js.undefined)
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
    def withEnableRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorBarRendering(value: /* e */ ErrorBarRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBarRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorBarRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBarRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSettings(value: ExportSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicators(value: js.Array[Indicator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSeriesRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSeriesRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSeriesRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSeriesRender")(js.undefined)
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
    def withLegend(value: Legend): Self = {
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
    def withLegendBoundsCalculate(value: /* e */ LegendBoundsCalculateEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendBoundsCalculate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendBoundsCalculate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendBoundsCalculate")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemClick(value: /* e */ LegendItemClickEventArgs => scala.Unit): Self = {
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
    def withLegendItemMouseMove(value: /* e */ LegendItemMouseMoveEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => scala.Unit): Self = {
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
    def withMargin(value: Margin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiLevelLabelClick(value: /* e */ MultiLevelLabelClickEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevelLabelClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMultiLevelLabelClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevelLabelClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiLevelLabelRendering(value: /* e */ MultiLevelLabelRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevelLabelRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMultiLevelLabelRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLevelLabelRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: js.Array[_]): Self = {
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
    def withPerspectiveAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspectiveAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerspectiveAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspectiveAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRegionClick(value: /* e */ PointRegionClickEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointRegionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRegionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => scala.Unit): Self = {
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
    def withPreRender(value: /* e */ PreRenderEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryXAxis(value: PrimaryXAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryXAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryXAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryYAxis(value: PrimaryYAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryYAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryYAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelected(value: /* e */ RangeSelectedEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRangeSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDefinitions(value: js.Array[RowDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollChanged(value: /* e */ ScrollChangedEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnd(value: /* e */ ScrollEndEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollStart(value: /* e */ ScrollStartEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDataPointIndexes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDataPointIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDataPointIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDataPointIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[Series]): Self = {
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
    def withSeriesRegionClick(value: /* e */ SeriesRegionClickEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesRegionClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeriesRegionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesRegionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesRendering(value: /* e */ SeriesRenderingEventArgs => scala.Unit): Self = {
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
    def withSideBySideSeriesPlacement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideBySideSeriesPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideBySideSeriesPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideBySideSeriesPlacement")(js.undefined)
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
    def withSubTitleRendering(value: /* e */ SubTitleRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitleRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubTitleRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitleRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolRendering(value: /* e */ SymbolRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSymbolRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolRendering")(js.undefined)
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
    def withTilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Title): Self = {
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
    def withTitleRendering(value: /* e */ TitleRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitleRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTipInitialize(value: /* e */ ToolTipInitializeEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipInitialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolTipInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackAxisToolTip(value: /* e */ TrackAxisToolTipEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAxisToolTip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrackAxisToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAxisToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackToolTip(value: /* e */ TrackToolTipEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackToolTip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrackToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withTrendlineRendering(value: /* e */ TrendlineRenderingEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendlineRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrendlineRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendlineRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withWallSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWallSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallSize")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomed(value: /* e */ ZoomedEventArgs => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomed")(js.undefined)
        ret
    }
    @scala.inline
    def withZooming(value: Zooming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(js.undefined)
        ret
    }
  }
  
}

