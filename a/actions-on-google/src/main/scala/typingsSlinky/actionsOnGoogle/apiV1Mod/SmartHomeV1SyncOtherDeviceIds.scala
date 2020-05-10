package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1SyncOtherDeviceIds extends js.Object {
  var agentId: js.UndefOr[String] = js.native
  var deviceId: String = js.native
}

object SmartHomeV1SyncOtherDeviceIds {
  @scala.inline
  def apply(deviceId: String): SmartHomeV1SyncOtherDeviceIds = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncOtherDeviceIds]
  }
  @scala.inline
  implicit class SmartHomeV1SyncOtherDeviceIdsOps[Self <: SmartHomeV1SyncOtherDeviceIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(js.undefined)
        ret
    }
  }
  
}

