package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.X
import typingsSlinky.antDesignPro.barMod.IBarProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bar {
  
  @scala.inline
  def apply(data: js.Array[X], height: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IBarProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "Bar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.Bar] {
    
    @scala.inline
    def autoLabel(value: Boolean): this.type = set("autoLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: js.Tuple4[Double, Double, Double, Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
