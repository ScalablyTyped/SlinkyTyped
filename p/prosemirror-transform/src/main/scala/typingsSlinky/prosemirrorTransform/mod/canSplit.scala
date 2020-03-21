package typingsSlinky.prosemirrorTransform.mod

import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorTransform.AnonAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "canSplit")
@js.native
object canSplit extends js.Object {
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double, typesAfter: js.Array[js.UndefOr[AnonAttrs[S] | Null]]): Boolean = js.native
}

