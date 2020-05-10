package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityGetRepoSubscriptionResponse extends js.Object {
  var created_at: String = js.native
  var ignored: Boolean = js.native
  var reason: Null = js.native
  var repository_url: String = js.native
  var subscribed: Boolean = js.native
  var url: String = js.native
}

object ActivityGetRepoSubscriptionResponse {
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: Null,
    repository_url: String,
    subscribed: Boolean,
    url: String
  ): ActivityGetRepoSubscriptionResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetRepoSubscriptionResponse]
  }
  @scala.inline
  implicit class ActivityGetRepoSubscriptionResponseOps[Self <: ActivityGetRepoSubscriptionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

