package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonComponentTElementDxElement
import typingsSlinky.devextreme.AnonDuration
import typingsSlinky.devextreme.AnonElementModelTarget
import typingsSlinky.devextreme.AnonElementTarget
import typingsSlinky.devextreme.AnonModelTarget
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChartOptions[T] extends BaseWidgetOptions[T] {
  /** Specifies adaptive layout options. */
  var adaptiveLayout: js.UndefOr[BaseChartAdaptiveLayout] = js.native
  /** Specifies animation options. */
  var animation: js.UndefOr[AnonDuration | Boolean] = js.native
  /** Customizes the appearance of an individual point label. */
  var customizeLabel: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesLabel]] = js.native
  /** Customizes the appearance of an individual series point. */
  var customizePoint: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesPoint]] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** Specifies options of the legend. */
  var legend: js.UndefOr[BaseChartLegend] = js.native
  /** A function that is executed when all series are ready. */
  var onDone: js.UndefOr[js.Function1[/* e */ AnonComponentTElementDxElement[T], _]] = js.native
  /** A function that is executed when a series point is clicked or tapped. */
  var onPointClick: js.UndefOr[(js.Function1[/* e */ AnonModelTarget[T], _]) | String] = js.native
  /** A function that is executed after the pointer enters or leaves a series point. */
  var onPointHoverChanged: js.UndefOr[js.Function1[/* e */ AnonElementTarget, _]] = js.native
  /** A function that is executed when a series point is selected or selection is canceled. */
  var onPointSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementTarget, _]] = js.native
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonElementModelTarget[T], _]] = js.native
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonElementModelTarget[T], _]] = js.native
  /** Sets the palette to be used for colorizing series and their elements. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** Specifies what to do with colors in the palette when their number is less than the number of series (in the Chart widget) or points in a series (in the PieChart widget). */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** Specifies whether a single point or multiple points can be selected in the chart. */
  var pointSelectionMode: js.UndefOr[multiple | single_] = js.native
  /** Specifies options for series. */
  var series: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_BaseChartOptions: js.UndefOr[BaseChartTooltip] = js.native
}

object BaseChartOptions {
  @scala.inline
  def apply[T](): BaseChartOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartOptions[T]]
  }
  @scala.inline
  implicit class BaseChartOptionsOps[Self[t] <: BaseChartOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdaptiveLayout(value: BaseChartAdaptiveLayout): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveLayout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: AnonDuration | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeLabel(value: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesLabel): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizePoint(value: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesPoint): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizePoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizePoint: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizePoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: BaseChartLegend): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDone(value: /* e */ AnonComponentTElementDxElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDone: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointClickFunction1(value: /* e */ AnonModelTarget[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPointClick(value: (js.Function1[/* e */ AnonModelTarget[T], _]) | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointHoverChanged(value: /* e */ AnonElementTarget => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointHoverChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointHoverChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointSelectionChanged(value: /* e */ AnonElementTarget => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointSelectionChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipHidden(value: /* e */ AnonElementModelTarget[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipHidden: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipShown(value: /* e */ AnonElementModelTarget[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipShown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteExtensionMode(value: alternate | blend | extrapolate): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteExtensionMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSelectionMode(value: multiple | single_): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSelectionMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Any | js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: BaseChartTooltip): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

