package typingsSlinky.electron.originalDashFsMod

import typingsSlinky.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "opendirSync")
@js.native
object opendirSync extends js.Object {
  def apply(path: String): typingsSlinky.node.fsMod.Dir = js.native
  def apply(path: String, options: OpenDirOptions): typingsSlinky.node.fsMod.Dir = js.native
}

