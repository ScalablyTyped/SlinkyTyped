package typingsSlinky.firebaseRemoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThrottleEndTimeMillis extends js.Object {
  var throttleEndTimeMillis: Double = js.native
}

object AnonThrottleEndTimeMillis {
  @scala.inline
  def apply(throttleEndTimeMillis: Double): AnonThrottleEndTimeMillis = {
    val __obj = js.Dynamic.literal(throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThrottleEndTimeMillis]
  }
  @scala.inline
  implicit class AnonThrottleEndTimeMillisOps[Self <: AnonThrottleEndTimeMillis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThrottleEndTimeMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleEndTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

