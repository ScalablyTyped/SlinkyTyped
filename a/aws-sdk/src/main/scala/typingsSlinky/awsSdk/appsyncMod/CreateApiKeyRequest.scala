package typingsSlinky.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiKeyRequest extends StObject {
  
  /**
    * The ID for your GraphQL API.
    */
  var apiId: String = js.native
  
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The time from creation time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.native
}
object CreateApiKeyRequest {
  
  @scala.inline
  def apply(apiId: String): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
  
  @scala.inline
  implicit class CreateApiKeyRequestMutableBuilder[Self <: CreateApiKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpires(value: Long): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
