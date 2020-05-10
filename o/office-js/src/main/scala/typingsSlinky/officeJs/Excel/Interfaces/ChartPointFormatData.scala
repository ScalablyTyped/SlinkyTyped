package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPointFormat.toJSON()`. */
@js.native
trait ChartPointFormatData extends js.Object {
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.native
}

object ChartPointFormatData {
  @scala.inline
  def apply(): ChartPointFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointFormatData]
  }
  @scala.inline
  implicit class ChartPointFormatDataOps[Self <: ChartPointFormatData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ChartBorderData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
  }
  
}

