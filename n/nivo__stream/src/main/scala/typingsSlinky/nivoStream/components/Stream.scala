package typingsSlinky.nivoStream.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.anon.Dictkey
import typingsSlinky.nivoCore.anon.Id
import typingsSlinky.nivoCore.mod.AreaCurve
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoCore.mod.StackOffset
import typingsSlinky.nivoCore.mod.StackOrder
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoScales.mod.Scale
import typingsSlinky.nivoStream.anon.`0`
import typingsSlinky.nivoStream.mod.Datum
import typingsSlinky.nivoStream.mod.DatumToNumber
import typingsSlinky.nivoStream.mod.StreamProps
import typingsSlinky.nivoStream.mod.TooltipFormatter
import typingsSlinky.nivoStream.nivoStreamStrings.center
import typingsSlinky.nivoStream.nivoStreamStrings.end
import typingsSlinky.nivoStream.nivoStreamStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stream {
  
  @JSImport("@nivo/stream", "Stream")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoStream.mod.Stream[T]] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisBottom(value: AxisProps): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisBottomNull: this.type = set("axisBottom", null)
    
    @scala.inline
    def axisLeft(value: AxisProps): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisLeftNull: this.type = set("axisLeft", null)
    
    @scala.inline
    def axisRight(value: AxisProps): this.type = set("axisRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisRightNull: this.type = set("axisRight", null)
    
    @scala.inline
    def axisTop(value: AxisProps): this.type = set("axisTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisTopNull: this.type = set("axisTop", null)
    
    @scala.inline
    def borderColorFunction1(value: _ => String): this.type = set("borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def borderColor(value: InheritedColorProp[_]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def curve(value: AreaCurve): this.type = set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value :_*))
    
    @scala.inline
    def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotBorderColorFunction1(value: _ => String): this.type = set("dotBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def dotBorderColor(value: InheritedColorProp[_]): this.type = set("dotBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotBorderWidthFunction1(value: /* datum */ Datum => Double): this.type = set("dotBorderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def dotBorderWidth(value: DatumToNumber | Double): this.type = set("dotBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotColorFunction1(value: _ => String): this.type = set("dotColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def dotColor(value: InheritedColorProp[_]): this.type = set("dotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotPosition(value: start | center | end): this.type = set("dotPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotSizeFunction1(value: /* datum */ Datum => Double): this.type = set("dotSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def dotSize(value: DatumToNumber | Double): this.type = set("dotSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableDots(value: Boolean): this.type = set("enableDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableStackTooltip(value: Boolean): this.type = set("enableStackTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillVarargs(value: Id[T]*): this.type = set("fill", js.Array(value :_*))
    
    @scala.inline
    def fill(value: js.Array[Id[T]]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillOpacity(value: Double): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
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
    def offsetType(value: StackOffset): this.type = set("offsetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def order(value: StackOrder): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderDot(value: typingsSlinky.nivoStream.mod.StreamDotsItem): this.type = set("renderDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stack(value: /* data */ js.Array[T] => js.Array[js.Array[`0`[T]]]): this.type = set("stack", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipFormatFunction1(value: T => ReactElement): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def tooltipFormat(value: TooltipFormatter[T] | String): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipLabel(value: T => String): this.type = set("tooltipLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def xScale(value: Scale): this.type = set("xScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yScale(value: Scale): this.type = set("yScale", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: StreamProps[T] with Dimensions): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](data: js.Array[T], height: Double, keys: js.Array[String], width: Double): Builder[T] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[StreamProps[T] with Dimensions]))
  }
}
