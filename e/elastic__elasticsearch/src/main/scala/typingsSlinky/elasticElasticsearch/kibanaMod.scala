package typingsSlinky.elasticElasticsearch

import typingsSlinky.elasticElasticsearch.anon.AckWatch_
import typingsSlinky.elasticElasticsearch.anon.AddBlock_
import typingsSlinky.elasticElasticsearch.anon.Aliases
import typingsSlinky.elasticElasticsearch.anon.AllocationExplain_
import typingsSlinky.elasticElasticsearch.anon.Authenticate
import typingsSlinky.elasticElasticsearch.anon.Body
import typingsSlinky.elasticElasticsearch.anon.Cancel
import typingsSlinky.elasticElasticsearch.anon.Certificates
import typingsSlinky.elasticElasticsearch.anon.CleanupRepository_
import typingsSlinky.elasticElasticsearch.anon.ClearCache_
import typingsSlinky.elasticElasticsearch.anon.ClearCursor_
import typingsSlinky.elasticElasticsearch.anon.CloseJob_
import typingsSlinky.elasticElasticsearch.anon.Delete
import typingsSlinky.elasticElasticsearch.anon.DeleteAutoFollowPattern_
import typingsSlinky.elasticElasticsearch.anon.DeleteAutoscalingPolicy_
import typingsSlinky.elasticElasticsearch.anon.DeleteDanglingIndex_
import typingsSlinky.elasticElasticsearch.anon.DeleteJob_
import typingsSlinky.elasticElasticsearch.anon.DeleteLifecycle_
import typingsSlinky.elasticElasticsearch.anon.DeletePipeline_
import typingsSlinky.elasticElasticsearch.anon.DeletePolicy_
import typingsSlinky.elasticElasticsearch.anon.DeleteTransform_
import typingsSlinky.elasticElasticsearch.anon.Deprecations
import typingsSlinky.elasticElasticsearch.anon.ExecuteLifecycle
import typingsSlinky.elasticElasticsearch.anon.Explore
import typingsSlinky.elasticElasticsearch.anon.Force
import typingsSlinky.elasticElasticsearch.anon.Get
import typingsSlinky.elasticElasticsearch.anon.GetBasicStatus
import typingsSlinky.elasticElasticsearch.anon.HotThreads_
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.request
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.response
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.resurrect
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.sniff
import typingsSlinky.elasticElasticsearch.helpersMod.default
import typingsSlinky.elasticElasticsearch.mod.ClientOptions
import typingsSlinky.elasticElasticsearch.mod.ConnectionPool
import typingsSlinky.elasticElasticsearch.mod.Serializer
import typingsSlinky.elasticElasticsearch.mod.Transport
import typingsSlinky.elasticElasticsearch.poolMod.ResurrectEvent
import typingsSlinky.elasticElasticsearch.requestParamsMod.Bulk
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClearScroll
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClosePointInTime
import typingsSlinky.elasticElasticsearch.requestParamsMod.Count
import typingsSlinky.elasticElasticsearch.requestParamsMod.Create
import typingsSlinky.elasticElasticsearch.requestParamsMod.DeleteByQuery
import typingsSlinky.elasticElasticsearch.requestParamsMod.DeleteByQueryRethrottle
import typingsSlinky.elasticElasticsearch.requestParamsMod.DeleteScript
import typingsSlinky.elasticElasticsearch.requestParamsMod.Exists
import typingsSlinky.elasticElasticsearch.requestParamsMod.ExistsSource
import typingsSlinky.elasticElasticsearch.requestParamsMod.Explain
import typingsSlinky.elasticElasticsearch.requestParamsMod.FieldCaps
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
import typingsSlinky.elasticElasticsearch.requestParamsMod.Search
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
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestParams
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@elastic/elasticsearch/api/kibana", JSImport.Namespace)
@js.native
object kibanaMod extends js.Object {
  
  // Extend API
  @js.native
  trait ClientExtendsCallbackOptions extends js.Object {
    
