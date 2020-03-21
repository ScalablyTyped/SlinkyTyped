package typingsSlinky.dexie.mod.default

import typingsSlinky.dexie.mod.IndexableTypeArrayReadonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "ModifyError")
@js.native
class ModifyError ()
  extends typingsSlinky.dexie.mod.Dexie.ModifyError {
  def this(msg: String) = this()
  def this(msg: String, failures: js.Array[_]) = this()
  def this(msg: String, failures: js.Array[_], successCount: Double) = this()
  def this(msg: String, failures: js.Array[_], successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
}

