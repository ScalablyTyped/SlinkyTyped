package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProfilerMoreRowsNotificationParams extends StObject {
  
  var data: IProfilerTableRow = js.native
  
  var rowCount: Double = js.native
  
  var uri: String = js.native
}
object IProfilerMoreRowsNotificationParams {
  
  @scala.inline
  def apply(data: IProfilerTableRow, rowCount: Double, uri: String): IProfilerMoreRowsNotificationParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerMoreRowsNotificationParams]
  }
  
  @scala.inline
  implicit class IProfilerMoreRowsNotificationParamsMutableBuilder[Self <: IProfilerMoreRowsNotificationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IProfilerTableRow): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
