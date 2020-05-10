package typingsSlinky.nivoHeatmap.mod

import slinky.core.ReactComponentClass
import typingsSlinky.nivoAxes.mod.Axis
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Colors
import typingsSlinky.nivoCore.mod.GetColor
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.cell
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.circle
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.column
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.rect
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.row
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.rowColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/core.@nivo/core.ColorProps<@nivo/heatmap.@nivo/heatmap.HeatMapDatum> & std.Partial<{  forceSquare  :boolean,   sizeVariation  :number,   margin  :@nivo/core.@nivo/core.Box,   padding  :number,   cellShape  :'rect' | 'circle' | react.react.StatelessComponent<any>,   cellOpacity  :number,   cellBorderWidth  :number,   cellBorderColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/heatmap.@nivo/heatmap.HeatMapDatumWithColor>,   axisTop  :@nivo/axes.@nivo/axes.Axis,   axisRight  :@nivo/axes.@nivo/axes.Axis,   axisBottom  :@nivo/axes.@nivo/axes.Axis,   axisLeft  :@nivo/axes.@nivo/axes.Axis,   enableGridX  :boolean,   enableGridY  :boolean,   enableLabels  :boolean,   labelTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/heatmap.@nivo/heatmap.HeatMapDatumWithColor>,   isInteractive  :boolean,   hoverTarget  :'cell' | 'row' | 'column' | 'rowColumn',   cellHoverOpacity  :number,   cellHoverOthersOpacity  :number,   tooltipFormat  :string | @nivo/heatmap.@nivo/heatmap.ValueFormatter,   theme  :@nivo/core.@nivo/core.Theme}> */
@js.native
trait HeatMapCommonProps extends js.Object {
  var axisBottom: js.UndefOr[Axis] = js.native
  var axisLeft: js.UndefOr[Axis] = js.native
  var axisRight: js.UndefOr[Axis] = js.native
  var axisTop: js.UndefOr[Axis] = js.native
  var cellBorderColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.native
  var cellBorderWidth: js.UndefOr[Double] = js.native
  var cellHoverOpacity: js.UndefOr[Double] = js.native
  var cellHoverOthersOpacity: js.UndefOr[Double] = js.native
  var cellOpacity: js.UndefOr[Double] = js.native
  var cellShape: js.UndefOr[rect | circle | ReactComponentClass[_]] = js.native
  var colorBy: js.UndefOr[String | GetColor[HeatMapDatum]] = js.native
  var colors: js.UndefOr[Colors] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enableLabels: js.UndefOr[Boolean] = js.native
  var forceSquare: js.UndefOr[Boolean] = js.native
  var hoverTarget: js.UndefOr[cell | row | column | rowColumn] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var padding: js.UndefOr[Double] = js.native
  var sizeVariation: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object HeatMapCommonProps {
  @scala.inline
  def apply(): HeatMapCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapCommonProps]
  }
  @scala.inline
  implicit class HeatMapCommonPropsOps[Self <: HeatMapCommonProps] (val x: Self) extends AnyVal {
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
    def withCellBorderColorFunction1(value: HeatMapDatumWithColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellBorderColor(value: InheritedColorProp[HeatMapDatumWithColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCellBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHoverOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHoverOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHoverOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHoverOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHoverOthersOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHoverOthersOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHoverOthersOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHoverOthersOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withCellOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withCellShapeFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellShape(value: rect | circle | ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellShape")(js.undefined)
        ret
    }
    @scala.inline
    def withColorByFunction1(value: HeatMapDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColorBy(value: String | GetColor[HeatMapDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Colors): Self = {
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
    def withEnableLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSquare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSquare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSquare")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverTarget(value: cell | row | column | rowColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverTarget")(js.undefined)
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
    def withLabelTextColorFunction1(value: HeatMapDatumWithColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelTextColor(value: InheritedColorProp[HeatMapDatumWithColor]): Self = {
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
    def withSizeVariation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeVariation")(js.undefined)
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

