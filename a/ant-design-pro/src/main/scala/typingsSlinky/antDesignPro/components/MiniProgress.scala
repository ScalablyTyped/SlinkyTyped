package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.miniProgressMod.IMiniProgressProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MiniProgress {
  
  @JSImport("ant-design-pro/lib/Charts", "MiniProgress")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.MiniProgress] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IMiniProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(target: Double, targetLabel: String): Builder = {
    val __props = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IMiniProgressProps]))
  }
}
