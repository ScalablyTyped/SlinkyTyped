package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.SqlClearCursor
import typingsSlinky.elasticElasticsearch.requestParamsMod.SqlQuery
import typingsSlinky.elasticElasticsearch.requestParamsMod.SqlTranslate
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
trait Clearcursor extends js.Object {
  
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlClearCursor[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlClearCursor[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlClearCursor[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SqlClearCursor[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def clear_cursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlClearCursor[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlClearCursor[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlClearCursor[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cursor[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SqlClearCursor[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SqlQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlTranslate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlTranslate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SqlTranslate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SqlTranslate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
