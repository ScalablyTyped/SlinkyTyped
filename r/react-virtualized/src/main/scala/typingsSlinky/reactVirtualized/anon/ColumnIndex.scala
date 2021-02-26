package typingsSlinky.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnIndex extends StObject {
  
  var columnIndex: Double = js.native
  
  var rowIndex: Double = js.native
}
object ColumnIndex {
  
  @scala.inline
  def apply(columnIndex: Double, rowIndex: Double): ColumnIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnIndex]
  }
  
  @scala.inline
  implicit class ColumnIndexMutableBuilder[Self <: ColumnIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
