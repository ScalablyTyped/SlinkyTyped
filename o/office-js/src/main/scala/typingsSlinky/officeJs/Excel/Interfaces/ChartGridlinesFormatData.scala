package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartGridlinesFormat.toJSON()`. */
@js.native
trait ChartGridlinesFormatData extends js.Object {
  /**
    *
    * Represents chart line formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.native
}

object ChartGridlinesFormatData {
  @scala.inline
  def apply(): ChartGridlinesFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesFormatData]
  }
  @scala.inline
  implicit class ChartGridlinesFormatDataOps[Self <: ChartGridlinesFormatData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: ChartLineFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
  }
  
}

