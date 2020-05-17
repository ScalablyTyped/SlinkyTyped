package typingsSlinky.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsFilter> */
@js.native
trait PartialMUIDataTableTextLaAll extends js.Object {
  var all: js.UndefOr[String] = js.native
  var reset: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialMUIDataTableTextLaAll {
  @scala.inline
  def apply(): PartialMUIDataTableTextLaAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaAll]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaAllOps[Self <: PartialMUIDataTableTextLaAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

