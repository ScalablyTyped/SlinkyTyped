package typingsSlinky.gracefulFs.mod

import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "lchmodSync")
@js.native
object lchmodSync extends js.Object {
  def apply(path: PathLike, mode: Mode): Unit = js.native
}

