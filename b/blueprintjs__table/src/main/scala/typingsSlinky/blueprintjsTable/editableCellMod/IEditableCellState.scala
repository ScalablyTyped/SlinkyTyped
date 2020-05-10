package typingsSlinky.blueprintjsTable.editableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableCellState extends js.Object {
  var dirtyValue: js.UndefOr[String] = js.native
  var isEditing: js.UndefOr[Boolean] = js.native
  var savedValue: js.UndefOr[String] = js.native
}

object IEditableCellState {
  @scala.inline
  def apply(): IEditableCellState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableCellState]
  }
  @scala.inline
  implicit class IEditableCellStateOps[Self <: IEditableCellState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirtyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirtyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedValue")(js.undefined)
        ret
    }
  }
  
}

