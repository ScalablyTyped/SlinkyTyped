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
trait ParamsResourceGroupsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Immutable ID of the G Suite account. In case of multi-domain, to fetch
    * all groups for a customer, fill this field instead of domain.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * Name of the domain. Fill this field to get groups from only this domain.
    * To return all groups in a multi-domain fill customer field instead.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to return. Default is 200
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Column to use for sorting results
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Token to specify next page in the list
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Query string search. Should be of the form "". Complete documentation is
    * at
    * https://developers.google.com/admin-sdk/directory/v1/guides/search-groups
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Whether to return results in ascending or descending order. Only of use
    * when orderBy is also used
    */
  var sortOrder: js.UndefOr[String] = js.native
  
  /**
    * Email or immutable Id of the user if only those groups are to be listed,
    * the given user is a member of. If Id, it should match with id of user
    * object
    */
  var userKey: js.UndefOr[String] = js.native
}
object ParamsResourceGroupsList {
  
  @scala.inline
  def apply(): ParamsResourceGroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsList]
  }
  
  @scala.inline
  implicit class ParamsResourceGroupsListMutableBuilder[Self <: ParamsResourceGroupsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
