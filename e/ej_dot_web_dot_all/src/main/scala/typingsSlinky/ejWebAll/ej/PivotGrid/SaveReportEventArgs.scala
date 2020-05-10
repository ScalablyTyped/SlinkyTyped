package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveReportEventArgs extends js.Object {
  /** returns the report to be stored in database.
    */
  var report: js.UndefOr[js.Any] = js.native
}

object SaveReportEventArgs {
  @scala.inline
  def apply(): SaveReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveReportEventArgs]
  }
  @scala.inline
  implicit class SaveReportEventArgsOps[Self <: SaveReportEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReport(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.undefined)
        ret
    }
  }
  
}

