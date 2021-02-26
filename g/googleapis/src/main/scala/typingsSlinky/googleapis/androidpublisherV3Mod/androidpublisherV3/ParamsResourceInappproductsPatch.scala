package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceInappproductsPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If true the prices for all regions targeted by the parent app that don't
    * have a price specified for this in-app product will be auto converted to
    * the target currency based on the default price. Defaults to false.
    */
  var autoConvertMissingPrices: js.UndefOr[Boolean] = js.native
  
  /**
    * Unique identifier for the Android app with the in-app product; for
    * example, "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInAppProduct] = js.native
  
  /**
    * Unique identifier for the in-app product.
    */
  var sku: js.UndefOr[String] = js.native
}
object ParamsResourceInappproductsPatch {
  
  @scala.inline
  def apply(): ParamsResourceInappproductsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInappproductsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceInappproductsPatchMutableBuilder[Self <: ParamsResourceInappproductsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAutoConvertMissingPrices(value: Boolean): Self = StObject.set(x, "autoConvertMissingPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConvertMissingPricesUndefined: Self = StObject.set(x, "autoConvertMissingPrices", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaInAppProduct): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
