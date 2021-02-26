package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherAckWatch
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherActivateWatch
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherDeactivateWatch
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherDeleteWatch
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherExecuteWatch
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherGetWatch
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherPutWatch
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherStart
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.WatcherStop
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
trait AckWatch_ extends StObject {
  
  def ackWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ackWatch[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ackWatch[TResponse, TContext](params: WatcherAckWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ackWatch[TResponse, TContext](params: WatcherAckWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def activateWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activateWatch[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activateWatch[TResponse, TContext](params: WatcherActivateWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activateWatch[TResponse, TContext](params: WatcherActivateWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deactivateWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivateWatch[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivateWatch[TResponse, TContext](params: WatcherDeactivateWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivateWatch[TResponse, TContext](params: WatcherDeactivateWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteWatch[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteWatch[TResponse, TContext](params: WatcherDeleteWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteWatch[TResponse, TContext](params: WatcherDeleteWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getWatch[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getWatch[TResponse, TContext](params: WatcherGetWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getWatch[TResponse, TContext](params: WatcherGetWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def start[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: WatcherStart): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: WatcherStart, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: WatcherStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: WatcherStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stop[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: WatcherStop): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: WatcherStop, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
