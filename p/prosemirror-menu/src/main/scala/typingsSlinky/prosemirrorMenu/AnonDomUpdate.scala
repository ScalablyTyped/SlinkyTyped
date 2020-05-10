package typingsSlinky.prosemirrorMenu

import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDomUpdate[S /* <: Schema[_, _] */] extends js.Object {
  var dom: js.UndefOr[DocumentFragment | Null] = js.native
  def update(p: EditorState[S]): Boolean = js.native
}

object AnonDomUpdate {
  @scala.inline
  def apply[S](update: EditorState[S] => Boolean): AnonDomUpdate[S] = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnonDomUpdate[S]]
  }
  @scala.inline
  implicit class AnonDomUpdateOps[Self[s] <: AnonDomUpdate[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withUpdate(value: EditorState[S] => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDom(value: DocumentFragment): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.undefined)
        ret
    }
    @scala.inline
    def withDomNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(null)
        ret
    }
  }
  
}

