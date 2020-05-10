package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkerBlockRequest extends js.Object {
  /**
    * A message that explains the reason for unblocking the Worker. The Worker does not see this message.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Worker to unblock.
    */
  var WorkerId: CustomerId = js.native
}

object DeleteWorkerBlockRequest {
  @scala.inline
  def apply(WorkerId: CustomerId): DeleteWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkerBlockRequest]
  }
  @scala.inline
  implicit class DeleteWorkerBlockRequestOps[Self <: DeleteWorkerBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(js.undefined)
        ret
    }
  }
  
}

