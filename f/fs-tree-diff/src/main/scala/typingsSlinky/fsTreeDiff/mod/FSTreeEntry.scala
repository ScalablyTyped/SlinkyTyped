package typingsSlinky.fsTreeDiff.mod

import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-tree-diff", "FSTreeEntry")
@js.native
class FSTreeEntry () extends Entry {
  def isFile(): Boolean = js.native
}

/* static members */
@JSImport("fs-tree-diff", "FSTreeEntry")
@js.native
object FSTreeEntry extends js.Object {
  def fromStat(relativePath: String, stat: Stats): Entry = js.native
}

