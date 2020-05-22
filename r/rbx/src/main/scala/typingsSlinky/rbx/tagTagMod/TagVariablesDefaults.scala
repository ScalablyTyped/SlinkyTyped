package typingsSlinky.rbx.tagTagMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagVariablesDefaults extends js.Object {
  var sizes: normal | medium | large
}

object TagVariablesDefaults {
  @scala.inline
  def apply(sizes: normal | medium | large): TagVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVariablesDefaults]
  }
}

