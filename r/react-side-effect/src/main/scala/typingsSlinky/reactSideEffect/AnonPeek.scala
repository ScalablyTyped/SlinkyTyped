package typingsSlinky.reactSideEffect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPeek[TPeek, TRewind] extends js.Object {
  def peek(): TPeek = js.native
  def rewind(): TRewind = js.native
}

object AnonPeek {
  @scala.inline
  def apply[TPeek, TRewind](peek: () => TPeek, rewind: () => TRewind): AnonPeek[TPeek, TRewind] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), rewind = js.Any.fromFunction0(rewind))
    __obj.asInstanceOf[AnonPeek[TPeek, TRewind]]
  }
  @scala.inline
  implicit class AnonPeekOps[Self[tpeek, trewind] <: AnonPeek[tpeek, trewind], TPeek, TRewind] (val x: Self[TPeek, TRewind]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TPeek, TRewind] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TPeek, TRewind]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TPeek, TRewind]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TPeek, TRewind]) with Other]
    @scala.inline
    def withPeek(value: () => TPeek): Self[TPeek, TRewind] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRewind(value: () => TRewind): Self[TPeek, TRewind] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

