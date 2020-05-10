package typingsSlinky.rbx.paginationStepMod

import typingsSlinky.rbx.rbxStrings.next
import typingsSlinky.rbx.rbxStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationStepVariablesDefaults extends js.Object {
  var alignments: next | previous = js.native
}

object PaginationStepVariablesDefaults {
  @scala.inline
  def apply(alignments: next | previous): PaginationStepVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationStepVariablesDefaults]
  }
  @scala.inline
  implicit class PaginationStepVariablesDefaultsOps[Self <: PaginationStepVariablesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignments(value: next | previous): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

