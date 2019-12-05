package typingsSlinky.atElasticElasticsearch

import typingsSlinky.atElasticElasticsearch.apiRequestParamsMod.MigrationDeprecations
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typingsSlinky.atElasticElasticsearch.libTransportMod.ApiResponse
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Deprecations extends js.Object {
  @JSName("deprecations")
  var deprecations_Original: ApiMethod[MigrationDeprecations, _] = js.native
  // Promise API
  def deprecations(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deprecations(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deprecations(params: MigrationDeprecations, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

