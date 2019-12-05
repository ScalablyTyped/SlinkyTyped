package typingsSlinky.atNivoSankey.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoColors.atNivoColorsMod.InheritedColorProp
import typingsSlinky.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typingsSlinky.atNivoCore.atNivoCoreMod.Box
import typingsSlinky.atNivoCore.atNivoCoreMod.CssMixBlendMode
import typingsSlinky.atNivoCore.atNivoCoreMod.Theme
import typingsSlinky.atNivoLegends.atNivoLegendsMod.LegendProps
import typingsSlinky.atNivoSankey.Anon_Links
import typingsSlinky.atNivoSankey.DataSankeyProps
import typingsSlinky.atNivoSankey.atNivoSankeyMod.AccessorFunc
import typingsSlinky.atNivoSankey.atNivoSankeyMod.LabelFormatter
import typingsSlinky.atNivoSankey.atNivoSankeyMod.SankeyLinkDatum
import typingsSlinky.atNivoSankey.atNivoSankeyMod.SankeyLinkProps
import typingsSlinky.atNivoSankey.atNivoSankeyMod.SankeyNodeDatum
import typingsSlinky.atNivoSankey.atNivoSankeyMod.SankeyNodeProps
import typingsSlinky.atNivoSankey.atNivoSankeyMod.SankeySortFunction
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.ascending
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.auto
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.center
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.descending
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.end
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.horizontal
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.input
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.inside
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.justify
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.outside
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.start
import typingsSlinky.atNivoSankey.atNivoSankeyStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveSankey
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoSankey.atNivoSankeyMod.ResponsiveSankey] {
  @JSImport("@nivo/sankey", "ResponsiveSankey")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: Anon_Links,
    align: center | justify | start | end = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    enableLinkGradient: js.UndefOr[Boolean] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | AccessorFunc = null,
    labelFormat: String | LabelFormatter = null,
    labelOrientation: horizontal | vertical = null,
    labelPadding: Int | Double = null,
    labelPosition: inside | outside = null,
    labelTextColor: InheritedColorProp[SankeyNodeDatum] = null,
    legends: js.Array[LegendProps] = null,
    linkBlendMode: CssMixBlendMode = null,
    linkContract: Int | Double = null,
    linkHoverOpacity: Int | Double = null,
    linkHoverOthersOpacity: Int | Double = null,
    linkOpacity: Int | Double = null,
    linkTooltip: SankeyLinkProps => TagMod[Any] = null,
    margin: Box = null,
    nodeBorderColor: InheritedColorProp[SankeyNodeDatum] = null,
    nodeBorderWidth: Int | Double = null,
    nodeHoverOpacity: Int | Double = null,
    nodeHoverOthersOpacity: Int | Double = null,
    nodeInnerPadding: Int | Double = null,
    nodeOpacity: Int | Double = null,
    nodeSpacing: Int | Double = null,
    nodeThickness: Int | Double = null,
    nodeTooltip: SankeyNodeProps => TagMod[Any] = null,
    onClick: (/* data */ SankeyNodeDatum | SankeyLinkDatum, /* event */ SyntheticMouseEvent[org.scalajs.dom.raw.Element]) => Unit = null,
    sort: auto | input | ascending | descending | SankeySortFunction = null,
    theme: Theme = null,
    tooltipFormat: /* value */ Double => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoSankey.atNivoSankeyMod.ResponsiveSankey] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinkGradient)) __obj.updateDynamic("enableLinkGradient")(enableLinkGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelOrientation != null) __obj.updateDynamic("labelOrientation")(labelOrientation.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (linkBlendMode != null) __obj.updateDynamic("linkBlendMode")(linkBlendMode.asInstanceOf[js.Any])
    if (linkContract != null) __obj.updateDynamic("linkContract")(linkContract.asInstanceOf[js.Any])
    if (linkHoverOpacity != null) __obj.updateDynamic("linkHoverOpacity")(linkHoverOpacity.asInstanceOf[js.Any])
    if (linkHoverOthersOpacity != null) __obj.updateDynamic("linkHoverOthersOpacity")(linkHoverOthersOpacity.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (linkTooltip != null) __obj.updateDynamic("linkTooltip")(js.Any.fromFunction1(linkTooltip))
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (nodeBorderColor != null) __obj.updateDynamic("nodeBorderColor")(nodeBorderColor.asInstanceOf[js.Any])
    if (nodeBorderWidth != null) __obj.updateDynamic("nodeBorderWidth")(nodeBorderWidth.asInstanceOf[js.Any])
    if (nodeHoverOpacity != null) __obj.updateDynamic("nodeHoverOpacity")(nodeHoverOpacity.asInstanceOf[js.Any])
    if (nodeHoverOthersOpacity != null) __obj.updateDynamic("nodeHoverOthersOpacity")(nodeHoverOthersOpacity.asInstanceOf[js.Any])
    if (nodeInnerPadding != null) __obj.updateDynamic("nodeInnerPadding")(nodeInnerPadding.asInstanceOf[js.Any])
    if (nodeOpacity != null) __obj.updateDynamic("nodeOpacity")(nodeOpacity.asInstanceOf[js.Any])
    if (nodeSpacing != null) __obj.updateDynamic("nodeSpacing")(nodeSpacing.asInstanceOf[js.Any])
    if (nodeThickness != null) __obj.updateDynamic("nodeThickness")(nodeThickness.asInstanceOf[js.Any])
    if (nodeTooltip != null) __obj.updateDynamic("nodeTooltip")(js.Any.fromFunction1(nodeTooltip))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(js.Any.fromFunction1(tooltipFormat))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DataSankeyProps
}

