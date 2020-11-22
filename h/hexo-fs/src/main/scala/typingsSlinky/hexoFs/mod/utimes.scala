package typingsSlinky.hexoFs.mod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "utimes")
@js.native
object utimes extends js.Object {
  
  def apply(path: PathLike, atime: String, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: js.Date, mtime: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: js.Date, mtime: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: js.Date, mtime: js.Date): typingsSlinky.bluebird.mod.^[Unit] = js.native
}
