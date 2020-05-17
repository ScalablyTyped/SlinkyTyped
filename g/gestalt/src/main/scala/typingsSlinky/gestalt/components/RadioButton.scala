package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.CheckedBoolean
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.mod.RadioButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButton {
  @JSImport("gestalt", "RadioButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.RadioButton] {
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: sm | md): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String, onChange: CheckedBoolean => Unit): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonProps]))
  }
}

