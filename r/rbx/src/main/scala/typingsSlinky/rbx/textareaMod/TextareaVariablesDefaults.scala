package typingsSlinky.rbx.textareaMod

import typingsSlinky.rbx.rbxStrings.focused
import typingsSlinky.rbx.rbxStrings.hovered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaVariablesDefaults extends js.Object {
  var sizes: small | medium | large
  var states: focused | hovered
}

object TextareaVariablesDefaults {
  @scala.inline
  def apply(sizes: small | medium | large, states: focused | hovered): TextareaVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaVariablesDefaults]
  }
}

