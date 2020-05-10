package typingsSlinky.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T, S] extends js.Object {
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* error */ S, Unit]] = js.native
  var value: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
}

object Observer {
  @scala.inline
  def apply[T, S](): Observer[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observer[T, S]]
  }
  @scala.inline
  implicit class ObserverOps[Self[t, s] <: Observer[t, s], T, S] (val x: Self[T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, S]) with Other]
    @scala.inline
    def withEnd(value: () => Unit): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnd: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* error */ S => Unit): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: /* value */ T => Unit): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValue: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

