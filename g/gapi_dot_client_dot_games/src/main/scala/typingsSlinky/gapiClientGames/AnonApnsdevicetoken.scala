package typingsSlinky.gapiClientGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApnsdevicetoken extends js.Object {
  /** Device token supplied by an iOS system call to register for remote notifications. Encode this field as web-safe base64. */
  var apns_device_token: js.UndefOr[String] = js.native
  /** Indicates whether this token should be used for the production or sandbox APNS server. */
  var apns_environment: js.UndefOr[String] = js.native
}

object AnonApnsdevicetoken {
  @scala.inline
  def apply(): AnonApnsdevicetoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApnsdevicetoken]
  }
  @scala.inline
  implicit class AnonApnsdevicetokenOps[Self <: AnonApnsdevicetoken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApns_device_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns_device_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApns_device_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns_device_token")(js.undefined)
        ret
    }
    @scala.inline
    def withApns_environment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns_environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApns_environment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns_environment")(js.undefined)
        ret
    }
  }
  
}

