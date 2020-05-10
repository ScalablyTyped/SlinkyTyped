package typingsSlinky.prosemirrorView

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMove[S /* <: Schema[_, _] */] extends js.Object {
  var move: Boolean = js.native
  var slice: Slice[S] = js.native
}

object AnonMove {
  @scala.inline
  def apply[S](move: Boolean, slice: Slice[S]): AnonMove[S] = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMove[S]]
  }
  @scala.inline
  implicit class AnonMoveOps[Self[s] <: AnonMove[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withMove(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlice(value: Slice[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

