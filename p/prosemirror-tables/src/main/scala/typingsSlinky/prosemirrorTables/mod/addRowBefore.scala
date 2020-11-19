package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-tables", "addRowBefore")
@js.native
object addRowBefore extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
}
