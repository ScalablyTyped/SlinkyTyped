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

trait InputVariablesDefaults extends js.Object {
  var sizes: small | medium | large
  var states: focused | hovered
  var types: text | email | tel | password | number | search | color | date | time
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
}

