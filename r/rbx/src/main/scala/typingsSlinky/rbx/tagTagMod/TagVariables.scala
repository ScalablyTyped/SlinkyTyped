package typingsSlinky.rbx.tagTagMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/tag/tag.TagVariablesOverrides, rbx.rbx/elements/tag/tag.TagVariablesDefaults> */
@js.native
trait TagVariables extends js.Object {
  var sizes: normal | medium | large = js.native
}

object TagVariables {
  @scala.inline
  def apply(sizes: normal | medium | large): TagVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVariables]
  }
  @scala.inline
  implicit class TagVariablesOps[Self <: TagVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizes(value: normal | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

