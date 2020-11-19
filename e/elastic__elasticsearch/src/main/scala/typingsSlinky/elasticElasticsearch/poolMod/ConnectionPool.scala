package typingsSlinky.elasticElasticsearch.poolMod

import typingsSlinky.elasticElasticsearch.anon.None
import typingsSlinky.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@elastic/elasticsearch/lib/pool", "ConnectionPool")
@js.native
class ConnectionPool () extends BaseConnectionPool {
  def this(opts: ConnectionPoolOptions) = this()
  
  var _sniffEnabled: Boolean = js.native
  
  var dead: js.Array[String] = js.native
  
  var pingTimeout: Double = js.native
  
  /**
    * If enabled, tries to resurrect a connection with the given
    * resurrect strategy ('ping', 'optimistic', 'none').
    *
    * @param {object} { now, requestId, name }
    * @param {function} callback (isAlive, connection)
    */
  def resurrect(opts: resurrectOptions): Unit = js.native
  def resurrect(
    opts: resurrectOptions,
    callback: js.Function2[/* isAlive */ Boolean | Null, /* connection */ default | Null, Unit]
  ): Unit = js.native
  
  var resurrectStrategy: Double = js.native
  
  var resurrectTimeout: Double = js.native
  
  var resurrectTimeoutCutoff: Double = js.native
}
/* static members */
@JSImport("@elastic/elasticsearch/lib/pool", "ConnectionPool")
@js.native
object ConnectionPool extends js.Object {
  
  var resurrectStrategies: None = js.native
}
