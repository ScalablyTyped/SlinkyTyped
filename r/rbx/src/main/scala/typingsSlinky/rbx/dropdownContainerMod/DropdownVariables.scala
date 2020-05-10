package typingsSlinky.rbx.dropdownContainerMod

import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/dropdown/dropdown-container.DropdownVariablesOverrides, rbx.rbx/components/dropdown/dropdown-container.DropdownVariablesDefaults> */
@js.native
trait DropdownVariables extends js.Object {
  var alignments: right = js.native
}

object DropdownVariables {
  @scala.inline
  def apply(alignments: right): DropdownVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownVariables]
  }
  @scala.inline
  implicit class DropdownVariablesOps[Self <: DropdownVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignments(value: right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

