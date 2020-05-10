package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBulkTemplatedEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendBulkTemplatedEmail action.
    */
  var Status: BulkEmailDestinationStatusList = js.native
}

object SendBulkTemplatedEmailResponse {
  @scala.inline
  def apply(Status: BulkEmailDestinationStatusList): SendBulkTemplatedEmailResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBulkTemplatedEmailResponse]
  }
  @scala.inline
  implicit class SendBulkTemplatedEmailResponseOps[Self <: SendBulkTemplatedEmailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: BulkEmailDestinationStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

