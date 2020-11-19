package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.EnrichDeletePolicy
import typingsSlinky.elasticElasticsearch.requestParamsMod.EnrichExecutePolicy
import typingsSlinky.elasticElasticsearch.requestParamsMod.EnrichGetPolicy
import typingsSlinky.elasticElasticsearch.requestParamsMod.EnrichPutPolicy
import typingsSlinky.elasticElasticsearch.requestParamsMod.EnrichStats
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePolicy extends js.Object {
  
  def deletePolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePolicy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePolicy[TResponse, TContext](params: EnrichDeletePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePolicy[TResponse, TContext](params: EnrichDeletePolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePolicy[TResponse, TContext](params: EnrichDeletePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePolicy[TResponse, TContext](
    params: EnrichDeletePolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_policy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_policy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_policy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_policy[TResponse, TContext](params: EnrichDeletePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_policy[TResponse, TContext](params: EnrichDeletePolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_policy[TResponse, TContext](params: EnrichDeletePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_policy[TResponse, TContext](
    params: EnrichDeletePolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def executePolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executePolicy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executePolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executePolicy[TResponse, TContext](params: EnrichExecutePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executePolicy[TResponse, TContext](params: EnrichExecutePolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executePolicy[TResponse, TContext](params: EnrichExecutePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executePolicy[TResponse, TContext](
    params: EnrichExecutePolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def execute_policy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_policy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_policy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_policy[TResponse, TContext](params: EnrichExecutePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_policy[TResponse, TContext](params: EnrichExecutePolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_policy[TResponse, TContext](params: EnrichExecutePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_policy[TResponse, TContext](
    params: EnrichExecutePolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPolicy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPolicy[TResponse, TContext](params: EnrichGetPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPolicy[TResponse, TContext](params: EnrichGetPolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPolicy[TResponse, TContext](params: EnrichGetPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPolicy[TResponse, TContext](
    params: EnrichGetPolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_policy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_policy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_policy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_policy[TResponse, TContext](params: EnrichGetPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_policy[TResponse, TContext](params: EnrichGetPolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_policy[TResponse, TContext](params: EnrichGetPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_policy[TResponse, TContext](
    params: EnrichGetPolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: EnrichPutPolicy[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: EnrichPutPolicy[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: EnrichPutPolicy[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: EnrichPutPolicy[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: EnrichPutPolicy[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: EnrichPutPolicy[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: EnrichPutPolicy[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: EnrichPutPolicy[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: EnrichStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: EnrichStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: EnrichStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: EnrichStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
