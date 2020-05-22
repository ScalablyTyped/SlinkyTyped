package typingsSlinky.rbx.controlMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/control.ControlVariablesOverrides, rbx.rbx/elements/form/control.ControlVariablesDefaults> */
trait ControlVariables extends js.Object {
  var sizes: small | medium | large
}

object ControlVariables {
  @scala.inline
  def apply(sizes: small | medium | large): ControlVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlVariables]
  }
}

