package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceResourcesFeaturesPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The unique ID for the customer's G Suite account. As an account
    * administrator, you can also use the my_customer alias to represent your
    * account's customer ID.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the feature to update.
    */
  var featureKey: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFeature] = js.native
}
object ParamsResourceResourcesFeaturesPatch {
  
  @scala.inline
  def apply(): ParamsResourceResourcesFeaturesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesFeaturesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceResourcesFeaturesPatchMutableBuilder[Self <: ParamsResourceResourcesFeaturesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setFeatureKey(value: String): Self = StObject.set(x, "featureKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureKeyUndefined: Self = StObject.set(x, "featureKey", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFeature): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
