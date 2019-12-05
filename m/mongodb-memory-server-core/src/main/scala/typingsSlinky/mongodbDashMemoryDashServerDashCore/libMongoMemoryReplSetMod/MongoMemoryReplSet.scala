package typingsSlinky.mongodbDashMemoryDashServerDashCore.libMongoMemoryReplSetMod

import typingsSlinky.mongodb.mongodbMod.Admin
import typingsSlinky.mongodbDashMemoryDashServerDashCore.Anon_AutoStart
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libTypesMod.DebugFn
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libTypesMod.MongoMemoryInstancePropBaseT
import typingsSlinky.mongodbDashMemoryDashServerDashCore.libTypesMod.MongoMemoryInstancePropT
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.init
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.running
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.stopped
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryReplSet extends EventEmitter {
  var _state: init | running | stopped = js.native
  var admin: js.UndefOr[Admin] = js.native
  @JSName("debug")
  var debug_Original: DebugFn = js.native
  var opts: Anon_AutoStart = js.native
  var servers: js.Array[
    typingsSlinky.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod.default
  ] = js.native
  /**
    * Connects to the first server from the list of servers and issues the `replSetInitiate`
    * command passing in a new replica set configuration object.
    */
  def _initReplSet(): js.Promise[Unit] = js.native
  def _initServer(instanceOpts: MongoMemoryInstancePropT): typingsSlinky.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod.default = js.native
  def _waitForPrimary(): js.Promise[Unit] = js.native
  def _waitForPrimary(timeout: Double): js.Promise[Unit] = js.native
  def debug(args: js.Any*): js.Any = js.native
  def getConnectionString(): js.Promise[String] = js.native
  def getConnectionString(otherDb: String): js.Promise[String] = js.native
  def getConnectionString(otherDb: Boolean): js.Promise[String] = js.native
  /**
    * Returns database name.
    */
  def getDbName(): js.Promise[String] = js.native
  /**
    * Returns instance options suitable for a MongoMemoryServer.
    * @param {MongoMemoryInstancePropBaseT} baseOpts
    */
  def getInstanceOpts(): MongoMemoryInstancePropT = js.native
  def getInstanceOpts(baseOpts: MongoMemoryInstancePropBaseT): MongoMemoryInstancePropT = js.native
  /**
    * Returns a mongodb: URI to connect to a given database.
    */
  def getUri(): js.Promise[String] = js.native
  def getUri(otherDb: String): js.Promise[String] = js.native
  def getUri(otherDb: Boolean): js.Promise[String] = js.native
  /**
    * Start underlying `mongod` instances.
    */
  def start(): js.Promise[Unit] = js.native
  /**
    * Stop the underlying `mongod` instance(s).
    */
  def stop(): js.Promise[Boolean] = js.native
  def waitUntilRunning(): js.Promise[Unit] = js.native
}

