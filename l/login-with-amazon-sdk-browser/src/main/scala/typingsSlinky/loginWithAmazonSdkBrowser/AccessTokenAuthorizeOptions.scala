package typingsSlinky.loginWithAmazonSdkBrowser

import typingsSlinky.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessTokenAuthorizeOptions extends AuthorizeOptions {
  
  @JSName("response_type")
  var response_type_AccessTokenAuthorizeOptions: js.UndefOr[token] = js.native
}
object AccessTokenAuthorizeOptions {
  
  @scala.inline
  def apply(scope: AuthorizeScope): AccessTokenAuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenAuthorizeOptions]
  }
  
  @scala.inline
  implicit class AccessTokenAuthorizeOptionsMutableBuilder[Self <: AccessTokenAuthorizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse_type(value: token): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
  }
}
