package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.Anon0
import typingsSlinky.gestalt.AnonSyntheticEvent
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.name
import typingsSlinky.gestalt.gestaltStrings.off
import typingsSlinky.gestalt.gestaltStrings.on
import typingsSlinky.gestalt.gestaltStrings.username
import typingsSlinky.gestalt.mod.SearchFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchField {
  @JSImport("gestalt", "SearchField")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.SearchField] {
    @scala.inline
    def autoComplete(value: on | off | username | name): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* args */ Anon0 => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* args */ AnonSyntheticEvent => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(accessibilityLabel: String, id: String, onChange: AnonSyntheticEvent => Unit): Builder = {
    val __props = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[SearchFieldProps]))
  }
}

