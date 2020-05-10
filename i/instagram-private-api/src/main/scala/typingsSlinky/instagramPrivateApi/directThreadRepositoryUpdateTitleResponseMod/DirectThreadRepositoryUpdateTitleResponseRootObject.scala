package typingsSlinky.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryUpdateTitleResponseRootObject extends js.Object {
  var status: String = js.native
  var thread: DirectThreadRepositoryUpdateTitleResponseThread = js.native
}

object DirectThreadRepositoryUpdateTitleResponseRootObject {
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryUpdateTitleResponseThread): DirectThreadRepositoryUpdateTitleResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseRootObject]
  }
  @scala.inline
  implicit class DirectThreadRepositoryUpdateTitleResponseRootObjectOps[Self <: DirectThreadRepositoryUpdateTitleResponseRootObject] (val x: Self) extends AnyVal {
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
    def withThread(value: DirectThreadRepositoryUpdateTitleResponseThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

