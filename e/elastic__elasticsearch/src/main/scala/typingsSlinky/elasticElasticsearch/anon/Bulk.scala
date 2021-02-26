package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.MonitoringBulk
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestNDBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bulk extends StObject {
  
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MonitoringBulk[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MonitoringBulk[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
