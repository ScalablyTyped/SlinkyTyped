package typingsSlinky.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookSheetFreezePane extends js.Object {
  var colSplit: js.UndefOr[Double] = js.native
  var rowSplit: js.UndefOr[Double] = js.native
}

object WorkbookSheetFreezePane {
  @scala.inline
  def apply(): WorkbookSheetFreezePane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSheetFreezePane]
  }
  @scala.inline
  implicit class WorkbookSheetFreezePaneOps[Self <: WorkbookSheetFreezePane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColSplit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSplit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSplit")(js.undefined)
        ret
    }
  }
  
}

