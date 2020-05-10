package typingsSlinky.instagramPrivateApi.directThreadRepositoryApproveParticipantRequestResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryApproveParticipantRequestResponseRootObject extends js.Object {
  var status: String = js.native
  var thread: DirectThreadRepositoryApproveParticipantRequestResponseThread = js.native
}

object DirectThreadRepositoryApproveParticipantRequestResponseRootObject {
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryApproveParticipantRequestResponseThread): DirectThreadRepositoryApproveParticipantRequestResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseRootObject]
  }
  @scala.inline
  implicit class DirectThreadRepositoryApproveParticipantRequestResponseRootObjectOps[Self <: DirectThreadRepositoryApproveParticipantRequestResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread(value: DirectThreadRepositoryApproveParticipantRequestResponseThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

