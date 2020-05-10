package typingsSlinky.redisInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalls extends js.Object {
  var calls: Double = js.native
  var usec: Double = js.native
  var usec_per_call: Double = js.native
}

object AnonCalls {
  @scala.inline
  def apply(calls: Double, usec: Double, usec_per_call: Double): AnonCalls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], usec = usec.asInstanceOf[js.Any], usec_per_call = usec_per_call.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalls]
  }
  @scala.inline
  implicit class AnonCallsOps[Self <: AnonCalls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsec_per_call(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usec_per_call")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

