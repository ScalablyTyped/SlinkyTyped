package typingsSlinky.atElasticElasticsearch

import typingsSlinky.atElasticElasticsearch.apiRequestParamsMod.GraphExplore
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typingsSlinky.atElasticElasticsearch.libTransportMod.ApiResponse
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Explore extends js.Object {
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

