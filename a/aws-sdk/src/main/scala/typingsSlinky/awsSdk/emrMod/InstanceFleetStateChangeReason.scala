package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetStateChangeReason extends js.Object {
  /**
    * A code corresponding to the reason the state change occurred.
    */
  var Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.native
  /**
    * An explanatory message.
    */
  var Message: js.UndefOr[String] = js.native
}

object InstanceFleetStateChangeReason {
  @scala.inline
  def apply(): InstanceFleetStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetStateChangeReason]
  }
  @scala.inline
  implicit class InstanceFleetStateChangeReasonOps[Self <: InstanceFleetStateChangeReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: InstanceFleetStateChangeReasonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

