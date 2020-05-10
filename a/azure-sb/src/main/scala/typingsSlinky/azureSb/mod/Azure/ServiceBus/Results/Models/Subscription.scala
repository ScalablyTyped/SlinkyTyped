package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azureSb.AnonAuthor
import typingsSlinky.azureSb.mod.Azure.ServiceBus.DateString
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends ExtendedBase {
  var CountDetails: StringDictionary[String] = js.native
  var DeadLetteringOnFilterEvaluationExceptions: String = js.native
  var DeadLetteringOnMessageExpiration: String = js.native
  var LockDuration: String = js.native
  var MaxDeliveryCount: String = js.native
  var MessageCount: String = js.native
  var RequiresSession: String = js.native
  var SubscriptionName: String = js.native
  var TopicName: String = js.native
}

object Subscription {
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CountDetails: StringDictionary[String],
    CreatedAt: DateString,
    DeadLetteringOnFilterEvaluationExceptions: String,
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    LockDuration: String,
    MaxDeliveryCount: String,
    MaxSizeInMegabytes: String,
    MessageCount: String,
    RequiresDuplicateDetection: String,
    RequiresSession: String,
    SizeInBytes: String,
    Status: EntityStatus,
    SubscriptionName: String,
    TopicName: String,
    UpdatedAt: DateString,
    _underscore: AnonAuthor
  ): Subscription = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CountDetails = CountDetails.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountDetails(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountDetails")(value.asInstanceOf[js.Any])
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
    def withLockDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDeliveryCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDeliveryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiresSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

