package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedRowsCollection extends js.Object {
  def activate(identifier: js.Object, element: js.Object, suppress: js.Object): Unit = js.native
  def activeRow(): Unit = js.native
  def addSubscriber(subscriber: js.Object, owner: js.Object): Unit = js.native
  def changeOwner(newOwner: js.Object): Unit = js.native
  def cleanAll(forOwner: js.Object): Unit = js.native
  def clearSelection(forOwner: js.Object): Unit = js.native
  def deactivate(suppress: js.Object): Unit = js.native
  def deselect(identifier: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def deselectAll(suppress: js.Object): Unit = js.native
  def elementFromIdentifier(identifier: js.Object): Unit = js.native
  def elementPosition(identifier: js.Object, element: js.Object): Unit = js.native
  def isActive(identifier: js.Object, forOwner: js.Object): Unit = js.native
  def isSelected(identifier: js.Object, forOwner: js.Object): Unit = js.native
  def onlyOneSelected(): Unit = js.native
  def rangeDeselect(range: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def rangeSelect(range: js.Object, add: js.Object, prevRange: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def removeSubscriber(subscriberId: js.Object, owner: js.Object): Unit = js.native
  def select(identifier: js.Object, add: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def selectedCells(): Unit = js.native
  def selectedDataRows(): Unit = js.native
  def selectedRows(): Unit = js.native
  def selectionLength(): Unit = js.native
  def toggle(element: js.Object): Unit = js.native
}

object SelectedRowsCollection {
  @scala.inline
  def apply(
    activate: (js.Object, js.Object, js.Object) => Unit,
    activeRow: () => Unit,
    addSubscriber: (js.Object, js.Object) => Unit,
    changeOwner: js.Object => Unit,
    cleanAll: js.Object => Unit,
    clearSelection: js.Object => Unit,
    deactivate: js.Object => Unit,
    deselect: (js.Object, js.Object, js.Object) => Unit,
    deselectAll: js.Object => Unit,
    elementFromIdentifier: js.Object => Unit,
    elementPosition: (js.Object, js.Object) => Unit,
    isActive: (js.Object, js.Object) => Unit,
    isSelected: (js.Object, js.Object) => Unit,
    onlyOneSelected: () => Unit,
    rangeDeselect: (js.Object, js.Object, js.Object) => Unit,
    rangeSelect: (js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    removeSubscriber: (js.Object, js.Object) => Unit,
    select: (js.Object, js.Object, js.Object, js.Object) => Unit,
    selectedCells: () => Unit,
    selectedDataRows: () => Unit,
    selectedRows: () => Unit,
    selectionLength: () => Unit,
    toggle: js.Object => Unit
  ): SelectedRowsCollection = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction3(activate), activeRow = js.Any.fromFunction0(activeRow), addSubscriber = js.Any.fromFunction2(addSubscriber), changeOwner = js.Any.fromFunction1(changeOwner), cleanAll = js.Any.fromFunction1(cleanAll), clearSelection = js.Any.fromFunction1(clearSelection), deactivate = js.Any.fromFunction1(deactivate), deselect = js.Any.fromFunction3(deselect), deselectAll = js.Any.fromFunction1(deselectAll), elementFromIdentifier = js.Any.fromFunction1(elementFromIdentifier), elementPosition = js.Any.fromFunction2(elementPosition), isActive = js.Any.fromFunction2(isActive), isSelected = js.Any.fromFunction2(isSelected), onlyOneSelected = js.Any.fromFunction0(onlyOneSelected), rangeDeselect = js.Any.fromFunction3(rangeDeselect), rangeSelect = js.Any.fromFunction5(rangeSelect), removeSubscriber = js.Any.fromFunction2(removeSubscriber), select = js.Any.fromFunction4(select), selectedCells = js.Any.fromFunction0(selectedCells), selectedDataRows = js.Any.fromFunction0(selectedDataRows), selectedRows = js.Any.fromFunction0(selectedRows), selectionLength = js.Any.fromFunction0(selectionLength), toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[SelectedRowsCollection]
  }
  @scala.inline
  implicit class SelectedRowsCollectionOps[Self <: SelectedRowsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: (js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withActiveRow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddSubscriber(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSubscriber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChangeOwner(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeOwner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCleanAll(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearSelection(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeactivate(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeselect(value: (js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDeselectAll(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElementFromIdentifier(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementFromIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElementPosition(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsActive(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsSelected(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnlyOneSelected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOneSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRangeDeselect(value: (js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeDeselect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRangeSelect(value: (js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelect")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withRemoveSubscriber(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSubscriber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelect(value: (js.Object, js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSelectedCells(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCells")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectedDataRows(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDataRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectedRows(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectionLength(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

