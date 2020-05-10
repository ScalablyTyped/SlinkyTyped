package typingsSlinky.instagramPrivateApi.directThreadRepositoryGetByParticipantsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryGetByParticipantsResponseRootObject extends js.Object {
  var status: String = js.native
  var thread: DirectThreadRepositoryGetByParticipantsResponseThread = js.native
}

object DirectThreadRepositoryGetByParticipantsResponseRootObject {
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryGetByParticipantsResponseThread): DirectThreadRepositoryGetByParticipantsResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseRootObject]
  }
  @scala.inline
  implicit class DirectThreadRepositoryGetByParticipantsResponseRootObjectOps[Self <: DirectThreadRepositoryGetByParticipantsResponseRootObject] (val x: Self) extends AnyVal {
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
    def withThread(value: DirectThreadRepositoryGetByParticipantsResponseThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

