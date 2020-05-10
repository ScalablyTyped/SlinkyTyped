package typingsSlinky.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportPrintEventArgs extends js.Object {
  /** true if you have to load the external style file; otherwise, false.
    */
  var isStyleLoad: js.UndefOr[Boolean] = js.native
}

object ReportPrintEventArgs {
  @scala.inline
  def apply(): ReportPrintEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportPrintEventArgs]
  }
  @scala.inline
  implicit class ReportPrintEventArgsOps[Self <: ReportPrintEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsStyleLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStyleLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStyleLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStyleLoad")(js.undefined)
        ret
    }
  }
  
}

