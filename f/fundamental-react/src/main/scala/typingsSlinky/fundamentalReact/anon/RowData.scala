package typingsSlinky.fundamentalReact.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowData extends StObject {
  
  var rowData: js.Array[String | ReactElement] = js.native
}
object RowData {
  
  @scala.inline
  def apply(rowData: js.Array[String | ReactElement]): RowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
  
  @scala.inline
  implicit class RowDataMutableBuilder[Self <: RowData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowData(value: js.Array[String | ReactElement]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDataVarargs(value: (String | ReactElement)*): Self = StObject.set(x, "rowData", js.Array(value :_*))
  }
}
