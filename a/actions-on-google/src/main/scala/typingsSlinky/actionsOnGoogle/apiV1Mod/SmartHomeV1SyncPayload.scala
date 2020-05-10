package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1SyncPayload extends js.Object {
  var agentUserId: js.UndefOr[String] = js.native
  var debugString: js.UndefOr[String] = js.native
  var devices: js.Array[SmartHomeV1SyncDevices] = js.native
  var errorCode: js.UndefOr[String] = js.native
}

object SmartHomeV1SyncPayload {
  @scala.inline
  def apply(devices: js.Array[SmartHomeV1SyncDevices]): SmartHomeV1SyncPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncPayload]
  }
  @scala.inline
  implicit class SmartHomeV1SyncPayloadOps[Self <: SmartHomeV1SyncPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: js.Array[SmartHomeV1SyncDevices]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugString")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
  }
  
}

