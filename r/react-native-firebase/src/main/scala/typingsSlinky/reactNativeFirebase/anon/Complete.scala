package typingsSlinky.reactNativeFirebase.anon

import typingsSlinky.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.Handler
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.RnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete[T] extends js.Object {
  var complete: js.UndefOr[Handler[T]] = js.native
  var error: js.UndefOr[ErrorHandler] = js.native
  var next: js.UndefOr[Handler[T]] = js.native
}

object Complete {
  @scala.inline
  def apply[T](): Complete[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete[T]]
  }
  @scala.inline
  implicit class CompleteOps[Self[t] <: Complete[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComplete(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: RnError => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
  }
  
}

