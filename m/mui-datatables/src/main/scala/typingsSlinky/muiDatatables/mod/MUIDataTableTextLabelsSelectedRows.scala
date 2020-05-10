package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableTextLabelsSelectedRows extends js.Object {
  var delete: String = js.native
  var deleteAria: String = js.native
  var text: String = js.native
}

object MUIDataTableTextLabelsSelectedRows {
  @scala.inline
  def apply(delete: String, deleteAria: String, text: String): MUIDataTableTextLabelsSelectedRows = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], deleteAria = deleteAria.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsSelectedRows]
  }
  @scala.inline
  implicit class MUIDataTableTextLabelsSelectedRowsOps[Self <: MUIDataTableTextLabelsSelectedRows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAria(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

