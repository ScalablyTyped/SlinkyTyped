package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonActionType
import typingsSlinky.devextreme.AnonAllowMouseWheel
import typingsSlinky.devextreme.AnonArgument
import typingsSlinky.devextreme.AnonAxis
import typingsSlinky.devextreme.AnonCheckTypeForAllData
import typingsSlinky.devextreme.AnonComponentDxChart
import typingsSlinky.devextreme.AnonCustomizeSeries
import typingsSlinky.devextreme.AnonEventJQueryEventModel
import typingsSlinky.devextreme.AnonHorizontalLine
import typingsSlinky.devextreme.AnonOffset
import typingsSlinky.devextreme.devextremeStrings.all
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.mouse
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.devextremeStrings.stack
import typingsSlinky.devextreme.devextremeStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartOptions extends BaseChartOptions[dxChart] {
  /** Specifies whether to adjust the value axis's visualRange when the argument axis is being zoomed or panned. */
  var adjustOnZoom: js.UndefOr[Boolean] = js.native
  /** Specifies the annotation collection. */
  var annotations: js.UndefOr[js.Array[dxChartAnnotationConfig | _]] = js.native
  /** Configures the argument axis. */
  var argumentAxis: js.UndefOr[dxChartArgumentAxis] = js.native
  /** Specifies whether to hide series point markers automatically to reduce visual clutter. */
  var autoHidePointMarkers: js.UndefOr[Boolean] = js.native
  /** Controls the padding and consequently the width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth option is set. */
  var barGroupPadding: js.UndefOr[Double] = js.native
  /** Specifies a fixed width for groups of bars with the same argument, measured in pixels. Takes precedence over the barGroupPadding option. */
  var barGroupWidth: js.UndefOr[Double] = js.native
  /** @deprecated Use CommonSeries.barPadding instead. */
  /** Controls the width of bars in the widget. Applies only to bar-like series and when the equalBarWidth option is true. */
  var barWidth: js.UndefOr[Double] = js.native
  /** Specifies settings common for all annotations in the chart. */
  var commonAnnotationSettings: js.UndefOr[dxChartCommonAnnotationConfig] = js.native
  /** Defines common settings for both the argument and value axis in a chart. */
  var commonAxisSettings: js.UndefOr[dxChartCommonAxisSettings] = js.native
  /** Defines common settings for all panes in a chart. */
  var commonPaneSettings: js.UndefOr[dxChartCommonPaneSettings] = js.native
  /** Specifies settings common for all series in the chart. */
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.native
  /** Colors the background of the chart container. */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  /** Configures the crosshair feature. */
  var crosshair: js.UndefOr[AnonHorizontalLine] = js.native
  /** Customizes an individual annotation. */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxChartAnnotationConfig | js.Any, dxChartAnnotationConfig]
  ] = js.native
  /** Processes data before visualizing it. */
  var dataPrepareSettings: js.UndefOr[AnonCheckTypeForAllData] = js.native
  /** Specifies which pane should be used by default. */
  var defaultPane: js.UndefOr[String] = js.native
  /** @deprecated Use CommonSeries.ignoreEmptyPoints instead. */
  /** Specifies whether all bars should have equal width, even if some values are missing from a series. Applies only to bar-like series. */
  var equalBarWidth: js.UndefOr[Boolean] = js.native
  /** Specifies the options of a chart's legend. */
  @JSName("legend")
  var legend_dxChartOptions: js.UndefOr[dxChartLegend] = js.native
  /** Specifies a coefficient determining the diameter of the largest bubble. */
  var maxBubbleSize: js.UndefOr[Double] = js.native
  /** Specifies the diameter of the smallest bubble measured in pixels. */
  var minBubbleSize: js.UndefOr[Double] = js.native
  /** Forces the widget to treat negative values as zeroes. Applies to stacked-like series only. */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.native
  /** A function that is executed when a label on the argument axis is clicked or tapped. */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ AnonArgument, _]) | String] = js.native
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String] = js.native
  /** A function that is executed when a series is clicked or tapped. */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String] = js.native
  /** A function that is executed after the pointer enters or leaves a series. */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxChart, _]] = js.native
  /** A function that is executed when a series is selected or selection is canceled. */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxChart, _]] = js.native
  /** A function that is executed when zooming or panning ends. */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ AnonActionType, _]] = js.native
  /** A function that is executed when zooming or panning begins. */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ AnonAxis, _]] = js.native
  /** Declares a collection of panes. */
  var panes: js.UndefOr[dxChartPanes | js.Array[dxChartPanes]] = js.native
  /** Specifies whether panes can be resized if other chart elements require more space after zooming or panning. */
  var resizePanesOnZoom: js.UndefOr[Boolean] = js.native
  /** Specifies how the chart must behave when series point labels overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none | stack] = js.native
  /** Swaps the axes around making the value axis horizontal and the argument axis vertical. */
  var rotated: js.UndefOr[Boolean] = js.native
  /** Specifies the settings of the scroll bar. */
  var scrollBar: js.UndefOr[AnonOffset] = js.native
  /** @deprecated Use the zoomAndPan option instead. */
  /** Enables scrolling in your chart. */
  var scrollingMode: js.UndefOr[all | mouse | none | touch] = js.native
  /** Specifies whether a single series or multiple series can be selected in the chart. */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.native
  /** Defines options for the series template. */
  var seriesTemplate: js.UndefOr[AnonCustomizeSeries] = js.native
  /** Specifies options for Chart widget series. */
  @JSName("series")
  var series_dxChartOptions: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.native
  /** Specifies whether a point should remain in the hover state when the mouse pointer moves away. */
  var stickyHovering: js.UndefOr[Boolean] = js.native
  /** Indicates whether or not to synchronize value axes when they are displayed on a single pane. */
  var synchronizeMultiAxes: js.UndefOr[Boolean] = js.native
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxChartOptions: js.UndefOr[dxChartTooltip] = js.native
  /** @deprecated Use CommonSeries.aggregation.enabled instead. */
  /** Specifies whether or not to filter the series points depending on their quantity. */
  var useAggregation: js.UndefOr[Boolean] = js.native
  /** Configures the value axis. */
  var valueAxis: js.UndefOr[dxChartValueAxis | js.Array[dxChartValueAxis]] = js.native
  /** Configures zooming and panning. */
  var zoomAndPan: js.UndefOr[AnonAllowMouseWheel] = js.native
  /** @deprecated Use the zoomAndPan option instead. */
  /** Enables zooming in your chart. */
  var zoomingMode: js.UndefOr[all | mouse | none | touch] = js.native
}

