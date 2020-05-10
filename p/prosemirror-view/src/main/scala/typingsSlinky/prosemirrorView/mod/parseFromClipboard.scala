package typingsSlinky.prosemirrorView.mod

import typingsSlinky.prosemirrorModel.mod.ResolvedPos
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "__parseFromClipboard")
@js.native
object parseFromClipboard extends js.Object {
  def apply[S /* <: Schema[_, _] */](view: EditorView[S], text: String, html: String, plainText: Boolean, $context: ResolvedPos[S]): Slice[S] = js.native
}

