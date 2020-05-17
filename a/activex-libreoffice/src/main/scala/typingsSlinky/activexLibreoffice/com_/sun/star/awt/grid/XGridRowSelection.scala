package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interfaces provides access to the selection of row for {@link UnoControlGrid} .
  * @since LibreOffice 3.4
  */
@js.native
trait XGridRowSelection extends js.Object {
  /**
    * Returns the indices of all selected rows.
    * @returns a sequence of indices.
    */
  val SelectedRows: SafeArray[Double] = js.native
  /**
    * Adds a listener for the {@link GridSelectionEvent} posted after the grid changes.
    * @param listener the listener to add.
    */
  def addSelectionListener(listener: XGridSelectionListener): Unit = js.native
  /** Deselects all selected rows. */
  def deselectAllRows(): Unit = js.native
  /**
    * removes the selection for a given row
    * @param RowIndex denotes the index of the row to deselect
    */
  def deselectRow(RowIndex: Double): Unit = js.native
  /**
    * Returns the indices of all selected rows.
    * @returns a sequence of indices.
    */
  def getSelectedRows(): SafeArray[Double] = js.native
  /**
    * Returns whether rows are selected.
    * @returns `TRUE` if and only if at least one row is selected.
    */
  def hasSelectedRows(): Boolean = js.native
  /**
    * Returns whether a specific row is selected.
    * @param RowIndex the index of a row. If the value does not denote a valid row index, i.e. is smaller than `0` or greater than the number of rows, this is
    * @returns `TRUE` if and only if there is a row with the given index, and it is selected currently.
    */
  def isRowSelected(RowIndex: Double): Boolean = js.native
  /**
    * Removes a listener previously added with {@link addSelectionListener()} .
    * @param listener the listener to remove.
    */
  def removeSelectionListener(listener: XGridSelectionListener): Unit = js.native
  /** Selects all rows. */
  def selectAllRows(): Unit = js.native
  /**
    * selects a given row
    * @param RowIndex denotes the index of the row to select
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `RowIndex` does not denote a valid row index
    */
  def selectRow(RowIndex: Double): Unit = js.native
}

object XGridRowSelection {
  @scala.inline
  def apply(
    SelectedRows: SafeArray[Double],
    addSelectionListener: XGridSelectionListener => Unit,
    deselectAllRows: () => Unit,
    deselectRow: Double => Unit,
    getSelectedRows: () => SafeArray[Double],
    hasSelectedRows: () => Boolean,
    isRowSelected: Double => Boolean,
    removeSelectionListener: XGridSelectionListener => Unit,
    selectAllRows: () => Unit,
    selectRow: Double => Unit
  ): XGridRowSelection = {
    val __obj = js.Dynamic.literal(SelectedRows = SelectedRows.asInstanceOf[js.Any], addSelectionListener = js.Any.fromFunction1(addSelectionListener), deselectAllRows = js.Any.fromFunction0(deselectAllRows), deselectRow = js.Any.fromFunction1(deselectRow), getSelectedRows = js.Any.fromFunction0(getSelectedRows), hasSelectedRows = js.Any.fromFunction0(hasSelectedRows), isRowSelected = js.Any.fromFunction1(isRowSelected), removeSelectionListener = js.Any.fromFunction1(removeSelectionListener), selectAllRows = js.Any.fromFunction0(selectAllRows), selectRow = js.Any.fromFunction1(selectRow))
    __obj.asInstanceOf[XGridRowSelection]
  }
  @scala.inline
  implicit class XGridRowSelectionOps[Self <: XGridRowSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedRows(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddSelectionListener(value: XGridSelectionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSelectionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeselectAllRows(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAllRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeselectRow(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSelectedRows(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSelectedRows(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelectedRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRowSelected(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSelectionListener(value: XGridSelectionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSelectionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectAllRows(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectRow(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

