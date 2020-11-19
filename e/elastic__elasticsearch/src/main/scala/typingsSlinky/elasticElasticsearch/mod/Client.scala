package typingsSlinky.elasticElasticsearch.mod

import typingsSlinky.elasticElasticsearch.anon.AckWatch
import typingsSlinky.elasticElasticsearch.anon.Aliases
import typingsSlinky.elasticElasticsearch.anon.AllocationExplain
import typingsSlinky.elasticElasticsearch.anon.Analyze
import typingsSlinky.elasticElasticsearch.anon.Authenticate
import typingsSlinky.elasticElasticsearch.anon.Cancel
import typingsSlinky.elasticElasticsearch.anon.Certificates
import typingsSlinky.elasticElasticsearch.anon.CleanupRepository
import typingsSlinky.elasticElasticsearch.anon.ClearCache
import typingsSlinky.elasticElasticsearch.anon.ClearCursor
import typingsSlinky.elasticElasticsearch.anon.CloseJob
import typingsSlinky.elasticElasticsearch.anon.Delete
import typingsSlinky.elasticElasticsearch.anon.DeleteAutoFollowPattern
import typingsSlinky.elasticElasticsearch.anon.DeleteAutoscalingPolicy
import typingsSlinky.elasticElasticsearch.anon.DeleteJob
import typingsSlinky.elasticElasticsearch.anon.DeleteLifecycle_
import typingsSlinky.elasticElasticsearch.anon.DeletePipeline
import typingsSlinky.elasticElasticsearch.anon.DeletePolicy
import typingsSlinky.elasticElasticsearch.anon.DeleteTransform
import typingsSlinky.elasticElasticsearch.anon.Deletelifecycle
import typingsSlinky.elasticElasticsearch.anon.Deprecations
import typingsSlinky.elasticElasticsearch.anon.Explore
import typingsSlinky.elasticElasticsearch.anon.Force
import typingsSlinky.elasticElasticsearch.anon.HotThreads
import typingsSlinky.elasticElasticsearch.anon.Search
import typingsSlinky.elasticElasticsearch.helpersMod.default
import typingsSlinky.elasticElasticsearch.requestParamsMod.Bulk
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClearScroll
import typingsSlinky.elasticElasticsearch.requestParamsMod.Count
import typingsSlinky.elasticElasticsearch.requestParamsMod.Create
import typingsSlinky.elasticElasticsearch.requestParamsMod.DeleteByQuery
import typingsSlinky.elasticElasticsearch.requestParamsMod.DeleteByQueryRethrottle
import typingsSlinky.elasticElasticsearch.requestParamsMod.DeleteScript
import typingsSlinky.elasticElasticsearch.requestParamsMod.Exists
import typingsSlinky.elasticElasticsearch.requestParamsMod.ExistsSource
import typingsSlinky.elasticElasticsearch.requestParamsMod.Explain
import typingsSlinky.elasticElasticsearch.requestParamsMod.FieldCaps
import typingsSlinky.elasticElasticsearch.requestParamsMod.Get
import typingsSlinky.elasticElasticsearch.requestParamsMod.GetScript
import typingsSlinky.elasticElasticsearch.requestParamsMod.GetScriptContext
import typingsSlinky.elasticElasticsearch.requestParamsMod.GetScriptLanguages
import typingsSlinky.elasticElasticsearch.requestParamsMod.GetSource
import typingsSlinky.elasticElasticsearch.requestParamsMod.Index
import typingsSlinky.elasticElasticsearch.requestParamsMod.Info
import typingsSlinky.elasticElasticsearch.requestParamsMod.Mget
import typingsSlinky.elasticElasticsearch.requestParamsMod.Msearch
import typingsSlinky.elasticElasticsearch.requestParamsMod.MsearchTemplate
import typingsSlinky.elasticElasticsearch.requestParamsMod.Mtermvectors
import typingsSlinky.elasticElasticsearch.requestParamsMod.Ping
import typingsSlinky.elasticElasticsearch.requestParamsMod.PutScript
import typingsSlinky.elasticElasticsearch.requestParamsMod.RankEval
import typingsSlinky.elasticElasticsearch.requestParamsMod.Reindex
import typingsSlinky.elasticElasticsearch.requestParamsMod.ReindexRethrottle
import typingsSlinky.elasticElasticsearch.requestParamsMod.RenderSearchTemplate
import typingsSlinky.elasticElasticsearch.requestParamsMod.ScriptsPainlessExecute
import typingsSlinky.elasticElasticsearch.requestParamsMod.Scroll
import typingsSlinky.elasticElasticsearch.requestParamsMod.SearchShards
import typingsSlinky.elasticElasticsearch.requestParamsMod.SearchTemplate
import typingsSlinky.elasticElasticsearch.requestParamsMod.Termvectors
import typingsSlinky.elasticElasticsearch.requestParamsMod.Update
import typingsSlinky.elasticElasticsearch.requestParamsMod.UpdateByQuery
import typingsSlinky.elasticElasticsearch.requestParamsMod.UpdateByQueryRethrottle
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.RequestNDBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@elastic/elasticsearch", "Client")
@js.native
class Client () extends EventEmitter {
  def this(opts: ClientOptions) = this()
  
