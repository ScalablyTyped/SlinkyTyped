package typingsSlinky.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESObserver[T, S] extends js.Object {
  var complete: js.UndefOr[js.Function0[_]] = js.native
  var error: js.UndefOr[js.Function1[/* error */ S, _]] = js.native
  var next: js.UndefOr[js.Function1[/* value */ T, _]] = js.native
  var start: js.UndefOr[js.Function] = js.native
}

object ESObserver {
  @scala.inline
  def apply[T, S](): ESObserver[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESObserver[T, S]]
  }
  @scala.inline
  implicit class ESObserverOps[Self[t, s] <: ESObserver[t, s], T, S] (val x: Self[T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, S]) with Other]
    @scala.inline
    def withComplete(value: () => _): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* error */ S => _): Self[T, S] = {
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
    def withNext(value: /* value */ T => _): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNext: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Function): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

