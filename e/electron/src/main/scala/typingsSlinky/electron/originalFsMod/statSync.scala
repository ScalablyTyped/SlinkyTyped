package typingsSlinky.electron.originalFsMod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "statSync")
@js.native
object statSync extends js.Object {
  def apply(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
}

