package typingsSlinky.prosemirrorMenu

import org.scalajs.dom.raw.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdate[S /* <: Schema[_, _] */] extends js.Object {
  var dom: Node
  def update(p: EditorState[S]): Unit
}

object AnonUpdate {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](dom: Node, update: EditorState[S] => Unit): AnonUpdate[S] = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AnonUpdate[S]]
  }
}

