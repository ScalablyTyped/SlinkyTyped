package typingsSlinky.prosemirrorTransform.mod

import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "replaceStep")
@js.native
object replaceStep extends js.Object {
  def apply[S /* <: Schema[_, _] */](doc: Node[S], from: Double): js.UndefOr[Step[S] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double): js.UndefOr[Step[S] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double, slice: Slice[S]): js.UndefOr[Step[S] | Null] = js.native
}

