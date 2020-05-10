package typingsSlinky.prosemirrorMenu

import org.scalajs.dom.raw.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDom[S /* <: Schema[_, _] */] extends js.Object {
  var dom: Node = js.native
  def update(p: EditorState[S]): Boolean = js.native
}

object AnonDom {
  @scala.inline
  def apply[S](dom: Node, update: EditorState[S] => Boolean): AnonDom[S] = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnonDom[S]]
  }
  @scala.inline
  implicit class AnonDomOps[Self[s] <: AnonDom[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withDom(value: Node): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: EditorState[S] => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

