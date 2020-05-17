package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.anon.H
import typingsSlinky.protonNative.anon.X
import typingsSlinky.protonNative.mod.PickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Picker {
  @JSImport("proton-native", "Picker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.Picker] {
    @scala.inline
    def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* text */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* selection */ Double => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: Double): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Picker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

