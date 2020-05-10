package typingsSlinky.instagramPrivateApi.liveFinalViewersResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveFinalViewersResponseRootObject extends js.Object {
  var status: String = js.native
  var total_unique_viewer_count: Double = js.native
  var users: js.Array[LiveFinalViewersResponseUsersItem] = js.native
}

object LiveFinalViewersResponseRootObject {
  @scala.inline
  def apply(
    status: String,
    total_unique_viewer_count: Double,
    users: js.Array[LiveFinalViewersResponseUsersItem]
  ): LiveFinalViewersResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], total_unique_viewer_count = total_unique_viewer_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveFinalViewersResponseRootObject]
  }
  @scala.inline
  implicit class LiveFinalViewersResponseRootObjectOps[Self <: LiveFinalViewersResponseRootObject] (val x: Self) extends AnyVal {
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
    def withTotal_unique_viewer_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_unique_viewer_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[LiveFinalViewersResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

