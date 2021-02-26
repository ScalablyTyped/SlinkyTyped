package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.Y
import typingsSlinky.antDesignPro.miniAreaMod.IAxis
import typingsSlinky.antDesignPro.miniAreaMod.IMiniAreaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MiniArea {
  
  @scala.inline
  def apply(data: js.Array[Y], height: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IMiniAreaProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "MiniArea")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.MiniArea] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def line(value: Boolean): this.type = set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xAxis(value: IAxis): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yAxis(value: IAxis): this.type = set("yAxis", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IMiniAreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
