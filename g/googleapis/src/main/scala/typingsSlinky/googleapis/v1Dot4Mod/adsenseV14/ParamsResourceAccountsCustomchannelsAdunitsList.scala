package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsCustomchannelsAdunitsList extends StandardParameters {
  
  /**
    * Account to which the ad client belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Ad client which contains the custom channel.
    */
  var adClientId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Custom channel for which to list ad units.
    */
  var customChannelId: js.UndefOr[String] = js.native
  
  /**
    * Whether to include inactive ad units. Default: true.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of ad units to include in the response, used for
    * paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * A continuation token, used to page through ad units. To retrieve the next
    * page, set this parameter to the value of "nextPageToken" from the
    * previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceAccountsCustomchannelsAdunitsList {
  
  @scala.inline
  def apply(): ParamsResourceAccountsCustomchannelsAdunitsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCustomchannelsAdunitsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsCustomchannelsAdunitsListMutableBuilder[Self <: ParamsResourceAccountsCustomchannelsAdunitsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomChannelId(value: String): Self = StObject.set(x, "customChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomChannelIdUndefined: Self = StObject.set(x, "customChannelId", js.undefined)
    
    @scala.inline
    def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
