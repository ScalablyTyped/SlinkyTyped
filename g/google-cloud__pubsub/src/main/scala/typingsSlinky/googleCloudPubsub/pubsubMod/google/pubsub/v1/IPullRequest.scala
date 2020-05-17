package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PullRequest. */
@js.native
trait IPullRequest extends js.Object {
  /** PullRequest maxMessages */
  var maxMessages: js.UndefOr[Double | Null] = js.native
  /** PullRequest returnImmediately */
  var returnImmediately: js.UndefOr[Boolean | Null] = js.native
  /** PullRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}

object IPullRequest {
  @scala.inline
  def apply(): IPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPullRequest]
  }
  @scala.inline
  implicit class IPullRequestOps[Self <: IPullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMessagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(null)
        ret
    }
    @scala.inline
    def withReturnImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnImmediatelyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnImmediately")(null)
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(null)
        ret
    }
  }
  
}

