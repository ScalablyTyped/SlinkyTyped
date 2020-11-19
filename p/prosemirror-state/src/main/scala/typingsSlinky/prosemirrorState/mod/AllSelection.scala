package typingsSlinky.prosemirrorState.mod

import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-state", "AllSelection")
@js.native
class AllSelection[S /* <: Schema[_, _] */] protected () extends Selection[S] {
  /**
    * Create an all-selection over the given document.
    */
  def this(doc: Node[S]) = this()
}
