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
trait ParamsResourceManagementUploadsGet extends StandardParameters {
  
  /**
    * Account Id for the upload to retrieve.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Custom data source Id for upload to retrieve.
    */
  var customDataSourceId: js.UndefOr[String] = js.native
  
  /**
    * Upload Id to retrieve.
    */
  var uploadId: js.UndefOr[String] = js.native
  
  /**
    * Web property Id for the upload to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object ParamsResourceManagementUploadsGet {
  
  @scala.inline
  def apply(): ParamsResourceManagementUploadsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementUploadsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementUploadsGetMutableBuilder[Self <: ParamsResourceManagementUploadsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataSourceIdUndefined: Self = StObject.set(x, "customDataSourceId", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
