package typingsSlinky.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportSavedEventArgs extends js.Object {
  /** Specifies whether report opened from device or server.
    */
  var isServerReport: js.UndefOr[Boolean] = js.native
  /** States whether report is downloaded from ReportServer.
    */
  var reportAction: js.UndefOr[String] = js.native
}

object ReportSavedEventArgs {
  @scala.inline
  def apply(): ReportSavedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportSavedEventArgs]
  }
  @scala.inline
  implicit class ReportSavedEventArgsOps[Self <: ReportSavedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsServerReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServerReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsServerReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServerReport")(js.undefined)
        ret
    }
    @scala.inline
    def withReportAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportAction")(js.undefined)
        ret
    }
  }
  
}

