package typingsSlinky.halogen.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.halogen.mod.FadeLoaderCls
import typingsSlinky.halogen.mod.RadiusLoaderProps
import typingsSlinky.halogen.mod.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FadeLoader {
  
  @JSImport("halogen", "FadeLoader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, FadeLoaderCls] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: String): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radius(value: String): this.type = set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: VerticalAlign): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadiusLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FadeLoader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
