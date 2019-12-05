package typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod

import typingsSlinky.atElasticElasticsearch.Anon_Body
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import typingsSlinky.atElasticElasticsearch.libTransportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend API
@js.native
trait ClientExtendsCallbackOptions extends js.Object {
  var ConfigurationError: typingsSlinky.atElasticElasticsearch.libErrorsMod.ConfigurationError = js.native
  var result: Anon_Body = js.native
  def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
  def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
}

