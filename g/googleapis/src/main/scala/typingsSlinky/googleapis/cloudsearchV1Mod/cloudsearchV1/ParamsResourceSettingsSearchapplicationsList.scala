package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSettingsSearchapplicationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token value returned from a previous List request, if any.
    * <br/> The default value is 10
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceSettingsSearchapplicationsList {
  
  @scala.inline
  def apply(): ParamsResourceSettingsSearchapplicationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettingsSearchapplicationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceSettingsSearchapplicationsListMutableBuilder[Self <: ParamsResourceSettingsSearchapplicationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "debugOptions.enableDebugging", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
