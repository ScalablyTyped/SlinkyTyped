package typingsSlinky.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportModifiedEventArgs extends js.Object {
  /** Specifies whether the report is modified or not.
    */
  var isModified: js.UndefOr[Boolean] = js.native
  /** Name of Opened Report.
    */
  var reportName: js.UndefOr[String] = js.native
}

object ReportModifiedEventArgs {
  @scala.inline
  def apply(): ReportModifiedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportModifiedEventArgs]
  }
  @scala.inline
  implicit class ReportModifiedEventArgsOps[Self <: ReportModifiedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.undefined)
        ret
    }
    @scala.inline
    def withReportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(js.undefined)
        ret
    }
  }
  
}

