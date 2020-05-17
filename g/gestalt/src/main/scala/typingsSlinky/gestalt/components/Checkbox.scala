package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Checked
import typingsSlinky.gestalt.anon.CheckedEvent
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.mod.CheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox {
  @JSImport("gestalt", "Checkbox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Checkbox] {
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def hasError(value: Boolean): this.type = set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* args */ CheckedEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def size(value: sm | md): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String, onChange: Checked => Unit): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckboxProps]))
  }
}

