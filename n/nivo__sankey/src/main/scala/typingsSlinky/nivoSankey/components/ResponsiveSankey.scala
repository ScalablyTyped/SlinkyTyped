package typingsSlinky.nivoSankey.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoSankey.anon.Links
import typingsSlinky.nivoSankey.mod.AccessorFunc
import typingsSlinky.nivoSankey.mod.LabelFormatter
import typingsSlinky.nivoSankey.mod.SankeyDataNode
import typingsSlinky.nivoSankey.mod.SankeyLinkDatum
import typingsSlinky.nivoSankey.mod.SankeyNodeDatum
import typingsSlinky.nivoSankey.mod.SankeySortFunction
import typingsSlinky.nivoSankey.mod.SharedProps
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveSankey {
  
  @JSImport("@nivo/sankey", "ResponsiveSankey")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoSankey.mod.ResponsiveSankey] {
    
    @scala.inline
    def align(value: center | justify | start | end): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableLabels(value: Boolean): this.type = set("enableLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableLinkGradient(value: Boolean): this.type = set("enableLinkGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFunction1(value: /* datum */ SankeyNodeDatum => String): this.type = set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def label(value: String | AccessorFunc): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFormatFunction1(value: /* label */ String | Double => String | Double): this.type = set("labelFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelFormat(value: String | LabelFormatter): this.type = set("labelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelOrientation(value: horizontal | vertical): this.type = set("labelOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPadding(value: Double): this.type = set("labelPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPosition(value: inside | outside): this.type = set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelTextColorFunction1(value: SankeyNodeDatum => String): this.type = set("labelTextColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelTextColor(value: InheritedColorProp[SankeyNodeDatum]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value :_*))
    
    @scala.inline
    def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkBlendMode(value: CssMixBlendMode): this.type = set("linkBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkContract(value: Double): this.type = set("linkContract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkHoverOpacity(value: Double): this.type = set("linkHoverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkHoverOthersOpacity(value: Double): this.type = set("linkHoverOthersOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkOpacity(value: Double): this.type = set("linkOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkTooltip(value: SankeyLinkDatum => ReactElement): this.type = set("linkTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeBorderColorFunction1(value: SankeyNodeDatum => String): this.type = set("nodeBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def nodeBorderColor(value: InheritedColorProp[SankeyNodeDatum]): this.type = set("nodeBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeBorderWidth(value: Double): this.type = set("nodeBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeHoverOpacity(value: Double): this.type = set("nodeHoverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeHoverOthersOpacity(value: Double): this.type = set("nodeHoverOthersOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeInnerPadding(value: Double): this.type = set("nodeInnerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeOpacity(value: Double): this.type = set("nodeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeSpacing(value: Double): this.type = set("nodeSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeThickness(value: Double): this.type = set("nodeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeTooltip(value: SankeyNodeDatum => ReactElement): this.type = set("nodeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(
      value: (/* data */ SankeyNodeDatum | SankeyLinkDatum, /* event */ SyntheticMouseEvent[Element]) => Unit
    ): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def sortFunction2(value: (/* nodeA */ SankeyDataNode, /* nodeB */ SankeyDataNode) => Double): this.type = set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def sort(value: auto | input | ascending | descending | SankeySortFunction): this.type = set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipFormat(value: /* value */ Double => ReactElement): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
  }
  
  def withProps(p: SharedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: Links): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SharedProps]))
  }
}
