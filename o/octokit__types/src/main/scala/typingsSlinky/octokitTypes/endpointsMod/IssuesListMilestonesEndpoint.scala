package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.all
import typingsSlinky.octokitTypes.octokitTypesStrings.asc
import typingsSlinky.octokitTypes.octokitTypesStrings.closed
import typingsSlinky.octokitTypes.octokitTypesStrings.completeness
import typingsSlinky.octokitTypes.octokitTypesStrings.desc
import typingsSlinky.octokitTypes.octokitTypesStrings.due_on
import typingsSlinky.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesListMilestonesEndpoint extends StObject {
  
  /**
    * The direction of the sort. Either `asc` or `desc`.
    */
  var direction: js.UndefOr[asc | desc] = js.native
  
  var owner: String = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  var repo: String = js.native
  
  /**
    * What to sort results by. Either `due_on` or `completeness`.
    */
  var sort: js.UndefOr[due_on | completeness] = js.native
  
  /**
    * The state of the milestone. Either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[open | closed | all] = js.native
}
object IssuesListMilestonesEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): IssuesListMilestonesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListMilestonesEndpoint]
  }
  
  @scala.inline
  implicit class IssuesListMilestonesEndpointMutableBuilder[Self <: IssuesListMilestonesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: due_on | completeness): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setState(value: open | closed | all): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
