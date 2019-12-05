package typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod

import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "AllSelection")
@js.native
class AllSelection[S /* <: Schema[_, _] */] protected () extends Selection[S] {
  /**
    * Create an all-selection over the given document.
    */
  def this(doc: Node[S]) = this()
}

