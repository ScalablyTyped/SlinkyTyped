package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsOperation extends Entity {
  
  // Unique Client Context string. Max limit is 256 chars.
  var clientContext: js.UndefOr[NullableOption[String]] = js.native
  
  // The result information. Read-only.
  var resultInfo: js.UndefOr[NullableOption[ResultInfo]] = js.native
  
  // Possible values are: notStarted, running, completed, failed. Read-only.
  var status: js.UndefOr[OperationStatus] = js.native
}
object CommsOperation {
  
  @scala.inline
  def apply(): CommsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsOperation]
  }
  
  @scala.inline
  implicit class CommsOperationMutableBuilder[Self <: CommsOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientContext(value: NullableOption[String]): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientContextNull: Self = StObject.set(x, "clientContext", null)
    
    @scala.inline
    def setClientContextUndefined: Self = StObject.set(x, "clientContext", js.undefined)
    
    @scala.inline
    def setResultInfo(value: NullableOption[ResultInfo]): Self = StObject.set(x, "resultInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultInfoNull: Self = StObject.set(x, "resultInfo", null)
    
    @scala.inline
    def setResultInfoUndefined: Self = StObject.set(x, "resultInfo", js.undefined)
    
    @scala.inline
    def setStatus(value: OperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
