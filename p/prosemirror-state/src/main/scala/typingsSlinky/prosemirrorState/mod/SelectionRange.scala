package typingsSlinky.prosemirrorState.mod

import typingsSlinky.prosemirrorModel.mod.ResolvedPos
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-state", "SelectionRange")
@js.native
class SelectionRange[S /* <: Schema[_, _] */] protected () extends js.Object {
  def this($from: ResolvedPos[S], $to: ResolvedPos[S]) = this()
  
  /**
    * The lower bound of the range.
    */
  @JSName("$from")
  var $from: ResolvedPos[S] = js.native
  
  /**
    * The upper bound of the range.
    */
  @JSName("$to")
  var $to: ResolvedPos[S] = js.native
}
