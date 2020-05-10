package typingsSlinky.knockoutRx

import typingsSlinky.knockoutRx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): Observable[T] = js.native
}

object KnockoutComputedFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest))
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
  @scala.inline
  implicit class KnockoutComputedFunctionsOps[Self[t] <: KnockoutComputedFunctions[t], T] (val x: Self[T]) extends AnyVal {
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
  }
  
}

