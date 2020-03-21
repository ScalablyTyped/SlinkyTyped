package typingsSlinky.hexoFs.mod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lchown")
@js.native
object lchown extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
}

