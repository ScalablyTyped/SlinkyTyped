package typingsSlinky.monk.mod

import typingsSlinky.monk.anon.MongoClientOptionscollect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monk", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(database: String): js.Promise[IMonkManager] with IMonkManager = js.native
  def apply(database: String, options: MongoClientOptionscollect): js.Promise[IMonkManager] with IMonkManager = js.native
  def apply(database: js.Array[String]): js.Promise[IMonkManager] with IMonkManager = js.native
  def apply(database: js.Array[String], options: MongoClientOptionscollect): js.Promise[IMonkManager] with IMonkManager = js.native
}
