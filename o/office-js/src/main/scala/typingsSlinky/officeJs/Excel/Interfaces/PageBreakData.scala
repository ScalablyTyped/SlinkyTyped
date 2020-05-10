package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pageBreak.toJSON()`. */
@js.native
trait PageBreakData extends js.Object {
  /**
    *
    * Represents the column index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the row index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.native
}

object PageBreakData {
  @scala.inline
  def apply(): PageBreakData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakData]
  }
  @scala.inline
  implicit class PageBreakDataOps[Self <: PageBreakData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
  }
  
}

