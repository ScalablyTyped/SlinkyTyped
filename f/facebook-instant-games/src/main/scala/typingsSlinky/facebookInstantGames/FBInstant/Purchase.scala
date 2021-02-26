package typingsSlinky.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual purchase of a game product.
  */
@js.native
trait Purchase extends StObject {
  
  /**
    * A developer-specified string, provided during the purchase of the product
    */
  var developerPayload: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the purchase transaction
    */
  var paymentID: String = js.native
  
  /**
    *  The product's game-specified identifier
    */
  var productID: String = js.native
  
  /**
    * Unix timestamp of when the purchase occurred
    */
  var purchaseTime: String = js.native
  
  /**
    *  A token representing the purchase that may be used to consume the purchase
    */
  var purchaseToken: String = js.native
  
  /**
    *  Server-signed encoding of the purchase request
    */
  var signedRequest: SignedPurchaseRequest = js.native
}
object Purchase {
  
  @scala.inline
  def apply(
    paymentID: String,
    productID: String,
    purchaseTime: String,
    purchaseToken: String,
    signedRequest: SignedPurchaseRequest
  ): Purchase = {
    val __obj = js.Dynamic.literal(paymentID = paymentID.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], purchaseTime = purchaseTime.asInstanceOf[js.Any], purchaseToken = purchaseToken.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purchase]
  }
  
  @scala.inline
  implicit class PurchaseMutableBuilder[Self <: Purchase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    @scala.inline
    def setPaymentID(value: String): Self = StObject.set(x, "paymentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTime(value: String): Self = StObject.set(x, "purchaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedRequest(value: SignedPurchaseRequest): Self = StObject.set(x, "signedRequest", value.asInstanceOf[js.Any])
  }
}
