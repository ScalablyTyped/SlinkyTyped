package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.MaxTimeMS
import typingsSlinky.mongodb.anon.NameOnly
import typingsSlinky.mongodb.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Admin extends js.Object {
  
  def addUser(username: String, password: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#addUser */
  def addUser(username: String, password: String, callback: MongoCallback[_]): Unit = js.native
  def addUser(username: String, password: String, options: AddUserOptions): js.Promise[_] = js.native
  def addUser(username: String, password: String, options: AddUserOptions, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#buildInfo */
  def buildInfo(): js.Promise[_] = js.native
  def buildInfo(callback: MongoCallback[_]): Unit = js.native
  def buildInfo(options: `1`): js.Promise[_] = js.native
  def buildInfo(options: `1`, callback: MongoCallback[_]): Unit = js.native
  
  def command(command: js.Object): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#command */
  def command(command: js.Object, callback: MongoCallback[_]): Unit = js.native
  def command(command: js.Object, options: MaxTimeMS): js.Promise[_] = js.native
  def command(command: js.Object, options: MaxTimeMS, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#listDatabases */
  def listDatabases(): js.Promise[_] = js.native
  def listDatabases(callback: MongoCallback[_]): Unit = js.native
  def listDatabases(options: NameOnly): js.Promise[_] = js.native
  def listDatabases(options: NameOnly, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#ping */
  def ping(): js.Promise[_] = js.native
  def ping(callback: MongoCallback[_]): Unit = js.native
  def ping(options: `1`): js.Promise[_] = js.native
  def ping(options: `1`, callback: MongoCallback[_]): Unit = js.native
  
  def removeUser(username: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#removeUser */
  def removeUser(username: String, callback: MongoCallback[_]): Unit = js.native
  def removeUser(username: String, options: FSyncOptions): js.Promise[_] = js.native
  def removeUser(username: String, options: FSyncOptions, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#replSetGetStatus */
  def replSetGetStatus(): js.Promise[_] = js.native
  def replSetGetStatus(callback: MongoCallback[_]): Unit = js.native
  def replSetGetStatus(options: `1`): js.Promise[_] = js.native
  def replSetGetStatus(options: `1`, callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#serverInfo */
  def serverInfo(): js.Promise[_] = js.native
  def serverInfo(callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#serverStatus */
  def serverStatus(): js.Promise[_] = js.native
  def serverStatus(callback: MongoCallback[_]): Unit = js.native
  def serverStatus(options: `1`): js.Promise[_] = js.native
  def serverStatus(options: `1`, callback: MongoCallback[_]): Unit = js.native
  
  def validateCollection(collectionNme: String): js.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#validateCollection */
  def validateCollection(collectionNme: String, callback: MongoCallback[_]): Unit = js.native
  def validateCollection(collectionNme: String, options: js.Object): js.Promise[_] = js.native
  def validateCollection(collectionNme: String, options: js.Object, callback: MongoCallback[_]): Unit = js.native
}
