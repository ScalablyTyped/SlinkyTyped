package typingsSlinky.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edit extends js.Object {
  var edit: String = js.native
  var editDisabled: String = js.native
  var remove: String = js.native
  var removeDisabled: String = js.native
}

object Edit {
  @scala.inline
  def apply(edit: String, editDisabled: String, remove: String, removeDisabled: String): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], editDisabled = editDisabled.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeDisabled = removeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  @scala.inline
  implicit class EditOps[Self <: Edit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

