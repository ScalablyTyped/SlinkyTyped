package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[R, S] extends js.Object {
  def forEach(cb: js.Function2[/* r */ R, /* s */ S, Unit]): Unit = js.native
}

object `0` {
  @scala.inline
  def apply[R, S](forEach: js.Function2[/* r */ R, /* s */ S, Unit] => Unit): `0`[R, S] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`0`[R, S]]
  }
  @scala.inline
  implicit class `0Ops`[Self[r, s] <: `0`[r, s], R, S] (val x: Self[R, S]) extends AnyVal {
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

