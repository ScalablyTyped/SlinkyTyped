package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.NodeType
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "splitCellWithType")
@js.native
object splitCellWithType extends js.Object {
  def apply[S /* <: Schema[_, _] */](getCellType: js.Function1[/* options */ GetCellTypeOptions, NodeType[S]]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

