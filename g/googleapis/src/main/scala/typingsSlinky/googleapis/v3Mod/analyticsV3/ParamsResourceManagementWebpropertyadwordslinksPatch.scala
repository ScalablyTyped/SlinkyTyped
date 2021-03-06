package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManagementWebpropertyadwordslinksPatch extends StandardParameters {
  
  /**
    * ID of the account which the given web property belongs to.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntityAdWordsLink] = js.native
  
  /**
    * Web property-Google Ads link ID.
    */
  var webPropertyAdWordsLinkId: js.UndefOr[String] = js.native
  
  /**
    * Web property ID to retrieve the Google Ads link for.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object ParamsResourceManagementWebpropertyadwordslinksPatch {
  
  @scala.inline
  def apply(): ParamsResourceManagementWebpropertyadwordslinksPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementWebpropertyadwordslinksPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementWebpropertyadwordslinksPatchMutableBuilder[Self <: ParamsResourceManagementWebpropertyadwordslinksPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEntityAdWordsLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setWebPropertyAdWordsLinkId(value: String): Self = StObject.set(x, "webPropertyAdWordsLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyAdWordsLinkIdUndefined: Self = StObject.set(x, "webPropertyAdWordsLinkId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
