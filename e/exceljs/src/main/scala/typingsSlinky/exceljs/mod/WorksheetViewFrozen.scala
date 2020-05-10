package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.frozen
import typingsSlinky.exceljs.exceljsStrings.pageBreakPreview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetViewFrozen extends js.Object {
  /**
  	 * Where a number of rows and columns to the top and left are frozen in place.
  	 * Only the bottom left section will scroll
  	 */
  var state: frozen = js.native
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview] = js.native
  /**
  	 * Which cell will be top-left in the bottom-right pane. Note: cannot be a frozen cell.
  	 * Defaults to first unfrozen cell
  	 */
  var topLeftCell: js.UndefOr[String] = js.native
  /**
  	 * How many columns to freeze. To freeze rows only, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.native
  /**
  	 * How many rows to freeze. To freeze columns only, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.native
}

object WorksheetViewFrozen {
  @scala.inline
  def apply(state: frozen): WorksheetViewFrozen = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewFrozen]
  }
  @scala.inline
  implicit class WorksheetViewFrozenOps[Self <: WorksheetViewFrozen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: frozen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: pageBreakPreview): Self = {
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
    def withTopLeftCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeftCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLeftCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeftCell")(js.undefined)
        ret
    }
    @scala.inline
    def withXSplit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withYSplit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ySplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ySplit")(js.undefined)
        ret
    }
  }
  
}

