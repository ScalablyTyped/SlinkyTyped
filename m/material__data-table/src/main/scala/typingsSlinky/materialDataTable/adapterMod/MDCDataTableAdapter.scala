package typingsSlinky.materialDataTable.adapterMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCDataTableAdapter extends js.Object {
  /**
    * Adds a class name to row element at given row index excluding header row.
    *
    * @param rowIndex Index of row element excluding header row.
    * @param cssClasses CSS Class string to add.
    */
  def addClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit = js.native
  /**
    * @return Row count excluding header row.
    */
  def getRowCount(): Double = js.native
  /**
    * @return Array of row elements excluding header row.
    */
  def getRowElements(): js.Array[Element] = js.native
  /**
    * Returns row id of row element at given row index based on `data-row-id` attribute on row element `tr`.
    *
    * @param rowIndex Index of row element.
    * @return Row id of row element, returns `null` in absence of `data-row-id` attribute on row element.
    */
  def getRowIdAtIndex(rowIndex: Double): String | Null = js.native
  /**
    * Returns index of row element that contains give child element. Returns -1 if element is not child of any row
    * element.
    *
    * @param el Child element of row element.
    * @return Index of row element.
    */
  def getRowIndexByChildElement(el: Element): Double = js.native
  /**
    * @return Selected row count.
    */
  def getSelectedRowCount(): Double = js.native
  /**
    * @param rowIndex Index of row element.
    * @return True if row checkbox at given row index is checked.
    */
  def isCheckboxAtRowIndexChecked(rowIndex: Double): Boolean = js.native
  /**
    * @return True if header row checkbox is checked.
    */
  def isHeaderRowCheckboxChecked(): Boolean = js.native
  /**
    * @return True if table rows are selectable.
    */
  def isRowsSelectable(): Boolean = js.native
  /**
    * Notifies when row selection is changed.
    *
    * @param data Event detail data for row selection changed event.
    */
  def notifyRowSelectionChanged(data: MDCDataTableRowSelectionChangedEventDetail): Unit = js.native
  /**
    * Notifies when header row is checked.
    */
  def notifySelectedAll(): Unit = js.native
  /**
    * Notifies when header row is unchecked.
    */
  def notifyUnselectedAll(): Unit = js.native
  /**
    * Initializes header row checkbox. Destroys previous header row checkbox instance if any.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerHeaderRowCheckbox(): js.Promise[Unit] | Unit = js.native
  /**
    * Initializes all row checkboxes. Destroys previous row checkbox instances if any. This is usually called when row
    * checkboxes are added or removed from table.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerRowCheckboxes(): js.Promise[Unit] | Unit = js.native
  /**
    * Removes class name from row element at give row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param cssClasses Class name string.
    */
  def removeClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit = js.native
  /**
    * Sets attribute to row element at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param attr Name of attribute.
    * @param value Value of attribute.
    */
  def setAttributeAtRowIndex(rowIndex: Double, attr: String, value: String): Unit = js.native
  /**
    * Sets header row checkbox checked or unchecked.
    *
    * @param checked True to set header row checkbox checked.
    */
  def setHeaderRowCheckboxChecked(checked: Boolean): Unit = js.native
  /**
    * Sets header row checkbox to indeterminate.
    *
    * @param indeterminate True to set header row checkbox indeterminate.
    */
  def setHeaderRowCheckboxIndeterminate(indeterminate: Boolean): Unit = js.native
  /**
    * Sets row checkbox to checked or unchecked at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param checked True to set checked.
    */
  def setRowCheckboxCheckedAtIndex(rowIndex: Double, checked: Boolean): Unit = js.native
}

