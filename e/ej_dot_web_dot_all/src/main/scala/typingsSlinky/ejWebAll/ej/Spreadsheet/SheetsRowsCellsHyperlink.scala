package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsRowsCellsHyperlink extends js.Object {
  /** Specifies the cell address for the hyperlink of a cell.
    */
  var cellAddr: js.UndefOr[String] = js.native
  /** Specifies the sheet index to which the cell is referred.
    * @Default {1}
    */
  var sheetIndex: js.UndefOr[Double] = js.native
  /** Specifies the web address for the hyperlink of a cell.
    */
  var webAddr: js.UndefOr[String] = js.native
}

object SheetsRowsCellsHyperlink {
  @scala.inline
  def apply(): SheetsRowsCellsHyperlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCellsHyperlink]
  }
  @scala.inline
  implicit class SheetsRowsCellsHyperlinkOps[Self <: SheetsRowsCellsHyperlink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellAddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAddr")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withWebAddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAddr")(js.undefined)
        ret
    }
  }
  
}

