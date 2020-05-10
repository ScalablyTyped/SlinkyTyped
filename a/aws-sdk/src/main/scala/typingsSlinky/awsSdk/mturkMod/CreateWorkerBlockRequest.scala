package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkerBlockRequest extends js.Object {
  /**
    * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your Workers. The Worker does not see this message.
    */
  var Reason: String = js.native
  /**
    * The ID of the Worker to block.
    */
  var WorkerId: CustomerId = js.native
}

object CreateWorkerBlockRequest {
  @scala.inline
  def apply(Reason: String, WorkerId: CustomerId): CreateWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerBlockRequest]
  }
  @scala.inline
  implicit class CreateWorkerBlockRequestOps[Self <: CreateWorkerBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

