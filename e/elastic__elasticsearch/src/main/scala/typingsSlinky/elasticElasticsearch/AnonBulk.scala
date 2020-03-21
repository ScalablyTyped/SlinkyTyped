package typingsSlinky.elasticElasticsearch

import typingsSlinky.elasticElasticsearch.mod.ApiMethod
import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.MonitoringBulk
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBulk extends js.Object {
  @JSName("bulk")
  var bulk_Original: ApiMethod[MonitoringBulk[_], _] = js.native
  // Promise API
  def bulk(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def bulk(callback: callbackFn[_]): TransportRequestCallback = js.native
  def bulk(params: MonitoringBulk[_]): js.Promise[ApiResponse[_, _]] = js.native
  def bulk(params: MonitoringBulk[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def bulk(params: MonitoringBulk[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def bulk(params: MonitoringBulk[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

