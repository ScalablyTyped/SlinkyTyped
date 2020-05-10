package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableFooter extends js.Object {
  var changePage: js.UndefOr[js.Any] = js.native
  var changeRowsPerPage: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var page: js.UndefOr[Double] = js.native
  var rowCount: js.UndefOr[Double] = js.native
  var rowsPerPage: js.UndefOr[Double] = js.native
}

object MUIDataTableFooter {
  @scala.inline
  def apply(): MUIDataTableFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableFooter]
  }
  @scala.inline
  implicit class MUIDataTableFooterOps[Self <: MUIDataTableFooter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangePage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePage")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeRowsPerPage(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeRowsPerPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChangeRowsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeRowsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsPerPage(value: Double): Self = {
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

