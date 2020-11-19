package typingsSlinky.agGrid.iRangeControllerMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.agGrid.gridCellMod.GridCell
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRangeController extends js.Object {
  
  def addRange(rangeSelection: AddRangeSelectionParams): Unit = js.native
  
  def clearSelection(): Unit = js.native
  
  def extendRangeInDirection(cell: GridCell, key: Double): Boolean = js.native
  
  def extendRangeToCell(cell: GridCell): Unit = js.native
  
  def getCellRangeCount(cell: GridCell): Double = js.native
  
  def getCellRanges(): js.Array[RangeSelection] = js.native
  
  def isCellInAnyRange(cell: GridCell): Boolean = js.native
  
  def onDragStart(mouseEvent: MouseEvent): Unit = js.native
  
  def onDragStop(): Unit = js.native
  
  def onDragging(mouseEvent: MouseEvent): Unit = js.native
  
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
  
  def setRange(rangeSelection: AddRangeSelectionParams): Unit = js.native
  
  def setRangeToCell(cell: GridCell): Unit = js.native
  def setRangeToCell(cell: GridCell, appendRange: Boolean): Unit = js.native
}
