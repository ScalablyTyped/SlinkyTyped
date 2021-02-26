package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditRowOperationParams extends IEditSessionOperationParams {
  
  var rowId: Double = js.native
}
object IEditRowOperationParams {
  
  @scala.inline
  def apply(ownerUri: String, rowId: Double): IEditRowOperationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditRowOperationParams]
  }
  
  @scala.inline
  implicit class IEditRowOperationParamsMutableBuilder[Self <: IEditRowOperationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowId(value: Double): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
  }
}
