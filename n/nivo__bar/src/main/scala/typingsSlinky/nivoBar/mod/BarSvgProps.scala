package typingsSlinky.nivoBar.mod

import org.scalajs.dom.raw.SVGRectElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoBar.anon.dataFromindexeskeysLegend
import typingsSlinky.nivoBar.nivoBarStrings.auto
import typingsSlinky.nivoBar.nivoBarStrings.grouped
import typingsSlinky.nivoBar.nivoBarStrings.horizontal
import typingsSlinky.nivoBar.nivoBarStrings.stacked
import typingsSlinky.nivoBar.nivoBarStrings.vertical
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.anon.Dictkey
import typingsSlinky.nivoCore.anon.Id
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/bar.@nivo/bar.Data & @nivo/bar.@nivo/bar.BarProps & @nivo/core.@nivo/core.MotionProps & @nivo/core.@nivo/core.SvgDefsAndFill<@nivo/bar.@nivo/bar.BarDatum> & std.Partial<{  layers  :std.Array<@nivo/bar.@nivo/bar.Layer>, onClick (datum : @nivo/bar.@nivo/bar.BarExtendedDatum, event : react.react.MouseEvent<std.SVGRectElement, react.react.NativeMouseEvent>): void}> */
@js.native
trait BarSvgProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var axisBottom: js.UndefOr[Axis] = js.native
  var axisLeft: js.UndefOr[Axis] = js.native
  var axisRight: js.UndefOr[Axis] = js.native
  var axisTop: js.UndefOr[Axis] = js.native
  var barComponent: js.UndefOr[ReactComponentClass[BarItemProps]] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var data: js.Array[js.Object] = js.native
  var defs: js.UndefOr[js.Array[Dictkey]] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enableLabel: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[js.Array[Id[BarDatum]]] = js.native
  var groupMode: js.UndefOr[stacked | grouped] = js.native
  var indexBy: js.UndefOr[String | IndexByFunc] = js.native
  var innerPadding: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var label: js.UndefOr[String | AccessorFunc] = js.native
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.native
  var labelLinkColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.native
  var labelSkipHeight: js.UndefOr[Double] = js.native
  var labelSkipWidth: js.UndefOr[Double] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.native
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  var layout: js.UndefOr[horizontal | vertical] = js.native
  var legends: js.UndefOr[js.Array[dataFromindexeskeysLegend]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  var maxValue: js.UndefOr[Double | auto] = js.native
  var minValue: js.UndefOr[Double | auto] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* datum */ BarExtendedDatum, /* event */ SyntheticMouseEvent[SVGRectElement], Unit]
  ] = js.native
  var padding: js.UndefOr[Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[ReactComponentClass[BarExtendedDatum]] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object BarSvgProps {
  @scala.inline
  def apply(data: js.Array[js.Object]): BarSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarSvgProps]
  }
  @scala.inline
  implicit class BarSvgPropsOps[Self <: BarSvgProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
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
    def withAxisBottom(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLeft(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisRight(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTop(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTop")(js.undefined)
        ret
    }
    @scala.inline
    def withBarComponent(value: ReactComponentClass[BarItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
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
    def withColorsFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: OrdinalColorsInstruction[_]): Self = {
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
    def withDefs(value: js.Array[Dictkey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridX")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGridY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGridY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGridY")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: js.Array[Id[BarDatum]]): Self = {
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
    def withGroupMode(value: stacked | grouped): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexByFunction1(value: /* datum */ BarDatum => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndexBy(value: String | IndexByFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBy")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(js.undefined)
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
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFunction1(value: /* datum */ BarDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: String | AccessorFunc): Self = {
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
    def withLabelFormatFunction1(value: /* label */ String | Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelFormat(value: String | LabelFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLinkColorFunction1(value: BarDatumWithColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLinkColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelLinkColor(value: InheritedColorProp[BarDatumWithColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLinkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLinkColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLinkColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSkipHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSkipHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSkipHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSkipHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSkipWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSkipWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSkipWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSkipWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextColorFunction1(value: BarDatumWithColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelTextColor(value: InheritedColorProp[BarDatumWithColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLegends(value: js.Array[dataFromindexeskeysLegend]): Self = {
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
    def withMarkers(value: js.Array[CartesianMarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
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
    def withOnClick(value: (/* datum */ BarExtendedDatum, /* event */ SyntheticMouseEvent[SVGRectElement]) => Unit): Self = {
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
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
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
    def withTooltip(value: ReactComponentClass[BarExtendedDatum]): Self = {
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

