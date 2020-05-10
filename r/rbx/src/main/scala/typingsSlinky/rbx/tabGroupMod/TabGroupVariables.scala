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
@js.native
trait TabGroupVariables extends js.Object {
  var alignments: centered | right = js.native
  var kinds: boxed | toggle | `toggle-rounded` = js.native
  var sizes: small | medium | large = js.native
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
  @scala.inline
  implicit class TabGroupVariablesOps[Self <: TabGroupVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignments(value: centered | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKinds(value: boxed | toggle | `toggle-rounded`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

