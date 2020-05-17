package typingsSlinky.prosemirrorState.anon

import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destroy[S /* <: typingsSlinky.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var update: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* prevState */ EditorState[S], Unit]) | Null
  ] = js.native
}

object Destroy {
  @scala.inline
  def apply[S](): Destroy[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destroy[S]]
  }
  @scala.inline
  implicit class DestroyOps[Self[s] <: Destroy[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(null)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* view */ EditorView[S], /* prevState */ EditorState[S]) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(null)
        ret
    }
  }
  
}

