package typingsSlinky.rbx.tagGroupMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/tag/tag-group.TagGroupVariablesOverrides, rbx.rbx/elements/tag/tag-group.TagGroupVariablesDefaults> */
@js.native
trait TagGroupVariables extends js.Object {
  var sizes: medium | large = js.native
}

object TagGroupVariables {
  @scala.inline
  def apply(sizes: medium | large): TagGroupVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagGroupVariables]
  }
  @scala.inline
  implicit class TagGroupVariablesOps[Self <: TagGroupVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizes(value: medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

