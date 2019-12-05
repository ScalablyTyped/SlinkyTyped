package typingsSlinky.fsDashPlus.fsDashPlusMod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "statSync")
@js.native
object statSync extends js.Object {
  /**
    * Synchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
}

