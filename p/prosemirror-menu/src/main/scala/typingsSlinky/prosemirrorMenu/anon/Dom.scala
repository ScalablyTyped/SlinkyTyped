package typingsSlinky.prosemirrorMenu.anon

import org.scalajs.dom.raw.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom[S /* <: Schema[_, _] */] extends js.Object {
  var dom: Node
  def update(p: EditorState[S]): Boolean
}

object Dom {
  @scala.inline
  def apply[S](dom: Node, update: EditorState[S] => Boolean): Dom[S] = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Dom[S]]
  }
}

