package typingsSlinky.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterUsageRequest extends StObject {
  
  /**
    * (Optional) To scope down the registration to a specific running software instance and guard against replay attacks.
    */
  var Nonce: js.UndefOr[typingsSlinky.awsSdk.marketplacemeteringMod.Nonce] = js.native
  
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typingsSlinky.awsSdk.marketplacemeteringMod.ProductCode = js.native
  
  /**
    * Public Key Version provided by AWS Marketplace
    */
  var PublicKeyVersion: VersionInteger = js.native
}
object RegisterUsageRequest {
  
  @scala.inline
  def apply(ProductCode: ProductCode, PublicKeyVersion: VersionInteger): RegisterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], PublicKeyVersion = PublicKeyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUsageRequest]
  }
  
  @scala.inline
  implicit class RegisterUsageRequestMutableBuilder[Self <: RegisterUsageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonce(value: Nonce): Self = StObject.set(x, "Nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "Nonce", js.undefined)
    
    @scala.inline
    def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyVersion(value: VersionInteger): Self = StObject.set(x, "PublicKeyVersion", value.asInstanceOf[js.Any])
  }
}
