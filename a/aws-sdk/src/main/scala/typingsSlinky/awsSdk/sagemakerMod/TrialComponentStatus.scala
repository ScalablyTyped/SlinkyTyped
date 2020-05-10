package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentStatus extends js.Object {
  /**
    * If the component failed, a message describing why.
    */
  var Message: js.UndefOr[TrialComponentStatusMessage] = js.native
  /**
    * The status of the trial component.
    */
  var PrimaryStatus: js.UndefOr[TrialComponentPrimaryStatus] = js.native
}

object TrialComponentStatus {
  @scala.inline
  def apply(): TrialComponentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentStatus]
  }
  @scala.inline
  implicit class TrialComponentStatusOps[Self <: TrialComponentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: TrialComponentStatusMessage): Self = {
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
    @scala.inline
    def withPrimaryStatus(value: TrialComponentPrimaryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryStatus")(js.undefined)
        ret
    }
  }
  
}

