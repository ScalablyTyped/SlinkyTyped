package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ReceivedMessage. */
@js.native
trait IReceivedMessage extends js.Object {
  /** ReceivedMessage ackId */
  var ackId: js.UndefOr[String | Null] = js.native
  /** ReceivedMessage deliveryAttempt */
  var deliveryAttempt: js.UndefOr[Double | Null] = js.native
  /** ReceivedMessage message */
  var message: js.UndefOr[IPubsubMessage | Null] = js.native
}

object IReceivedMessage {
  @scala.inline
  def apply(): IReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReceivedMessage]
  }
  @scala.inline
  implicit class IReceivedMessageOps[Self <: IReceivedMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackId")(js.undefined)
        ret
    }
    @scala.inline
    def withAckIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackId")(null)
        ret
    }
    @scala.inline
    def withDeliveryAttempt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryAttemptNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryAttempt")(null)
        ret
    }
    @scala.inline
    def withMessage(value: IPubsubMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(null)
        ret
    }
  }
  
}

