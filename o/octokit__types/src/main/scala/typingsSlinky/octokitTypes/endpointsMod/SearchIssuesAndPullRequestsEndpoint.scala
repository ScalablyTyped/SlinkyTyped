package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.`reactions--1`
import typingsSlinky.octokitTypes.octokitTypesStrings.`reactions-Plussign1`
import typingsSlinky.octokitTypes.octokitTypesStrings.`reactions-heart`
import typingsSlinky.octokitTypes.octokitTypesStrings.`reactions-smile`
import typingsSlinky.octokitTypes.octokitTypesStrings.`reactions-tada`
import typingsSlinky.octokitTypes.octokitTypesStrings.`reactions-thinking_face`
import typingsSlinky.octokitTypes.octokitTypesStrings.asc
import typingsSlinky.octokitTypes.octokitTypesStrings.comments
import typingsSlinky.octokitTypes.octokitTypesStrings.created
import typingsSlinky.octokitTypes.octokitTypesStrings.desc
import typingsSlinky.octokitTypes.octokitTypesStrings.interactions
import typingsSlinky.octokitTypes.octokitTypesStrings.reactions
import typingsSlinky.octokitTypes.octokitTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchIssuesAndPullRequestsEndpoint extends StObject {
  
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[desc | asc] = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query). See "[Searching issues and pull requests](https://docs.github.com/articles/searching-issues-and-pull-requests/)" for a detailed list of qualifiers.
    */
  var q: String = js.native
  
  /**
    * Sorts the results of your query by the number of `comments`, `reactions`, `reactions-+1`, `reactions--1`, `reactions-smile`, `reactions-thinking_face`, `reactions-heart`, `reactions-tada`, or `interactions`. You can also sort results by how recently the items were `created` or `updated`, Default: [best match](https://developer.github.com/v3/search/#ranking-search-results)
    */
  var sort: js.UndefOr[
    comments | reactions | `reactions-Plussign1` | `reactions--1` | `reactions-smile` | `reactions-thinking_face` | `reactions-heart` | `reactions-tada` | interactions | created | updated
  ] = js.native
}
object SearchIssuesAndPullRequestsEndpoint {
  
  @scala.inline
  def apply(q: String): SearchIssuesAndPullRequestsEndpoint = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesAndPullRequestsEndpoint]
  }
  
  @scala.inline
  implicit class SearchIssuesAndPullRequestsEndpointMutableBuilder[Self <: SearchIssuesAndPullRequestsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrder(value: desc | asc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(
      value: comments | reactions | `reactions-Plussign1` | `reactions--1` | `reactions-smile` | `reactions-thinking_face` | `reactions-heart` | `reactions-tada` | interactions | created | updated
    ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
