package typingsSlinky.pReflect.mod

import typingsSlinky.pReflect.pReflectBooleans.`false`
import typingsSlinky.pReflect.pReflectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseRejectedResult
  extends PromiseResult[js.Any] {
  var isFulfilled: `false` = js.native
  var isRejected: `true` = js.native
  var reason: js.Any = js.native
}

object PromiseRejectedResult {
  @scala.inline
  def apply(isFulfilled: `false`, isRejected: `true`, reason: js.Any): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectedResult]
  }
  @scala.inline
  implicit class PromiseRejectedResultOps[Self <: PromiseRejectedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFulfilled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFulfilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRejected(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

