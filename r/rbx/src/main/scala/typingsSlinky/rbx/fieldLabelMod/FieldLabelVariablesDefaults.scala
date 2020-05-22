package typingsSlinky.rbx.fieldLabelMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLabelVariablesDefaults extends js.Object {
  var sizes: small | normal | medium | large
}

object FieldLabelVariablesDefaults {
  @scala.inline
  def apply(sizes: small | normal | medium | large): FieldLabelVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLabelVariablesDefaults]
  }
}

