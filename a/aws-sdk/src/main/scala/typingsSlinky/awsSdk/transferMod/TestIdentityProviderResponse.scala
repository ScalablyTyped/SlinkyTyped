package typingsSlinky.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestIdentityProviderResponse extends StObject {
  
  /**
    * A message that indicates whether the test was successful or not.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.transferMod.Message] = js.native
  
  /**
    * The response that is returned from your API Gateway.
    */
  var Response: js.UndefOr[typingsSlinky.awsSdk.transferMod.Response] = js.native
  
  /**
    * The HTTP status code that is the response from your API Gateway.
    */
  var StatusCode: typingsSlinky.awsSdk.transferMod.StatusCode = js.native
  
  /**
    * The endpoint of the service used to authenticate a user.
    */
  var Url: typingsSlinky.awsSdk.transferMod.Url = js.native
}
object TestIdentityProviderResponse {
  
  @scala.inline
  def apply(StatusCode: StatusCode, Url: Url): TestIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderResponse]
  }
  
  @scala.inline
  implicit class TestIdentityProviderResponseMutableBuilder[Self <: TestIdentityProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setResponse(value: Response): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
