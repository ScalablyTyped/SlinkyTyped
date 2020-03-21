package typingsSlinky.dexie.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "BulkError")
@js.native
class BulkError ()
  extends typingsSlinky.dexie.mod.Dexie.BulkError {
  def this(msg: String) = this()
  def this(msg: String, failures: js.Array[_]) = this()
}

