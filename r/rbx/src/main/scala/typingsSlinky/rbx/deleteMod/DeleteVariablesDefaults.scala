package typingsSlinky.rbx.deleteMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVariablesDefaults extends js.Object {
  var sizes: small | medium | large
}

object DeleteVariablesDefaults {
  @scala.inline
  def apply(sizes: small | medium | large): DeleteVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVariablesDefaults]
  }
}

