package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonArgumentComponent
import typingsSlinky.devextreme.AnonComponentDxPolarChart
import typingsSlinky.devextreme.AnonConvertToAxisDataType
import typingsSlinky.devextreme.AnonCustomizeSeriesNameField
import typingsSlinky.devextreme.AnonJQueryEventModelTarget
import typingsSlinky.devextreme.AnonPreviousRange
import typingsSlinky.devextreme.AnonRange
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartOptions extends BaseChartOptions[dxPolarChart] {
  /** Specifies adaptive layout options. */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPolarChartOptions: js.UndefOr[dxPolarChartAdaptiveLayout] = js.native
  /** Specifies argument axis options for the PolarChart widget. */
  var argumentAxis: js.UndefOr[dxPolarChartArgumentAxis] = js.native
  /** Controls the padding and consequently the angular width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth option is set. */
  var barGroupPadding: js.UndefOr[Double] = js.native
  /** Specifies a fixed angular width for groups of bars with the same argument, measured in degrees. Takes precedence over the barGroupPadding option. */
  var barGroupWidth: js.UndefOr[Double] = js.native
  /** @deprecated Use CommonPolarChartSeries.barPadding instead. */
  /** Specifies a common bar width as a percentage from 0 to 1. */
  var barWidth: js.UndefOr[Double] = js.native
  /** An object defining the configuration options that are common for all axes of the PolarChart widget. */
  var commonAxisSettings: js.UndefOr[dxPolarChartCommonAxisSettings] = js.native
  /** An object defining the configuration options that are common for all series of the PolarChart widget. */
  var commonSeriesSettings: js.UndefOr[dxPolarChartCommonSeriesSettings] = js.native
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  /** An object providing options for managing data from a data source. */
  var dataPrepareSettings: js.UndefOr[AnonConvertToAxisDataType] = js.native
  /** @deprecated Use CommonPolarChartSeries.ignoreEmptyPoints instead. */
  /** Specifies whether or not all bars in a series must have the same angle, or may have different angles if any points in other series are missing. */
  var equalBarWidth: js.UndefOr[Boolean] = js.native
  /** Specifies the options of a chart's legend. */
  @JSName("legend")
  var legend_dxPolarChartOptions: js.UndefOr[dxPolarChartLegend] = js.native
  /** Forces the widget to treat negative values as zeroes. Applies to stacked-like series only. */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.native
  /** A function that is executed when a label on the argument axis is clicked or tapped. */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ AnonArgumentComponent, _]) | String] = js.native
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String] = js.native
  /** A function that is executed when a series is clicked or tapped. */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String] = js.native
  /** A function that is executed after the pointer enters or leaves a series. */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxPolarChart, _]] = js.native
  /** A function that is executed when a series is selected or selection is canceled. */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxPolarChart, _]] = js.native
  /** A function that is executed when zooming or panning ends. */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ AnonPreviousRange, _]] = js.native
  /** A function that is executed when zooming or panning begins. */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ AnonRange, _]] = js.native
  /** Specifies how the chart must behave when series point labels overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none] = js.native
  /** Specifies whether a single series or multiple series can be selected in the chart. */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.native
  /** Defines options for the series template. */
  var seriesTemplate: js.UndefOr[AnonCustomizeSeriesNameField] = js.native
  /** Specifies options for PolarChart widget series. */
  @JSName("series")
  var series_dxPolarChartOptions: js.UndefOr[PolarChartSeries | js.Array[PolarChartSeries]] = js.native
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxPolarChartOptions: js.UndefOr[dxPolarChartTooltip] = js.native
  /** Indicates whether or not to display a "spider web". */
  var useSpiderWeb: js.UndefOr[Boolean] = js.native
  /** Specifies value axis options for the PolarChart widget. */
  var valueAxis: js.UndefOr[dxPolarChartValueAxis] = js.native
}

object dxPolarChartOptions {
  @scala.inline
  def apply(): dxPolarChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartOptions]
  }
  @scala.inline
  implicit class dxPolarChartOptionsOps[Self <: dxPolarChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveLayout(value: dxPolarChartAdaptiveLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentAxis(value: dxPolarChartArgumentAxis): Self = {
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
    def withCommonAxisSettings(value: dxPolarChartCommonAxisSettings): Self = {
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
    def withCommonSeriesSettings(value: dxPolarChartCommonSeriesSettings): Self = {
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
    def withDataPrepareSettings(value: AnonConvertToAxisDataType): Self = {
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
    def withLegend(value: dxPolarChartLegend): Self = {
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
    def withOnArgumentAxisClickFunction1(value: /* e */ AnonArgumentComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArgumentAxisClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnArgumentAxisClick(value: (js.Function1[/* e */ AnonArgumentComponent, _]) | String): Self = {
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
    def withOnLegendClickFunction1(value: /* e */ AnonJQueryEventModelTarget => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLegendClick(value: (js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String): Self = {
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
    def withOnSeriesClickFunction1(value: /* e */ AnonJQueryEventModelTarget => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeriesClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSeriesClick(value: (js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String): Self = {
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
    def withOnSeriesHoverChanged(value: /* e */ AnonComponentDxPolarChart => _): Self = {
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
    def withOnSeriesSelectionChanged(value: /* e */ AnonComponentDxPolarChart => _): Self = {
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
    def withOnZoomEnd(value: /* e */ AnonPreviousRange => _): Self = {
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
    def withOnZoomStart(value: /* e */ AnonRange => _): Self = {
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
    def withResolveLabelOverlapping(value: hide | none): Self = {
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
    def withSeries(value: PolarChartSeries | js.Array[PolarChartSeries]): Self = {
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
    def withSeriesTemplate(value: AnonCustomizeSeriesNameField): Self = {
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
    def withTooltip(value: dxPolarChartTooltip): Self = {
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
    def withUseSpiderWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSpiderWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSpiderWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSpiderWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAxis(value: dxPolarChartValueAxis): Self = {
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
  }
  
}

