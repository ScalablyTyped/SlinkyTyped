package typingsSlinky.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableResponse extends StObject {
  
  /**
    * The updated Timestream table.
    */
  var Table: js.UndefOr[typingsSlinky.awsSdk.timestreamwriteMod.Table] = js.native
}
object UpdateTableResponse {
  
  @scala.inline
  def apply(): UpdateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableResponse]
  }
  
  @scala.inline
  implicit class UpdateTableResponseMutableBuilder[Self <: UpdateTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
