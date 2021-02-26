package typingsSlinky.googleapis.v32Mod.dfareportingV32

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePlacementgroupsList extends StandardParameters {
  
  /**
    * Select only placement groups that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only archived placements. Don't set this field to select both
    * archived and non-archived placements.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Select only placement groups that belong to these campaigns.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only placement groups that are associated with these content
    * categories.
    */
  var contentCategoryIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only placement groups that are associated with these directory
    * sites.
    */
  var directorySiteIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only placement groups with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only placements or placement groups whose end date is on or before
    * the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var maxEndDate: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Select only placements or placement groups whose start date is on or
    * before the specified maxStartDate. The date should be formatted as
    * "yyyy-MM-dd".
    */
  var maxStartDate: js.UndefOr[String] = js.native
  
  /**
    * Select only placements or placement groups whose end date is on or after
    * the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var minEndDate: js.UndefOr[String] = js.native
  
  /**
    * Select only placements or placement groups whose start date is on or
    * after the specified minStartDate. The date should be formatted as
    * "yyyy-MM-dd".
    */
  var minStartDate: js.UndefOr[String] = js.native
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Select only placement groups belonging with this group type. A package is
    * a simple group of placements that acts as a single pricing point for a
    * group of tags. A roadblock is a group of placements that not only acts as
    * a single pricing point but also assumes that all the tags in it will be
    * served at the same time. A roadblock requires one of its assigned
    * placements to be marked as primary for reporting.
    */
  var placementGroupType: js.UndefOr[String] = js.native
  
  /**
    * Select only placement groups that are associated with these placement
    * strategies.
    */
  var placementStrategyIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Select only placement groups with these pricing types.
    */
  var pricingTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Allows searching for placement groups by name or ID. Wildcards (*) are
    * allowed. For example, "placement*2015" will return placement groups with
    * names like "placement group June 2015", "placement group May 2015", or
    * simply "placements 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a
    * search string of "placementgroup" will match placement groups with name
    * "my placementgroup", "placementgroup 2015", or simply "placementgroup".
    */
  var searchString: js.UndefOr[String] = js.native
  
  /**
    * Select only placement groups that are associated with these sites.
    */
  var siteIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
}
object ParamsResourcePlacementgroupsList {
  
  @scala.inline
  def apply(): ParamsResourcePlacementgroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlacementgroupsList]
  }
  
  @scala.inline
  implicit class ParamsResourcePlacementgroupsListMutableBuilder[Self <: ParamsResourcePlacementgroupsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    @scala.inline
    def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value :_*))
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCampaignIds(value: js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value :_*))
    
    @scala.inline
    def setContentCategoryIds(value: js.Array[String]): Self = StObject.set(x, "contentCategoryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCategoryIdsUndefined: Self = StObject.set(x, "contentCategoryIds", js.undefined)
    
    @scala.inline
    def setContentCategoryIdsVarargs(value: String*): Self = StObject.set(x, "contentCategoryIds", js.Array(value :_*))
    
    @scala.inline
    def setDirectorySiteIds(value: js.Array[String]): Self = StObject.set(x, "directorySiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorySiteIdsUndefined: Self = StObject.set(x, "directorySiteIds", js.undefined)
    
    @scala.inline
    def setDirectorySiteIdsVarargs(value: String*): Self = StObject.set(x, "directorySiteIds", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setMaxEndDate(value: String): Self = StObject.set(x, "maxEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEndDateUndefined: Self = StObject.set(x, "maxEndDate", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMaxStartDate(value: String): Self = StObject.set(x, "maxStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStartDateUndefined: Self = StObject.set(x, "maxStartDate", js.undefined)
    
    @scala.inline
    def setMinEndDate(value: String): Self = StObject.set(x, "minEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinEndDateUndefined: Self = StObject.set(x, "minEndDate", js.undefined)
    
    @scala.inline
    def setMinStartDate(value: String): Self = StObject.set(x, "minStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinStartDateUndefined: Self = StObject.set(x, "minStartDate", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPlacementGroupType(value: String): Self = StObject.set(x, "placementGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupTypeUndefined: Self = StObject.set(x, "placementGroupType", js.undefined)
    
    @scala.inline
    def setPlacementStrategyIds(value: js.Array[String]): Self = StObject.set(x, "placementStrategyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategyIdsUndefined: Self = StObject.set(x, "placementStrategyIds", js.undefined)
    
    @scala.inline
    def setPlacementStrategyIdsVarargs(value: String*): Self = StObject.set(x, "placementStrategyIds", js.Array(value :_*))
    
    @scala.inline
    def setPricingTypes(value: js.Array[String]): Self = StObject.set(x, "pricingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingTypesUndefined: Self = StObject.set(x, "pricingTypes", js.undefined)
    
    @scala.inline
    def setPricingTypesVarargs(value: String*): Self = StObject.set(x, "pricingTypes", js.Array(value :_*))
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    @scala.inline
    def setSiteIds(value: js.Array[String]): Self = StObject.set(x, "siteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdsUndefined: Self = StObject.set(x, "siteIds", js.undefined)
    
    @scala.inline
    def setSiteIdsVarargs(value: String*): Self = StObject.set(x, "siteIds", js.Array(value :_*))
    
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
