package typingsSlinky.halogen.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.halogen.mod.MarginLoaderProps
import typingsSlinky.halogen.mod.PacmanLoaderCls
import typingsSlinky.halogen.mod.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PacmanLoader {
  
  @JSImport("halogen", "PacmanLoader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, PacmanLoaderCls] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: VerticalAlign): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MarginLoaderProps[Double]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PacmanLoader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
