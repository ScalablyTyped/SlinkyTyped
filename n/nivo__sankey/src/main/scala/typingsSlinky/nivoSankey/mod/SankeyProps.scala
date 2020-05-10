package typingsSlinky.nivoSankey.mod

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoSankey.nivoSankeyStrings.ascending
import typingsSlinky.nivoSankey.nivoSankeyStrings.auto
import typingsSlinky.nivoSankey.nivoSankeyStrings.center
import typingsSlinky.nivoSankey.nivoSankeyStrings.descending
import typingsSlinky.nivoSankey.nivoSankeyStrings.end
import typingsSlinky.nivoSankey.nivoSankeyStrings.horizontal
import typingsSlinky.nivoSankey.nivoSankeyStrings.input
import typingsSlinky.nivoSankey.nivoSankeyStrings.inside
import typingsSlinky.nivoSankey.nivoSankeyStrings.justify
import typingsSlinky.nivoSankey.nivoSankeyStrings.outside
import typingsSlinky.nivoSankey.nivoSankeyStrings.start
import typingsSlinky.nivoSankey.nivoSankeyStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  align  :'center' | 'justify' | 'start' | 'end',   sort  :'auto' | 'input' | 'ascending' | 'descending' | @nivo/sankey.@nivo/sankey.SankeySortFunction,   margin  :@nivo/core.@nivo/core.Box,   nodeOpacity  :number,   nodeHoverOpacity  :number,   nodeHoverOthersOpacity  :number,   nodeThickness  :number,   nodeSpacing  :number,   nodeInnerPadding  :number,   nodeBorderWidth  :number,   nodeBorderColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/sankey.@nivo/sankey.SankeyNodeDatum>,   linkOpacity  :number,   linkHoverOpacity  :number,   linkHoverOthersOpacity  :number,   linkContract  :number,   linkBlendMode  :@nivo/core.@nivo/core.CssMixBlendMode,   enableLinkGradient  :boolean,   enableLabels  :boolean,   label  :string | @nivo/sankey.@nivo/sankey.AccessorFunc,   labelPosition  :'inside' | 'outside',   labelPadding  :number,   labelOrientation  :'horizontal' | 'vertical',   labelTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/sankey.@nivo/sankey.SankeyNodeDatum>,   labelFormat  :string | @nivo/sankey.@nivo/sankey.LabelFormatter,   isInteractive  :boolean,   onClick  :@nivo/sankey.@nivo/sankey.SankeyMouseHandler,   tooltipFormat  :@nivo/sankey.@nivo/sankey.TooltipFormat,   nodeTooltip  :@nivo/sankey.@nivo/sankey.TooltipRenderer<@nivo/sankey.@nivo/sankey.SankeyNodeProps>,   linkTooltip  :@nivo/sankey.@nivo/sankey.TooltipRenderer<@nivo/sankey.@nivo/sankey.SankeyLinkProps>,   colors  :@nivo/colors.@nivo/colors.OrdinalColorsInstruction<any>,   theme  :@nivo/core.@nivo/core.Theme,   legends  :std.Array<@nivo/legends.@nivo/legends.LegendProps>}> */
@js.native
trait SankeyProps extends js.Object {
  var align: js.UndefOr[center | justify | start | end] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var enableLabels: js.UndefOr[Boolean] = js.native
  var enableLinkGradient: js.UndefOr[Boolean] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String | AccessorFunc] = js.native
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.native
  var labelOrientation: js.UndefOr[horizontal | vertical] = js.native
  var labelPadding: js.UndefOr[Double] = js.native
  var labelPosition: js.UndefOr[inside | outside] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[SankeyNodeDatum]] = js.native
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  var linkBlendMode: js.UndefOr[CssMixBlendMode] = js.native
  var linkContract: js.UndefOr[Double] = js.native
  var linkHoverOpacity: js.UndefOr[Double] = js.native
  var linkHoverOthersOpacity: js.UndefOr[Double] = js.native
  var linkOpacity: js.UndefOr[Double] = js.native
  var linkTooltip: js.UndefOr[TooltipRenderer[SankeyLinkProps]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var nodeBorderColor: js.UndefOr[InheritedColorProp[SankeyNodeDatum]] = js.native
  var nodeBorderWidth: js.UndefOr[Double] = js.native
  var nodeHoverOpacity: js.UndefOr[Double] = js.native
  var nodeHoverOthersOpacity: js.UndefOr[Double] = js.native
  var nodeInnerPadding: js.UndefOr[Double] = js.native
  var nodeOpacity: js.UndefOr[Double] = js.native
  var nodeSpacing: js.UndefOr[Double] = js.native
  var nodeThickness: js.UndefOr[Double] = js.native
  var nodeTooltip: js.UndefOr[TooltipRenderer[SankeyNodeProps]] = js.native
  var onClick: js.UndefOr[SankeyMouseHandler] = js.native
  var sort: js.UndefOr[auto | input | ascending | descending | SankeySortFunction] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltipFormat: js.UndefOr[TooltipFormat] = js.native
}

object SankeyProps {
  @scala.inline
  def apply(): SankeyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyProps]
  }
  @scala.inline
  implicit class SankeyPropsOps[Self <: SankeyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: center | justify | start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
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
    def withEnableLinkGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinkGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLinkGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinkGradient")(js.undefined)
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
    def withLabelFunction1(value: /* datum */ SankeyNodeDatum => String): Self = {
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
    def withLabelOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPosition(value: inside | outside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextColorFunction1(value: SankeyNodeDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelTextColor(value: InheritedColorProp[SankeyNodeDatum]): Self = {
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
    def withLinkBlendMode(value: CssMixBlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkBlendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkBlendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkContract(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkContract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContract")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkHoverOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHoverOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkHoverOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHoverOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkHoverOthersOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHoverOthersOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkHoverOthersOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHoverOthersOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTooltip(value: SankeyLinkProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLinkTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTooltip")(js.undefined)
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
    def withNodeBorderColorFunction1(value: SankeyNodeDatum => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNodeBorderColor(value: InheritedColorProp[SankeyNodeDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHoverOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHoverOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeHoverOthersOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverOthersOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeHoverOthersOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHoverOthersOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeInnerPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeInnerPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeInnerPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeInnerPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTooltip(value: SankeyNodeProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* data */ SankeyNodeDatum | SankeyLinkDatum, /* event */ SyntheticMouseEvent[Element]) => Unit
    ): Self = {
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
    def withSortFunction2(value: (/* nodeA */ SankeyDataNode, /* nodeB */ SankeyDataNode) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSort(value: auto | input | ascending | descending | SankeySortFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
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
    def withTooltipFormat(value: /* value */ Double => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
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

