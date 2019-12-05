package typingsSlinky.atElasticElasticsearch

import typingsSlinky.atElasticElasticsearch.apiRequestParamsMod.MonitoringBulk
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typingsSlinky.atElasticElasticsearch.libTransportMod.ApiResponse
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bulk extends js.Object {
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

