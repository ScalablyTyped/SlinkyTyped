package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDeploymentOutput extends js.Object {
  /**
    * The status of the stop deployment operation:   Pending: The stop operation is pending.   Succeeded: The stop operation was successful.  
    */
  var status: js.UndefOr[StopStatus] = js.native
  /**
    * An accompanying status message.
    */
  var statusMessage: js.UndefOr[Message] = js.native
}

object StopDeploymentOutput {
  @scala.inline
  def apply(): StopDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDeploymentOutput]
  }
  @scala.inline
  implicit class StopDeploymentOutputOps[Self <: StopDeploymentOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: StopStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
  }
  
}

