package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApiKeyRequest extends StObject {
  
  /**
    * [Required] The identifier of the ApiKey resource to be deleted.
    */
  var apiKey: String = js.native
}
object DeleteApiKeyRequest {
  
  @scala.inline
  def apply(apiKey: String): DeleteApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiKeyRequest]
  }
  
  @scala.inline
  implicit class DeleteApiKeyRequestMutableBuilder[Self <: DeleteApiKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
  }
}
