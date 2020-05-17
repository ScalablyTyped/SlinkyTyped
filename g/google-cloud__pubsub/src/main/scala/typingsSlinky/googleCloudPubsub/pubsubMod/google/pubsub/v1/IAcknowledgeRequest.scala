package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AcknowledgeRequest. */
@js.native
trait IAcknowledgeRequest extends js.Object {
  /** AcknowledgeRequest ackIds */
  var ackIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** AcknowledgeRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
}

object IAcknowledgeRequest {
  @scala.inline
  def apply(): IAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAcknowledgeRequest]
  }
  @scala.inline
  implicit class IAcknowledgeRequestOps[Self <: IAcknowledgeRequest] (val x: Self) extends AnyVal {
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

