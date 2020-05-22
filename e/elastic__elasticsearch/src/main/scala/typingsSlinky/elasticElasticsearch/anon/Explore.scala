package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.GraphExplore
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explore extends js.Object {
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: GraphExplore[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: GraphExplore[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: GraphExplore[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: GraphExplore[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

