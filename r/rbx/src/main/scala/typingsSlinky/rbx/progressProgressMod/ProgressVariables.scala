package typingsSlinky.rbx.progressProgressMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/progress/progress.ProgressVariablesOverrides, rbx.rbx/elements/progress/progress.ProgressVariablesDefaults> */
trait ProgressVariables extends js.Object {
  var sizes: small | medium | large
}

object ProgressVariables {
  @scala.inline
  def apply(sizes: small | medium | large): ProgressVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressVariables]
  }
}

