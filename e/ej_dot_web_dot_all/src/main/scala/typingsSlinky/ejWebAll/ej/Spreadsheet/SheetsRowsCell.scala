package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsRowsCell extends js.Object {
  /** Specifies the comment for a cell in Spreadsheet.
    * @Default {null}
    */
  var comment: js.UndefOr[SheetsRowsCellsComment] = js.native
  /** Specifies the format of a cell in Spreadsheet.
    * @Default {null}
    */
  var format: js.UndefOr[SheetsRowsCellsFormat] = js.native
  /** Specifies the hyperlink for a cell in Spreadsheet.
    * @Default {null}
    */
  var hyperlink: js.UndefOr[SheetsRowsCellsHyperlink] = js.native
  /** Specifies the index of a cell in Spreadsheet.
    * @Default {0}
    */
  var index: js.UndefOr[Double] = js.native
  /** Specifies whether to lock or unlock a particular cell.
    * @Default {false}
    */
  var isLocked: js.UndefOr[Boolean] = js.native
  /** Specifies the styles of a cell in Spreadsheet.
    * @Default {null}
    */
  var style: js.UndefOr[SheetsRowsCellsStyle] = js.native
  /** Specifies the value for a cell in Spreadsheet.
    */
  var value: js.UndefOr[String] = js.native
}

object SheetsRowsCell {
  @scala.inline
  def apply(): SheetsRowsCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRowsCell]
  }
  @scala.inline
  implicit class SheetsRowsCellOps[Self <: SheetsRowsCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: SheetsRowsCellsComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: SheetsRowsCellsFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlink(value: SheetsRowsCellsHyperlink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: SheetsRowsCellsStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

