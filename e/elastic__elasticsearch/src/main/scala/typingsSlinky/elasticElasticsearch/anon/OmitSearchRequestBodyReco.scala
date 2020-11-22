package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.AND
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.OR
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.always
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.missing
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.open
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.popular
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @elastic/elasticsearch.@elastic/elasticsearch/lib/Helpers.Omit<@elastic/elasticsearch.@elastic/elasticsearch/api/requestParams.Search<@elastic/elasticsearch.@elastic/elasticsearch/lib/Transport.RequestBody<std.Record<string, any>>>, 'body'> */
@js.native
trait OmitSearchRequestBodyReco extends js.Object {
  
  var _source: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_include: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.native
  
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  
  var allow_partial_search_results: js.UndefOr[Boolean] = js.native
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.native
  
  var analyzer: js.UndefOr[String] = js.native
  
  var batched_reduce_size: js.UndefOr[Double] = js.native
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.native
  
  var default_operator: js.UndefOr[AND | OR] = js.native
  
  var df: js.UndefOr[String] = js.native
  
  var docvalue_fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var error_trace: js.UndefOr[Boolean] = js.native
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  
  var explain: js.UndefOr[Boolean] = js.native
  
  var filter_path: js.UndefOr[String | js.Array[String]] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var human: js.UndefOr[Boolean] = js.native
  
  var ignore_throttled: js.UndefOr[Boolean] = js.native
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var lenient: js.UndefOr[Boolean] = js.native
  
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var pre_filter_shard_size: js.UndefOr[Double] = js.native
  
  var preference: js.UndefOr[String] = js.native
  
  var pretty: js.UndefOr[Boolean] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var request_cache: js.UndefOr[Boolean] = js.native
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  
  var routing: js.UndefOr[String | js.Array[String]] = js.native
  
  var scroll: js.UndefOr[String] = js.native
  
  var search_type: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.native
  
  var seq_no_primary_term: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var sort: js.UndefOr[String | js.Array[String]] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var stats: js.UndefOr[String | js.Array[String]] = js.native
  
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var suggest_field: js.UndefOr[String] = js.native
  
  var suggest_mode: js.UndefOr[missing | popular | always] = js.native
  
  var suggest_size: js.UndefOr[Double] = js.native
  
  var suggest_text: js.UndefOr[String] = js.native
  
  var terminate_after: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var track_scores: js.UndefOr[Boolean] = js.native
  
  var track_total_hits: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  var typed_keys: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[Boolean] = js.native
}
object OmitSearchRequestBodyReco {
  
