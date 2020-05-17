package typingsSlinky.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsToolbar> */
@js.native
trait PartialMUIDataTableTextLaDownloadCsv extends js.Object {
  var downloadCsv: js.UndefOr[String] = js.native
  var filterTable: js.UndefOr[String] = js.native
  var print: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var viewColumns: js.UndefOr[String] = js.native
}

object PartialMUIDataTableTextLaDownloadCsv {
  @scala.inline
  def apply(): PartialMUIDataTableTextLaDownloadCsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDownloadCsv]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaDownloadCsvOps[Self <: PartialMUIDataTableTextLaDownloadCsv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadCsv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadCsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadCsv")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTable")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withViewColumns(value: String): Self = {
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

