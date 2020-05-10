package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ink.mod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  @JSImport("ink", "Text")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def bold(value: Boolean): this.type = set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def strikethrough(value: Boolean): this.type = set("strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

