package typingsSlinky.prosemirrorTransform.mod

import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.NodeType
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-transform", "insertPoint")
@js.native
object insertPoint extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, nodeType: NodeType[S]): js.UndefOr[Double | Null] = js.native
}
