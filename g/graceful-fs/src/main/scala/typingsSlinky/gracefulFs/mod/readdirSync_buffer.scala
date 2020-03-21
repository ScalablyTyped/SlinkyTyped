package typingsSlinky.gracefulFs.mod

import typingsSlinky.gracefulFs.gracefulFsStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readdirSync")
@js.native
object readdirSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

