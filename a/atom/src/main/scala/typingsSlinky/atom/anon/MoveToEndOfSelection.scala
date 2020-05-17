package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveToEndOfSelection extends js.Object {
  var moveToEndOfSelection: js.UndefOr[Boolean] = js.native
}

object MoveToEndOfSelection {
  @scala.inline
  def apply(): MoveToEndOfSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToEndOfSelection]
  }
  @scala.inline
  implicit class MoveToEndOfSelectionOps[Self <: MoveToEndOfSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoveToEndOfSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToEndOfSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToEndOfSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToEndOfSelection")(js.undefined)
        ret
    }
  }
  
}

