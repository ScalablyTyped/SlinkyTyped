package typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod

import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoMemoryServer extends js.Object {
  
  /**
    * Internal Function to start an instance
    * @private
    */
  def _startUpInstance(): js.Promise[MongoInstanceDataT] = js.native
  
  /**
    * Ensure that the instance is running
    * -> throws if instance cannot be started
    */
  def ensureInstance(): js.Promise[MongoInstanceDataT] = js.native
  
  /**
    * Get a mongodb-URI for a different DataBase
    * @param otherDbName Set this to "true" to generate a random DataBase name, otherwise a string to specify a DataBase name
    * @deprecated
    */
  def getConnectionString(): js.Promise[String] = js.native
  def getConnectionString(otherDbName: String): js.Promise[String] = js.native
  def getConnectionString(otherDbName: Boolean): js.Promise[String] = js.native
  
  /**
    * Get the DB-Name of the currently running Instance
    * Note: calls "ensureInstance"
    */
  def getDbName(): js.Promise[String] = js.native
  
  /**
    * Get the DB-Path of the currently running Instance
    * Note: calls "ensureInstance"
    */
  def getDbPath(): js.Promise[String] = js.native
  
  /**
    * Get Information about the currently running instance, if it is not running it returns "false"
    */
  def getInstanceInfo(): MongoInstanceDataT | `false` = js.native
  
  /**
    * Get the Port of the currently running Instance
    * Note: calls "ensureInstance"
    */
  def getPort(): js.Promise[Double] = js.native
  
  /**
    * Get a mongodb-URI for a different DataBase
    * @param otherDbName Set this to "true" to generate a random DataBase name, otherwise a string to specify a DataBase name
    */
  def getUri(): js.Promise[String] = js.native
  def getUri(otherDbName: String): js.Promise[String] = js.native
  def getUri(otherDbName: Boolean): js.Promise[String] = js.native
  
  var instanceInfoSync: MongoInstanceDataT | Null = js.native
  
  var opts: MongoMemoryServerOptsT = js.native
  
  var runningInstance: js.Promise[MongoInstanceDataT] | Null = js.native
  
  /**
    * Start the in-memory Instance
    * (when options.autoStart is true, this already got called)
    */
  def start(): js.Promise[Boolean] = js.native
  
  /**
    * Stop the current In-Memory Instance
    */
  def stop(): js.Promise[Boolean] = js.native
}
