package typingsSlinky.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverFeedResponseRootObject extends js.Object {
  var max_id: String = js.native
  var more_available: Boolean = js.native
  var new_suggested_users: DiscoverFeedResponseNewSuggestedUsers = js.native
  var next_max_id: String = js.native
  var status: String = js.native
  var suggested_users: DiscoverFeedResponseSuggestedUsers = js.native
}

object DiscoverFeedResponseRootObject {
  @scala.inline
  def apply(
    max_id: String,
    more_available: Boolean,
    new_suggested_users: DiscoverFeedResponseNewSuggestedUsers,
    next_max_id: String,
    status: String,
    suggested_users: DiscoverFeedResponseSuggestedUsers
  ): DiscoverFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_suggested_users = new_suggested_users.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], suggested_users = suggested_users.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseRootObject]
  }
  @scala.inline
  implicit class DiscoverFeedResponseRootObjectOps[Self <: DiscoverFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_suggested_users(value: DiscoverFeedResponseNewSuggestedUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_suggested_users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggested_users(value: DiscoverFeedResponseSuggestedUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggested_users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

