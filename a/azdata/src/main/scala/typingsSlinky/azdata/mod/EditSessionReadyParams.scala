package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditSessionReadyParams extends StObject {
  
  var message: String = js.native
  
  var ownerUri: String = js.native
  
  var success: Boolean = js.native
}
object EditSessionReadyParams {
  
  @scala.inline
  def apply(message: String, ownerUri: String, success: Boolean): EditSessionReadyParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSessionReadyParams]
  }
  
  @scala.inline
  implicit class EditSessionReadyParamsMutableBuilder[Self <: EditSessionReadyParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
