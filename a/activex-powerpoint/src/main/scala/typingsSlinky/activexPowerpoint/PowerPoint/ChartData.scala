package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartData extends js.Object {
  val IsLinked: Boolean = js.native
  @JSName("PowerPoint.ChartData_typekey")
  var PowerPointDotChartData_typekey: ChartData = js.native
  val Workbook: js.Any = js.native
  def Activate(): Unit = js.native
  def BreakLink(): Unit = js.native
}

object ChartData {
  @scala.inline
  def apply(
    Activate: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    PowerPointDotChartData_typekey: ChartData,
    Workbook: js.Any
  ): ChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartData_typekey")(PowerPointDotChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
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
    def withPowerPointDotChartData_typekey(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ChartData_typekey")(value.asInstanceOf[js.Any])
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

