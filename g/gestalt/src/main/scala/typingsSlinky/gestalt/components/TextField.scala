package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.Anon1
import typingsSlinky.gestalt.Anon2
import typingsSlinky.gestalt.AnonEventSyntheticEventValueString
import typingsSlinky.gestalt.gestaltStrings.`current-password`
import typingsSlinky.gestalt.gestaltStrings.`new-password`
import typingsSlinky.gestalt.gestaltStrings.date
import typingsSlinky.gestalt.gestaltStrings.email
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.number
import typingsSlinky.gestalt.gestaltStrings.off
import typingsSlinky.gestalt.gestaltStrings.on
import typingsSlinky.gestalt.gestaltStrings.password
import typingsSlinky.gestalt.gestaltStrings.text
import typingsSlinky.gestalt.gestaltStrings.url
import typingsSlinky.gestalt.gestaltStrings.username
import typingsSlinky.gestalt.mod.TextFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextField {
  @JSImport("gestalt", "TextField")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.TextField] {
    @scala.inline
    def autoComplete(value: `current-password` | on | off | username | `new-password`): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* args */ Anon1 => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* args */ Anon1 => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: /* args */ Anon2 => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: date | email | number | password | text | url): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String, onChange: AnonEventSyntheticEventValueString => Unit): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[TextFieldProps]))
  }
}

