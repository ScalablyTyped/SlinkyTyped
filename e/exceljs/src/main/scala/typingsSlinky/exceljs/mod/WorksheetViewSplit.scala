package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.bottomLeft
import typingsSlinky.exceljs.exceljsStrings.bottomRight
import typingsSlinky.exceljs.exceljsStrings.pageBreakPreview
import typingsSlinky.exceljs.exceljsStrings.pageLayout
import typingsSlinky.exceljs.exceljsStrings.split
import typingsSlinky.exceljs.exceljsStrings.topLeft
import typingsSlinky.exceljs.exceljsStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetViewSplit extends js.Object {
  /**
  	 * Which pane will be active
  	 */
  var activePane: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight] = js.native
  /**
  	 * Where the view is split into 4 sections, each semi-independently scrollable.
  	 */
  var state: split = js.native
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview | pageLayout] = js.native
  /**
  	 * Which cell will be top-left in the bottom-right pane
  	 */
  var topLeftCell: js.UndefOr[String] = js.native
  /**
  	 * How many points from the left to place the splitter.
  	 * To split vertically, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.native
  /**
  	 * How many points from the top to place the splitter.
  	 * To split horizontally, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.native
}

object WorksheetViewSplit {
  @scala.inline
  def apply(state: split): WorksheetViewSplit = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewSplit]
  }
  @scala.inline
  implicit class WorksheetViewSplitOps[Self <: WorksheetViewSplit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: split): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivePane(value: topLeft | topRight | bottomLeft | bottomRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivePane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePane")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: pageBreakPreview | pageLayout): Self = {
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

