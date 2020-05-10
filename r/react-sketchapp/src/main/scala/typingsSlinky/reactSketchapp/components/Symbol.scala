package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.symbolMod.SymbolProps
import typingsSlinky.reactSketchapp.symbolMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Symbol {
  @JSImport("react-sketchapp/lib/components/Svg/Symbol", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SymbolProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SymbolProps]))
  }
}

