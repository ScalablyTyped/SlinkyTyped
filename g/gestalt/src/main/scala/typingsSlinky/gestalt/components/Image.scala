package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.`lazy`
import typingsSlinky.gestalt.gestaltStrings.auto
import typingsSlinky.gestalt.gestaltStrings.contain
import typingsSlinky.gestalt.gestaltStrings.cover
import typingsSlinky.gestalt.gestaltStrings.eager
import typingsSlinky.gestalt.gestaltStrings.high
import typingsSlinky.gestalt.gestaltStrings.low
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.mod.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @JSImport("gestalt", "Image")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Image] {
    
    @scala.inline
    def fit(value: cover | contain | none): this.type = set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importance(value: high | low | auto): this.type = set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: eager | `lazy` | auto): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: () => Unit): this.type = set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(alt: String, color: String, naturalHeight: Double, naturalWidth: Double, src: String): Builder = {
    val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageProps]))
  }
}
