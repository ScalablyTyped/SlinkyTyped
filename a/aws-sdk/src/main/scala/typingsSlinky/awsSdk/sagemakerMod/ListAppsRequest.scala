package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppsRequest extends StObject {
  
  /**
    * A parameter to search for the domain ID.
    */
  var DomainIdEquals: js.UndefOr[DomainId] = js.native
  
  /**
    * Returns a list up to a specified limit.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[AppSortKey] = js.native
  
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
  
  /**
    * A parameter to search by user profile name.
    */
  var UserProfileNameEquals: js.UndefOr[UserProfileName] = js.native
}
object ListAppsRequest {
  
  @scala.inline
  def apply(): ListAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsRequest]
  }
  
  @scala.inline
  implicit class ListAppsRequestMutableBuilder[Self <: ListAppsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainIdEquals(value: DomainId): Self = StObject.set(x, "DomainIdEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdEqualsUndefined: Self = StObject.set(x, "DomainIdEquals", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: AppSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setUserProfileNameEquals(value: UserProfileName): Self = StObject.set(x, "UserProfileNameEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileNameEqualsUndefined: Self = StObject.set(x, "UserProfileNameEquals", js.undefined)
  }
}
