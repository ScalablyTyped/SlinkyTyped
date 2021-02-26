package typingsSlinky.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIdTokenResponse extends StObject {
  
  /**
    * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.
    */
  var IdentityId: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.IdentityId] = js.native
  
  /**
    * An OpenID token, valid for 10 minutes.
    */
  var Token: js.UndefOr[OIDCToken] = js.native
}
object GetOpenIdTokenResponse {
  
  @scala.inline
  def apply(): GetOpenIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenResponse]
  }
  
  @scala.inline
  implicit class GetOpenIdTokenResponseMutableBuilder[Self <: GetOpenIdTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setToken(value: OIDCToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
