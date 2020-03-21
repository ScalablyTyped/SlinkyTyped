package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.hexoFsStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "realpath")
@js.native
object realpath_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): typingsSlinky.bluebird.mod.^[Buffer] = js.native
}

