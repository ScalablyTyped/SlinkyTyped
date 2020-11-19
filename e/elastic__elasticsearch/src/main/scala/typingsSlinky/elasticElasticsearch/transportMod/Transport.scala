package typingsSlinky.elasticElasticsearch.transportMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typingsSlinky.elasticElasticsearch.poolMod.CloudConnectionPool
import typingsSlinky.elasticElasticsearch.poolMod.ConnectionPool
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends js.Object {
  
  var _isSniffing: Boolean = js.native
  
  var _nextSniff: Double = js.native
  
  var _sniffEnabled: Boolean = js.native
  
  var compression: gzip | `false` = js.native
  
  var connectionPool: ConnectionPool | CloudConnectionPool = js.native
  
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  
  def getConnection(opts: TransportGetConnectionOptions): typingsSlinky.elasticElasticsearch.connectionMod.default | Null = js.native
  
  var maxRetries: Double = js.native
  
  var opaqueIdPrefix: String | Null = js.native
  
  def request(params: TransportRequestParams): js.Promise[ApiResponse[Record[String, _], _]] = js.native
  def request(
    params: TransportRequestParams,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ApiError, /* result */ ApiResponse[Record[String, _], _], Unit]
  ): TransportRequestCallback = js.native
  def request(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[ApiResponse[Record[String, _], _]] = js.native
  def request(
    params: TransportRequestParams,
    options: TransportRequestOptions,
    callback: js.Function2[/* err */ ApiError, /* result */ ApiResponse[Record[String, _], _], Unit]
  ): TransportRequestCallback = js.native
  
  var requestTimeout: Double = js.native
  
  @JSName("request")
  def request_TransportRequestCallback(params: TransportRequestParams): TransportRequestCallback = js.native
  @JSName("request")
  def request_TransportRequestCallback(params: TransportRequestParams, options: TransportRequestOptions): TransportRequestCallback = js.native
  
  var serializer: typingsSlinky.elasticElasticsearch.serializerMod.default = js.native
  
  def sniff(): Unit = js.native
  def sniff(opts: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def sniff(opts: TransportSniffOptions): Unit = js.native
  def sniff(opts: TransportSniffOptions, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  var sniffEndpoint: String = js.native
  
  var sniffInterval: Double = js.native
  
  var sniffOnConnectionFault: Boolean = js.native
  
  var suggestCompression: Boolean = js.native
}
