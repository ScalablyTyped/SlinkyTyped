package typingsSlinky.elasticElasticsearch.poolMod

import typingsSlinky.elasticElasticsearch.anon.Instantiable
import typingsSlinky.elasticElasticsearch.anon.Url
import typingsSlinky.elasticElasticsearch.connectionMod.AgentOptions
import typingsSlinky.elasticElasticsearch.connectionMod.default
import typingsSlinky.node.tlsMod.SecureContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@elastic/elasticsearch/lib/pool", "BaseConnectionPool")
@js.native
class BaseConnectionPool () extends js.Object {
  def this(opts: BaseConnectionPoolOptions) = this()
  
  var Connection: Instantiable = js.native
  
  var _agent: AgentOptions | Null = js.native
  
  var _ssl: SecureContextOptions | Null = js.native
  
  /**
    * Adds a new connection to the pool.
    *
    * @param {object|string} host
    * @returns {ConnectionPool}
    */
  def addConnection(opts: js.Any): default = js.native
  
  var auth: BasicAuth | ApiKeyAuth = js.native
  
  var connections: js.Array[default] = js.native
  
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  
  /**
    * Empties the connection pool.
    *
    * @returns {ConnectionPool}
    */
  def empty(): this.type = js.native
  
  /**
    * Returns an alive connection if present,
    * otherwise returns a dead connection.
    * By default it filters the `master` only nodes.
    * It uses the selector to choose which
    * connection return.
    *
    * @param {object} options (filter and selector)
    * @returns {object|null} connection
    */
  def getConnection(): default | Null = js.native
  def getConnection(opts: getConnectionOptions): default | Null = js.native
  
  /**
    * Marks a connection as 'alive'.
    * If needed removes the connection from the dead list
    * and then resets the `deadCount`.
    *
    * @param {object} connection
    */
  def markAlive(connection: default): this.type = js.native
  
  /**
    * Marks a connection as 'dead'.
    * If needed adds the connection to the dead list
    * and then increments the `deadCount`.
    *
    * @param {object} connection
    */
  def markDead(connection: default): this.type = js.native
  
  /**
    * Transforms the nodes objects to a host object.
    *
    * @param {object} nodes
    * @returns {array} hosts
    */
  def nodesToHost(nodes: js.Any, protocol: String): js.Array[_] = js.native
  
  /**
    * Removes a new connection to the pool.
    *
    * @param {object} connection
    * @returns {ConnectionPool}
    */
  def removeConnection(connection: default): this.type = js.native
  
  var size: Double = js.native
  
  /**
    * Update the ConnectionPool with new connections.
    *
    * @param {array} array of connections
    * @returns {ConnectionPool}
    */
  def update(connections: js.Array[_]): this.type = js.native
  
  /**
    * Transforms an url string to a host object
    *
    * @param {string} url
    * @returns {object} host
    */
  def urlToHost(url: String): Url = js.native
}