  @scala.inline
  def apply(): OmitSearchRequestBodyReco = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitSearchRequestBodyReco]
  }
  
  @scala.inline
  implicit class OmitSearchRequestBodyRecoOps[Self <: OmitSearchRequestBodyReco] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    
    @scala.inline
    def set_source(value: String | js.Array[String]): Self = this.set("_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    
    @scala.inline
    def set_source_excludeVarargs(value: String*): Self = this.set("_source_exclude", js.Array(value :_*))
    
    @scala.inline
    def set_source_exclude(value: String | js.Array[String]): Self = this.set("_source_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_exclude: Self = this.set("_source_exclude", js.undefined)
    
    @scala.inline
    def set_source_excludesVarargs(value: String*): Self = this.set("_source_excludes", js.Array(value :_*))
    
    @scala.inline
    def set_source_excludes(value: String | js.Array[String]): Self = this.set("_source_excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_excludes: Self = this.set("_source_excludes", js.undefined)
    
    @scala.inline
    def set_source_includeVarargs(value: String*): Self = this.set("_source_include", js.Array(value :_*))
    
    @scala.inline
    def set_source_include(value: String | js.Array[String]): Self = this.set("_source_include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_include: Self = this.set("_source_include", js.undefined)
    
    @scala.inline
    def set_source_includesVarargs(value: String*): Self = this.set("_source_includes", js.Array(value :_*))
    
    @scala.inline
    def set_source_includes(value: String | js.Array[String]): Self = this.set("_source_includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_includes: Self = this.set("_source_includes", js.undefined)
    
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = this.set("allow_no_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_indices: Self = this.set("allow_no_indices", js.undefined)
    
    @scala.inline
    def setAllow_partial_search_results(value: Boolean): Self = this.set("allow_partial_search_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_partial_search_results: Self = this.set("allow_partial_search_results", js.undefined)
    
    @scala.inline
    def setAnalyze_wildcard(value: Boolean): Self = this.set("analyze_wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyze_wildcard: Self = this.set("analyze_wildcard", js.undefined)
    
    @scala.inline
    def setAnalyzer(value: String): Self = this.set("analyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzer: Self = this.set("analyzer", js.undefined)
    
    @scala.inline
    def setBatched_reduce_size(value: Double): Self = this.set("batched_reduce_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatched_reduce_size: Self = this.set("batched_reduce_size", js.undefined)
    
    @scala.inline
    def setCcs_minimize_roundtrips(value: Boolean): Self = this.set("ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcs_minimize_roundtrips: Self = this.set("ccs_minimize_roundtrips", js.undefined)
    
    @scala.inline
    def setDefault_operator(value: AND | OR): Self = this.set("default_operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_operator: Self = this.set("default_operator", js.undefined)
    
    @scala.inline
    def setDf(value: String): Self = this.set("df", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDf: Self = this.set("df", js.undefined)
    
    @scala.inline
    def setDocvalue_fieldsVarargs(value: String*): Self = this.set("docvalue_fields", js.Array(value :_*))
    
    @scala.inline
    def setDocvalue_fields(value: String | js.Array[String]): Self = this.set("docvalue_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocvalue_fields: Self = this.set("docvalue_fields", js.undefined)
    
    @scala.inline
    def setError_trace(value: Boolean): Self = this.set("error_trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_trace: Self = this.set("error_trace", js.undefined)
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = this.set("expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand_wildcards: Self = this.set("expand_wildcards", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    
    @scala.inline
    def setFilter_pathVarargs(value: String*): Self = this.set("filter_path", js.Array(value :_*))
    
    @scala.inline
    def setFilter_path(value: String | js.Array[String]): Self = this.set("filter_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter_path: Self = this.set("filter_path", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
    
    @scala.inline
    def setIgnore_throttled(value: Boolean): Self = this.set("ignore_throttled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore_throttled: Self = this.set("ignore_throttled", js.undefined)
    
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = this.set("ignore_unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore_unavailable: Self = this.set("ignore_unavailable", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLenient(value: Boolean): Self = this.set("lenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLenient: Self = this.set("lenient", js.undefined)
    
    @scala.inline
    def setMax_concurrent_shard_requests(value: Double): Self = this.set("max_concurrent_shard_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_concurrent_shard_requests: Self = this.set("max_concurrent_shard_requests", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPre_filter_shard_size(value: Double): Self = this.set("pre_filter_shard_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre_filter_shard_size: Self = this.set("pre_filter_shard_size", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setRequest_cache(value: Boolean): Self = this.set("request_cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_cache: Self = this.set("request_cache", js.undefined)
    
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = this.set("rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRest_total_hits_as_int: Self = this.set("rest_total_hits_as_int", js.undefined)
    
    @scala.inline
    def setRoutingVarargs(value: String*): Self = this.set("routing", js.Array(value :_*))
    
    @scala.inline
    def setRouting(value: String | js.Array[String]): Self = this.set("routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    
    @scala.inline
    def setScroll(value: String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSearch_type(value: query_then_fetch | dfs_query_then_fetch): Self = this.set("search_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_type: Self = this.set("search_type", js.undefined)
    
    @scala.inline
    def setSeq_no_primary_term(value: Boolean): Self = this.set("seq_no_primary_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeq_no_primary_term: Self = this.set("seq_no_primary_term", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: String | js.Array[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: String*): Self = this.set("stats", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: String | js.Array[String]): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    
    @scala.inline
    def setStored_fieldsVarargs(value: String*): Self = this.set("stored_fields", js.Array(value :_*))
    
    @scala.inline
    def setStored_fields(value: String | js.Array[String]): Self = this.set("stored_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStored_fields: Self = this.set("stored_fields", js.undefined)
    
    @scala.inline
    def setSuggest_field(value: String): Self = this.set("suggest_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest_field: Self = this.set("suggest_field", js.undefined)
    
    @scala.inline
    def setSuggest_mode(value: missing | popular | always): Self = this.set("suggest_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest_mode: Self = this.set("suggest_mode", js.undefined)
    
    @scala.inline
    def setSuggest_size(value: Double): Self = this.set("suggest_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest_size: Self = this.set("suggest_size", js.undefined)
    
    @scala.inline
    def setSuggest_text(value: String): Self = this.set("suggest_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest_text: Self = this.set("suggest_text", js.undefined)
    
    @scala.inline
    def setTerminate_after(value: Double): Self = this.set("terminate_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminate_after: Self = this.set("terminate_after", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTrack_scores(value: Boolean): Self = this.set("track_scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_scores: Self = this.set("track_scores", js.undefined)
    
    @scala.inline
    def setTrack_total_hits(value: Boolean): Self = this.set("track_total_hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_total_hits: Self = this.set("track_total_hits", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTyped_keys(value: Boolean): Self = this.set("typed_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTyped_keys: Self = this.set("typed_keys", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
