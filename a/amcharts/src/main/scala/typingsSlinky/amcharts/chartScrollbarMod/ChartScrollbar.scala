package typingsSlinky.amcharts.chartScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartScrollbar extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    */
  var autoGridCount: Boolean = js.native
  /**
    * Background opacity.
    * @default 1
    */
  var backgroundAlpha: Double = js.native
  /**
    * Background color of the scrollbar.
    * @default #D4D4D4
    */
  var backgroundColor: String = js.native
  /**
    * Read-only. Category axis of the scrollbar.
    */
  var categoryAxis: typingsSlinky.amcharts.categoryAxisMod.default = js.native
  /**
    * Text color. Will use chart's color if not set.
    */
  var color: String = js.native
  /**
    * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
    */
  var graph: typingsSlinky.amcharts.amGraphMod.default = js.native
  /**
    * Graph fill opacity. Value range is 0 - 1.  0.1
    */
  var graphFillAlpha: Double = js.native
  /**
    * Graph fill color. #000000
    */
  var graphFillColor: String = js.native
  /**
    * Graph line opacity. Value range is 0 - 1.
    */
  var graphLineAlpha: Double = js.native
  /**
    * Graph line color. #000000
    */
  var graphLineColor: String = js.native
  /**
    * By default the graph type is the same as the original graph's type,
    * however in case of "candlestick" or "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
    */
  var graphType: String = js.native
  /**
    * Grid opacity. Value range is 0 - 1. 0.7
    */
  var gridAlpha: Double = js.native
  /**
    * Grid color. #FFFFFF
    */
  var gridColor: String = js.native
  /**
    * The number of grid lines.
    */
  var gridCount: Double = js.native
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  var hideResizeGrips: Boolean = js.native
  /**
    * Specifies whether scrollbar has a resize feature.
    * @default true
    */
  var resizeEnabled: Boolean = js.native
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    * @default 2
    */
  var scrollDuration: Double = js.native
  /**
    * Height (width, if chart is rotated) of a scrollbar.
    * @default 20
    */
  var scrollbarHeight: Double = js.native
  /**
    * Selected backround opacity.
    * @default 1
    */
  var selectedBackgroundAlpha: Double = js.native
  /**
    * Selected background color. #EFEFEF
    */
  var selectedBackgroundColor: String = js.native
  /**
    * Selected graph's fill opacity. Value range is 0 - 1. 0.5
    */
  var selectedGraphFillAlpha: Double = js.native
  /**
    * Selected graph's fill color. #000000
    */
  var selectedGraphFillColor: String = js.native
  /**
    * Selected graph's line opacity. Value range is 0 - 1.
    */
  var selectedGraphLineAlpha: Double = js.native
  /**
    * Selected graph's line color. #000000
    */
  var selectedGraphLineColor: String = js.native
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment
    * when user releases mouse button.
    */
  var updateOnReleaseOnly: Boolean = js.native
}

object ChartScrollbar {
  @scala.inline
  def apply(
    autoGridCount: Boolean,
    backgroundAlpha: Double,
    backgroundColor: String,
    categoryAxis: typingsSlinky.amcharts.categoryAxisMod.default,
    color: String,
    graph: typingsSlinky.amcharts.amGraphMod.default,
    graphFillAlpha: Double,
    graphFillColor: String,
    graphLineAlpha: Double,
    graphLineColor: String,
    graphType: String,
    gridAlpha: Double,
    gridColor: String,
    gridCount: Double,
    hideResizeGrips: Boolean,
    resizeEnabled: Boolean,
    scrollDuration: Double,
    scrollbarHeight: Double,
    selectedBackgroundAlpha: Double,
    selectedBackgroundColor: String,
    selectedGraphFillAlpha: Double,
    selectedGraphFillColor: String,
    selectedGraphLineAlpha: Double,
    selectedGraphLineColor: String,
    updateOnReleaseOnly: Boolean
  ): ChartScrollbar = {
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], categoryAxis = categoryAxis.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], graphFillAlpha = graphFillAlpha.asInstanceOf[js.Any], graphFillColor = graphFillColor.asInstanceOf[js.Any], graphLineAlpha = graphLineAlpha.asInstanceOf[js.Any], graphLineColor = graphLineColor.asInstanceOf[js.Any], graphType = graphType.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], hideResizeGrips = hideResizeGrips.asInstanceOf[js.Any], resizeEnabled = resizeEnabled.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], scrollbarHeight = scrollbarHeight.asInstanceOf[js.Any], selectedBackgroundAlpha = selectedBackgroundAlpha.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedGraphFillAlpha = selectedGraphFillAlpha.asInstanceOf[js.Any], selectedGraphFillColor = selectedGraphFillColor.asInstanceOf[js.Any], selectedGraphLineAlpha = selectedGraphLineAlpha.asInstanceOf[js.Any], selectedGraphLineColor = selectedGraphLineColor.asInstanceOf[js.Any], updateOnReleaseOnly = updateOnReleaseOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartScrollbar]
  }
  @scala.inline
  implicit class ChartScrollbarOps[Self <: ChartScrollbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoGridCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGridCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryAxis(value: typingsSlinky.amcharts.categoryAxisMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraph(value: typingsSlinky.amcharts.amGraphMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphFillAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphFillAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphLineAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphLineAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideResizeGrips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideResizeGrips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedBackgroundAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBackgroundAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedGraphFillAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedGraphFillAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedGraphFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedGraphFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedGraphLineAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedGraphLineAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedGraphLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedGraphLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateOnReleaseOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnReleaseOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

