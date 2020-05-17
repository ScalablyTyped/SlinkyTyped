package typingsSlinky.actionsOnGoogle.apiV1Mod

import typingsSlinky.actionsOnGoogle.anon.Ack
import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1ExecuteRequestExecution extends js.Object {
  var challenge: js.UndefOr[Ack] = js.native
  var command: String = js.native
  var params: ApiClientObjectMap[_] = js.native
}

object SmartHomeV1ExecuteRequestExecution {
  @scala.inline
  def apply(command: String, params: ApiClientObjectMap[_]): SmartHomeV1ExecuteRequestExecution = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestExecution]
  }
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestExecutionOps[Self <: SmartHomeV1ExecuteRequestExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallenge(value: Ack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(js.undefined)
        ret
    }
  }
  
}

