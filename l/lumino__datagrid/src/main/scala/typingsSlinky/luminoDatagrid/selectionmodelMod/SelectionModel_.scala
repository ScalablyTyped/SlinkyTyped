package typingsSlinky.luminoDatagrid.selectionmodelMod

import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.ChangedArgs
import typingsSlinky.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import typingsSlinky.luminoDatagrid.selectionmodelMod.SelectionModel.IOptions
import typingsSlinky.luminoDatagrid.selectionmodelMod.SelectionModel.SelectArgs
import typingsSlinky.luminoDatagrid.selectionmodelMod.SelectionModel.Selection
import typingsSlinky.luminoDatagrid.selectionmodelMod.SelectionModel.SelectionMode
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/selectionmodel", "SelectionModel")
@js.native
abstract class SelectionModel_ protected () extends js.Object {
  /**
    * Construct a new selection model.
    *
    * @param options - The options for initializing the model.
    */
  def this(options: IOptions) = this()
  
  var _changed: js.Any = js.native
  
  var _selectionMode: js.Any = js.native
  
  /**
    * A signal emitted when the selection model has changed.
    */
  val changed: ISignal[this.type, Unit] = js.native
  
  /**
    * Clear all selections in the selection model.
    */
  def clear(): Unit = js.native
  
  /**
    * Get the current selection in the selection model.
    *
    * @returns The current selection or `null`.
    *
    * #### Notes
    * This is the selection which holds the cursor.
    */
  def currentSelection(): Selection | Null = js.native
  
  /**
    * The column index of the cursor.
    *
    * This is `-1` if the selection model is empty.
    */
  val cursorColumn: Double = js.native
  
  /**
    * The row index of the cursor.
    *
    * This is `-1` if the selection model is empty.
    */
  val cursorRow: Double = js.native
  
  /**
    * The data model associated with the selection model.
    */
  val dataModel: DataModel = js.native
  
  /**
    * Emit the `changed` signal for the selection model.
    *
    * #### Notes
    * Subclasses should call this method whenever the selection model
    * has changed so that attached data grids can update themselves.
    */
  /* protected */ def emitChanged(): Unit = js.native
  
  /**
    * Test whether any selection intersects a cell.
    *
    * @param row - The row index of interest.
    *
    * @param column - The column index of interest.
    *
    * @returns Whether any selection intersects the cell.
    *
    * #### Notes
    * This method may be reimplemented in a subclass.
    */
  def isCellSelected(row: Double, column: Double): Boolean = js.native
  
  /**
    * Test whether any selection intersects a column.
    *
    * @param index - The column index of interest.
    *
    * @returns Whether any selection intersects the column.
    *
    * #### Notes
    * This method may be reimplemented in a subclass.
    */
  def isColumnSelected(index: Double): Boolean = js.native
  
  /**
    * Whether the selection model is empty.
    *
    * #### Notes
    * An empty selection model will yield an empty `selections` iterator.
    */
  val isEmpty: Boolean = js.native
  
  /**
    * Test whether any selection intersects a row.
    *
    * @param index - The row index of interest.
    *
    * @returns Whether any selection intersects the row.
    *
    * #### Notes
    * This method may be reimplemented in a subclass.
    */
  def isRowSelected(index: Double): Boolean = js.native
  
  /**
    * Move cursor down/up/left/right while making sure it remains
    * within the bounds of selected rectangles
    *
    * @param direction - The direction of the movement.
    */
  def moveCursorWithinSelections(direction: CursorMoveDirection): Unit = js.native
  
  /**
    * A signal handler for the data model `changed` signal.
    *
    * @param args - The arguments for the signal.
    *
    * #### Notes
    * Selection model implementations should update their selections
    * in a manner that is relevant for the changes to the data model.
    *
    * The default implementation of this method is a no-op.
    */
  /* protected */ def onDataModelChanged(sender: DataModel, args: ChangedArgs): Unit = js.native
  
  /**
    * Select the specified cells.
    *
    * @param args - The arguments for the selection.
    */
  def select(args: SelectArgs): Unit = js.native
  
  /**
    * Get the selection mode for the model.
    */
  /**
    * Set the selection mode for the model.
    *
    * #### Notes
    * This will clear the selection model.
    */
  var selectionMode: SelectionMode = js.native
  
  /**
    * Get an iterator of the selections in the model.
    *
    * @returns A new iterator of the selections in the model.
    *
    * #### Notes
    * The data grid will render the selections in order.
    */
  def selections(): IIterator[Selection] = js.native
}
