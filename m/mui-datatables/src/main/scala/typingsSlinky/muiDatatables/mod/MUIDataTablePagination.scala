package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTablePagination extends js.Object {
  var count: Double = js.native
  var options: js.Object = js.native
  var page: Double = js.native
  var rowsPerPage: Double = js.native
  def changeRowsPerPage(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}

object MUIDataTablePagination {
  @scala.inline
  def apply(
    changeRowsPerPage: js.Any => js.Any,
    count: Double,
    options: js.Object,
    page: Double,
    rowsPerPage: Double
  ): MUIDataTablePagination = {
    val __obj = js.Dynamic.literal(changeRowsPerPage = js.Any.fromFunction1(changeRowsPerPage), count = count.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTablePagination]
  }
  @scala.inline
  implicit class MUIDataTablePaginationOps[Self <: MUIDataTablePagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeRowsPerPage(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeRowsPerPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

