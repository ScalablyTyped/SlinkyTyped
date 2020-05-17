package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSize
import typingsSlinky.cathoQuantum.checkboxMod.CheckboxProps
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox {
  @JSImport("@catho/quantum/Checkbox", "Checkbox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.checkboxMod.Checkbox] {
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def theme(value: BaseFontSize): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckboxProps]))
  }
}

