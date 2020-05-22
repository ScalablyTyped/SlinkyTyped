package typingsSlinky.electron.originalFsMod

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.RmDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "rmdirSync")
@js.native
object rmdirSync extends js.Object {
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: RmDirOptions): Unit = js.native
}

