package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *   Information about a cell expanded.
  */
@js.native
trait CellExpandEvent[T] extends StObject {
  
  /**
    * Expand data.
    */
  var expandArgs: js.Any = js.native
  
  /**
    * The column index where the cell is being expanded.
    */
  var idx: Double = js.native
  
  /**
    * The values of the row.
    */
  var rowData: T = js.native
  
  /**
    * The row index where the cell is being expanded.
    */
  var rowIdx: Double = js.native
}
object CellExpandEvent {
  
  @scala.inline
  def apply[T](expandArgs: js.Any, idx: Double, rowData: T, rowIdx: Double): CellExpandEvent[T] = {
    val __obj = js.Dynamic.literal(expandArgs = expandArgs.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellExpandEvent[T]]
  }
  
  @scala.inline
  implicit class CellExpandEventMutableBuilder[Self <: CellExpandEvent[_], T] (val x: Self with CellExpandEvent[T]) extends AnyVal {
    
    @scala.inline
    def setExpandArgs(value: js.Any): Self = StObject.set(x, "expandArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: T): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
  }
}
