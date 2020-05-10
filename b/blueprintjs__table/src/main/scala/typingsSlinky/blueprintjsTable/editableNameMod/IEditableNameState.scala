package typingsSlinky.blueprintjsTable.editableNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableNameState extends js.Object {
  var dirtyName: js.UndefOr[String] = js.native
  var isEditing: js.UndefOr[Boolean] = js.native
  var savedName: js.UndefOr[String] = js.native
}

object IEditableNameState {
  @scala.inline
  def apply(): IEditableNameState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableNameState]
  }
  @scala.inline
  implicit class IEditableNameStateOps[Self <: IEditableNameState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirtyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirtyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyName")(js.undefined)
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
    def withSavedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedName")(js.undefined)
        ret
    }
  }
  
}

