package typingsSlinky.reactBootstrapTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseInsertModal extends js.Object {
  /**
  		 * Callback to close the insert row modal window.
  		 */
  def closeInsertModal(): Unit = js.native
  /**
  		 * Callback to delete selected row(s) from the table.
  		 */
  def dropRow(): Unit = js.native
  /**
  		 * Callback to export the table to a CSV file.
  		 */
  def exportCSV(): Unit = js.native
  /**
  		 * Callback to activate the insert row modal window.
  		 */
  def openInsertModal(): Unit = js.native
  /**
  		 * Callback to apply a search.
  		 */
  def search(): Unit = js.native
  /**
  		 * Callback to toggle between showing all rows and showing only selected rows.
  		 */
  def showOnlyToogle(): Unit = js.native
}

object CloseInsertModal {
  @scala.inline
  def apply(
    closeInsertModal: () => Unit,
    dropRow: () => Unit,
    exportCSV: () => Unit,
    openInsertModal: () => Unit,
    search: () => Unit,
    showOnlyToogle: () => Unit
  ): CloseInsertModal = {
    val __obj = js.Dynamic.literal(closeInsertModal = js.Any.fromFunction0(closeInsertModal), dropRow = js.Any.fromFunction0(dropRow), exportCSV = js.Any.fromFunction0(exportCSV), openInsertModal = js.Any.fromFunction0(openInsertModal), search = js.Any.fromFunction0(search), showOnlyToogle = js.Any.fromFunction0(showOnlyToogle))
    __obj.asInstanceOf[CloseInsertModal]
  }
  @scala.inline
  implicit class CloseInsertModalOps[Self <: CloseInsertModal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseInsertModal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeInsertModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropRow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExportCSV(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSV")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenInsertModal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInsertModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowOnlyToogle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnlyToogle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

