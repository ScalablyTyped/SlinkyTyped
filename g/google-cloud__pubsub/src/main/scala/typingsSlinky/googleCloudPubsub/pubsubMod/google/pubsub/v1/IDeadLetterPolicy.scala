package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeadLetterPolicy. */
@js.native
trait IDeadLetterPolicy extends js.Object {
  /** DeadLetterPolicy deadLetterTopic */
  var deadLetterTopic: js.UndefOr[String | Null] = js.native
  /** DeadLetterPolicy maxDeliveryAttempts */
  var maxDeliveryAttempts: js.UndefOr[Double | Null] = js.native
}

object IDeadLetterPolicy {
  @scala.inline
  def apply(): IDeadLetterPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeadLetterPolicy]
  }
  @scala.inline
  implicit class IDeadLetterPolicyOps[Self <: IDeadLetterPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadLetterTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadLetterTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadLetterTopicNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterTopic")(null)
        ret
    }
    @scala.inline
    def withMaxDeliveryAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeliveryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeliveryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeliveryAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeliveryAttemptsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeliveryAttempts")(null)
        ret
    }
  }
  
}

