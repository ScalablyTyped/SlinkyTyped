package typingsSlinky.atElasticElasticsearch

import typingsSlinky.atElasticElasticsearch.apiRequestParamsMod.SslCertificates
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typingsSlinky.atElasticElasticsearch.libTransportMod.ApiResponse
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Certificates extends js.Object {
  @JSName("certificates")
  var certificates_Original: ApiMethod[SslCertificates, _] = js.native
  // Promise API
  def certificates(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def certificates(callback: callbackFn[_]): TransportRequestCallback = js.native
  def certificates(params: SslCertificates): js.Promise[ApiResponse[_, _]] = js.native
  def certificates(params: SslCertificates, callback: callbackFn[_]): TransportRequestCallback = js.native
  def certificates(params: SslCertificates, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def certificates(params: SslCertificates, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

