package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-tables", "fixTables")
@js.native
object fixTables extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): Null | Transaction[S] = js.native
  def apply[S /* <: Schema[_, _] */](state: EditorState[S], oldState: EditorState[S]): Null | Transaction[S] = js.native
}
