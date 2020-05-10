package typingsSlinky.knockoutRx

import typingsSlinky.knockoutRx.Rx.Observable
import typingsSlinky.rxCoreBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): Observable[T] = js.native
  def toSubject(): ISubject[T] = js.native
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T], toSubject: () => ISubject[T]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest), toSubject = js.Any.fromFunction0(toSubject))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  @scala.inline
  implicit class KnockoutObservableFunctionsOps[Self[t] <: KnockoutObservableFunctions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withToObservableWithReplyLatest(value: () => Observable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toObservableWithReplyLatest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSubject(value: () => ISubject[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSubject")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

