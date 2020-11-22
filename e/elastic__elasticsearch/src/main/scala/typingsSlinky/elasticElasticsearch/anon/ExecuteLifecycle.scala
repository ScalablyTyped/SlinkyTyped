package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmDeleteLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmExecuteLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmExecuteRetention
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmGetLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmGetStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmGetStatus
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmPutLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmStart
import typingsSlinky.elasticElasticsearch.requestParamsMod.SlmStop
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteLifecycle extends js.Object {
  
  def deleteLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: SlmDeleteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: SlmDeleteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def executeLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeLifecycle[TResponse, TContext](params: SlmExecuteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeLifecycle[TResponse, TContext](params: SlmExecuteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def executeRetention[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeRetention[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeRetention[TResponse, TContext](params: SlmExecuteRetention): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeRetention[TResponse, TContext](params: SlmExecuteRetention, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: SlmGetLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: SlmGetLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStats[TResponse, TContext](params: SlmGetStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStats[TResponse, TContext](params: SlmGetStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: SlmGetStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: SlmGetStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SlmPutLifecycle[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SlmPutLifecycle[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def start[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: SlmStart): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: SlmStart, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stop[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: SlmStop): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: SlmStop, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
