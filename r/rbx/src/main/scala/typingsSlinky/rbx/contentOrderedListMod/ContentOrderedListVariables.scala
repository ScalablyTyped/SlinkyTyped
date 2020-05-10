package typingsSlinky.rbx.contentOrderedListMod

import typingsSlinky.rbx.rbxStrings.`lower-alpha`
import typingsSlinky.rbx.rbxStrings.`lower-roman`
import typingsSlinky.rbx.rbxStrings.`upper-alpha`
import typingsSlinky.rbx.rbxStrings.`upper-roman`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/content/content-ordered-list.ContentOrderedListVariablesOverrides, rbx.rbx/elements/content/content-ordered-list.ContentOrderedListVariablesDefaults> */
@js.native
trait ContentOrderedListVariables extends js.Object {
  var types: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman` = js.native
}

object ContentOrderedListVariables {
  @scala.inline
  def apply(types: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`): ContentOrderedListVariables = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedListVariables]
  }
  @scala.inline
  implicit class ContentOrderedListVariablesOps[Self <: ContentOrderedListVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

