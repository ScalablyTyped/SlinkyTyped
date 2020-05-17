package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.anon.H
import typingsSlinky.protonNative.anon.X
import typingsSlinky.protonNative.mod.SliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  @JSImport("proton-native", "Slider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.Slider] {
    @scala.inline
    def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

