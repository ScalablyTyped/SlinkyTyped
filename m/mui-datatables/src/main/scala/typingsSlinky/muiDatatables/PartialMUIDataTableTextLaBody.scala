package typingsSlinky.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels> */
@js.native
trait PartialMUIDataTableTextLaBody extends js.Object {
  var body: js.UndefOr[PartialMUIDataTableTextLa] = js.native
  var filter: js.UndefOr[PartialMUIDataTableTextLaAll] = js.native
  var pagination: js.UndefOr[PartialMUIDataTableTextLaDisplayRows] = js.native
  var selectedRows: js.UndefOr[PartialMUIDataTableTextLaDelete] = js.native
  var toolbar: js.UndefOr[PartialMUIDataTableTextLaDownloadCsv] = js.native
  var viewColumns: js.UndefOr[PartialMUIDataTableTextLaTitle] = js.native
}

object PartialMUIDataTableTextLaBody {
  @scala.inline
  def apply(): PartialMUIDataTableTextLaBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaBody]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaBodyOps[Self <: PartialMUIDataTableTextLaBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: PartialMUIDataTableTextLa): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: PartialMUIDataTableTextLaAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: PartialMUIDataTableTextLaDisplayRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRows(value: PartialMUIDataTableTextLaDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: PartialMUIDataTableTextLaDownloadCsv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withViewColumns(value: PartialMUIDataTableTextLaTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumns")(js.undefined)
        ret
    }
  }
  
}

