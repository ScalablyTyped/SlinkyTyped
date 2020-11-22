package typingsSlinky.grommet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.Color
import typingsSlinky.grommet.anon.Height
import typingsSlinky.grommet.anon.Label
import typingsSlinky.grommet.anon.Opacity
import typingsSlinky.grommet.anon.Vertical
import typingsSlinky.grommet.chartMod.ChartProps
import typingsSlinky.grommet.grommetStrings.area
import typingsSlinky.grommet.grommetStrings.bar
import typingsSlinky.grommet.grommetStrings.circle
import typingsSlinky.grommet.grommetStrings.diamond
import typingsSlinky.grommet.grommetStrings.fill
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.line
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.point
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.square
import typingsSlinky.grommet.grommetStrings.star
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.triangle
import typingsSlinky.grommet.grommetStrings.triangleDown
import typingsSlinky.grommet.grommetStrings.weak
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.EdgeSizeType
import typingsSlinky.grommet.utilsMod.GapType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.ThicknessType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chart {
  
  @JSImport("grommet/es6", "Chart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.grommet.mod.Chart] {
    
    @scala.inline
    def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boundsVarargs(value: js.Array[Double]*): this.type = set("bounds", js.Array(value :_*))
    
    @scala.inline
    def bounds(value: js.Array[js.Array[Double]]): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorVarargs(value: Color*): this.type = set("color", js.Array(value :_*))
    
    @scala.inline
    def color(value: ColorType | js.Array[Color] | Opacity): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dash(value: Boolean): this.type = set("dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: GapType): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* repeated */ js.Any => _): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHover(value: /* repeated */ js.Any => _): this.type = set("onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def opacity(value: weak | medium | strong | Boolean | Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflow(value: Boolean): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pad(value: EdgeSizeType | Vertical): this.type = set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def point(value: circle | diamond | square | star | triangle | triangleDown): this.type = set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def round(value: Boolean): this.type = set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thickness(value: ThicknessType): this.type = set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: bar | line | area | point): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(values: js.Array[Double | js.Array[Double] | Label]): Builder = {
    val __props = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChartProps]))
  }
}
