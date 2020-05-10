package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1ExecuteRequestCommands extends js.Object {
  var devices: js.Array[SmartHomeV1QueryRequestDevices] = js.native
  var execution: js.Array[SmartHomeV1ExecuteRequestExecution] = js.native
}

object SmartHomeV1ExecuteRequestCommands {
  @scala.inline
  def apply(
    devices: js.Array[SmartHomeV1QueryRequestDevices],
    execution: js.Array[SmartHomeV1ExecuteRequestExecution]
  ): SmartHomeV1ExecuteRequestCommands = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestCommands]
  }
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestCommandsOps[Self <: SmartHomeV1ExecuteRequestCommands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: js.Array[SmartHomeV1QueryRequestDevices]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution(value: js.Array[SmartHomeV1ExecuteRequestExecution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

