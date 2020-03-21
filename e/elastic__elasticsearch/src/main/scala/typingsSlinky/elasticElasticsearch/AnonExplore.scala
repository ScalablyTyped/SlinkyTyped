package typingsSlinky.elasticElasticsearch

import typingsSlinky.elasticElasticsearch.mod.ApiMethod
import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.GraphExplore
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExplore extends js.Object {
  @JSName("explore")
  var explore_Original: ApiMethod[GraphExplore[_], _] = js.native
  // Promise API
  def explore(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explore(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explore(params: GraphExplore[_]): js.Promise[ApiResponse[_, _]] = js.native
  def explore(params: GraphExplore[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def explore(params: GraphExplore[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explore(params: GraphExplore[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

