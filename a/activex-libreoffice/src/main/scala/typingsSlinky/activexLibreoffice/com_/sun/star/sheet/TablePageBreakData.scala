package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a page break in a spreadsheet.
  * @see com.sun.star.sheet.XSheetPageBreak
  */
@js.native
trait TablePageBreakData extends js.Object {
  /** is `TRUE` for a manual page break, `FALSE` for an automatic one. */
  var ManualBreak: Boolean = js.native
  /** the position (column or row index) of the page break. */
  var Position: Double = js.native
}

object TablePageBreakData {
  @scala.inline
  def apply(ManualBreak: Boolean, Position: Double): TablePageBreakData = {
    val __obj = js.Dynamic.literal(ManualBreak = ManualBreak.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablePageBreakData]
  }
  @scala.inline
  implicit class TablePageBreakDataOps[Self <: TablePageBreakData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManualBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

