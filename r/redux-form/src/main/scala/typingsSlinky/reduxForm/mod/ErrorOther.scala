package typingsSlinky.reduxForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorOther[T] extends js.Object {
  var _error: js.UndefOr[T] = js.native
}

object ErrorOther {
  @scala.inline
  def apply[T](): ErrorOther[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOther[T]]
  }
  @scala.inline
  implicit class ErrorOtherOps[Self[t] <: ErrorOther[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_error(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_error: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_error")(js.undefined)
        ret
    }
  }
  
}

