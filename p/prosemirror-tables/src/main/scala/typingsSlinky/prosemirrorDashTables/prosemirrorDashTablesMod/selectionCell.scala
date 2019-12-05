package typingsSlinky.prosemirrorDashTables.prosemirrorDashTablesMod

import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.ResolvedPos
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "selectionCell")
@js.native
object selectionCell extends js.Object {
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[ResolvedPos[S] | Null] = js.native
}

