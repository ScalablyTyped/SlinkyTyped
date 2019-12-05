package typingsSlinky.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typingsSlinky.node.Anon_AutoCloseEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): typingsSlinky.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: String): typingsSlinky.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: Anon_AutoCloseEncoding): typingsSlinky.node.fsMod.WriteStream = js.native
}

