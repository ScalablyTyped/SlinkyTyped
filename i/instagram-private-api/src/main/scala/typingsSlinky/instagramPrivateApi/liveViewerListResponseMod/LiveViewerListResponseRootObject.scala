package typingsSlinky.instagramPrivateApi.liveViewerListResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveViewerListResponseRootObject extends js.Object {
  var status: String = js.native
  var users: js.Array[LiveViewerListResponseUsersItem] = js.native
}

object LiveViewerListResponseRootObject {
  @scala.inline
  def apply(status: String, users: js.Array[LiveViewerListResponseUsersItem]): LiveViewerListResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveViewerListResponseRootObject]
  }
  @scala.inline
  implicit class LiveViewerListResponseRootObjectOps[Self <: LiveViewerListResponseRootObject] (val x: Self) extends AnyVal {
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
    def withUsers(value: js.Array[LiveViewerListResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

