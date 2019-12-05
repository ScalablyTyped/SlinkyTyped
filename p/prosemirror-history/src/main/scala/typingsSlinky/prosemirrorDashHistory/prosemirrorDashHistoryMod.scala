package typingsSlinky.prosemirrorDashHistory

import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-history", JSImport.Namespace)
@js.native
object prosemirrorDashHistoryMod extends js.Object {
  def closeHistory[S /* <: Schema[_, _] */](tr: Transaction[S]): Transaction[S] = js.native
  def history(): Plugin[_, _] = js.native
  def history(config: Anon_Depth): Plugin[_, _] = js.native
  def redo[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def redo[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def redoDepth(state: EditorState[_]): Double = js.native
  def undo[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def undo[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def undoDepth(state: EditorState[_]): Double = js.native
}

