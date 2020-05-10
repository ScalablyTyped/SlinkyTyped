package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.elasticsearchStrings.always
import typingsSlinky.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typingsSlinky.elasticsearch.elasticsearchStrings.missing
import typingsSlinky.elasticsearch.elasticsearchStrings.popular
import typingsSlinky.elasticsearch.elasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.native
  var _sourceExclude: js.UndefOr[NameList] = js.native
  var _sourceInclude: js.UndefOr[NameList] = js.native
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var analyzeWildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var defaultOperator: js.UndefOr[DefaultOperator] = js.native
  var df: js.UndefOr[String] = js.native
  var docvalueFields: js.UndefOr[NameList] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var fielddataFields: js.UndefOr[NameList] = js.native
  var from: js.UndefOr[Double] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[NameList] = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.native
  var preference: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var requestCache: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[NameList] = js.native
  var scroll: js.UndefOr[TimeSpan] = js.native
  var searchType: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.native
  var size: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[NameList] = js.native
  var stats: js.UndefOr[NameList] = js.native
  var storedFields: js.UndefOr[NameList] = js.native
  var suggestField: js.UndefOr[String] = js.native
  var suggestMode: js.UndefOr[missing | popular | always] = js.native
  var suggestSize: js.UndefOr[Double] = js.native
  var suggestText: js.UndefOr[String] = js.native
  var terminateAfter: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
  var trackScores: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[NameList] = js.native
  var version: js.UndefOr[Boolean] = js.native
}

object SearchParams {
  @scala.inline
  def apply(): SearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchParams]
  }
  @scala.inline
  implicit class SearchParamsOps[Self <: SearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_source(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(js.undefined)
        ret
    }
    @scala.inline
    def with_sourceExclude(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceExclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sourceExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceExclude")(js.undefined)
        ret
    }
    @scala.inline
    def with_sourceInclude(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sourceInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceInclude")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowNoIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNoIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNoIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzeWildcard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeWildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzeWildcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeWildcard")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOperator(value: DefaultOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withDf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("df")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("df")(js.undefined)
        ret
    }
    @scala.inline
    def withDocvalueFields(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docvalueFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocvalueFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docvalueFields")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandWildcards(value: ExpandWildcards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandWildcards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandWildcards")(js.undefined)
        ret
    }
    @scala.inline
    def withExplain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(js.undefined)
        ret
    }
    @scala.inline
    def withFielddataFields(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fielddataFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFielddataFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fielddataFields")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnavailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnavailable")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLenient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenient")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercaseExpandedTerms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseExpandedTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercaseExpandedTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseExpandedTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCache")(js.undefined)
        ret
    }
    @scala.inline
    def withRouting(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchType(value: query_then_fetch | dfs_query_then_fetch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withStoredFields(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestField")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestMode(value: missing | popular | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestText")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: TimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackScores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackScores")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

