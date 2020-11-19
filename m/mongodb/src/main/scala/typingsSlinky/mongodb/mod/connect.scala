package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "connect")
@js.native
object connect extends js.Object {
  
  def apply(uri: String): js.Promise[MongoClient] = js.native
  def apply(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def apply(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def apply(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
}
