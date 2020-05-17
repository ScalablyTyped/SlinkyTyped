package typingsSlinky.elasticElasticsearch.mod

import typingsSlinky.elasticElasticsearch.anon.None
import typingsSlinky.elasticElasticsearch.poolMod.ConnectionPoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
class ConnectionPool ()
  extends typingsSlinky.elasticElasticsearch.poolMod.ConnectionPool {
  def this(opts: ConnectionPoolOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch", "ConnectionPool")
@js.native
object ConnectionPool extends js.Object {
  var resurrectStrategies: None = js.native
}

