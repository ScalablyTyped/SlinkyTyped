package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilerSessionStoppedParams extends js.Object {
  var ownerUri: String = js.native
  var sessionId: Double = js.native
}

object ProfilerSessionStoppedParams {
  @scala.inline
  def apply(ownerUri: String, sessionId: Double): ProfilerSessionStoppedParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionStoppedParams]
  }
  @scala.inline
  implicit class ProfilerSessionStoppedParamsOps[Self <: ProfilerSessionStoppedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

