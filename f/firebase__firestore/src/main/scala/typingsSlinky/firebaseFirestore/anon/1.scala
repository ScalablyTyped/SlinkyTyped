package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1`[R] extends js.Object {
  def forEach(cb: js.Function1[/* r */ R, Unit]): Unit = js.native
}

object `1` {
  @scala.inline
  def apply[R](forEach: js.Function1[/* r */ R, Unit] => Unit): `1`[R] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`1`[R]]
  }
  @scala.inline
  implicit class `1Ops`[Self[r] <: `1`[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withForEach(value: js.Function1[/* r */ R, Unit] => Unit): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

