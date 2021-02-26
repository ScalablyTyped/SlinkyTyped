package typingsSlinky.muiDatatables.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColIndex extends StObject {
  
  var colIndex: Double = js.native
  
  var dataIndex: Double = js.native
  
  var event: SyntheticMouseEvent[Element] = js.native
  
  var rowIndex: Double = js.native
}
object ColIndex {
  
  @scala.inline
  def apply(colIndex: Double, dataIndex: Double, event: SyntheticMouseEvent[Element], rowIndex: Double): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
  
  @scala.inline
  implicit class ColIndexMutableBuilder[Self <: ColIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