object dxChartOptions {
  @scala.inline
  def apply(): dxChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartOptions]
  }
  @scala.inline
  implicit class dxChartOptionsOps[Self <: dxChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustOnZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustOnZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustOnZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustOnZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Array[dxChartAnnotationConfig | _]): Self = {
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
    def withArgumentAxis(value: dxChartArgumentAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHidePointMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHidePointMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHidePointMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHidePointMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withBarGroupPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGroupPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withBarGroupWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGroupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGroupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonAnnotationSettings(value: dxChartCommonAnnotationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonAnnotationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonAnnotationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonAnnotationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonAxisSettings(value: dxChartCommonAxisSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonAxisSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonAxisSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonAxisSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonPaneSettings(value: dxChartCommonPaneSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonPaneSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonPaneSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonPaneSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonSeriesSettings(value: dxChartCommonSeriesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonSeriesSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshair(value: AnonHorizontalLine): Self = {
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
    def withCustomizeAnnotation(value: /* annotation */ dxChartAnnotationConfig | js.Any => dxChartAnnotationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withDataPrepareSettings(value: AnonCheckTypeForAllData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPrepareSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPrepareSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPrepareSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPane")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualBarWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalBarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalBarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: dxChartLegend): Self = {
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
    def withMaxBubbleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBubbleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBubbleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBubbleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBubbleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBubbleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBubbleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBubbleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativesAsZeroes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativesAsZeroes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativesAsZeroes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativesAsZeroes")(js.undefined)
        ret
    }
    @scala.inline
    def withOnArgumentAxisClickFunction1(value: /* e */ AnonArgument => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArgumentAxisClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnArgumentAxisClick(value: (js.Function1[/* e */ AnonArgument, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArgumentAxisClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnArgumentAxisClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArgumentAxisClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLegendClickFunction1(value: /* e */ AnonEventJQueryEventModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLegendClick(value: (js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLegendClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeriesClickFunction1(value: /* e */ AnonEventJQueryEventModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSeriesClick(value: (js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeriesClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeriesHoverChanged(value: /* e */ AnonComponentDxChart => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeriesHoverChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesHoverChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeriesSelectionChanged(value: /* e */ AnonComponentDxChart => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeriesSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomEnd(value: /* e */ AnonActionType => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoomEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomStart(value: /* e */ AnonAxis => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPanes(value: dxChartPanes | js.Array[dxChartPanes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panes")(js.undefined)
        ret
    }
    @scala.inline
    def withResizePanesOnZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizePanesOnZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizePanesOnZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizePanesOnZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveLabelOverlapping(value: hide | none | stack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveLabelOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withRotated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBar(value: AnonOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBar")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingMode(value: all | mouse | none | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: ChartSeries | js.Array[ChartSeries]): Self = {
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
    def withSeriesSelectionMode(value: multiple | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesTemplate(value: AnonCustomizeSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHovering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHovering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHovering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHovering")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronizeMultiAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeMultiAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronizeMultiAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeMultiAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: dxChartTooltip): Self = {
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
    def withUseAggregation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAggregation")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAxis(value: dxChartValueAxis | js.Array[dxChartValueAxis]): Self = {
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
    def withZoomAndPan(value: AnonAllowMouseWheel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAndPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomAndPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAndPan")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomingMode(value: all | mouse | none | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomingMode")(js.undefined)
        ret
    }
  }
  
}

