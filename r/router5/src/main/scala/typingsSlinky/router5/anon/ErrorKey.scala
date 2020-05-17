package typingsSlinky.router5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorKey extends js.Object {
  var errorKey: js.UndefOr[js.Any] = js.native
  var fromState: js.Any = js.native
  var isCancelled: js.Any = js.native
  var toState: js.Any = js.native
}

object ErrorKey {
  @scala.inline
  def apply(fromState: js.Any, isCancelled: js.Any, toState: js.Any): ErrorKey = {
    val __obj = js.Dynamic.literal(fromState = fromState.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any], toState = toState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorKey]
  }
  @scala.inline
  implicit class ErrorKeyOps[Self <: ErrorKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCancelled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorKey")(js.undefined)
        ret
    }
  }
  
}

