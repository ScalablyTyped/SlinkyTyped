package typingsSlinky.electron.originalFsMod

import typingsSlinky.electron.electronStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "readdirSync")
@js.native
object readdirSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

