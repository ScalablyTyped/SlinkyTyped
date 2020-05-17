package typingsSlinky.hostile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hostile", "getFile")
@js.native
object getFile extends js.Object {
  def apply(filePath: String, preserveFormatting: Boolean): Unit | Lines = js.native
  def apply(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = js.native
}

