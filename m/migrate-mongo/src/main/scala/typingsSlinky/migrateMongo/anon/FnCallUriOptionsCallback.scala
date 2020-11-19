package typingsSlinky.migrateMongo.anon

import typingsSlinky.mongodb.mod.MongoCallback
import typingsSlinky.mongodb.mod.MongoClient
import typingsSlinky.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallUriOptionsCallback extends js.Object {
  
  def apply(uri: String): js.Promise[MongoClient] = js.native
  def apply(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def apply(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def apply(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
}
