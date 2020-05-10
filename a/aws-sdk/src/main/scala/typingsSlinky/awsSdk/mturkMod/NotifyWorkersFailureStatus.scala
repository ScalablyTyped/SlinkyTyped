package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWorkersFailureStatus extends js.Object {
  /**
    *  Encoded value for the failure type. 
    */
  var NotifyWorkersFailureCode: js.UndefOr[typingsSlinky.awsSdk.mturkMod.NotifyWorkersFailureCode] = js.native
  /**
    *  A message detailing the reason the Worker could not be notified. 
    */
  var NotifyWorkersFailureMessage: js.UndefOr[String] = js.native
  /**
    *  The ID of the Worker.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object NotifyWorkersFailureStatus {
  @scala.inline
  def apply(): NotifyWorkersFailureStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWorkersFailureStatus]
  }
  @scala.inline
  implicit class NotifyWorkersFailureStatusOps[Self <: NotifyWorkersFailureStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyWorkersFailureCode(value: NotifyWorkersFailureCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyWorkersFailureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyWorkersFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyWorkersFailureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyWorkersFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyWorkersFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyWorkersFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyWorkersFailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(js.undefined)
        ret
    }
  }
  
}

