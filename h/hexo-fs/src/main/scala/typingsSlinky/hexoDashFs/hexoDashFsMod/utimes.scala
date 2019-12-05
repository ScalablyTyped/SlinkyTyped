package typingsSlinky.hexoDashFs.hexoDashFsMod

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "utimes")
@js.native
object utimes extends js.Object {
  def apply(path: PathLike, atime: String, mtime: String): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Double): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Date): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: String): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: Date): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: String): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: Double): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: Date): typingsSlinky.bluebird.bluebirdMod.^[Unit] = js.native
}

