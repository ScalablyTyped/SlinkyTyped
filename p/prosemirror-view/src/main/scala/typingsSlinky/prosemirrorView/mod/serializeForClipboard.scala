package typingsSlinky.prosemirrorView.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorModel.mod.Slice
import typingsSlinky.prosemirrorView.anon.Dom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "__serializeForClipboard")
@js.native
object serializeForClipboard extends js.Object {
  def apply[S /* <: Schema[_, _] */](view: EditorView[S], slice: Slice[S]): Dom = js.native
}

