package typingsSlinky.azureSb.subscriptionresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionProperties extends js.Object {
  var AutoDeleteOnIdle: Boolean = js.native
  var DeadLetteringOnFilterEvaluationExceptions: String = js.native
  var DeadLetteringOnMessageExpiration: String = js.native
  var DefaultMessageTimeToLive: String = js.native
  var EnableBatchedOperations: Boolean = js.native
  var LockDuration: String = js.native
  var MaxDeliveryCount: Double = js.native
  var MessageCount: Double = js.native
  var RequiresSession: Boolean = js.native
}

object SubscriptionProperties {
  @scala.inline
  def apply(
    AutoDeleteOnIdle: Boolean,
    DeadLetteringOnFilterEvaluationExceptions: String,
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    EnableBatchedOperations: Boolean,
    LockDuration: String,
    MaxDeliveryCount: Double,
    MessageCount: Double,
    RequiresSession: Boolean
  ): SubscriptionProperties = {
    val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionProperties]
  }
  @scala.inline
  implicit class SubscriptionPropertiesOps[Self <: SubscriptionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDeleteOnIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeleteOnIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadLetteringOnFilterEvaluationExceptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetteringOnFilterEvaluationExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadLetteringOnMessageExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetteringOnMessageExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMessageTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessageTimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableBatchedOperations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableBatchedOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDeliveryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDeliveryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

