package typingsSlinky.muiDatatables.mod

import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLa
import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLaAll
import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLaDelete
import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLaDisplayRows
import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLaDownloadCsv
import typingsSlinky.muiDatatables.anon.PartialMUIDataTableTextLaTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableTextLabels extends js.Object {
  var body: PartialMUIDataTableTextLa = js.native
  var filter: PartialMUIDataTableTextLaAll = js.native
  var pagination: PartialMUIDataTableTextLaDisplayRows = js.native
  var selectedRows: PartialMUIDataTableTextLaDelete = js.native
  var toolbar: PartialMUIDataTableTextLaDownloadCsv = js.native
  var viewColumns: PartialMUIDataTableTextLaTitle = js.native
}

object MUIDataTableTextLabels {
  @scala.inline
  def apply(
    body: PartialMUIDataTableTextLa,
    filter: PartialMUIDataTableTextLaAll,
    pagination: PartialMUIDataTableTextLaDisplayRows,
    selectedRows: PartialMUIDataTableTextLaDelete,
    toolbar: PartialMUIDataTableTextLaDownloadCsv,
    viewColumns: PartialMUIDataTableTextLaTitle
  ): MUIDataTableTextLabels = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], viewColumns = viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabels]
  }
  @scala.inline
  implicit class MUIDataTableTextLabelsOps[Self <: MUIDataTableTextLabels] (val x: Self) extends AnyVal {
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
    def withFilter(value: PartialMUIDataTableTextLaAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: PartialMUIDataTableTextLaDisplayRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedRows(value: PartialMUIDataTableTextLaDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: PartialMUIDataTableTextLaDownloadCsv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewColumns(value: PartialMUIDataTableTextLaTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

