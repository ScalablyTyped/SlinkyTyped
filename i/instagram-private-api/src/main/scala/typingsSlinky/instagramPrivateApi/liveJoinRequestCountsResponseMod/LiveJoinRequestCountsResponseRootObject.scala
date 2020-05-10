package typingsSlinky.instagramPrivateApi.liveJoinRequestCountsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveJoinRequestCountsResponseRootObject extends js.Object {
  var fetch_ts: Double = js.native
  var num_new_requests: Double = js.native
  var num_total_requests: Double = js.native
  var num_unseen_requests: Double = js.native
  var status: String = js.native
  var users: js.Array[LiveJoinRequestCountsResponseUsersItem] = js.native
}

object LiveJoinRequestCountsResponseRootObject {
  @scala.inline
  def apply(
    fetch_ts: Double,
    num_new_requests: Double,
    num_total_requests: Double,
    num_unseen_requests: Double,
    status: String,
    users: js.Array[LiveJoinRequestCountsResponseUsersItem]
  ): LiveJoinRequestCountsResponseRootObject = {
    val __obj = js.Dynamic.literal(fetch_ts = fetch_ts.asInstanceOf[js.Any], num_new_requests = num_new_requests.asInstanceOf[js.Any], num_total_requests = num_total_requests.asInstanceOf[js.Any], num_unseen_requests = num_unseen_requests.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveJoinRequestCountsResponseRootObject]
  }
  @scala.inline
  implicit class LiveJoinRequestCountsResponseRootObjectOps[Self <: LiveJoinRequestCountsResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetch_ts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_new_requests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_new_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_total_requests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_total_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_unseen_requests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_unseen_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[LiveJoinRequestCountsResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

