package typingsSlinky.jupyterlabCells

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabCells.widgetMod.Cell
import typingsSlinky.jupyterlabNbformat.mod.ICell
import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object celldragutilsMod {
  
  object CellDragUtils {
    
    /**
      * Create an image for the cell(s) to be dragged
      *
      * @param activeCell - The cell from where the drag event is triggered
      * @param selectedCells - The cells to be dragged
      */
    @JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.createCellDragImage")
    @js.native
    def createCellDragImage(activeCell: Cell, selectedCells: js.Array[ICell]): HTMLElement = js.native
    
    /**
      * Detect which part of the cell triggered the MouseEvent
      *
      * @param cell - The cell which contains the MouseEvent's target
      * @param target - The DOM node which triggered the MouseEvent
      */
    @JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.detectTargetArea")
    @js.native
    def detectTargetArea(cell: Cell, target: HTMLElement): ICellTargetArea = js.native
    
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
    @JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.findCell")
    @js.native
    def findCell(
      node: HTMLElement,
      cells: IterableOrArrayLike[Cell],
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
    @JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils.shouldStartDrag")
    @js.native
    def shouldStartDrag(prevX: Double, prevY: Double, nextX: Double, nextY: Double): Boolean = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.input
      - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.prompt
      - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.cell
      - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.unknown
    */
    trait ICellTargetArea extends StObject
    object ICellTargetArea {
      
      @scala.inline
      def cell: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.cell = "cell".asInstanceOf[typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.cell]
      
      @scala.inline
      def input: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.input = "input".asInstanceOf[typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.input]
      
      @scala.inline
      def prompt: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.prompt = "prompt".asInstanceOf[typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.prompt]
      
      @scala.inline
      def unknown: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.unknown = "unknown".asInstanceOf[typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.unknown]
    }
  }
}
