package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.AnonA
import typingsSlinky.protonNative.AnonH
import typingsSlinky.protonNative.AnonX
import typingsSlinky.protonNative.mod.ColorButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorButton {
  @JSImport("proton-native", "ColorButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.ColorButton] {
    @scala.inline
    def align(value: AnonH): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def expand(value: AnonH): this.type = set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* color */ AnonA => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def span(value: AnonX): this.type = set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColorButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ColorButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

