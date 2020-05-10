package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1ExecutePayload extends js.Object {
  var commands: js.Array[SmartHomeV1ExecuteResponseCommands] = js.native
  var debugString: js.UndefOr[String] = js.native
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.native
}

object SmartHomeV1ExecutePayload {
  @scala.inline
  def apply(commands: js.Array[SmartHomeV1ExecuteResponseCommands]): SmartHomeV1ExecutePayload = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecutePayload]
  }
  @scala.inline
  implicit class SmartHomeV1ExecutePayloadOps[Self <: SmartHomeV1ExecutePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: js.Array[SmartHomeV1ExecuteResponseCommands]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
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
    def withErrorCode(value: SmartHomeV1ExecuteErrors): Self = {
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

