package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSNotificationPayload extends BaseNotificationPayload {
  var apnsPushType: js.UndefOr[String] = js.native
  var configurations: js.Array[APNS2Configuration] = js.native
  var isSilent: Boolean = js.native
}

object APNSNotificationPayload {
  @scala.inline
  def apply(configurations: js.Array[APNS2Configuration], isSilent: Boolean, payload: js.Object): APNSNotificationPayload = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], isSilent = isSilent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSNotificationPayload]
  }
  @scala.inline
  implicit class APNSNotificationPayloadOps[Self <: APNSNotificationPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurations(value: js.Array[APNS2Configuration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSilent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApnsPushType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apnsPushType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApnsPushType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apnsPushType")(js.undefined)
        ret
    }
  }
  
}

