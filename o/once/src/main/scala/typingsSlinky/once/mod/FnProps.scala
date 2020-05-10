package typingsSlinky.once.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnProps[R] extends js.Object {
  var called: Boolean = js.native
  var value: js.UndefOr[R] = js.native
}

object FnProps {
  @scala.inline
  def apply[R](called: Boolean): FnProps[R] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any])
    __obj.asInstanceOf[FnProps[R]]
  }
  @scala.inline
  implicit class FnPropsOps[Self[r] <: FnProps[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withCalled(value: Boolean): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("called")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: R): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

