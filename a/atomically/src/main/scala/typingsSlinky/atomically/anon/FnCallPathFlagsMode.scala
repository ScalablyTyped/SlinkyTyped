package typingsSlinky.atomically.anon

import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.OpenMode
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathFlagsMode extends js.Object {
  def apply(path: PathLike, flags: OpenMode): js.Promise[Double] = js.native
  def apply(path: PathLike, flags: OpenMode, mode: Mode): js.Promise[Double] = js.native
}

