package typingsSlinky.elasticElasticsearch.mod

import typingsSlinky.elasticElasticsearch.anon.Body
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extend API
@js.native
trait ClientExtendsCallbackOptions extends js.Object {
  
  var ConfigurationError: typingsSlinky.elasticElasticsearch.errorsMod.ConfigurationError = js.native
  
  def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
  def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
  
  var result: Body = js.native
}
