package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableTextLabelsViewColumns extends js.Object {
  var title: String = js.native
  var titleAria: String = js.native
}

object MUIDataTableTextLabelsViewColumns {
  @scala.inline
  def apply(title: String, titleAria: String): MUIDataTableTextLabelsViewColumns = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleAria = titleAria.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsViewColumns]
  }
  @scala.inline
  implicit class MUIDataTableTextLabelsViewColumnsOps[Self <: MUIDataTableTextLabelsViewColumns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleAria(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAria")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

