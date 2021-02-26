package typingsSlinky.googleapis.reportsV1Mod.adminReportsV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUserusagereportGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Represents the customer for which the data is to be fetched.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Represents the date in yyyy-mm-dd format for which the data is to be
    * fetched.
    */
  var date: js.UndefOr[String] = js.native
  
  /**
    * Represents the set of filters including parameter operator value.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to return. Maximum allowed is 1000
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * the organizational unit's ID to filter usage parameters from users
    * belonging to a specific OU or one of its sub-OU(s).
    */
  var orgUnitID: js.UndefOr[String] = js.native
  
  /**
    * Token to specify next page.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Represents the application name, parameter name pairs to fetch in csv as
    * app_name1:param_name1, app_name2:param_name2.
    */
  var parameters: js.UndefOr[String] = js.native
  
  /**
    * Represents the profile id or the user email for which the data should be
    * filtered.
    */
  var userKey: js.UndefOr[String] = js.native
}
object ParamsResourceUserusagereportGet {
  
  @scala.inline
  def apply(): ParamsResourceUserusagereportGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserusagereportGet]
  }
  
  @scala.inline
  implicit class ParamsResourceUserusagereportGetMutableBuilder[Self <: ParamsResourceUserusagereportGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOrgUnitID(value: String): Self = StObject.set(x, "orgUnitID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitIDUndefined: Self = StObject.set(x, "orgUnitID", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
