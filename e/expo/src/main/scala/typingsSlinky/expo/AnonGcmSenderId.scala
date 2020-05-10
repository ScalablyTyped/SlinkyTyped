package typingsSlinky.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGcmSenderId extends js.Object {
  var gcmSenderId: js.UndefOr[String] = js.native
}

object AnonGcmSenderId {
  @scala.inline
  def apply(): AnonGcmSenderId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGcmSenderId]
  }
  @scala.inline
  implicit class AnonGcmSenderIdOps[Self <: AnonGcmSenderId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcmSenderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcmSenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcmSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcmSenderId")(js.undefined)
        ret
    }
  }
  
}

