package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetSubset extends StObject {
  
  var rowCount: Double = js.native
  
  var rows: js.Array[js.Array[DbCellValue]] = js.native
}
object ResultSetSubset {
  
  @scala.inline
  def apply(rowCount: Double, rows: js.Array[js.Array[DbCellValue]]): ResultSetSubset = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetSubset]
  }
  
  @scala.inline
  implicit class ResultSetSubsetMutableBuilder[Self <: ResultSetSubset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[js.Array[DbCellValue]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Array[DbCellValue]*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
