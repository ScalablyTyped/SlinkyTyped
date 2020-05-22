package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.AutoscalingGetAutoscalingDecision
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoscalingDecision extends js.Object {
  def getAutoscalingDecision[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](
    params: AutoscalingGetAutoscalingDecision,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_autoscaling_decision[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_decision[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_autoscaling_decision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_decision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_autoscaling_decision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_decision[TResponse, TContext](
    params: AutoscalingGetAutoscalingDecision,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

