package typingsSlinky.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApns extends js.Object {
  var apns: AnonCerData = js.native
  var gcm: AnonServerApiKey = js.native
}

object AnonApns {
  @scala.inline
  def apply(apns: AnonCerData, gcm: AnonServerApiKey): AnonApns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApns]
  }
  @scala.inline
  implicit class AnonApnsOps[Self <: AnonApns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApns(value: AnonCerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGcm(value: AnonServerApiKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

