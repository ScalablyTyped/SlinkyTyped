package typingsSlinky.axios.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelToken extends js.Object {
  var promise: js.Promise[Cancel] = js.native
  var reason: js.UndefOr[Cancel] = js.native
  def throwIfRequested(): Unit = js.native
}

object CancelToken {
  @scala.inline
  def apply(promise: js.Promise[Cancel], throwIfRequested: () => Unit): CancelToken = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], throwIfRequested = js.Any.fromFunction0(throwIfRequested))
    __obj.asInstanceOf[CancelToken]
  }
  @scala.inline
  implicit class CancelTokenOps[Self <: CancelToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: js.Promise[Cancel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowIfRequested(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwIfRequested")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReason(value: Cancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

