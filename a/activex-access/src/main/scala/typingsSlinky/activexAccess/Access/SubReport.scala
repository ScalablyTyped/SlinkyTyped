package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubReport extends js.Object {
  @JSName("Access.SubReport_typekey")
  var AccessDotSubReport_typekey: SubReport = js.native
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  val Form: typingsSlinky.activexAccess.Access.Form = js.native
  val Parent: js.Any = js.native
  val Report: typingsSlinky.activexAccess.Access.Report = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object SubReport {
  @scala.inline
  def apply(
    AccessDotSubReport_typekey: SubReport,
    Application: Application,
    Form: Form,
    IsMemberSafe: Double => Boolean,
    Parent: js.Any,
    Report: Report
  ): SubReport = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Parent = Parent.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SubReport_typekey")(AccessDotSubReport_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubReport]
  }
  @scala.inline
  implicit class SubReportOps[Self <: SubReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotSubReport_typekey(value: SubReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.SubReport_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm(value: Form): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: Report): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Report")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

