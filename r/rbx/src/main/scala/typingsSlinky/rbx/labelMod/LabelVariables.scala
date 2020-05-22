package typingsSlinky.rbx.labelMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/label.LabelVariablesOverrides, rbx.rbx/elements/form/label.LabelVariablesDefaults> */
trait LabelVariables extends js.Object {
  var sizes: small | medium | large
}

object LabelVariables {
  @scala.inline
  def apply(sizes: small | medium | large): LabelVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelVariables]
  }
}

