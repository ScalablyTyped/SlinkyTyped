package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import typingsSlinky.fundamentalReact.iconMod.IconProps
import typingsSlinky.fundamentalReact.iconMod.IconSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  @JSImport("fundamental-react", "Icon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: IconSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(glyph: IconGlyph): Builder = {
    val __props = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}
