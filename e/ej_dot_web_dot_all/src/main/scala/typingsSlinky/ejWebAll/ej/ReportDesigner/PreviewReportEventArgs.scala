package typingsSlinky.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewReportEventArgs extends js.Object {
  /** Specifies whether to show or hide preview data dialog.
    */
  var cancelDataInputDialog: js.UndefOr[Boolean] = js.native
  /** Contains the required data to load the report.
    */
  var dataSets: js.UndefOr[js.Array[_]] = js.native
  /** Contains the instance of Report Viewer component.
    */
  var reportViewer: js.UndefOr[js.Any] = js.native
}

object PreviewReportEventArgs {
  @scala.inline
  def apply(): PreviewReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewReportEventArgs]
  }
  @scala.inline
  implicit class PreviewReportEventArgsOps[Self <: PreviewReportEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelDataInputDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelDataInputDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelDataInputDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelDataInputDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSets(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSets")(js.undefined)
        ret
    }
    @scala.inline
    def withReportViewer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportViewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportViewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportViewer")(js.undefined)
        ret
    }
  }
  
}

