package typingsSlinky.electron.originalDashFsMod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "lstatSync")
@js.native
object lstatSync extends js.Object {
  /**
    * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
}

