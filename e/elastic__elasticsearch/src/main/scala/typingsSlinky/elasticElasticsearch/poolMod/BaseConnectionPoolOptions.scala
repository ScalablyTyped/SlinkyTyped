package typingsSlinky.elasticElasticsearch.poolMod

import typingsSlinky.elasticElasticsearch.anon.TypeofConnection
import typingsSlinky.elasticElasticsearch.connectionMod.AgentOptions
import typingsSlinky.node.tlsMod.SecureContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConnectionPoolOptions extends js.Object {
  var Connection: TypeofConnection = js.native
  var agent: js.UndefOr[AgentOptions] = js.native
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
  var ssl: js.UndefOr[SecureContextOptions] = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
}

