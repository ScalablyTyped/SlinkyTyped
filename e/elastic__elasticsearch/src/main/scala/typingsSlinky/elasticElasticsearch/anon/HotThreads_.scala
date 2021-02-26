package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.NodesHotThreads
import typingsSlinky.elasticElasticsearch.requestParamsMod.NodesInfo
import typingsSlinky.elasticElasticsearch.requestParamsMod.NodesReloadSecureSettings
import typingsSlinky.elasticElasticsearch.requestParamsMod.NodesStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.NodesUsage
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotThreads_ extends StObject {
  
  def hotThreads[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hotThreads[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hotThreads[TResponse, TContext](params: NodesHotThreads): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hotThreads[TResponse, TContext](params: NodesHotThreads, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: NodesInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: NodesInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: NodesStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: NodesStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def usage[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: NodesUsage): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: NodesUsage, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
