package typingsSlinky.nivoChord.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoChord.anon.OmitArcDataformattedValue
import typingsSlinky.nivoChord.anon.OmitArcDatalabel
import typingsSlinky.nivoChord.mod.ArcData
import typingsSlinky.nivoChord.mod.ChordProps
import typingsSlinky.nivoChord.mod.LabelAccessor
import typingsSlinky.nivoChord.mod.RibbonData
import typingsSlinky.nivoChord.mod.ValueFormatter
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chord {
  
  @JSImport("@nivo/chord", "Chord")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoChord.mod.Chord] {
    
    @scala.inline
    def BorderColorFunction1(value: _ => String): this.type = set("BorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def BorderColor(value: InheritedColorProp[_]): this.type = set("BorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcBorderColorFunction1(value: _ => String): this.type = set("arcBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def arcBorderColor(value: InheritedColorProp[_]): this.type = set("arcBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcBorderWidth(value: Double): this.type = set("arcBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcHoverOpacity(value: Double): this.type = set("arcHoverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcHoverOthersOpacity(value: Double): this.type = set("arcHoverOthersOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcOpacity(value: Double): this.type = set("arcOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcTooltip(value: js.Any): this.type = set("arcTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableLabel(value: Boolean): this.type = set("enableLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRadiusOffset(value: Double): this.type = set("innerRadiusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRadiusRatio(value: Double): this.type = set("innerRadiusRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFunction1(value: /* datum */ OmitArcDatalabel => String): this.type = set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def label(value: String | LabelAccessor): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelOffset(value: Double): this.type = set("labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelRotation(value: Double): this.type = set("labelRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelTextColorFunction1(value: _ => String): this.type = set("labelTextColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelTextColor(value: InheritedColorProp[_]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onArcClick(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onArcClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onArcMouseEnter(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onArcMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onArcMouseLeave(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onArcMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onArcMouseMove(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onArcMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRibbonClick(value: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onRibbonClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRibbonMouseEnter(value: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onRibbonMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRibbonMouseLeave(value: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onRibbonMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRibbonMouseMove(value: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): this.type = set("onRibbonMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def padAngle(value: Double): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ribbonBorderWidth(value: Double): this.type = set("ribbonBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ribbonHoverOpacity(value: Double): this.type = set("ribbonHoverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ribbonHoverOthersOpacity(value: Double): this.type = set("ribbonHoverOthersOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ribbonOpacity(value: Double): this.type = set("ribbonOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ribbonTooltip(value: js.Any): this.type = set("ribbonTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueFormatFunction1(value: /* datum */ OmitArcDataformattedValue => String | Double): this.type = set("valueFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def valueFormat(value: String | ValueFormatter): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChordProps with Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    height: Double,
    keys: js.Array[String],
    layers: js.Array[_],
    matrix: js.Array[js.Array[Double]],
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChordProps with Dimensions]))
  }
}
