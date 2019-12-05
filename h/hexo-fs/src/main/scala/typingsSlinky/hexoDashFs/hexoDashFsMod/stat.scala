package typingsSlinky.hexoDashFs.hexoDashFsMod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "stat")
@js.native
object stat extends js.Object {
  def apply(path: PathLike): typingsSlinky.bluebird.bluebirdMod.^[typingsSlinky.gracefulDashFs.gracefulDashFsMod.Stats] = js.native
}

