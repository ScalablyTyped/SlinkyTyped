package typingsSlinky.rbx.fieldLabelMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/field-label.FieldLabelVariablesOverrides, rbx.rbx/elements/form/field-label.FieldLabelVariablesDefaults> */
trait FieldLabelVariables extends js.Object {
  var sizes: small | normal | medium | large
}

object FieldLabelVariables {
  @scala.inline
  def apply(sizes: small | normal | medium | large): FieldLabelVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLabelVariables]
  }
}

