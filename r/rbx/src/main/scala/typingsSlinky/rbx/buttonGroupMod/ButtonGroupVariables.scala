package typingsSlinky.rbx.buttonGroupMod

import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/button/button-group.ButtonGroupVariablesOverrides, rbx.rbx/elements/button/button-group.ButtonGroupVariablesDefaults> */
trait ButtonGroupVariables extends js.Object {
  var alignments: centered | right
  var sizes: small | medium | large
}

object ButtonGroupVariables {
  @scala.inline
  def apply(alignments: centered | right, sizes: small | medium | large): ButtonGroupVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupVariables]
  }
}

