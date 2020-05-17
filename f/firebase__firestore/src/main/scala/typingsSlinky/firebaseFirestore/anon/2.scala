package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  def forEach(cb: js.Function1[/* el */ PersistencePromise[_], Unit]): Unit = js.native
}

object `2` {
  @scala.inline
  def apply(forEach: js.Function1[/* el */ PersistencePromise[_], Unit] => Unit): `2` = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForEach(value: js.Function1[/* el */ PersistencePromise[_], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

