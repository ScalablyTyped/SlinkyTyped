package typingsSlinky.nivoPie.components

import org.scalajs.dom.raw.SVGPathElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.svg.path.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.anon.Dictkey
import typingsSlinky.nivoCore.anon.Id
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoPie.mod.AccessorFunc
import typingsSlinky.nivoPie.mod.PieDatum
import typingsSlinky.nivoPie.mod.PieDatumWithColor
import typingsSlinky.nivoPie.mod.PieSvgProps
import typingsSlinky.nivoPie.mod.ValueFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pie {
  
  @JSImport("@nivo/pie", "Pie")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoPie.mod.Pie] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderColorFunction1(value: PieDatum => String): this.type = set("borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderColor(value: InheritedColorProp[PieDatum]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def colorsFunction1(value: PieDatum => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def colors(value: OrdinalColorsInstruction[PieDatum]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cornerRadius(value: Double): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value :_*))
    
    @scala.inline
    def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableRadialLabels(value: Boolean): this.type = set("enableRadialLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableSlicesLabels(value: Boolean): this.type = set("enableSlicesLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillVarargs(value: Id[PieDatum]*): this.type = set("fill", js.Array(value :_*))
    
    @scala.inline
    def fill(value: js.Array[Id[PieDatum]]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fit(value: Boolean): this.type = set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRadius(value: Double): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value :_*))
    
    @scala.inline
    def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* datum */ PieDatum, /* event */ SyntheticMouseEvent[SVGPathElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseEnter(value: (/* datum */ PieDatum, /* event */ SyntheticMouseEvent[SVGPathElement]) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseLeave(value: (/* datum */ PieDatum, /* event */ SyntheticMouseEvent[SVGPathElement]) => Unit): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def padAngle(value: Double): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelFunction1(value: /* datum */ PieDatum => String): this.type = set("radialLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def radialLabel(value: String | AccessorFunc): this.type = set("radialLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsLinkColorFunction1(value: PieDatumWithColor => String): this.type = set("radialLabelsLinkColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def radialLabelsLinkColor(value: InheritedColorProp[PieDatumWithColor]): this.type = set("radialLabelsLinkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsLinkDiagonalLength(value: Double): this.type = set("radialLabelsLinkDiagonalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsLinkHorizontalLength(value: Double): this.type = set("radialLabelsLinkHorizontalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsLinkOffset(value: Double): this.type = set("radialLabelsLinkOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsLinkStrokeWidth(value: Double): this.type = set("radialLabelsLinkStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsSkipAngle(value: Double): this.type = set("radialLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsTextColorFunction1(value: PieDatumWithColor => String): this.type = set("radialLabelsTextColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def radialLabelsTextColor(value: InheritedColorProp[PieDatumWithColor]): this.type = set("radialLabelsTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radialLabelsTextXOffset(value: Double): this.type = set("radialLabelsTextXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sliceLabelFunction1(value: /* datum */ PieDatum => String): this.type = set("sliceLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def sliceLabel(value: String | AccessorFunc): this.type = set("sliceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slicesLabelsSkipAngle(value: Double): this.type = set("slicesLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slicesLabelsTextColorFunction1(value: PieDatumWithColor => String): this.type = set("slicesLabelsTextColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def slicesLabelsTextColor(value: InheritedColorProp[PieDatumWithColor]): this.type = set("slicesLabelsTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortByValue(value: Boolean): this.type = set("sortByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: ReactComponentClass[PieDatumWithColor]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipFormatFunction1(value: /* value */ Double => String | Double): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def tooltipFormat(value: String | ValueFormatter): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PieSvgProps with Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[PieDatum], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PieSvgProps with Dimensions]))
  }
}
