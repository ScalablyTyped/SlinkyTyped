package typingsSlinky.reactSpring.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSpring.renderpropsAddonsMod.ParallaxLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ParallaxLayer {
  
  @JSImport("react-spring/renderprops-addons", "ParallaxLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSpring.renderpropsAddonsMod.ParallaxLayer] {
    
    @scala.inline
    def factor(value: Double): this.type = set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ParallaxLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ParallaxLayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
