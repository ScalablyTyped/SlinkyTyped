package typingsSlinky.fsPromise.mod

import typingsSlinky.node.AnonAutoClose
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "createReadStream")
@js.native
object createReadStream extends js.Object {
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): typingsSlinky.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: String): typingsSlinky.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: AnonAutoClose): typingsSlinky.node.fsMod.ReadStream = js.native
}

