package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "rowIsHeader")
@js.native
object rowIsHeader extends js.Object {
  def apply[S /* <: Schema[_, _] */](map: TableMap, table: Node[S], row: Double): Boolean = js.native
}

