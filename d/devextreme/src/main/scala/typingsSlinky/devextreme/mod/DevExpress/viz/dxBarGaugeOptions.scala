package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonComponentDxBarGauge
import typingsSlinky.devextreme.AnonConnectorColor
import typingsSlinky.devextreme.AnonEndAngle
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
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxBarGaugeOptions extends BaseWidgetOptions[dxBarGauge] {
  /** Specifies animation options. */
  var animation: js.UndefOr[js.Any] = js.native
  /** Specifies a color for the remaining segment of the bar's track. */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies a distance between bars in pixels. */
  var barSpacing: js.UndefOr[Double] = js.native
  /** Specifies a base value for bars. */
  var baseValue: js.UndefOr[Double] = js.native
  /** Specifies an end value for the gauge's invisible scale. */
  var endValue: js.UndefOr[Double] = js.native
  /** Defines the shape of the gauge's arc. */
  var geometry: js.UndefOr[AnonEndAngle] = js.native
  /** Specifies the options of the labels that accompany gauge bars. */
  var label: js.UndefOr[AnonConnectorColor] = js.native
  /** Configures the legend. */
  var legend: js.UndefOr[dxBarGaugeLegend] = js.native
  /** Configures the loading indicator. */
  @JSName("loadingIndicator")
  var loadingIndicator_dxBarGaugeOptions: js.UndefOr[dxBarGaugeLoadingIndicator] = js.native
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonComponentDxBarGauge, _]] = js.native
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonComponentDxBarGauge, _]] = js.native
  /** Sets the palette to be used for colorizing bars in the gauge. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** Specifies what to do with colors in the palette when their number is less than the number of bars in the gauge. */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** Defines the radius of the bar that is closest to the center relatively to the radius of the topmost bar. */
  var relativeInnerRadius: js.UndefOr[Double] = js.native
  /** Specifies how the widget should behave when bar labels overlap: hide certain labels or leave them overlapped. */
  var resolveLabelOverlapping: js.UndefOr[hide | none] = js.native
  /** Specifies a start value for the gauge's invisible scale. */
  var startValue: js.UndefOr[Double] = js.native
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxBarGaugeOptions: js.UndefOr[dxBarGaugeTooltip] = js.native
  /** Specifies the array of values to be indicated on a bar gauge. */
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object dxBarGaugeOptions {
  @scala.inline
  def apply(): dxBarGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBarGaugeOptions]
  }
  @scala.inline
  implicit class dxBarGaugeOptionsOps[Self <: dxBarGaugeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEndValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: AnonEndAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonConnectorColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: dxBarGaugeLegend): Self = {
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
    def withLoadingIndicator(value: dxBarGaugeLoadingIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipHidden(value: /* e */ AnonComponentDxBarGauge => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipShown(value: /* e */ AnonComponentDxBarGauge => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipShown")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = {
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
    def withPaletteExtensionMode(value: alternate | blend | extrapolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteExtensionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeInnerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeInnerRadius")(js.undefined)
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
    def withStartValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: dxBarGaugeTooltip): Self = {
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
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

