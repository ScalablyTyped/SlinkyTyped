package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.ResolvedPos
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-tables", "selectionCell")
@js.native
object selectionCell extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[ResolvedPos[S] | Null] = js.native
}
