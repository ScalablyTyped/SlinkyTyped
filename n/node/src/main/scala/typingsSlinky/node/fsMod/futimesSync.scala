package typingsSlinky.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "futimesSync")
@js.native
object futimesSync extends js.Object {
  def apply(fd: Double, atime: String, mtime: String): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: String, mtime: js.Date): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: String): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: js.Date): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: String): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: js.Date, mtime: js.Date): Unit = js.native
}

