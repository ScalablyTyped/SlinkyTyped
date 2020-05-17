package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoChartData extends js.Object {
  val IsLinked: Boolean = js.native
  @JSName("Office.IMsoChartData_typekey")
  var OfficeDotIMsoChartData_typekey: IMsoChartData = js.native
  val Workbook: js.Any = js.native
  def Activate(): Unit = js.native
  def ActivateChartDataWindow(): Unit = js.native
  def BreakLink(): Unit = js.native
}

object IMsoChartData {
  @scala.inline
  def apply(
    Activate: () => Unit,
    ActivateChartDataWindow: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    OfficeDotIMsoChartData_typekey: IMsoChartData,
    Workbook: js.Any
  ): IMsoChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), ActivateChartDataWindow = js.Any.fromFunction0(ActivateChartDataWindow), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartData_typekey")(OfficeDotIMsoChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartData]
  }
  @scala.inline
  implicit class IMsoChartDataOps[Self <: IMsoChartData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivateChartDataWindow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivateChartDataWindow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBreakLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLinked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLinked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotIMsoChartData_typekey(value: IMsoChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.IMsoChartData_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkbook(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workbook")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

