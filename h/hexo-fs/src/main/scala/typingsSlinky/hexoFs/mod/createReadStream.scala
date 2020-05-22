package typingsSlinky.hexoFs.mod

import typingsSlinky.node.anon.AutoClose
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  def apply(path: PathLike): typingsSlinky.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: String): typingsSlinky.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: AutoClose): typingsSlinky.node.fsMod.ReadStream = js.native
}

