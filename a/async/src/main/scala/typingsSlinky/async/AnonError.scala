package typingsSlinky.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonError[E, T] extends js.Object {
  var error: js.UndefOr[E] = js.native
  var value: js.UndefOr[T] = js.native
}

object AnonError {
  @scala.inline
  def apply[E, T](): AnonError[E, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonError[E, T]]
  }
  @scala.inline
  implicit class AnonErrorOps[Self[e, t] <: AnonError[e, t], E, T] (val x: Self[E, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[E, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[E, T]) with Other]
    @scala.inline
    def withError(value: E): Self[E, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[E, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: T): Self[E, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[E, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

