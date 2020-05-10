package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Application
import typingsSlinky.activexExcel.Excel.Chart
import typingsSlinky.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Excel.Application")
  var ExcelDotApplication: Application = js.native
  @JSName("Excel.Chart")
  var ExcelDotChart: Chart = js.native
  @JSName("Excel.Sheet")
  var ExcelDotSheet: Worksheet = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(ExcelDotApplication: Application, ExcelDotChart: Chart, ExcelDotSheet: Worksheet): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Excel.Application")(ExcelDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Chart")(ExcelDotChart.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Sheet")(ExcelDotSheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcelDotApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotChart(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSheet(value: Worksheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Sheet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

