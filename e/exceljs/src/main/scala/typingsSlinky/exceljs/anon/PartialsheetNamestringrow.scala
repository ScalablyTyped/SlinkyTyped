package typingsSlinky.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  sheetName  :string,   row  :number,   col  :number}> */
@js.native
trait PartialsheetNamestringrow extends js.Object {
  var col: js.UndefOr[Double] = js.native
  var row: js.UndefOr[Double] = js.native
  var sheetName: js.UndefOr[String] = js.native
}

object PartialsheetNamestringrow {
  @scala.inline
  def apply(): PartialsheetNamestringrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialsheetNamestringrow]
  }
  @scala.inline
  implicit class PartialsheetNamestringrowOps[Self <: PartialsheetNamestringrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(js.undefined)
        ret
    }
  }
  
}

