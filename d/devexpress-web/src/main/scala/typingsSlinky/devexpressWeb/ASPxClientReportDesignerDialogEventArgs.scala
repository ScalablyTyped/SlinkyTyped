package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
@js.native
trait ASPxClientReportDesignerDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the report currently being processed.
    */
  var Report: js.Any = js.native
  /**
    * Specifies the URL of the report currently being processed.
    */
  var Url: String = js.native
}

object ASPxClientReportDesignerDialogEventArgs {
  @scala.inline
  def apply(Report: js.Any, Url: String): ASPxClientReportDesignerDialogEventArgs = {
    val __obj = js.Dynamic.literal(Report = Report.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerDialogEventArgs]
  }
  @scala.inline
  implicit class ASPxClientReportDesignerDialogEventArgsOps[Self <: ASPxClientReportDesignerDialogEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReport(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

