package typingsSlinky.firebaseRemoteConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottleEndTimeMillis extends js.Object {
  var throttleEndTimeMillis: Double = js.native
}

object ThrottleEndTimeMillis {
  @scala.inline
  def apply(throttleEndTimeMillis: Double): ThrottleEndTimeMillis = {
    val __obj = js.Dynamic.literal(throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleEndTimeMillis]
  }
  @scala.inline
  implicit class ThrottleEndTimeMillisOps[Self <: ThrottleEndTimeMillis] (val x: Self) extends AnyVal {
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

