package typingsSlinky.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsPagination> */
@js.native
trait PartialMUIDataTableTextLaDisplayRows extends js.Object {
  var displayRows: js.UndefOr[String] = js.native
  var next: js.UndefOr[String] = js.native
  var previous: js.UndefOr[String] = js.native
  var rowsPerPage: js.UndefOr[String] = js.native
}

object PartialMUIDataTableTextLaDisplayRows {
  @scala.inline
  def apply(): PartialMUIDataTableTextLaDisplayRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDisplayRows]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaDisplayRowsOps[Self <: PartialMUIDataTableTextLaDisplayRows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsPerPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPage")(js.undefined)
        ret
    }
  }
  
}

