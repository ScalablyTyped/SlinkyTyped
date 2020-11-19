package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.lightboxMod.LightboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lightbox {
  
  @JSImport("primereact/lightbox", "Lightbox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactLightboxMod.Lightbox] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def effectDuration(value: String): this.type = set("effectDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imagesVarargs(value: js.Any*): this.type = set("images", js.Array(value :_*))
    
    @scala.inline
    def images(value: js.Array[_]): this.type = set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LightboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Lightbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