object MDCDataTableAdapter {
  @scala.inline
  def apply(
    addClassAtRowIndex: (Double, String) => Unit,
    getRowCount: () => Double,
    getRowElements: () => js.Array[Element],
    getRowIdAtIndex: Double => String | Null,
    getRowIndexByChildElement: Element => Double,
    getSelectedRowCount: () => Double,
    isCheckboxAtRowIndexChecked: Double => Boolean,
    isHeaderRowCheckboxChecked: () => Boolean,
    isRowsSelectable: () => Boolean,
    notifyRowSelectionChanged: MDCDataTableRowSelectionChangedEventDetail => Unit,
    notifySelectedAll: () => Unit,
    notifyUnselectedAll: () => Unit,
    registerHeaderRowCheckbox: () => js.Promise[Unit] | Unit,
    registerRowCheckboxes: () => js.Promise[Unit] | Unit,
    removeClassAtRowIndex: (Double, String) => Unit,
    setAttributeAtRowIndex: (Double, String, String) => Unit,
    setHeaderRowCheckboxChecked: Boolean => Unit,
    setHeaderRowCheckboxIndeterminate: Boolean => Unit,
    setRowCheckboxCheckedAtIndex: (Double, Boolean) => Unit
  ): MDCDataTableAdapter = {
    val __obj = js.Dynamic.literal(addClassAtRowIndex = js.Any.fromFunction2(addClassAtRowIndex), getRowCount = js.Any.fromFunction0(getRowCount), getRowElements = js.Any.fromFunction0(getRowElements), getRowIdAtIndex = js.Any.fromFunction1(getRowIdAtIndex), getRowIndexByChildElement = js.Any.fromFunction1(getRowIndexByChildElement), getSelectedRowCount = js.Any.fromFunction0(getSelectedRowCount), isCheckboxAtRowIndexChecked = js.Any.fromFunction1(isCheckboxAtRowIndexChecked), isHeaderRowCheckboxChecked = js.Any.fromFunction0(isHeaderRowCheckboxChecked), isRowsSelectable = js.Any.fromFunction0(isRowsSelectable), notifyRowSelectionChanged = js.Any.fromFunction1(notifyRowSelectionChanged), notifySelectedAll = js.Any.fromFunction0(notifySelectedAll), notifyUnselectedAll = js.Any.fromFunction0(notifyUnselectedAll), registerHeaderRowCheckbox = js.Any.fromFunction0(registerHeaderRowCheckbox), registerRowCheckboxes = js.Any.fromFunction0(registerRowCheckboxes), removeClassAtRowIndex = js.Any.fromFunction2(removeClassAtRowIndex), setAttributeAtRowIndex = js.Any.fromFunction3(setAttributeAtRowIndex), setHeaderRowCheckboxChecked = js.Any.fromFunction1(setHeaderRowCheckboxChecked), setHeaderRowCheckboxIndeterminate = js.Any.fromFunction1(setHeaderRowCheckboxIndeterminate), setRowCheckboxCheckedAtIndex = js.Any.fromFunction2(setRowCheckboxCheckedAtIndex))
    __obj.asInstanceOf[MDCDataTableAdapter]
  }
  @scala.inline
  implicit class MDCDataTableAdapterOps[Self <: MDCDataTableAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClassAtRowIndex(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassAtRowIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRowElements(value: () => js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowElements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRowIdAtIndex(value: Double => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIdAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRowIndexByChildElement(value: Element => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowIndexByChildElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSelectedRowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRowCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCheckboxAtRowIndexChecked(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCheckboxAtRowIndexChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsHeaderRowCheckboxChecked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderRowCheckboxChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRowsSelectable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowsSelectable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyRowSelectionChanged(value: MDCDataTableRowSelectionChangedEventDetail => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyRowSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifySelectedAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySelectedAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyUnselectedAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyUnselectedAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterHeaderRowCheckbox(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerHeaderRowCheckbox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterRowCheckboxes(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerRowCheckboxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveClassAtRowIndex(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClassAtRowIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAttributeAtRowIndex(value: (Double, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributeAtRowIndex")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetHeaderRowCheckboxChecked(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderRowCheckboxChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderRowCheckboxIndeterminate(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderRowCheckboxIndeterminate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRowCheckboxCheckedAtIndex(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowCheckboxCheckedAtIndex")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

