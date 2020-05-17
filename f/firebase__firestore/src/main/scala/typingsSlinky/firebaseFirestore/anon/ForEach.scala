package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForEach extends js.Object {
  def forEach(cb: js.Function1[/* el */ PersistencePromise[_], Unit]): Unit = js.native
}

object ForEach {
  @scala.inline
  def apply(forEach: js.Function1[/* el */ PersistencePromise[_], Unit] => Unit): ForEach = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[ForEach]
  }
  @scala.inline
  implicit class ForEachOps[Self <: ForEach] (val x: Self) extends AnyVal {
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

