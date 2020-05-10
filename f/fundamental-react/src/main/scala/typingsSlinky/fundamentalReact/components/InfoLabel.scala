package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`10`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`1`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`7`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`8`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`9`
import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import typingsSlinky.fundamentalReact.infoLabelMod.InfoLabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InfoLabel {
  @JSImport("fundamental-react/lib/InfoLabel/InfoLabel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def glyph(value: IconGlyph): this.type = set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def numeric(value: Boolean): this.type = set("numeric", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InfoLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: InfoLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

