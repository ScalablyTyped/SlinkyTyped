package typingsSlinky.gestalt.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.rectangle
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.square
import typingsSlinky.gestalt.mod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("gestalt", "Toast")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Toast] {
    
    @scala.inline
    def buttonReactElement(value: ReactElement): this.type = set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def button(value: ReactElement): this.type = set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: darkGray | red): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textReactElement(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String | ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbnailReactElement(value: ReactElement): this.type = set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbnail(value: ReactElement): this.type = set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbnailShape(value: circle | rectangle | square): this.type = set("thumbnailShape", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Toast.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
