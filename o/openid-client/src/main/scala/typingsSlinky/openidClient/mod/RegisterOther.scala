package typingsSlinky.openidClient.mod

import typingsSlinky.jose.mod.JSONWebKeySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterOther extends StObject {
  
  /**
    * Initial Access Token to use as a Bearer token during the registration call.
    */
  var initialAccessToken: js.UndefOr[String] = js.native
  
  /**
    * JWK Set formatted object with private keys used for signing client assertions or decrypting responses.
    * When neither jwks_uri or jwks is present in metadata the key's public parts will be registered as jwks.
    */
  var jwks: js.UndefOr[JSONWebKeySet] = js.native
}
object RegisterOther {
  
  @scala.inline
  def apply(): RegisterOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOther]
  }
  
  @scala.inline
  implicit class RegisterOtherMutableBuilder[Self <: RegisterOther] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialAccessToken(value: String): Self = StObject.set(x, "initialAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialAccessTokenUndefined: Self = StObject.set(x, "initialAccessToken", js.undefined)
    
    @scala.inline
    def setJwks(value: JSONWebKeySet): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
  }
}
