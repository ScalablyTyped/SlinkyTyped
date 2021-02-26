package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmDeleteLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmExplainLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmGetLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmGetStatus
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmMoveToStep
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmPutLifecycle
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmRemovePolicy
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmRetry
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmStart
import typingsSlinky.elasticElasticsearch.requestParamsMod.IlmStop
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
trait DeleteLifecycle_ extends StObject {
  
  def deleteLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: IlmDeleteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: IlmDeleteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def explainLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainLifecycle[TResponse, TContext](params: IlmExplainLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainLifecycle[TResponse, TContext](params: IlmExplainLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: IlmGetLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: IlmGetLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: IlmGetStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: IlmGetStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def removePolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def removePolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def removePolicy[TResponse, TContext](params: IlmRemovePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def removePolicy[TResponse, TContext](params: IlmRemovePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def retry[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def retry[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def retry[TResponse, TContext](params: IlmRetry): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def retry[TResponse, TContext](params: IlmRetry, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def start[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: IlmStart): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: IlmStart, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stop[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: IlmStop): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: IlmStop, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
