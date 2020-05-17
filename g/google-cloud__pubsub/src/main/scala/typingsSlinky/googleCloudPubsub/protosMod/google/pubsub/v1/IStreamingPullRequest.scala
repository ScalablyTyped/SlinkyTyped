package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingPullRequest. */
@js.native
trait IStreamingPullRequest extends js.Object {
  /** StreamingPullRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** StreamingPullRequest clientId */
  var clientId: js.UndefOr[String | Null] = js.native
  /** StreamingPullRequest modifyDeadlineAckIds */
  var modifyDeadlineAckIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** StreamingPullRequest modifyDeadlineSeconds */
  var modifyDeadlineSeconds: js.UndefOr[js.Array[Double] | Null] = js.native
  /** StreamingPullRequest streamAckDeadlineSeconds */
  var streamAckDeadlineSeconds: js.UndefOr[Double | Null] = js.native
  /** StreamingPullRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}

object IStreamingPullRequest {
  @scala.inline
  def apply(): IStreamingPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingPullRequest]
  }
  @scala.inline
  implicit class IStreamingPullRequestOps[Self <: IStreamingPullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAckIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackIds")(null)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(null)
        ret
    }
    @scala.inline
    def withModifyDeadlineAckIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDeadlineAckIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyDeadlineAckIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDeadlineAckIds")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyDeadlineAckIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDeadlineAckIds")(null)
        ret
    }
    @scala.inline
    def withModifyDeadlineSeconds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyDeadlineSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDeadlineSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyDeadlineSecondsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDeadlineSeconds")(null)
        ret
    }
    @scala.inline
    def withStreamAckDeadlineSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamAckDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamAckDeadlineSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamAckDeadlineSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamAckDeadlineSecondsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamAckDeadlineSeconds")(null)
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

