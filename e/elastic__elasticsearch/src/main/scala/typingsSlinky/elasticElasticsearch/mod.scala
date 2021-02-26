package typingsSlinky.elasticElasticsearch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.elasticElasticsearch.anon.ALIVE
import typingsSlinky.elasticElasticsearch.anon.Ackwatch
import typingsSlinky.elasticElasticsearch.anon.Addblock
import typingsSlinky.elasticElasticsearch.anon.Allocation
import typingsSlinky.elasticElasticsearch.anon.Allocationexplain
import typingsSlinky.elasticElasticsearch.anon.Body
import typingsSlinky.elasticElasticsearch.anon.ChangePassword
import typingsSlinky.elasticElasticsearch.anon.Cleanuprepository
import typingsSlinky.elasticElasticsearch.anon.Clearcache
import typingsSlinky.elasticElasticsearch.anon.Clearcursor
import typingsSlinky.elasticElasticsearch.anon.Closejob
import typingsSlinky.elasticElasticsearch.anon.DATA_
import typingsSlinky.elasticElasticsearch.anon.DEFAULT
import typingsSlinky.elasticElasticsearch.anon.Data
import typingsSlinky.elasticElasticsearch.anon.Deleteautofollowpattern
import typingsSlinky.elasticElasticsearch.anon.Deleteautoscalingpolicy
import typingsSlinky.elasticElasticsearch.anon.Deletedanglingindex
import typingsSlinky.elasticElasticsearch.anon.Deletejob
import typingsSlinky.elasticElasticsearch.anon.Deletelifecycle
import typingsSlinky.elasticElasticsearch.anon.Deletepipeline
import typingsSlinky.elasticElasticsearch.anon.Deletepolicy
import typingsSlinky.elasticElasticsearch.anon.Deletetransform
import typingsSlinky.elasticElasticsearch.anon.ExecuteRetention
import typingsSlinky.elasticElasticsearch.anon.Force
import typingsSlinky.elasticElasticsearch.anon.GetTrialStatus
import typingsSlinky.elasticElasticsearch.anon.Hotthreads
import typingsSlinky.elasticElasticsearch.anon.Id
import typingsSlinky.elasticElasticsearch.anon.List
import typingsSlinky.elasticElasticsearch.anon.Search
import typingsSlinky.elasticElasticsearch.anon.Submit
import typingsSlinky.elasticElasticsearch.anon.TypeofConnection
import typingsSlinky.elasticElasticsearch.anon.TypeofConnectionPool
import typingsSlinky.elasticElasticsearch.anon.TypeofTransport
import typingsSlinky.elasticElasticsearch.anon.Usage
import typingsSlinky.elasticElasticsearch.anon.`0`
import typingsSlinky.elasticElasticsearch.anon.`1`
import typingsSlinky.elasticElasticsearch.anon.`2`
import typingsSlinky.elasticElasticsearch.anon.`3`
import typingsSlinky.elasticElasticsearch.connectionMod.AgentOptions
import typingsSlinky.elasticElasticsearch.connectionMod.ConnectionOptions
import typingsSlinky.elasticElasticsearch.connectionMod.agentFn
import typingsSlinky.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ping
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.request
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.response
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.resurrect
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.sniff
import typingsSlinky.elasticElasticsearch.helpersMod.default
import typingsSlinky.elasticElasticsearch.poolMod.ApiKeyAuth
import typingsSlinky.elasticElasticsearch.poolMod.BaseConnectionPoolOptions
import typingsSlinky.elasticElasticsearch.poolMod.BasicAuth
import typingsSlinky.elasticElasticsearch.poolMod.ConnectionPoolOptions
import typingsSlinky.elasticElasticsearch.poolMod.ResurrectEvent
import typingsSlinky.elasticElasticsearch.requestParamsMod.Bulk
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClearScroll
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClosePointInTime
import typingsSlinky.elasticElasticsearch.requestParamsMod.Count
import typingsSlinky.elasticElasticsearch.requestParamsMod.Create
import typingsSlinky.elasticElasticsearch.requestParamsMod.Delete
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
import typingsSlinky.elasticElasticsearch.requestParamsMod.OpenPointInTime
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
import typingsSlinky.elasticElasticsearch.transportMod.ApiError
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.Context
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.RequestEvent
import typingsSlinky.elasticElasticsearch.transportMod.RequestNDBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestParams
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.elasticElasticsearch.transportMod.generateRequestIdFn
import typingsSlinky.elasticElasticsearch.transportMod.nodeFilterFn
import typingsSlinky.elasticElasticsearch.transportMod.nodeSelectorFn
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@elastic/elasticsearch", "BaseConnectionPool")
  @js.native
  class BaseConnectionPool ()
    extends typingsSlinky.elasticElasticsearch.poolMod.BaseConnectionPool {
    def this(opts: BaseConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "Client")
  @js.native
  class Client () extends StObject {
    def this(opts: ClientOptions) = this()
    
    var asyncSearch: Submit = js.native
    
    /* GENERATED */
    var async_search: Submit = js.native
    
    var autoscaling: Deleteautoscalingpolicy = js.native
    
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
    
    var cat: Allocation = js.native
    
    var ccr: Deleteautofollowpattern = js.native
    
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
    
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
      params: ClosePointInTime[TRequestBody],
      options: TransportRequestOptions,
      callback: callbackFn[TResponse, TContext]
    ): TransportRequestCallback = js.native
    
    @JSName("close")
    def close_Promise(): js.Promise[Unit] = js.native
    @JSName("close")
    def close_Unit(callback: js.Function): Unit = js.native
    
    def close_point_in_time[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def close_point_in_time[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def close_point_in_time[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def close_point_in_time[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def close_point_in_time[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def close_point_in_time[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def close_point_in_time[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
      params: ClosePointInTime[TRequestBody],
      options: TransportRequestOptions,
      callback: callbackFn[TResponse, TContext]
    ): TransportRequestCallback = js.native
    
    var cluster: Allocationexplain = js.native
    
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
    
    var danglingIndices: Deletedanglingindex = js.native
    
    var dangling_indices: Deletedanglingindex = js.native
    
    def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: Delete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: Delete, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def delete[TResponse, TContext](params: Delete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: Delete, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    
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
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    var enrich: Deletepolicy = js.native
    
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
    
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
      params: FieldCaps[TRequestBody],
      options: TransportRequestOptions,
      callback: callbackFn[TResponse, TContext]
    ): TransportRequestCallback = js.native
    
    def field_caps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def field_caps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def field_caps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def field_caps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def field_caps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def field_caps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def field_caps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
      params: FieldCaps[TRequestBody],
      options: TransportRequestOptions,
      callback: callbackFn[TResponse, TContext]
    ): TransportRequestCallback = js.native
    
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
    
    var graph: `0` = js.native
    
    var helpers: default = js.native
    
    var ilm: Deletelifecycle = js.native
    
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
    
    var indices: Addblock = js.native
    
    def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: Info): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: Info, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def info[TResponse, TContext](params: Info, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: Info, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    
    var ingest: Deletepipeline = js.native
    
    var license: GetTrialStatus = js.native
    
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
    
    var migration: `1` = js.native
    
    var ml: Closejob = js.native
    
    var monitoring: `2` = js.native
    
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
    
    var nodes: Hotthreads = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    @JSName("on")
    def on_request(
      event: request,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_response(
      event: response,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_resurrect(event: resurrect, listener: js.Function2[/* err */ Null, /* meta */ ResurrectEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_sniff(
      event: sniff,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    
    @JSName("once")
    def once_request(
      event: request,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_response(
      event: response,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_resurrect(event: resurrect, listener: js.Function2[/* err */ Null, /* meta */ ResurrectEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_sniff(
      event: sniff,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    
    def openPointInTime[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def openPointInTime[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](params: OpenPointInTime): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](params: OpenPointInTime, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def openPointInTime[TResponse, TContext](params: OpenPointInTime, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](
      params: OpenPointInTime,
      options: TransportRequestOptions,
      callback: callbackFn[TResponse, TContext]
    ): TransportRequestCallback = js.native
    
    def open_point_in_time[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def open_point_in_time[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def open_point_in_time[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def open_point_in_time[TResponse, TContext](params: OpenPointInTime): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def open_point_in_time[TResponse, TContext](params: OpenPointInTime, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
    def open_point_in_time[TResponse, TContext](params: OpenPointInTime, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def open_point_in_time[TResponse, TContext](
      params: OpenPointInTime,
      options: TransportRequestOptions,
      callback: callbackFn[TResponse, TContext]
    ): TransportRequestCallback = js.native
    
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
    
    var rollup: Deletejob = js.native
    
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
    
    var searchableSnapshots: Clearcache = js.native
    
    var searchable_snapshots: Clearcache = js.native
    
    var security: ChangePassword = js.native
    
    var serializer: typingsSlinky.elasticElasticsearch.serializerMod.default = js.native
    
    var slm: ExecuteRetention = js.native
    
    var snapshot: Cleanuprepository = js.native
    
    var sql: Clearcursor = js.native
    
    var ssl: `3` = js.native
    
    var tasks: List = js.native
    
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
    
    var transform: Deletetransform = js.native
    
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
    
    var watcher: Ackwatch = js.native
    
    var xpack: Usage = js.native
  }
  
  @JSImport("@elastic/elasticsearch", "CloudConnectionPool")
  @js.native
  class CloudConnectionPool ()
    extends typingsSlinky.elasticElasticsearch.poolMod.CloudConnectionPool {
    def this(opts: BaseConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/elasticsearch", "Connection")
  @js.native
  class Connection ()
    extends typingsSlinky.elasticElasticsearch.connectionMod.default {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object Connection {
    
    @JSImport("@elastic/elasticsearch", "Connection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch", "Connection.roles")
    @js.native
    def roles: DATA_ = js.native
    @scala.inline
    def roles_=(x: DATA_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roles")(x.asInstanceOf[js.Any])
    
    @JSImport("@elastic/elasticsearch", "Connection.statuses")
    @js.native
    def statuses: ALIVE = js.native
    @scala.inline
    def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/elasticsearch", "ConnectionPool")
  @js.native
  class ConnectionPool ()
    extends typingsSlinky.elasticElasticsearch.poolMod.ConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  object ConnectionPool {
    
    /* static member */
    object resurrectStrategies {
      
      @JSImport("@elastic/elasticsearch", "ConnectionPool.resurrectStrategies")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@elastic/elasticsearch", "ConnectionPool.resurrectStrategies.none")
      @js.native
      def none: Double = js.native
      @scala.inline
      def none_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
      
      @JSImport("@elastic/elasticsearch", "ConnectionPool.resurrectStrategies.optimistic")
      @js.native
      def optimistic: Double = js.native
      @scala.inline
      def optimistic_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optimistic")(x.asInstanceOf[js.Any])
      
      @JSImport("@elastic/elasticsearch", "ConnectionPool.resurrectStrategies.ping")
      @js.native
      def ping: Double = js.native
      @scala.inline
      def ping_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ping")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@elastic/elasticsearch", "Serializer")
  @js.native
  class Serializer ()
    extends typingsSlinky.elasticElasticsearch.serializerMod.default
  
  @JSImport("@elastic/elasticsearch", "Transport")
  @js.native
  class Transport protected ()
    extends typingsSlinky.elasticElasticsearch.transportMod.default {
    def this(opts: TransportOptions) = this()
  }
  /* static members */
  object Transport {
    
    @JSImport("@elastic/elasticsearch", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch", "Transport.sniffReasons")
    @js.native
    def sniffReasons: DEFAULT = js.native
    @scala.inline
    def sniffReasons_=(x: DEFAULT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sniffReasons")(x.asInstanceOf[js.Any])
  }
  
  object errors {
    
    @JSImport("@elastic/elasticsearch", "errors.ConfigurationError")
    @js.native
    class ConfigurationError protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.ConfigurationError {
      def this(message: String) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.ConnectionError")
    @js.native
    class ConnectionError[TResponse, TContext] protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.ConnectionError[TResponse, TContext] {
      def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.DeserializationError")
    @js.native
    class DeserializationError protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.DeserializationError {
      def this(message: String, data: String) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.ElasticsearchClientError")
    @js.native
    class ElasticsearchClientError ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.ElasticsearchClientError
    
    @JSImport("@elastic/elasticsearch", "errors.NoLivingConnectionsError")
    @js.native
    class NoLivingConnectionsError[TResponse, TContext] protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.NoLivingConnectionsError[TResponse, TContext] {
      def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.RequestAbortedError")
    @js.native
    class RequestAbortedError[TResponse, TContext] protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.RequestAbortedError[TResponse, TContext] {
      def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.ResponseError")
    @js.native
    class ResponseError[TResponse, TContext] protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.ResponseError[TResponse, TContext] {
      def this(meta: ApiResponse[Record[String, _], Context]) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.SerializationError")
    @js.native
    class SerializationError protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.SerializationError {
      def this(message: String, data: js.Any) = this()
    }
    
    @JSImport("@elastic/elasticsearch", "errors.TimeoutError")
    @js.native
    class TimeoutError[TResponse, TContext] protected ()
      extends typingsSlinky.elasticElasticsearch.errorsMod.TimeoutError[TResponse, TContext] {
      def this(message: String, meta: ApiResponse[Record[String, _], Context]) = this()
    }
  }
  
  object events {
    
    @JSImport("@elastic/elasticsearch", "events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch", "events.REQUEST")
    @js.native
    def REQUEST: String = js.native
    @scala.inline
    def REQUEST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(x.asInstanceOf[js.Any])
    
    @JSImport("@elastic/elasticsearch", "events.RESPONSE")
    @js.native
    def RESPONSE: String = js.native
    @scala.inline
    def RESPONSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPONSE")(x.asInstanceOf[js.Any])
    
    @JSImport("@elastic/elasticsearch", "events.RESURRECT")
    @js.native
    def RESURRECT: String = js.native
    @scala.inline
    def RESURRECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESURRECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@elastic/elasticsearch", "events.SNIFF")
    @js.native
    def SNIFF: String = js.native
    @scala.inline
    def SNIFF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNIFF")(x.asInstanceOf[js.Any])
  }
  
  // Extend API
  @js.native
  trait ClientExtendsCallbackOptions extends StObject {
    
    var ConfigurationError: typingsSlinky.elasticElasticsearch.errorsMod.ConfigurationError = js.native
    
    def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
    def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
    
    var result: Body = js.native
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    var Connection: js.UndefOr[TypeofConnection] = js.native
    
    var ConnectionPool: js.UndefOr[
        (Instantiable1[
          /* opts */ js.UndefOr[ConnectionPoolOptions], 
          typingsSlinky.elasticElasticsearch.poolMod.ConnectionPool
        ]) with TypeofConnectionPool
      ] = js.native
    
    var Serializer: js.UndefOr[Instantiable0[typingsSlinky.elasticElasticsearch.serializerMod.default]] = js.native
    
    var Transport: js.UndefOr[TypeofTransport] = js.native
    
    var agent: js.UndefOr[AgentOptions | agentFn | `false`] = js.native
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
    
    var cloud: js.UndefOr[Id] = js.native
    
    var compression: js.UndefOr[gzip] = js.native
    
    var context: js.UndefOr[Context] = js.native
    
    var generateRequestId: js.UndefOr[generateRequestIdFn] = js.native
    
    var headers: js.UndefOr[Record[String, _]] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String | js.Symbol] = js.native
    
    var node: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.native
    
    var nodeFilter: js.UndefOr[nodeFilterFn] = js.native
    
    var nodeSelector: js.UndefOr[nodeSelectorFn | String] = js.native
    
    var nodes: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.native
    
    var opaqueIdPrefix: js.UndefOr[String] = js.native
    
    var pingTimeout: js.UndefOr[Double] = js.native
    
    var proxy: js.UndefOr[String | URL_] = js.native
    
    var requestTimeout: js.UndefOr[Double] = js.native
    
    var resurrectStrategy: js.UndefOr[ping | optimistic | none] = js.native
    
    var sniffEndpoint: js.UndefOr[String] = js.native
    
    var sniffInterval: js.UndefOr[Double | Boolean] = js.native
    
    var sniffOnConnectionFault: js.UndefOr[Boolean] = js.native
    
    var sniffOnStart: js.UndefOr[Boolean] = js.native
    
    var ssl: js.UndefOr[typingsSlinky.node.tlsMod.ConnectionOptions] = js.native
    
    var suggestCompression: js.UndefOr[Boolean] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: AgentOptions | agentFn | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentFunction1(value: /* opts */ ConnectionOptions => js.Any): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: BasicAuth | ApiKeyAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setCloud(value: Id): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudUndefined: Self = StObject.set(x, "cloud", js.undefined)
      
      @scala.inline
      def setCompression(value: gzip): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setConnection(value: TypeofConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPool(
        value: (Instantiable1[
              /* opts */ js.UndefOr[ConnectionPoolOptions], 
              typingsSlinky.elasticElasticsearch.poolMod.ConnectionPool
            ]) with TypeofConnectionPool
      ): Self = StObject.set(x, "ConnectionPool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPoolUndefined: Self = StObject.set(x, "ConnectionPool", js.undefined)
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextNull: Self = StObject.set(x, "context", null)
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setGenerateRequestId(value: (/* params */ TransportRequestParams, /* options */ TransportRequestOptions) => js.Any): Self = StObject.set(x, "generateRequestId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateRequestIdUndefined: Self = StObject.set(x, "generateRequestId", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, _]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNode(value: String | (js.Array[NodeOptions | String]) | NodeOptions): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeFilter(value: /* connection */ typingsSlinky.elasticElasticsearch.connectionMod.default => Boolean): Self = StObject.set(x, "nodeFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeFilterUndefined: Self = StObject.set(x, "nodeFilter", js.undefined)
      
      @scala.inline
      def setNodeSelector(value: nodeSelectorFn | String): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeSelectorFunction1(
        value: /* connections */ js.Array[typingsSlinky.elasticElasticsearch.connectionMod.default] => typingsSlinky.elasticElasticsearch.connectionMod.default
      ): Self = StObject.set(x, "nodeSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setNodeVarargs(value: (NodeOptions | String)*): Self = StObject.set(x, "node", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: String | (js.Array[NodeOptions | String]) | NodeOptions): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      @scala.inline
      def setNodesVarargs(value: (NodeOptions | String)*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setOpaqueIdPrefix(value: String): Self = StObject.set(x, "opaqueIdPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpaqueIdPrefixUndefined: Self = StObject.set(x, "opaqueIdPrefix", js.undefined)
      
      @scala.inline
      def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      @scala.inline
      def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      @scala.inline
      def setResurrectStrategy(value: ping | optimistic | none): Self = StObject.set(x, "resurrectStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResurrectStrategyUndefined: Self = StObject.set(x, "resurrectStrategy", js.undefined)
      
      @scala.inline
      def setSerializer(value: Instantiable0[typingsSlinky.elasticElasticsearch.serializerMod.default]): Self = StObject.set(x, "Serializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializerUndefined: Self = StObject.set(x, "Serializer", js.undefined)
      
      @scala.inline
      def setSniffEndpoint(value: String): Self = StObject.set(x, "sniffEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSniffEndpointUndefined: Self = StObject.set(x, "sniffEndpoint", js.undefined)
      
      @scala.inline
      def setSniffInterval(value: Double | Boolean): Self = StObject.set(x, "sniffInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSniffIntervalUndefined: Self = StObject.set(x, "sniffInterval", js.undefined)
      
      @scala.inline
      def setSniffOnConnectionFault(value: Boolean): Self = StObject.set(x, "sniffOnConnectionFault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSniffOnConnectionFaultUndefined: Self = StObject.set(x, "sniffOnConnectionFault", js.undefined)
      
      @scala.inline
      def setSniffOnStart(value: Boolean): Self = StObject.set(x, "sniffOnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSniffOnStartUndefined: Self = StObject.set(x, "sniffOnStart", js.undefined)
      
      @scala.inline
      def setSsl(value: typingsSlinky.node.tlsMod.ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setSuggestCompression(value: Boolean): Self = StObject.set(x, "suggestCompression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestCompressionUndefined: Self = StObject.set(x, "suggestCompression", js.undefined)
      
      @scala.inline
      def setTransport(value: TypeofTransport): Self = StObject.set(x, "Transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "Transport", js.undefined)
    }
  }
  
  // /Extend API
  @js.native
  trait NodeOptions extends StObject {
    
    var agent: js.UndefOr[AgentOptions] = js.native
    
    var headers: js.UndefOr[Record[String, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var roles: js.UndefOr[Data] = js.native
    
    var ssl: js.UndefOr[typingsSlinky.node.tlsMod.ConnectionOptions] = js.native
    
    var url: URL_ = js.native
  }
  object NodeOptions {
    
    @scala.inline
    def apply(url: URL_): NodeOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeOptions]
    }
    
    @scala.inline
    implicit class NodeOptionsMutableBuilder[Self <: NodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: AgentOptions): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, _]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRoles(value: Data): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      @scala.inline
      def setSsl(value: typingsSlinky.node.tlsMod.ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type callbackFn[TResponse, TContext] = js.Function2[/* err */ ApiError, /* result */ ApiResponse[TResponse, TContext], Unit]
  
  type extendsCallback = js.Function1[/* options */ ClientExtendsCallbackOptions, js.Any]
}
