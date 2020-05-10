package typingsSlinky.nivoPie.mod

import org.scalajs.dom.raw.SVGPathElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/pie.@nivo/pie.Data & @nivo/pie.@nivo/pie.CommonPieProps & std.Partial<{  pixelRatio  :number}> */
@js.native
trait PieCanvasProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[PieDatum]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[PieDatum]] = js.native
  var cornerRadius: js.UndefOr[Double] = js.native
  var data: js.Array[PieDatum] = js.native
  var enableRadialLabels: js.UndefOr[Boolean] = js.native
  var enableSlicesLabels: js.UndefOr[Boolean] = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var fit: js.UndefOr[Boolean] = js.native
  var innerRadius: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* datum */ PieDatum, /* event */ SyntheticMouseEvent[SVGPathElement], Unit]
  ] = js.native
  var padAngle: js.UndefOr[Double] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var radialLabel: js.UndefOr[String | AccessorFunc] = js.native
  var radialLabelsLinkColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.native
  var radialLabelsLinkDiagonalLength: js.UndefOr[Double] = js.native
  var radialLabelsLinkHorizontalLength: js.UndefOr[Double] = js.native
  var radialLabelsLinkOffset: js.UndefOr[Double] = js.native
  var radialLabelsLinkStrokeWidth: js.UndefOr[Double] = js.native
  var radialLabelsSkipAngle: js.UndefOr[Double] = js.native
  var radialLabelsTextColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.native
  var radialLabelsTextXOffset: js.UndefOr[Double] = js.native
  var sliceLabel: js.UndefOr[String | AccessorFunc] = js.native
  var slicesLabelsSkipAngle: js.UndefOr[Double] = js.native
  var slicesLabelsTextColor: js.UndefOr[InheritedColorProp[PieDatumWithColor]] = js.native
  var sortByValue: js.UndefOr[Boolean] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[ReactComponentClass[PieDatumWithColor]] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object PieCanvasProps {
  @scala.inline
  def apply(data: js.Array[PieDatum]): PieCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieCanvasProps]
  }
  @scala.inline
  implicit class PieCanvasPropsOps[Self <: PieCanvasProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[PieDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColorFunction1(value: PieDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColor(value: InheritedColorProp[PieDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColorsFunction1(value: PieDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: OrdinalColorsInstruction[PieDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRadialLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRadialLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRadialLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRadialLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSlicesLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSlicesLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSlicesLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSlicesLabels")(js.undefined)
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
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
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
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[LegendProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legends")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self = {
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
    def withMotionDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* datum */ PieDatum, /* event */ SyntheticMouseEvent[SVGPathElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPadAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelFunction1(value: /* datum */ PieDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadialLabel(value: String | AccessorFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsLinkColorFunction1(value: PieDatumWithColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadialLabelsLinkColor(value: InheritedColorProp[PieDatumWithColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsLinkColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsLinkDiagonalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkDiagonalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsLinkDiagonalLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkDiagonalLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsLinkHorizontalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkHorizontalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsLinkHorizontalLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkHorizontalLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsLinkOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsLinkOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsLinkStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsLinkStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsLinkStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsSkipAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsSkipAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsSkipAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsSkipAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsTextColorFunction1(value: PieDatumWithColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsTextColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadialLabelsTextColor(value: InheritedColorProp[PieDatumWithColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialLabelsTextXOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsTextXOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialLabelsTextXOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialLabelsTextXOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceLabelFunction1(value: /* datum */ PieDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSliceLabel(value: String | AccessorFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliceLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicesLabelsSkipAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicesLabelsSkipAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicesLabelsSkipAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicesLabelsSkipAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicesLabelsTextColorFunction1(value: PieDatumWithColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicesLabelsTextColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlicesLabelsTextColor(value: InheritedColorProp[PieDatumWithColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicesLabelsTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicesLabelsTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicesLabelsTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSortByValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortByValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByValue")(js.undefined)
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
    def withTheme(value: Theme): Self = {
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
    def withTooltip(value: ReactComponentClass[PieDatumWithColor]): Self = {
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
    def withTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltipFormat(value: String | ValueFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.undefined)
        ret
    }
  }
  
}

