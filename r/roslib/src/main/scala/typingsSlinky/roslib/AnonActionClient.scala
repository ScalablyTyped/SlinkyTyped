package typingsSlinky.roslib

import typingsSlinky.roslib.mod.ActionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionClient extends js.Object {
  var actionClient: ActionClient = js.native
  var goalMessage: js.Any = js.native
}

object AnonActionClient {
  @scala.inline
  def apply(actionClient: ActionClient, goalMessage: js.Any): AnonActionClient = {
    val __obj = js.Dynamic.literal(actionClient = actionClient.asInstanceOf[js.Any], goalMessage = goalMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionClient]
  }
  @scala.inline
  implicit class AnonActionClientOps[Self <: AnonActionClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionClient(value: ActionClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoalMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

