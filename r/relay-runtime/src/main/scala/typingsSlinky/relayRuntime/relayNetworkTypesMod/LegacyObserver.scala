package typingsSlinky.relayRuntime.relayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyObserver[T] extends js.Object {
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var onNext: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.native
}

object LegacyObserver {
  @scala.inline
  def apply[T](): LegacyObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyObserver[T]]
  }
  @scala.inline
  implicit class LegacyObserverOps[Self[t] <: LegacyObserver[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnCompleted(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCompleted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: /* data */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
  }
  
}

