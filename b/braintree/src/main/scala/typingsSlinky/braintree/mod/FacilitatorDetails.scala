package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacilitatorDetails extends StObject {
  
  var oauthApplicationClientId: String = js.native
  
  var oauthApplicationName: String = js.native
  
  var sourcePaymentMethodToken: String = js.native
}
object FacilitatorDetails {
  
  @scala.inline
  def apply(oauthApplicationClientId: String, oauthApplicationName: String, sourcePaymentMethodToken: String): FacilitatorDetails = {
    val __obj = js.Dynamic.literal(oauthApplicationClientId = oauthApplicationClientId.asInstanceOf[js.Any], oauthApplicationName = oauthApplicationName.asInstanceOf[js.Any], sourcePaymentMethodToken = sourcePaymentMethodToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatorDetails]
  }
  
  @scala.inline
  implicit class FacilitatorDetailsMutableBuilder[Self <: FacilitatorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOauthApplicationClientId(value: String): Self = StObject.set(x, "oauthApplicationClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthApplicationName(value: String): Self = StObject.set(x, "oauthApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePaymentMethodToken(value: String): Self = StObject.set(x, "sourcePaymentMethodToken", value.asInstanceOf[js.Any])
  }
}
