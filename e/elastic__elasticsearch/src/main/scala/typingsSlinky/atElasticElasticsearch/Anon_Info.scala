package typingsSlinky.atElasticElasticsearch

import typingsSlinky.atElasticElasticsearch.apiRequestParamsMod.XpackInfo
import typingsSlinky.atElasticElasticsearch.apiRequestParamsMod.XpackUsage
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typingsSlinky.atElasticElasticsearch.libTransportMod.ApiResponse
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Info extends js.Object {
  @JSName("info")
  var info_Original: ApiMethod[XpackInfo, _] = js.native
  @JSName("usage")
  var usage_Original: ApiMethod[XpackUsage, _] = js.native
  // Promise API
  def info(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def info(callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: XpackInfo): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: XpackInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: XpackInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: XpackInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def usage(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def usage(callback: callbackFn[_]): TransportRequestCallback = js.native
  def usage(params: XpackUsage): js.Promise[ApiResponse[_, _]] = js.native
  def usage(params: XpackUsage, callback: callbackFn[_]): TransportRequestCallback = js.native
  def usage(params: XpackUsage, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def usage(params: XpackUsage, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

