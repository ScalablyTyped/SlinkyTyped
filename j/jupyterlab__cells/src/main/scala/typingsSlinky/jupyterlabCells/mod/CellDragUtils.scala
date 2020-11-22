package typingsSlinky.jupyterlabCells.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabCells.celldragutilsMod.CellDragUtils.ICellTargetArea
import typingsSlinky.jupyterlabNbformat.mod.ICell
import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells", "CellDragUtils")
@js.native
object CellDragUtils extends js.Object {
  
  /**
    * Create an image for the cell(s) to be dragged
    *
    * @param activeCell - The cell from where the drag event is triggered
    * @param selectedCells - The cells to be dragged
    */
  def createCellDragImage(activeCell: typingsSlinky.jupyterlabCells.widgetMod.Cell, selectedCells: js.Array[ICell]): HTMLElement = js.native
  
  /**
    * Detect which part of the cell triggered the MouseEvent
    *
    * @param cell - The cell which contains the MouseEvent's target
    * @param target - The DOM node which triggered the MouseEvent
    */
  def detectTargetArea(cell: typingsSlinky.jupyterlabCells.widgetMod.Cell, target: HTMLElement): ICellTargetArea = js.native
  
  /**
    * Find the cell index containing the target html element.
    * This function traces up the DOM hierarchy to find the root cell
    * node. Then find the corresponding child and select it.
    *
    * @param node - the cell node or a child of the cell node.
    * @param cells - an iterable of Cells
    * @param isCellNode - a function that takes in a node and checks if
    * it is a cell node.
    *
    * @returns index of the cell we're looking for. Returns -1 if
    * the cell is not founds
    */
  def findCell(
    node: HTMLElement,
    cells: IterableOrArrayLike[typingsSlinky.jupyterlabCells.widgetMod.Cell],
    isCellNode: js.Function1[/* node */ HTMLElement, Boolean]
  ): Double = js.native
  
  /**
    * Detect if a drag event should be started. This is down if the
    * mouse is moved beyond a certain distance (DRAG_THRESHOLD).
    *
    * @param prevX - X Coordinate of the mouse pointer during the mousedown event
    * @param prevY - Y Coordinate of the mouse pointer during the mousedown event
    * @param nextX - Current X Coordinate of the mouse pointer
    * @param nextY - Current Y Coordinate of the mouse pointer
    */
  def shouldStartDrag(prevX: Double, prevY: Double, nextX: Double, nextY: Double): Boolean = js.native
}
