package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.normal
import typingsSlinky.exceljs.exceljsStrings.pageBreakPreview
import typingsSlinky.exceljs.exceljsStrings.pageLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetViewNormal extends js.Object {
  /**
  	 * Controls the view state
  	 */
  var state: normal = js.native
  /**
  	 * Presentation style
  	 */
  var style: pageBreakPreview | pageLayout = js.native
}

object WorksheetViewNormal {
  @scala.inline
  def apply(state: normal, style: pageBreakPreview | pageLayout): WorksheetViewNormal = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewNormal]
  }
  @scala.inline
  implicit class WorksheetViewNormalOps[Self <: WorksheetViewNormal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: pageBreakPreview | pageLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

