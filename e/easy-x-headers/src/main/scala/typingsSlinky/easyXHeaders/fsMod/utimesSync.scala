package typingsSlinky.easyXHeaders.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "utimesSync")
@js.native
object utimesSync extends js.Object {
  def apply(path: String, atime: Double, mtime: Double): Unit = js.native
  def apply(path: String, atime: js.Date, mtime: js.Date): Unit = js.native
}

