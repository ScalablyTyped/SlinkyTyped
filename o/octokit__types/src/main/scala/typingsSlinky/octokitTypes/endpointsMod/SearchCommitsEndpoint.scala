package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`18`
import typingsSlinky.octokitTypes.octokitTypesStrings.`author-date`
import typingsSlinky.octokitTypes.octokitTypesStrings.`committer-date`
import typingsSlinky.octokitTypes.octokitTypesStrings.asc
import typingsSlinky.octokitTypes.octokitTypesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  q :string,   sort :'author-date' | 'committer-date' | undefined,   order :'desc' | 'asc' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'cloak'> */
@js.native
trait SearchCommitsEndpoint extends StObject {
  
  var mediaType: `18` = js.native
  
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
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query). See "[Searching commits](https://docs.github.com/articles/searching-commits/)" for a detailed list of qualifiers.
    */
  var q: String = js.native
  
  /**
    * Sorts the results of your query by `author-date` or `committer-date`. Default: [best match](https://developer.github.com/v3/search/#ranking-search-results)
    */
  var sort: js.UndefOr[`author-date` | `committer-date`] = js.native
}
object SearchCommitsEndpoint {
  
  @scala.inline
  def apply(mediaType: `18`, q: String): SearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCommitsEndpoint]
  }
  
  @scala.inline
  implicit class SearchCommitsEndpointMutableBuilder[Self <: SearchCommitsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `18`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
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
    def setSort(value: `author-date` | `committer-date`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
