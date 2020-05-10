package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorChangeCancellable extends EditorChange {
  /** may be used to modify the change. All three arguments to update are optional, and can be left off to leave the existing value for that field intact.
    If the change came from undo/redo, `update` is undefined and the change cannot be modified. */
  var update: js.UndefOr[
    js.Function3[
      /* from */ js.UndefOr[Position], 
      /* to */ js.UndefOr[Position], 
      /* text */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.native
  def cancel(): Unit = js.native
}

object EditorChangeCancellable {
  @scala.inline
  def apply(cancel: () => Unit, from: Position, text: js.Array[String], to: Position): EditorChangeCancellable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeCancellable]
  }
  @scala.inline
  implicit class EditorChangeCancellableOps[Self <: EditorChangeCancellable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* from */ js.UndefOr[Position], /* to */ js.UndefOr[Position], /* text */ js.UndefOr[js.Array[String]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

