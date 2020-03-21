package typingsSlinky.hexoFs.mod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lstat")
@js.native
object lstat extends js.Object {
  def apply(path: PathLike): typingsSlinky.bluebird.mod.^[typingsSlinky.gracefulFs.mod.Stats] = js.native
}

