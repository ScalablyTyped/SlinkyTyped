package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0[R, S] extends js.Object {
  def forEach(cb: js.Function2[/* r */ R, /* s */ S, Unit]): Unit = js.native
}

object Anon0 {
  @scala.inline
  def apply[R, S](forEach: js.Function2[/* r */ R, /* s */ S, Unit] => Unit): Anon0[R, S] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[Anon0[R, S]]
  }
  @scala.inline
  implicit class Anon0Ops[Self[r, s] <: Anon0[r, s], R, S] (val x: Self[R, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, S]) with Other]
    @scala.inline
    def withForEach(value: js.Function2[/* r */ R, /* s */ S, Unit] => Unit): Self[R, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