    var ConfigurationError: typingsSlinky.elasticElasticsearch.mod.errors.ConfigurationError = js.native
    
    def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
    def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
    
    var result: Body = js.native
  }
  
  // /Extend API
  @js.native
  trait KibanaClient extends js.Object {
    
    /* GENERATED */
    var asyncSearch: Delete = js.native
    
    var autoscaling: DeleteAutoscalingPolicy_ = js.native
    
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Bulk[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Bulk[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var cat: Aliases = js.native
    
    var ccr: DeleteAutoFollowPattern_ = js.native
    
    def child(): KibanaClient = js.native
    def child(opts: ClientOptions): KibanaClient = js.native
    
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var cluster: AllocationExplain_ = js.native
    
    var connectionPool: ConnectionPool = js.native
    
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var danglingIndices: DeleteDanglingIndex_ = js.native
    
    def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: typingsSlinky.elasticElasticsearch.requestParamsMod.Delete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](
      params: typingsSlinky.elasticElasticsearch.requestParamsMod.Delete,
      options: TransportRequestOptions
    ): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def deleteByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQueryRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def deleteScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteScript[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteScript[TResponse, TContext](params: DeleteScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteScript[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    var enrich: DeletePolicy_ = js.native
    
    var eql: Get = js.native
    
    def exists[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def exists[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def exists[TResponse, TContext](params: Exists): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def exists[TResponse, TContext](params: Exists, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def existsSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def existsSource[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def existsSource[TResponse, TContext](params: ExistsSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def existsSource[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def extend(method: String, fn: extendsCallback): Unit = js.native
    def extend(method: String, opts: Force, fn: extendsCallback): Unit = js.native
    
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def get[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def get[TResponse, TContext](params: typingsSlinky.elasticElasticsearch.requestParamsMod.Get): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def get[TResponse, TContext](params: typingsSlinky.elasticElasticsearch.requestParamsMod.Get, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScript[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScript[TResponse, TContext](params: GetScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScript[TResponse, TContext](params: GetScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getScriptContext[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptContext[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptContext[TResponse, TContext](params: GetScriptContext): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptContext[TResponse, TContext](params: GetScriptContext, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getScriptLanguages[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptLanguages[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getSource[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getSource[TResponse, TContext](params: GetSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getSource[TResponse, TContext](params: GetSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var graph: Explore = js.native
    
    var helpers: default = js.native
    
    var ilm: DeleteLifecycle_ = js.native
    
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var indices: AddBlock_ = js.native
    
    def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: Info): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: Info, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var ingest: DeletePipeline_ = js.native
    
    var license: GetBasicStatus = js.native
    
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var migration: Deprecations = js.native
    
    var ml: CloseJob_ = js.native
    
    var monitoring: typingsSlinky.elasticElasticsearch.anon.Bulk = js.native
    
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var nodes: HotThreads_ = js.native
    
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
    def openPointInTime[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](params: OpenPointInTime): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](params: OpenPointInTime, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def ping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def ping[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def ping[TResponse, TContext](params: Ping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def ping[TResponse, TContext](params: Ping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def reindexRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindexRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var rollup: DeleteJob_ = js.native
    
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def searchShards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchShards[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchShards[TResponse, TContext](params: SearchShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchShards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var searchableSnapshots: ClearCache_ = js.native
    
    var security: Authenticate = js.native
    
    var serializer: Serializer = js.native
    
    var slm: ExecuteLifecycle = js.native
    
    var snapshot: CleanupRepository_ = js.native
    
    var sql: ClearCursor_ = js.native
    
    var ssl: Certificates = js.native
    
    var tasks: Cancel = js.native
    
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var transform: DeleteTransform_ = js.native
    
    var transport: Transport = js.native
    
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def updateByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQueryRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var watcher: AckWatch_ = js.native
    
    var xpack: typingsSlinky.elasticElasticsearch.anon.Info = js.native
  }
  
  type extendsCallback = js.Function1[/* options */ ClientExtendsCallbackOptions, js.Any]
}
