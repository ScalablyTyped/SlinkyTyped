package typingsSlinky.nivoBar.mod

import slinky.core.ReactComponentClass
import typingsSlinky.nivoBar.dataFromindexeskeysLegend
import typingsSlinky.nivoBar.nivoBarStrings.auto
import typingsSlinky.nivoBar.nivoBarStrings.grouped
import typingsSlinky.nivoBar.nivoBarStrings.horizontal
import typingsSlinky.nivoBar.nivoBarStrings.stacked
import typingsSlinky.nivoBar.nivoBarStrings.vertical
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  indexBy  :string | @nivo/bar.@nivo/bar.IndexByFunc,   keys  :std.Array<string>,   groupMode  :'stacked' | 'grouped',   layout  :'horizontal' | 'vertical',   reverse  :boolean,   innerPadding  :number,   minValue  :number | 'auto',   margin  :@nivo/core.@nivo/core.Box,   maxValue  :number | 'auto',   padding  :number,   axisBottom  :@nivo/bar.@nivo/bar.Axis | null,   axisLeft  :@nivo/bar.@nivo/bar.Axis | null,   axisRight  :@nivo/bar.@nivo/bar.Axis | null,   axisTop  :@nivo/bar.@nivo/bar.Axis | null,   enableGridX  :boolean,   enableGridY  :boolean,   barComponent  :react.react.StatelessComponent<@nivo/bar.@nivo/bar.BarItemProps>,   enableLabel  :boolean,   label  :string | @nivo/bar.@nivo/bar.AccessorFunc,   labelFormat  :string | @nivo/bar.@nivo/bar.LabelFormatter,   labelLinkColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/bar.@nivo/bar.BarDatumWithColor>,   labelSkipWidth  :number,   labelSkipHeight  :number,   labelTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/bar.@nivo/bar.BarDatumWithColor>,   colors  :@nivo/colors.@nivo/colors.OrdinalColorsInstruction<any>,   borderRadius  :number,   borderWidth  :number,   theme  :@nivo/core.@nivo/core.Theme,   isInteractive  :boolean,   tooltipFormat  :string | @nivo/bar.@nivo/bar.ValueFormatter,   tooltip  :@nivo/bar.@nivo/bar.TooltipProp,   legends  :std.Array<{  dataFrom  :'indexes' | 'keys'} & @nivo/legends.@nivo/legends.LegendProps>,   markers  :std.Array<@nivo/core.@nivo/core.CartesianMarkerProps>}> */
@js.native
trait BarProps extends js.Object {
  var axisBottom: js.UndefOr[Axis] = js.native
  var axisLeft: js.UndefOr[Axis] = js.native
  var axisRight: js.UndefOr[Axis] = js.native
  var axisTop: js.UndefOr[Axis] = js.native
  var barComponent: js.UndefOr[ReactComponentClass[BarItemProps]] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enableLabel: js.UndefOr[Boolean] = js.native
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
  var layout: js.UndefOr[horizontal | vertical] = js.native
  var legends: js.UndefOr[js.Array[dataFromindexeskeysLegend]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  var maxValue: js.UndefOr[Double | auto] = js.native
  var minValue: js.UndefOr[Double | auto] = js.native
  var padding: js.UndefOr[Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[ReactComponentClass[BarExtendedDatum]] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object BarProps {
  @scala.inline
  def apply(): BarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarProps]
  }
  @scala.inline
  implicit class BarPropsOps[Self <: BarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

