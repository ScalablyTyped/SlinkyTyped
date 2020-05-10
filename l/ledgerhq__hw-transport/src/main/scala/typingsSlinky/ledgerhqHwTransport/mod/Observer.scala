package typingsSlinky.ledgerhqHwTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[Ev] extends js.Object {
  def complete(): js.Any = js.native
  def error(e: js.Any): js.Any = js.native
  def next(event: Ev): js.Any = js.native
}

object Observer {
  @scala.inline
  def apply[Ev](complete: () => js.Any, error: js.Any => js.Any, next: Ev => js.Any): Observer[Ev] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[Ev]]
  }
  @scala.inline
  implicit class ObserverOps[Self[ev] <: Observer[ev], Ev] (val x: Self[Ev]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ev] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ev]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ev] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ev] with Other]
    @scala.inline
    def withComplete(value: () => js.Any): Self[Ev] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: js.Any => js.Any): Self[Ev] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext(value: Ev => js.Any): Self[Ev] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

