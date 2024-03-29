package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typingsSlinky.elasticsearch.elasticsearchStrings.query_then_fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDocumentByQueryParams extends GenericParams {
  
  var _source: js.UndefOr[NameList] = js.native
  
  var _sourceExclude: js.UndefOr[NameList] = js.native
  
  var _sourceInclude: js.UndefOr[NameList] = js.native
  
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  
  var analyzeWildcard: js.UndefOr[Boolean] = js.native
  
  var analyzer: js.UndefOr[String] = js.native
  
  var conflicts: js.UndefOr[Conflicts] = js.native
  
  var defaultOperator: js.UndefOr[DefaultOperator] = js.native
  
  var df: js.UndefOr[String] = js.native
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var lenient: js.UndefOr[Boolean] = js.native
  
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.native
  
  var preference: js.UndefOr[String] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var refresh: js.UndefOr[Refresh] = js.native
  
  var requestCache: js.UndefOr[Boolean] = js.native
  
  var requestsPerSecond: js.UndefOr[Double] = js.native
  
  var routing: js.UndefOr[String | js.Array[String] | Boolean] = js.native
  
  var scroll: js.UndefOr[String] = js.native
  
  var scrollSize: js.UndefOr[Double] = js.native
  
  var searchTimeout: js.UndefOr[TimeSpan] = js.native
  
  var searchType: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var slices: js.UndefOr[Double] = js.native
  
  var sort: js.UndefOr[NameList] = js.native
  
  var stats: js.UndefOr[String | js.Array[String] | Boolean] = js.native
  
  var terminateAfter: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var waitForActiveShards: js.UndefOr[String] = js.native
  
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}
object DeleteDocumentByQueryParams {
  
  @scala.inline
  def apply(): DeleteDocumentByQueryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDocumentByQueryParams]
  }
  
  @scala.inline
  implicit class DeleteDocumentByQueryParamsMutableBuilder[Self <: DeleteDocumentByQueryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
    @scala.inline
    def setAnalyzeWildcard(value: Boolean): Self = StObject.set(x, "analyzeWildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeWildcardUndefined: Self = StObject.set(x, "analyzeWildcard", js.undefined)
    
    @scala.inline
    def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    @scala.inline
    def setConflicts(value: Conflicts): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setDefaultOperator(value: DefaultOperator): Self = StObject.set(x, "defaultOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOperatorUndefined: Self = StObject.set(x, "defaultOperator", js.undefined)
    
    @scala.inline
    def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    @scala.inline
    def setLowercaseExpandedTerms(value: Boolean): Self = StObject.set(x, "lowercaseExpandedTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowercaseExpandedTermsUndefined: Self = StObject.set(x, "lowercaseExpandedTerms", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRequestCache(value: Boolean): Self = StObject.set(x, "requestCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCacheUndefined: Self = StObject.set(x, "requestCache", js.undefined)
    
    @scala.inline
    def setRequestsPerSecond(value: Double): Self = StObject.set(x, "requestsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsPerSecondUndefined: Self = StObject.set(x, "requestsPerSecond", js.undefined)
    
    @scala.inline
    def setRouting(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setRoutingVarargs(value: String*): Self = StObject.set(x, "routing", js.Array(value :_*))
    
    @scala.inline
    def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSize(value: Double): Self = StObject.set(x, "scrollSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSizeUndefined: Self = StObject.set(x, "scrollSize", js.undefined)
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: TimeSpan): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    @scala.inline
    def setSearchType(value: query_then_fetch | dfs_query_then_fetch): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    @scala.inline
    def setSort(value: NameList): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: String*): Self = StObject.set(x, "stats", js.Array(value :_*))
    
    @scala.inline
    def setTerminateAfter(value: Double): Self = StObject.set(x, "terminateAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateAfterUndefined: Self = StObject.set(x, "terminateAfter", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
    
    @scala.inline
    def set_source(value: NameList): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceExclude(value: NameList): Self = StObject.set(x, "_sourceExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceExcludeUndefined: Self = StObject.set(x, "_sourceExclude", js.undefined)
    
    @scala.inline
    def set_sourceExcludeVarargs(value: String*): Self = StObject.set(x, "_sourceExclude", js.Array(value :_*))
    
    @scala.inline
    def set_sourceInclude(value: NameList): Self = StObject.set(x, "_sourceInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceIncludeUndefined: Self = StObject.set(x, "_sourceInclude", js.undefined)
    
    @scala.inline
    def set_sourceIncludeVarargs(value: String*): Self = StObject.set(x, "_sourceInclude", js.Array(value :_*))
    
    @scala.inline
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
  }
}
