package typingsSlinky.rbx.inputMod

import typingsSlinky.rbx.rbxStrings.color
import typingsSlinky.rbx.rbxStrings.date
import typingsSlinky.rbx.rbxStrings.email
import typingsSlinky.rbx.rbxStrings.focused
import typingsSlinky.rbx.rbxStrings.hovered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.number
import typingsSlinky.rbx.rbxStrings.password
import typingsSlinky.rbx.rbxStrings.search
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.tel
import typingsSlinky.rbx.rbxStrings.text
import typingsSlinky.rbx.rbxStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputVariablesDefaults extends js.Object {
  var sizes: small | medium | large = js.native
  var states: focused | hovered = js.native
  var types: text | email | tel | password | number | search | color | date | time = js.native
}

object InputVariablesDefaults {
  @scala.inline
  def apply(
    sizes: small | medium | large,
    states: focused | hovered,
    types: text | email | tel | password | number | search | color | date | time
  ): InputVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVariablesDefaults]
  }
  @scala.inline
  implicit class InputVariablesDefaultsOps[Self <: InputVariablesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSizes(value: small | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStates(value: focused | hovered): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: text | email | tel | password | number | search | color | date | time): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

