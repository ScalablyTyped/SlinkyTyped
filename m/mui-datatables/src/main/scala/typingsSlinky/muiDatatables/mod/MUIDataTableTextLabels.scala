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

trait MUIDataTableTextLabels extends js.Object {
  var body: PartialMUIDataTableTextLa
  var filter: PartialMUIDataTableTextLaAll
  var pagination: PartialMUIDataTableTextLaDisplayRows
  var selectedRows: PartialMUIDataTableTextLaDelete
  var toolbar: PartialMUIDataTableTextLaDownloadCsv
  var viewColumns: PartialMUIDataTableTextLaTitle
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
}

