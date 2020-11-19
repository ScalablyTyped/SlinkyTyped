package typingsSlinky.mongration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongration", "Migration")
@js.native
class Migration protected () extends js.Object {
  def this(dbConfig: DbConfig) = this()
  
  def add(paths: String): Unit = js.native
  def add(paths: js.Array[String]): Unit = js.native
  
  def addAllFromPath(path: String): Unit = js.native
  
  def migrate(): Unit = js.native
  def migrate(doneCb: js.Function2[/* err */ js.Error | Null, /* response */ js.Array[MigrationResponse], Unit]): Unit = js.native
}
