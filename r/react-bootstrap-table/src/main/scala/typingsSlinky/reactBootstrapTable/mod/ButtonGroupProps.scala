package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupProps extends js.Object {
  /**
  	 * Delete button.
  	 */
  var deleteBtn: ReactElement = js.native
  /**
  	 * Export to CSV button.
  	 */
  var exportCSVBtn: ReactElement = js.native
  /**
  	 * Insert button (to add a row).
  	 */
  var insertBtn: ReactElement = js.native
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: ReactElement = js.native
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    deleteBtn: ReactElement,
    exportCSVBtn: ReactElement,
    insertBtn: ReactElement,
    showSelectedOnlyBtn: ReactElement
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn.asInstanceOf[js.Any], exportCSVBtn = exportCSVBtn.asInstanceOf[js.Any], insertBtn = insertBtn.asInstanceOf[js.Any], showSelectedOnlyBtn = showSelectedOnlyBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
  @scala.inline
  implicit class ButtonGroupPropsOps[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportCSVBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSVBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSelectedOnlyBtn(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectedOnlyBtn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

