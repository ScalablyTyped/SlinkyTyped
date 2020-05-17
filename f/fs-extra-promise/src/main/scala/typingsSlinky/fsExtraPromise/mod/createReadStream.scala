package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "createReadStream")
@js.native
object createReadStream extends js.Object {
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): typingsSlinky.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: String): typingsSlinky.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: AutoClose): typingsSlinky.node.fsMod.ReadStream = js.native
}