  var asyncSearch: Delete = js.native
  
  /* GENERATED */
  var async_search: Delete = js.native
  
  var autoscaling: DeleteAutoscalingPolicy = js.native
  
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Bulk[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Bulk[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Bulk[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: Bulk[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var cat: Aliases = js.native
  
  var ccr: DeleteAutoFollowPattern = js.native
  
  def child(): Client = js.native
  def child(opts: ClientOptions): Client = js.native
  
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClearScroll[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClearScroll[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def close(): js.Promise[Unit] | Unit = js.native
  def close(callback: js.Function): js.Promise[Unit] | Unit = js.native
  
  var cluster: AllocationExplain = js.native
  
  var connectionPool: typingsSlinky.elasticElasticsearch.poolMod.ConnectionPool = js.native
  
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Count[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Create[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: typingsSlinky.elasticElasticsearch.requestParamsMod.Delete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](
    params: typingsSlinky.elasticElasticsearch.requestParamsMod.Delete,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete[TResponse, TContext](
    params: typingsSlinky.elasticElasticsearch.requestParamsMod.Delete,
    options: TransportRequestOptions
  ): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](
    params: typingsSlinky.elasticElasticsearch.requestParamsMod.Delete,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: DeleteByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQueryRethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQueryRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQueryRethrottle[TResponse, TContext](
    params: DeleteByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteScript[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteScript[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: DeleteByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_by_query_rethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query_rethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query_rethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query_rethrottle[TResponse, TContext](params: DeleteByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query_rethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query_rethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query_rethrottle[TResponse, TContext](
    params: DeleteByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_script[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_script[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_script[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_script[TResponse, TContext](params: DeleteScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_script[TResponse, TContext](params: DeleteScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_script[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_script[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  var enrich: DeletePolicy = js.native
  
  var eql: Search = js.native
  
  def exists[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: Exists): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: Exists, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists[TResponse, TContext](params: Exists, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: Exists, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def existsSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsSource[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsSource[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsSource[TResponse, TContext](params: ExistsSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsSource[TResponse, TContext](params: ExistsSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsSource[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsSource[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def exists_source[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_source[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_source[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_source[TResponse, TContext](params: ExistsSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_source[TResponse, TContext](params: ExistsSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_source[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_source[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Explain[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def extend(method: String, fn: extendsCallback): Unit = js.native
  def extend(method: String, opts: Force, fn: extendsCallback): Unit = js.native
  @JSName("extend")
  var extend_Original: ClientExtends = js.native
  
  def fieldCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fieldCaps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def fieldCaps[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def field_caps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def field_caps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def field_caps[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def field_caps[TResponse, TContext](params: FieldCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def field_caps[TResponse, TContext](params: FieldCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def field_caps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def field_caps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: Get): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: Get, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: Get, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: Get, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScript[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScript[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScript[TResponse, TContext](params: GetScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScript[TResponse, TContext](params: GetScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScript[TResponse, TContext](params: GetScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScript[TResponse, TContext](params: GetScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getScriptContext[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptContext[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptContext[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptContext[TResponse, TContext](params: GetScriptContext): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptContext[TResponse, TContext](params: GetScriptContext, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptContext[TResponse, TContext](params: GetScriptContext, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptContext[TResponse, TContext](
    params: GetScriptContext,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getScriptLanguages[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptLanguages[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptLanguages[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptLanguages[TResponse, TContext](
    params: GetScriptLanguages,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSource[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSource[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSource[TResponse, TContext](params: GetSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSource[TResponse, TContext](params: GetSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSource[TResponse, TContext](params: GetSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSource[TResponse, TContext](params: GetSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_script[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script[TResponse, TContext](params: GetScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script[TResponse, TContext](params: GetScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script[TResponse, TContext](params: GetScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script[TResponse, TContext](params: GetScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_script_context[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_context[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_context[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_context[TResponse, TContext](params: GetScriptContext): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_context[TResponse, TContext](params: GetScriptContext, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_context[TResponse, TContext](params: GetScriptContext, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_context[TResponse, TContext](
    params: GetScriptContext,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_script_languages[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_languages[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_languages[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_languages[TResponse, TContext](params: GetScriptLanguages): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_languages[TResponse, TContext](params: GetScriptLanguages, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_languages[TResponse, TContext](params: GetScriptLanguages, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_languages[TResponse, TContext](
    params: GetScriptLanguages,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_source[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_source[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_source[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_source[TResponse, TContext](params: GetSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_source[TResponse, TContext](params: GetSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_source[TResponse, TContext](params: GetSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_source[TResponse, TContext](params: GetSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  var graph: Explore = js.native
  
  var helpers: default = js.native
  
  var ilm: DeleteLifecycle_ = js.native
  
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Index[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var indices: Analyze = js.native
  
  def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: Info): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: Info, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: Info, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: Info, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  var ingest: DeletePipeline = js.native
  
  var license: typingsSlinky.elasticElasticsearch.anon.Get = js.native
  
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Mget[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var migration: Deprecations = js.native
  
  var ml: CloseJob = js.native
  
  var monitoring: typingsSlinky.elasticElasticsearch.anon.Bulk = js.native
  
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: Msearch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: MsearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: MsearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Mtermvectors[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var nodes: HotThreads = js.native
  
  def ping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ping[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ping[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ping[TResponse, TContext](params: Ping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ping[TResponse, TContext](params: Ping, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ping[TResponse, TContext](params: Ping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ping[TResponse, TContext](params: Ping, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: PutScript[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: PutScript[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RankEval[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RankEval[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Reindex[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def reindexRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindexRethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindexRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindexRethrottle[TResponse, TContext](
    params: ReindexRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def reindex_rethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex_rethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex_rethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex_rethrottle[TResponse, TContext](params: ReindexRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex_rethrottle[TResponse, TContext](params: ReindexRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex_rethrottle[TResponse, TContext](params: ReindexRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex_rethrottle[TResponse, TContext](
    params: ReindexRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RenderSearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RenderSearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var rollup: DeleteJob = js.native
  
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ScriptsPainlessExecute[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ScriptsPainlessExecute[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Scroll[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: typingsSlinky.elasticElasticsearch.requestParamsMod.Search[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: typingsSlinky.elasticElasticsearch.requestParamsMod.Search[TRequestBody],
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: typingsSlinky.elasticElasticsearch.requestParamsMod.Search[TRequestBody],
    options: TransportRequestOptions
  ): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: typingsSlinky.elasticElasticsearch.requestParamsMod.Search[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def searchShards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchShards[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchShards[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchShards[TResponse, TContext](params: SearchShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchShards[TResponse, TContext](params: SearchShards, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchShards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchShards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def search_shards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_shards[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_shards[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_shards[TResponse, TContext](params: SearchShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_shards[TResponse, TContext](params: SearchShards, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_shards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_shards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var searchableSnapshots: ClearCache = js.native
  
  var searchable_snapshots: ClearCache = js.native
  
  var security: Authenticate = js.native
  
  var serializer: typingsSlinky.elasticElasticsearch.serializerMod.default = js.native
  
  var slm: Deletelifecycle = js.native
  
  var snapshot: CleanupRepository = js.native
  
  var sql: ClearCursor = js.native
  
  var ssl: Certificates = js.native
  
  var tasks: Cancel = js.native
  
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Termvectors[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var transform: DeleteTransform = js.native
  
  var transport: typingsSlinky.elasticElasticsearch.transportMod.default = js.native
  
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Update[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: UpdateByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQueryRethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQueryRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQueryRethrottle[TResponse, TContext](
    params: UpdateByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: UpdateByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_by_query_rethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query_rethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query_rethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query_rethrottle[TResponse, TContext](params: UpdateByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query_rethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query_rethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query_rethrottle[TResponse, TContext](
    params: UpdateByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  var watcher: AckWatch = js.native
  
  var xpack: typingsSlinky.elasticElasticsearch.anon.Info = js.native
}
