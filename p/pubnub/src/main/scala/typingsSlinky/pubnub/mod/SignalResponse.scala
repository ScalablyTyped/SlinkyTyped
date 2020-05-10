package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalResponse extends js.Object {
  var timetoken: Double = js.native
}

object SignalResponse {
  @scala.inline
  def apply(timetoken: Double): SignalResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalResponse]
  }
  @scala.inline
  implicit class SignalResponseOps[Self <: SignalResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimetoken(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timetoken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

