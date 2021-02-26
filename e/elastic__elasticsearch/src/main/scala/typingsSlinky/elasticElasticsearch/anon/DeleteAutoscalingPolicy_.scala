package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.AutoscalingDeleteAutoscalingPolicy
import typingsSlinky.elasticElasticsearch.requestParamsMod.AutoscalingGetAutoscalingDecision
import typingsSlinky.elasticElasticsearch.requestParamsMod.AutoscalingGetAutoscalingPolicy
import typingsSlinky.elasticElasticsearch.requestParamsMod.AutoscalingPutAutoscalingPolicy
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
trait DeleteAutoscalingPolicy_ extends StObject {
  
  def deleteAutoscalingPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getAutoscalingDecision[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getAutoscalingPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
