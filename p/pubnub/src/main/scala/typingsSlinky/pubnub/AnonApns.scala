package typingsSlinky.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApns extends js.Object {
  var apns: js.Object = js.native
  var fcm: js.Object = js.native
  var mpns: js.Object = js.native
}

object AnonApns {
  @scala.inline
  def apply(apns: js.Object, fcm: js.Object, mpns: js.Object): AnonApns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApns]
  }
  @scala.inline
  implicit class AnonApnsOps[Self <: AnonApns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApns(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFcm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMpns(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

