package typingsSlinky.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshExtras extends StObject {
  
  /**
    * Private key to sign the DPoP Proof JWT with. This can be a crypto.KeyObject, crypto.createPrivateKey valid
    * inputs, or a JWK formatted private key.
    */
  var DPoP: js.UndefOr[DPoPInput] = js.native
  
  /**
    * extra client assertion payload parameters to be sent as part of a client JWT assertion.
    * This is only used when the client's token_endpoint_auth_method is either client_secret_jwt or private_key_jwt.
    */
  var clientAssertionPayload: js.UndefOr[js.Object] = js.native
  
  /**
    * extra request body properties to be sent to the AS during refresh token exchange.
    */
  var exchangeBody: js.UndefOr[js.Object] = js.native
}
object RefreshExtras {
  
  @scala.inline
  def apply(): RefreshExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshExtras]
  }
  
  @scala.inline
  implicit class RefreshExtrasMutableBuilder[Self <: RefreshExtras] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
    
    @scala.inline
    def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
    
    @scala.inline
    def setExchangeBody(value: js.Object): Self = StObject.set(x, "exchangeBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeBodyUndefined: Self = StObject.set(x, "exchangeBody", js.undefined)
  }
}
