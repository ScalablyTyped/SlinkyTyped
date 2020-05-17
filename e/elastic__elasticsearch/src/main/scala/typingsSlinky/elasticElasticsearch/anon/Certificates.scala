package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.ApiMethod
import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.SslCertificates
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificates extends js.Object {
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

