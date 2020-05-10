package typingsSlinky.ejWebAll.ej.datavisualization.SunburstChart

import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.Animation
import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.SunburstTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the sunburst chart.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Animation type of sunburst
    * @Default {rotation. See Alignment}
    */
  var animationType: js.UndefOr[Animation | String] = js.native
  /** Background color of the plot area.
    * @Default {null}
    */
  var background: js.UndefOr[String] = js.native
  /** Options for customizing the sunburst border.
    */
  var border: js.UndefOr[Border] = js.native
  /** Fires before rendering the datalabel
    */
  var dataLabelRendering: js.UndefOr[js.Function1[/* e */ DataLabelRenderingEventArgs, Unit]] = js.native
  /** Options to customize the Sunburst dataLabel.
    */
  var dataLabelSettings: js.UndefOr[DataLabelSettings] = js.native
  /** Specifies the dataSource to the sunburst.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Fires, on double clicking the sunburst chart.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Fires when resetting drilldown points.
    */
  var drillDownBack: js.UndefOr[js.Function1[/* e */ DrillDownBackEventArgs, Unit]] = js.native
  /** Fires when clicking the point to perform drilldown.
    */
  var drillDownClick: js.UndefOr[js.Function1[/* e */ DrillDownClickEventArgs, Unit]] = js.native
  /** Fires after resetting the sunburst points
    */
  var drillDownReset: js.UndefOr[js.Function1[/* e */ DrillDownResetEventArgs, Unit]] = js.native
  /** Enable/disable the animation for all the levels.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Sunburst rendering will end at the specified value
    * @Default {null}
    */
  var endAngle: js.UndefOr[Double] = js.native
  /** Options for customizing the appearance of the levels or point while highlighting.
    */
  var highlightSettings: js.UndefOr[HighlightSettings] = js.native
  /** Sunburst inner radius value
    * @Default {0.4}
    */
  var innerRadius: js.UndefOr[Double] = js.native
  /** Controls whether sunburst has to be responsive or not.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Options to customize the legend items and legend title.
    */
  var legend: js.UndefOr[Legend] = js.native
  /** Specify levels of sunburst for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.native
  /** Fires before loading.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Fires after rendering sunburst.
    */
  var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.native
  /** Options to customize the left, right, top and bottom margins of sunburst area.
    */
  var margin: js.UndefOr[Margin] = js.native
  /** Opacity of the levels.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Palette color for the data points.
    * @Default {null}
    */
  var palette: js.UndefOr[String] = js.native
  /** Parent node of the data points.
    * @Default {null}
    */
  var parentNode: js.UndefOr[String] = js.native
  /** Fires after clicking the point in sunburst
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.native
  /** Fires while moving the mouse over sunburst points
    */
  var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.native
  /** Options for customizing sunburst points.
    */
  var points: js.UndefOr[Points] = js.native
  /** Fires before rendering sunburst.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.native
  /** Sunburst outer radius value
    * @Default {1}
    */
  var radius: js.UndefOr[Double] = js.native
  /** Fires, on right clicking the sunburst chart
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Options for customizing the sunburst segment border.
    */
  var segmentBorder: js.UndefOr[SegmentBorder] = js.native
  /** Fires before rendering each segment
    */
  var segmentRendering: js.UndefOr[js.Function1[/* e */ SegmentRenderingEventArgs, Unit]] = js.native
  /** Options for customizing the appearance of the levels or data point while selection.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  /** Options to customize the Sunburst size.
    */
  var size: js.UndefOr[Size] = js.native
  /** Sunburst rendering will start from the specified value
    * @Default {null}
    */
  var startAngle: js.UndefOr[Double] = js.native
  /** Specifies the theme for Sunburst.
    * @Default {Flatlight. See Theme}
    */
  var theme: js.UndefOr[SunburstTheme | String] = js.native
  /** Options for customizing the title and subtitle of sunburst.
    */
  var title: js.UndefOr[Title] = js.native
  /** Fires before rendering sunburst title.
    */
  var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, Unit]] = js.native
  /** Options to customize the Sunburst tooltip.
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /** Fires during initialization of tooltip.
    */
  var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.native
  /** Bind the data field from the data source.
    * @Default {null}
    */
  var valueMemberPath: js.UndefOr[String] = js.native
  /** Controls the visibility of sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Name of the property in the datasource that contains x values.
    * @Default {null}
    */
  var xName: js.UndefOr[String] = js.native
  /** Name of the property in the datasource that contains y values.
    * @Default {null}
    */
  var yName: js.UndefOr[String] = js.native
  /** Options for enable zooming feature of chart.
    */
  var zoomSettings: js.UndefOr[ZoomSettings] = js.native
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
    def withAnimationType(value: Animation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(js.undefined)
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
    def withDataLabelRendering(value: /* e */ DataLabelRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabelRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataLabelRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabelRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLabelSettings(value: DataLabelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabelSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabelSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabelSettings")(js.undefined)
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
    def withDrillDownBack(value: /* e */ DrillDownBackEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownBack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillDownBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownBack")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDownClick(value: /* e */ DrillDownClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillDownClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDownReset(value: /* e */ DrillDownResetEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillDownReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownReset")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSettings(value: HighlightSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
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
    def withLevels(value: js.Array[Level]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
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
    def withParentNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRegionClick(value: /* e */ PointRegionClickEventArgs => Unit): Self = {
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
    def withPoints(value: Points): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRender(value: /* e */ PreRenderEventArgs => Unit): Self = {
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
    def withSegmentBorder(value: SegmentBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentRendering(value: /* e */ SegmentRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSegmentRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionSettings(value: SelectionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(js.undefined)
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
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: SunburstTheme | String): Self = {
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
    def withTitleRendering(value: /* e */ TitleRenderingEventArgs => Unit): Self = {
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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
    @scala.inline
    def withZoomSettings(value: ZoomSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSettings")(js.undefined)
        ret
    }
  }
  
}

