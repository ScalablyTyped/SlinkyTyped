package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.Plugin
import typingsSlinky.prosemirrorTables.anon.CellMinWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "columnResizing")
@js.native
object columnResizing extends js.Object {
  def apply[S /* <: Schema[_, _] */](props: CellMinWidth[S]): Plugin[S, _] = js.native
}

