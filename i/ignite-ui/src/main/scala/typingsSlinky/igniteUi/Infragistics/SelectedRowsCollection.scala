package typingsSlinky.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedRowsCollection extends StObject {
  
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
  implicit class SelectedRowsCollectionMutableBuilder[Self <: SelectedRowsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: (js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setActiveRow(value: () => Unit): Self = StObject.set(x, "activeRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddSubscriber(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "addSubscriber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeOwner(value: js.Object => Unit): Self = StObject.set(x, "changeOwner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCleanAll(value: js.Object => Unit): Self = StObject.set(x, "cleanAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearSelection(value: js.Object => Unit): Self = StObject.set(x, "clearSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeactivate(value: js.Object => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeselect(value: (js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeselectAll(value: js.Object => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementFromIdentifier(value: js.Object => Unit): Self = StObject.set(x, "elementFromIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementPosition(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "elementPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsActive(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsSelected(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "isSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnlyOneSelected(value: () => Unit): Self = StObject.set(x, "onlyOneSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRangeDeselect(value: (js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "rangeDeselect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRangeSelect(value: (js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "rangeSelect", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRemoveSubscriber(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "removeSubscriber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelect(value: (js.Object, js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSelectedCells(value: () => Unit): Self = StObject.set(x, "selectedCells", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedDataRows(value: () => Unit): Self = StObject.set(x, "selectedDataRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedRows(value: () => Unit): Self = StObject.set(x, "selectedRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectionLength(value: () => Unit): Self = StObject.set(x, "selectionLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: js.Object => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
  }
}
