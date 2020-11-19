package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.gaugeMod.IGaugeProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gauge {
  
  @JSImport("ant-design-pro/lib/Charts", "Gauge")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.chartsMod.Gauge] {
    
    @scala.inline
    def bgColor(value: Double): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGaugeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(height: Double, percent: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IGaugeProps]))
  }
}
