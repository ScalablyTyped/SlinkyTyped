package typingsSlinky.rbx.tabGroupMod

import typingsSlinky.rbx.rbxStrings.`toggle-rounded`
import typingsSlinky.rbx.rbxStrings.boxed
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/tab/tab-group.TabGroupVariablesOverrides, rbx.rbx/components/tab/tab-group.TabGroupVariablesDefaults> */
trait TabGroupVariables extends js.Object {
  var alignments: centered | right
  var kinds: boxed | toggle | `toggle-rounded`
  var sizes: small | medium | large
}

object TabGroupVariables {
  @scala.inline
  def apply(
    alignments: centered | right,
    kinds: boxed | toggle | `toggle-rounded`,
    sizes: small | medium | large
  ): TabGroupVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupVariables]
  }
}

