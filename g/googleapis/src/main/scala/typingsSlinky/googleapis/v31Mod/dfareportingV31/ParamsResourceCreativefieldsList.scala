package typingsSlinky.googleapis.v31Mod.dfareportingV31

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCreativefieldsList extends StandardParameters {
  
  /**
    * Select only creative fields that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only creative fields with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Allows searching for creative fields by name or ID. Wildcards (*) are
    * allowed. For example, "creativefield*2015" will return creative fields
    * with names like "creativefield June 2015", "creativefield April 2015", or
    * simply "creativefield 2015". Most of the searches also add wild-cards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "creativefield" will match creative fields with the name
    * "my creativefield", "creativefield 2015", or simply "creativefield".
    */
  var searchString: js.UndefOr[String] = js.native
  
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
}
object ParamsResourceCreativefieldsList {
  
  @scala.inline
  def apply(): ParamsResourceCreativefieldsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativefieldsList]
  }
  
  @scala.inline
  implicit class ParamsResourceCreativefieldsListMutableBuilder[Self <: ParamsResourceCreativefieldsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    @scala.inline
    def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value :_*))
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    @scala.inline
    def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
