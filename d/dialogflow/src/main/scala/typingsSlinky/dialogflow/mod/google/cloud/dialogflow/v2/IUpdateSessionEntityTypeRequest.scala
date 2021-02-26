package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import typingsSlinky.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateSessionEntityTypeRequest. */
@js.native
trait IUpdateSessionEntityTypeRequest extends StObject {
  
  /** UpdateSessionEntityTypeRequest sessionEntityType */
  var sessionEntityType: js.UndefOr[ISessionEntityType | Null] = js.native
  
  /** UpdateSessionEntityTypeRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IUpdateSessionEntityTypeRequest {
  
  @scala.inline
  def apply(): IUpdateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateSessionEntityTypeRequest]
  }
  
  @scala.inline
  implicit class IUpdateSessionEntityTypeRequestMutableBuilder[Self <: IUpdateSessionEntityTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionEntityType(value: ISessionEntityType): Self = StObject.set(x, "sessionEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypeNull: Self = StObject.set(x, "sessionEntityType", null)
    
    @scala.inline
    def setSessionEntityTypeUndefined: Self = StObject.set(x, "sessionEntityType", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
