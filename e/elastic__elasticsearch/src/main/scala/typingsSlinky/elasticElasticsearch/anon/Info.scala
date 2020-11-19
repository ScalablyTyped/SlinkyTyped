package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.XpackInfo
import typingsSlinky.elasticElasticsearch.requestParamsMod.XpackUsage
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends js.Object {
  
  def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: XpackInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: XpackInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: XpackInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: XpackInfo, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def usage[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def usage[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: XpackUsage): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: XpackUsage, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def usage[TResponse, TContext](params: XpackUsage, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: XpackUsage, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
